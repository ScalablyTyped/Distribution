package typings
package phaserLib.PhaserNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Input Manager is responsible for handling the pointer related systems in a single Phaser Game instance.
  * 
  * Based on the Game Config it will create handlers for mouse and touch support.
  * 
  * Keyboard and Gamepad are plugins, handled directly by the InputPlugin class.
  * 
  * It then manages the event queue, pointer creation and general hit test related operations.
  * 
  * You rarely need to interact with the Input Manager directly, and as such, all of its properties and methods
  * should be considered private. Instead, you should use the Input Plugin, which is a Scene level system, responsible
  * for dealing with all input events for a Scene.
  */
@JSGlobal("Phaser.Input.InputManager")
@js.native
class InputManager protected () extends js.Object {
  /**
    * 
    * @param game The Game instance that owns the Input Manager.
    * @param config The Input Configuration object, as set in the Game Config.
    */
  def this(game: phaserLib.PhaserNs.Game, config: js.Object) = this()
  /**
    * The most recently active Pointer object.
    * 
    * If you've only 1 Pointer in your game then this will accurately be either the first finger touched, or the mouse.
    * 
    * If your game doesn't need to support multi-touch then you can safely use this property in all of your game
    * code and it will adapt to be either the mouse or the touch, based on device.
    */
  var activePointer: Pointer = js.native
  /**
    * The Canvas that is used for all DOM event input listeners.
    */
  var canvas: stdLib.HTMLCanvasElement = js.native
  /**
    * The Game Configuration object, as set during the game boot.
    */
  var config: phaserLib.PhaserNs.CoreNs.Config = js.native
  /**
    * The default CSS cursor to be used when interacting with your game.
    * 
    * See the `setDefaultCursor` method for more details.
    */
  var defaultCursor: java.lang.String = js.native
  /**
    * Reset every frame. Set to `true` if any of the Pointers are dirty this frame.
    */
  var dirty: scala.Boolean = js.native
  /**
    * If set, the Input Manager will run its update loop every frame.
    */
  var enabled: scala.Boolean = js.native
  /**
    * The Event Emitter instance that the Input Manager uses to emit events from.
    */
  var events: phaserLib.PhaserNs.EventsNs.EventEmitter = js.native
  /**
    * The Game instance that owns the Input Manager.
    * A Game only maintains on instance of the Input Manager at any time.
    */
  val game: phaserLib.PhaserNs.Game = js.native
  /**
    * If the top-most Scene in the Scene List receives an input it will stop input from
    * propagating any lower down the scene list, i.e. if you have a UI Scene at the top
    * and click something on it, that click will not then be passed down to any other
    * Scene below. Disable this to have input events passed through all Scenes, all the time.
    */
  var globalTopOnly: scala.Boolean = js.native
  /**
    * An internal flag that controls if the Input Manager will ignore or process native DOM events this frame.
    * Set via the InputPlugin.stopPropagation method.
    */
  var ignoreEvents: scala.Boolean = js.native
  /**
    * Are any mouse or touch pointers currently over the game canvas?
    * This is updated automatically by the canvas over and out handlers.
    */
  val isOver: scala.Boolean = js.native
  /**
    * A reference to the Keyboard Manager class, if enabled via the `input.keyboard` Game Config property.
    */
  var keyboard: phaserLib.PhaserNs.InputNs.KeyboardNs.KeyboardManager = js.native
  /**
    * A reference to the Mouse Manager class, if enabled via the `input.mouse` Game Config property.
    */
  var mouse: phaserLib.PhaserNs.InputNs.MouseNs.MouseManager = js.native
  /**
    * The mouse has its own unique Pointer object, which you can reference directly if making a _desktop specific game_.
    * If you are supporting both desktop and touch devices then do not use this property, instead use `activePointer`
    * which will always map to the most recently interacted pointer.
    */
  var mousePointer: Pointer = js.native
  /**
    * An array of Pointers that have been added to the game.
    * The first entry is reserved for the Mouse Pointer, the rest are Touch Pointers.
    * 
    * By default there is 1 touch pointer enabled. If you need more use the `addPointer` method to start them,
    * or set the `input.activePointers` property in the Game Config.
    */
  var pointers: js.Array[Pointer] = js.native
  /**
    * The number of touch objects activated and being processed each update.
    * 
    * You can change this by either calling `addPointer` at run-time, or by
    * setting the `input.activePointers` property in the Game Config.
    */
  val pointersTotal: phaserLib.integer = js.native
  /**
    * A standard FIFO queue for the native DOM events waiting to be handled by the Input Manager.
    */
  var queue: js.Array[_] = js.native
  /**
    * A reference to the global Game Scale Manager.
    * Used for all bounds checks and pointer scaling.
    */
  var scaleManager: phaserLib.PhaserNs.ScaleNs.ScaleManager = js.native
  /**
    * The time this Input Manager was last updated.
    * This value is populated by the Game Step each frame.
    */
  val time: scala.Double = js.native
  /**
    * A reference to the Touch Manager class, if enabled via the `input.touch` Game Config property.
    */
  var touch: phaserLib.PhaserNs.InputNs.TouchNs.TouchManager = js.native
  /**
    * Use the internal event queue or not?
    * 
    * Set this via the Game Config with the `inputQueue` property.
    * 
    * Phaser 3.15.1 and earlier used a event queue by default.
    * 
    * This was changed in version 3.16 to use an immediate-mode system.
    * The previous queue based version remains and is left under this flag for backwards
    * compatibility. This flag, along with the legacy system, will be removed in a future version.
    */
  var useQueue: scala.Boolean = js.native
  /**
    * **Note:** As of Phaser 3.16 this method is no longer required _unless_ you have set `input.queue = true`
    * in your game config, to force it to use the legacy event queue system. This method is deprecated and
    * will be removed in a future version.
    * 
    * Adds a callback to be invoked whenever the native DOM `mousedown` or `touchstart` events are received.
    * By setting the `isOnce` argument you can control if the callback is called once,
    * or every time the DOM event occurs.
    * 
    * Callbacks passed to this method are invoked _immediately_ when the DOM event happens,
    * within the scope of the DOM event handler. Therefore, they are considered as 'native'
    * from the perspective of the browser. This means they can be used for tasks such as
    * opening new browser windows, or anything which explicitly requires user input to activate.
    * However, as a result of this, they come with their own risks, and as such should not be used
    * for general game input, but instead be reserved for special circumstances.
    * 
    * If all you're trying to do is execute a callback when a pointer is down, then
    * please use the internal Input event system instead.
    * 
    * Please understand that these callbacks are invoked when the browser feels like doing so,
    * which may be entirely out of the normal flow of the Phaser Game Loop. Therefore, you should absolutely keep
    * Phaser related operations to a minimum in these callbacks. For example, don't destroy Game Objects,
    * change Scenes or manipulate internal systems, otherwise you run a very real risk of creating
    * heisenbugs (https://en.wikipedia.org/wiki/Heisenbug) that prove a challenge to reproduce, never mind
    * solve.
    * @param callback The callback to be invoked on this dom event.
    * @param isOnce `true` if the callback will only be invoked once, `false` to call every time this event happens. Default true.
    */
  def addDownCallback(callback: js.Function): this.type = js.native
  def addDownCallback(callback: js.Function, isOnce: scala.Boolean): this.type = js.native
  /**
    * **Note:** As of Phaser 3.16 this method is no longer required _unless_ you have set `input.queue = true`
    * in your game config, to force it to use the legacy event queue system. This method is deprecated and
    * will be removed in a future version.
    * 
    * Adds a callback to be invoked whenever the native DOM `mousemove` or `touchmove` events are received.
    * By setting the `isOnce` argument you can control if the callback is called once,
    * or every time the DOM event occurs.
    * 
    * Callbacks passed to this method are invoked _immediately_ when the DOM event happens,
    * within the scope of the DOM event handler. Therefore, they are considered as 'native'
    * from the perspective of the browser. This means they can be used for tasks such as
    * opening new browser windows, or anything which explicitly requires user input to activate.
    * However, as a result of this, they come with their own risks, and as such should not be used
    * for general game input, but instead be reserved for special circumstances.
    * 
    * If all you're trying to do is execute a callback when a pointer is moved, then
    * please use the internal Input event system instead.
    * 
    * Please understand that these callbacks are invoked when the browser feels like doing so,
    * which may be entirely out of the normal flow of the Phaser Game Loop. Therefore, you should absolutely keep
    * Phaser related operations to a minimum in these callbacks. For example, don't destroy Game Objects,
    * change Scenes or manipulate internal systems, otherwise you run a very real risk of creating
    * heisenbugs (https://en.wikipedia.org/wiki/Heisenbug) that prove a challenge to reproduce, never mind
    * solve.
    * @param callback The callback to be invoked on this dom event.
    * @param isOnce `true` if the callback will only be invoked once, `false` to call every time this event happens. Default false.
    */
  def addMoveCallback(callback: js.Function): this.type = js.native
  def addMoveCallback(callback: js.Function, isOnce: scala.Boolean): this.type = js.native
  /**
    * Adds new Pointer objects to the Input Manager.
    * 
    * By default Phaser creates 2 pointer objects: `mousePointer` and `pointer1`.
    * 
    * You can create more either by calling this method, or by setting the `input.activePointers` property
    * in the Game Config, up to a maximum of 10 pointers.
    * 
    * The first 10 pointers are available via the `InputPlugin.pointerX` properties, once they have been added
    * via this method.
    * @param quantity The number of new Pointers to create. A maximum of 10 is allowed in total. Default 1.
    */
  def addPointer(): js.Array[Pointer] = js.native
  def addPointer(quantity: phaserLib.integer): js.Array[Pointer] = js.native
  /**
    * **Note:** As of Phaser 3.16 this method is no longer required _unless_ you have set `input.queue = true`
    * in your game config, to force it to use the legacy event queue system. This method is deprecated and
    * will be removed in a future version.
    * 
    * Adds a callback to be invoked whenever the native DOM `mouseup` or `touchend` events are received.
    * By setting the `isOnce` argument you can control if the callback is called once,
    * or every time the DOM event occurs.
    * 
    * Callbacks passed to this method are invoked _immediately_ when the DOM event happens,
    * within the scope of the DOM event handler. Therefore, they are considered as 'native'
    * from the perspective of the browser. This means they can be used for tasks such as
    * opening new browser windows, or anything which explicitly requires user input to activate.
    * However, as a result of this, they come with their own risks, and as such should not be used
    * for general game input, but instead be reserved for special circumstances.
    * 
    * If all you're trying to do is execute a callback when a pointer is released, then
    * please use the internal Input event system instead.
    * 
    * Please understand that these callbacks are invoked when the browser feels like doing so,
    * which may be entirely out of the normal flow of the Phaser Game Loop. Therefore, you should absolutely keep
    * Phaser related operations to a minimum in these callbacks. For example, don't destroy Game Objects,
    * change Scenes or manipulate internal systems, otherwise you run a very real risk of creating
    * heisenbugs (https://en.wikipedia.org/wiki/Heisenbug) that prove a challenge to reproduce, never mind
    * solve.
    * @param callback The callback to be invoked on this dom event.
    * @param isOnce `true` if the callback will only be invoked once, `false` to call every time this event happens. Default true.
    */
  def addUpCallback(callback: js.Function): this.type = js.native
  def addUpCallback(callback: js.Function, isOnce: scala.Boolean): this.type = js.native
  /**
    * The Boot handler is called by Phaser.Game when it first starts up.
    * The renderer is available by now.
    */
  /* protected */ def boot(): scala.Unit = js.native
  /**
    * Destroys the Input Manager and all of its systems.
    * 
    * There is no way to recover from doing this.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Performs a hit test using the given Pointer and camera, against an array of interactive Game Objects.
    * 
    * The Game Objects are culled against the camera, and then the coordinates are translated into the local camera space
    * and used to determine if they fall within the remaining Game Objects hit areas or not.
    * 
    * If nothing is matched an empty array is returned.
    * 
    * This method is called automatically by InputPlugin.hitTestPointer and doesn't usually need to be invoked directly.
    * @param pointer The Pointer to test against.
    * @param gameObjects An array of interactive Game Objects to check.
    * @param camera The Camera which is being tested against.
    * @param output An array to store the results in. If not given, a new empty array is created.
    */
  def hitTest(pointer: Pointer, gameObjects: js.Array[_], camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): js.Array[_] = js.native
  def hitTest(
    pointer: Pointer,
    gameObjects: js.Array[_],
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera,
    output: js.Array[_]
  ): js.Array[_] = js.native
  /**
    * Checks if the given x and y coordinate are within the hit area of the Game Object.
    * 
    * This method assumes that the coordinate values have already been translated into the space of the Game Object.
    * 
    * If the coordinates are within the hit area they are set into the Game Objects Input `localX` and `localY` properties.
    * @param gameObject The interactive Game Object to check against.
    * @param x The translated x coordinate for the hit test.
    * @param y The translated y coordinate for the hit test.
    */
  def pointWithinHitArea(gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
    * Checks if the given x and y coordinate are within the hit area of the Interactive Object.
    * 
    * This method assumes that the coordinate values have already been translated into the space of the Interactive Object.
    * 
    * If the coordinates are within the hit area they are set into the Interactive Objects Input `localX` and `localY` properties.
    * @param object The Interactive Object to check against.
    * @param x The translated x coordinate for the hit test.
    * @param y The translated y coordinate for the hit test.
    */
  def pointWithinInteractiveObject(`object`: phaserLib.PhaserNs.TypesNs.InputNs.InteractiveObject, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
    * Tells the Input system to set a custom cursor.
    * 
    * This cursor will be the default cursor used when interacting with the game canvas.
    * 
    * If an Interactive Object also sets a custom cursor, this is the cursor that is reset after its use.
    * 
    * Any valid CSS cursor value is allowed, including paths to image files, i.e.:
    * 
    * ```javascript
    * this.input.setDefaultCursor('url(assets/cursors/sword.cur), pointer');
    * ```
    * 
    * Please read about the differences between browsers when it comes to the file formats and sizes they support:
    * 
    * https://developer.mozilla.org/en-US/docs/Web/CSS/cursor
    * https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_User_Interface/Using_URL_values_for_the_cursor_property
    * 
    * It's up to you to pick a suitable cursor format that works across the range of browsers you need to support.
    * @param cursor The CSS to be used when setting the default cursor.
    */
  def setDefaultCursor(cursor: java.lang.String): scala.Unit = js.native
  /**
    * Transforms the pageX and pageY values of a Pointer into the scaled coordinate space of the Input Manager.
    * @param pointer The Pointer to transform the values for.
    * @param pageX The Page X value.
    * @param pageY The Page Y value.
    * @param wasMove Are we transforming the Pointer from a move event, or an up / down event?
    */
  def transformPointer(pointer: Pointer, pageX: scala.Double, pageY: scala.Double, wasMove: scala.Boolean): scala.Unit = js.native
  /**
    * Internal method that gets a list of all the active Input Plugins in the game
    * and updates each of them in turn, in reverse order (top to bottom), to allow
    * for DOM top-level event handling simulation.
    * @param time The time value from the most recent Game step. Typically a high-resolution timer value, or Date.now().
    * @param delta The delta value since the last frame. This is smoothed to avoid delta spikes by the TimeStep class.
    */
  def updateInputPlugins(time: scala.Double, delta: scala.Double): scala.Unit = js.native
}

