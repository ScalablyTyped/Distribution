package typings.phaser.PhaserNs.InputNs

import typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera
import typings.phaser.PhaserNs.CoreNs.Config
import typings.phaser.PhaserNs.EventsNs.EventEmitter
import typings.phaser.PhaserNs.Game
import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.phaser.PhaserNs.InputNs.KeyboardNs.KeyboardManager
import typings.phaser.PhaserNs.InputNs.MouseNs.MouseManager
import typings.phaser.PhaserNs.InputNs.TouchNs.TouchManager
import typings.phaser.PhaserNs.ScaleNs.ScaleManager
import typings.phaser.PhaserNs.TypesNs.InputNs.InteractiveObject
import typings.phaser.integer
import typings.std.HTMLCanvasElement
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
  * It then manages the events, pointer creation and general hit test related operations.
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
  def this(game: Game, config: js.Object) = this()
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
  var canvas: HTMLCanvasElement = js.native
  /**
    * The Game Configuration object, as set during the game boot.
    */
  var config: Config = js.native
  /**
    * The default CSS cursor to be used when interacting with your game.
    * 
    * See the `setDefaultCursor` method for more details.
    */
  var defaultCursor: String = js.native
  /**
    * If set, the Input Manager will run its update loop every frame.
    */
  var enabled: Boolean = js.native
  /**
    * The Event Emitter instance that the Input Manager uses to emit events from.
    */
  var events: EventEmitter = js.native
  /**
    * The Game instance that owns the Input Manager.
    * A Game only maintains on instance of the Input Manager at any time.
    */
  val game: Game = js.native
  /**
    * If the top-most Scene in the Scene List receives an input it will stop input from
    * propagating any lower down the scene list, i.e. if you have a UI Scene at the top
    * and click something on it, that click will not then be passed down to any other
    * Scene below. Disable this to have input events passed through all Scenes, all the time.
    */
  var globalTopOnly: Boolean = js.native
  /**
    * Are any mouse or touch pointers currently over the game canvas?
    * This is updated automatically by the canvas over and out handlers.
    */
  val isOver: Boolean = js.native
  /**
    * A reference to the Keyboard Manager class, if enabled via the `input.keyboard` Game Config property.
    */
  var keyboard: KeyboardManager = js.native
  /**
    * A reference to the Mouse Manager class, if enabled via the `input.mouse` Game Config property.
    */
  var mouse: MouseManager = js.native
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
  val pointersTotal: integer = js.native
  /**
    * A reference to the global Game Scale Manager.
    * Used for all bounds checks and pointer scaling.
    */
  var scaleManager: ScaleManager = js.native
  /**
    * The time this Input Manager was last updated.
    * This value is populated by the Game Step each frame.
    */
  val time: Double = js.native
  /**
    * A reference to the Touch Manager class, if enabled via the `input.touch` Game Config property.
    */
  var touch: TouchManager = js.native
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
  def addPointer(quantity: integer): js.Array[Pointer] = js.native
  /**
    * The Boot handler is called by Phaser.Game when it first starts up.
    * The renderer is available by now.
    */
  /* protected */ def boot(): Unit = js.native
  /**
    * Destroys the Input Manager and all of its systems.
    * 
    * There is no way to recover from doing this.
    */
  def destroy(): Unit = js.native
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
  def hitTest(pointer: Pointer, gameObjects: js.Array[_], camera: Camera): js.Array[_] = js.native
  def hitTest(pointer: Pointer, gameObjects: js.Array[_], camera: Camera, output: js.Array[_]): js.Array[_] = js.native
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
  def pointWithinHitArea(gameObject: GameObject, x: Double, y: Double): Boolean = js.native
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
  def pointWithinInteractiveObject(`object`: InteractiveObject, x: Double, y: Double): Boolean = js.native
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
  def setDefaultCursor(cursor: String): Unit = js.native
  /**
    * Transforms the pageX and pageY values of a Pointer into the scaled coordinate space of the Input Manager.
    * @param pointer The Pointer to transform the values for.
    * @param pageX The Page X value.
    * @param pageY The Page Y value.
    * @param wasMove Are we transforming the Pointer from a move event, or an up / down event?
    */
  def transformPointer(pointer: Pointer, pageX: Double, pageY: Double, wasMove: Boolean): Unit = js.native
  /**
    * Internal method that gets a list of all the active Input Plugins in the game
    * and updates each of them in turn, in reverse order (top to bottom), to allow
    * for DOM top-level event handling simulation.
    * @param type The type of event to process.
    * @param pointers An array of Pointers on which the event occurred.
    */
  def updateInputPlugins(`type`: integer, pointers: js.Array[Pointer]): Unit = js.native
}

