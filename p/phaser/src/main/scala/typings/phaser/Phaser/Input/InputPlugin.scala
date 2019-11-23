package typings.phaser.Phaser.Input

import typings.phaser.Phaser.Cameras.Scene2D.CameraManager
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.GameObjects.DisplayList
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Input.Gamepad.GamepadPlugin
import typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin
import typings.phaser.Phaser.Input.Mouse.MouseManager
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Types.Input.HitAreaCallback
import typings.phaser.Phaser.Types.Input.InputConfiguration
import typings.phaser.Phaser.Types.Scenes.SettingsObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Input Plugin belongs to a Scene and handles all input related events and operations for it.
  * 
  * You can access it from within a Scene using `this.input`.
  * 
  * It emits events directly. For example, you can do:
  * 
  * ```javascript
  * this.input.on('pointerdown', callback, context);
  * ```
  * 
  * To listen for a pointer down event anywhere on the game canvas.
  * 
  * Game Objects can be enabled for input by calling their `setInteractive` method. After which they
  * will directly emit input events:
  * 
  * ```javascript
  * var sprite = this.add.sprite(x, y, texture);
  * sprite.setInteractive();
  * sprite.on('pointerdown', callback, context);
  * ```
  * 
  * There are lots of game configuration options available relating to input.
  * See the [Input Config object]{@linkcode Phaser.Types.Core.InputConfig} for more details, including how to deal with Phaser
  * listening for input events outside of the canvas, how to set a default number of pointers, input
  * capture settings and more.
  * 
  * Please also see the Input examples and tutorials for further information.
  */
@JSGlobal("Phaser.Input.InputPlugin")
@js.native
class InputPlugin protected () extends EventEmitter {
  /**
    * 
    * @param scene A reference to the Scene that this Input Plugin is responsible for.
    */
  def this(scene: Scene) = this()
  /**
    * The current active input Pointer.
    */
  val activePointer: Pointer = js.native
  /**
    * A reference to the Scene Cameras Manager. This property is set during the `boot` method.
    */
  var cameras: CameraManager = js.native
  /**
    * A reference to the Scene Display List. This property is set during the `boot` method.
    */
  var displayList: DisplayList = js.native
  /**
    * The distance, in pixels, a pointer has to move while being held down, before it thinks it is being dragged.
    */
  var dragDistanceThreshold: Double = js.native
  /**
    * The amount of time, in ms, a pointer has to be held down before it thinks it is dragging.
    * 
    * The default polling rate is to poll only on move so once the time threshold is reached the
    * drag event will not start until you move the mouse. If you want it to start immediately
    * when the time threshold is reached, you must increase the polling rate by calling
    * [setPollAlways]{@linkcode Phaser.Input.InputPlugin#setPollAlways} or
    * [setPollRate]{@linkcode Phaser.Input.InputPlugin#setPollRate}.
    */
  var dragTimeThreshold: Double = js.native
  /**
    * If `true` this Input Plugin will process DOM input events.
    */
  var enabled: Boolean = js.native
  /**
    * An instance of the Gamepad Plugin class, if enabled via the `input.gamepad` Scene or Game Config property.
    * Use this to create access Gamepads connected to the browser and respond to gamepad buttons.
    */
  var gamepad: GamepadPlugin = js.native
  /**
    * Are any mouse or touch pointers currently over the game canvas?
    */
  val isOver: Boolean = js.native
  /**
    * An instance of the Keyboard Plugin class, if enabled via the `input.keyboard` Scene or Game Config property.
    * Use this to create Key objects and listen for keyboard specific events.
    */
  var keyboard: KeyboardPlugin = js.native
  /**
    * A reference to the Game Input Manager.
    */
  var manager: InputManager = js.native
  /**
    * A reference to the Mouse Manager.
    * 
    * This property is only set if Mouse support has been enabled in your Game Configuration file.
    * 
    * If you just wish to get access to the mouse pointer, use the `mousePointer` property instead.
    */
  var mouse: MouseManager = js.native
  /**
    * The mouse has its own unique Pointer object, which you can reference directly if making a _desktop specific game_.
    * If you are supporting both desktop and touch devices then do not use this property, instead use `activePointer`
    * which will always map to the most recently interacted pointer.
    */
  val mousePointer: Pointer = js.native
  /**
    * A touch-based Pointer object.
    * This will be `undefined` by default unless you add a new Pointer using `addPointer`.
    */
  val pointer1: Pointer = js.native
  /**
    * A touch-based Pointer object.
    * This will be `undefined` by default unless you add a new Pointer using `addPointer`.
    */
  val pointer10: Pointer = js.native
  /**
    * A touch-based Pointer object.
    * This will be `undefined` by default unless you add a new Pointer using `addPointer`.
    */
  val pointer2: Pointer = js.native
  /**
    * A touch-based Pointer object.
    * This will be `undefined` by default unless you add a new Pointer using `addPointer`.
    */
  val pointer3: Pointer = js.native
  /**
    * A touch-based Pointer object.
    * This will be `undefined` by default unless you add a new Pointer using `addPointer`.
    */
  val pointer4: Pointer = js.native
  /**
    * A touch-based Pointer object.
    * This will be `undefined` by default unless you add a new Pointer using `addPointer`.
    */
  val pointer5: Pointer = js.native
  /**
    * A touch-based Pointer object.
    * This will be `undefined` by default unless you add a new Pointer using `addPointer`.
    */
  val pointer6: Pointer = js.native
  /**
    * A touch-based Pointer object.
    * This will be `undefined` by default unless you add a new Pointer using `addPointer`.
    */
  val pointer7: Pointer = js.native
  /**
    * A touch-based Pointer object.
    * This will be `undefined` by default unless you add a new Pointer using `addPointer`.
    */
  val pointer8: Pointer = js.native
  /**
    * A touch-based Pointer object.
    * This will be `undefined` by default unless you add a new Pointer using `addPointer`.
    */
  val pointer9: Pointer = js.native
  /**
    * How often should the Pointers be checked?
    * 
    * The value is a time, given in ms, and is the time that must have elapsed between game steps before
    * the Pointers will be polled again. When a pointer is polled it runs a hit test to see which Game
    * Objects are currently below it, or being interacted with it.
    * 
    * Pointers will *always* be checked if they have been moved by the user, or press or released.
    * 
    * This property only controls how often they will be polled if they have not been updated.
    * You should set this if you want to have Game Objects constantly check against the pointers, even
    * if the pointer didn't itself move.
    * 
    * Set to 0 to poll constantly. Set to -1 to only poll on user movement.
    */
  var pollRate: integer = js.native
  /**
    * A reference to the Scene that this Input Plugin is responsible for.
    */
  var scene: Scene = js.native
  /**
    * A reference to the Scene Systems Settings.
    */
  var settings: SettingsObject = js.native
  /**
    * A reference to the Scene Systems class.
    */
  var systems: Systems = js.native
  /**
    * When set to `true` (the default) the Input Plugin will emulate DOM behavior by only emitting events from
    * the top-most Game Objects in the Display List.
    * 
    * If set to `false` it will emit events from all Game Objects below a Pointer, not just the top one.
    */
  var topOnly: Boolean = js.native
  /**
    * The x coordinates of the ActivePointer based on the first camera in the camera list.
    * This is only safe to use if your game has just 1 non-transformed camera and doesn't use multi-touch.
    */
  val x: Double = js.native
  /**
    * The y coordinates of the ActivePointer based on the first camera in the camera list.
    * This is only safe to use if your game has just 1 non-transformed camera and doesn't use multi-touch.
    */
  val y: Double = js.native
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
    * Clears a Game Object so it no longer has an Interactive Object associated with it.
    * The Game Object is then queued for removal from the Input Plugin on the next update.
    * @param gameObject The Game Object that will have its Interactive Object removed.
    * @param skipQueue Skip adding this Game Object into the removal queue? Default false.
    */
  def clear(gameObject: GameObject): GameObject = js.native
  def clear(gameObject: GameObject, skipQueue: Boolean): GameObject = js.native
  /**
    * Disables Input on a single Game Object.
    * 
    * An input disabled Game Object still retains its Interactive Object component and can be re-enabled
    * at any time, by passing it to `InputPlugin.enable`.
    * @param gameObject The Game Object to have its input system disabled.
    */
  def disable(gameObject: GameObject): Unit = js.native
  /**
    * Enable a Game Object for interaction.
    * 
    * If the Game Object already has an Interactive Object component, it is enabled and returned.
    * 
    * Otherwise, a new Interactive Object component is created and assigned to the Game Object's `input` property.
    * 
    * Input works by using hit areas, these are nearly always geometric shapes, such as rectangles or circles, that act as the hit area
    * for the Game Object. However, you can provide your own hit area shape and callback, should you wish to handle some more advanced
    * input detection.
    * 
    * If no arguments are provided it will try and create a rectangle hit area based on the texture frame the Game Object is using. If
    * this isn't a texture-bound object, such as a Graphics or BitmapText object, this will fail, and you'll need to provide a specific
    * shape for it to use.
    * 
    * You can also provide an Input Configuration Object as the only argument to this method.
    * @param gameObject The Game Object to be enabled for input.
    * @param shape Either an input configuration object, or a geometric shape that defines the hit area for the Game Object. If not specified a Rectangle will be used.
    * @param callback The 'contains' function to invoke to check if the pointer is within the hit area.
    * @param dropZone Is this Game Object a drop zone or not? Default false.
    */
  def enable(gameObject: GameObject): InputPlugin = js.native
  def enable(gameObject: GameObject, shape: js.Any): InputPlugin = js.native
  def enable(gameObject: GameObject, shape: js.Any, callback: HitAreaCallback): InputPlugin = js.native
  def enable(gameObject: GameObject, shape: js.Any, callback: HitAreaCallback, dropZone: Boolean): InputPlugin = js.native
  def enable(gameObject: GameObject, shape: InputConfiguration): InputPlugin = js.native
  def enable(gameObject: GameObject, shape: InputConfiguration, callback: HitAreaCallback): InputPlugin = js.native
  def enable(gameObject: GameObject, shape: InputConfiguration, callback: HitAreaCallback, dropZone: Boolean): InputPlugin = js.native
  /**
    * Creates an Input Debug Shape for the given Game Object.
    * 
    * The Game Object must have _already_ been enabled for input prior to calling this method.
    * 
    * This is intended to assist you during development and debugging.
    * 
    * Debug Shapes can only be created for Game Objects that are using standard Phaser Geometry for input,
    * including: Circle, Ellipse, Line, Polygon, Rectangle and Triangle.
    * 
    * Game Objects that are using their automatic hit areas are using Rectangles by default, so will also work.
    * 
    * The Debug Shape is created and added to the display list and is then kept in sync with the Game Object
    * it is connected with. Should you need to modify it yourself, such as to hide it, you can access it via
    * the Game Object property: `GameObject.input.hitAreaDebug`.
    * 
    * Calling this method on a Game Object that already has a Debug Shape will first destroy the old shape,
    * before creating a new one. If you wish to remove the Debug Shape entirely, you should call the
    * method `InputPlugin.removeDebug`.
    * 
    * Note that the debug shape will only show the outline of the input area. If the input test is using a
    * pixel perfect check, for example, then this is not displayed. If you are using a custom shape, that
    * doesn't extend one of the base Phaser Geometry objects, as your hit area, then this method will not
    * work.
    * @param gameObject The Game Object to create the input debug shape for.
    * @param color The outline color of the debug shape. Default 0x00ff00.
    */
  def enableDebug(gameObject: GameObject): InputPlugin = js.native
  def enableDebug(gameObject: GameObject, color: Double): InputPlugin = js.native
  /**
    * Returns the drag state of the given Pointer for this Input Plugin.
    * 
    * The state will be one of the following:
    * 
    * 0 = Not dragging anything
    * 1 = Primary button down and objects below, so collect a draglist
    * 2 = Pointer being checked if meets drag criteria
    * 3 = Pointer meets criteria, notify the draglist
    * 4 = Pointer actively dragging the draglist and has moved
    * 5 = Pointer actively dragging but has been released, notify draglist
    * @param pointer The Pointer to get the drag state for.
    */
  def getDragState(pointer: Pointer): integer = js.native
  /**
    * Takes the given Pointer and performs a hit test against it, to see which interactive Game Objects
    * it is currently above.
    * 
    * The hit test is performed against which-ever Camera the Pointer is over. If it is over multiple
    * cameras, it starts checking the camera at the top of the camera list, and if nothing is found, iterates down the list.
    * @param pointer The Pointer to check against the Game Objects.
    */
  def hitTestPointer(pointer: Pointer): js.Array[GameObject] = js.native
  /**
    * Checks to see if both this plugin and the Scene to which it belongs is active.
    */
  def isActive(): Boolean = js.native
  /**
    * Creates a function that can be passed to `setInteractive`, `enable` or `setHitArea` that will handle
    * pixel-perfect input detection on an Image or Sprite based Game Object, or any custom class that extends them.
    * 
    * The following will create a sprite that is clickable on any pixel that has an alpha value >= 1.
    * 
    * ```javascript
    * this.add.sprite(x, y, key).setInteractive(this.input.makePixelPerfect());
    * ```
    * 
    * The following will create a sprite that is clickable on any pixel that has an alpha value >= 150.
    * 
    * ```javascript
    * this.add.sprite(x, y, key).setInteractive(this.input.makePixelPerfect(150));
    * ```
    * 
    * Once you have made an Interactive Object pixel perfect it impacts all input related events for it: down, up,
    * dragstart, drag, etc.
    * 
    * As a pointer interacts with the Game Object it will constantly poll the texture, extracting a single pixel from
    * the given coordinates and checking its color values. This is an expensive process, so should only be enabled on
    * Game Objects that really need it.
    * 
    * You cannot make non-texture based Game Objects pixel perfect. So this will not work on Graphics, BitmapText,
    * Render Textures, Text, Tilemaps, Containers or Particles.
    * @param alphaTolerance The alpha level that the pixel should be above to be included as a successful interaction. Default 1.
    */
  def makePixelPerfect(): js.Function = js.native
  def makePixelPerfect(alphaTolerance: integer): js.Function = js.native
  /**
    * Removes an Input Debug Shape from the given Game Object.
    * 
    * The shape is destroyed immediately and the `hitAreaDebug` property is set to `null`.
    * @param gameObject The Game Object to remove the input debug shape from.
    */
  def removeDebug(gameObject: GameObject): InputPlugin = js.native
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
  def setDefaultCursor(cursor: String): InputPlugin = js.native
  /**
    * Sets the drag state of the given Pointer for this Input Plugin.
    * 
    * The state must be one of the following values:
    * 
    * 0 = Not dragging anything
    * 1 = Primary button down and objects below, so collect a draglist
    * 2 = Pointer being checked if meets drag criteria
    * 3 = Pointer meets criteria, notify the draglist
    * 4 = Pointer actively dragging the draglist and has moved
    * 5 = Pointer actively dragging but has been released, notify draglist
    * @param pointer The Pointer to set the drag state for.
    * @param state The drag state value. An integer between 0 and 5.
    */
  def setDragState(pointer: Pointer, state: integer): Unit = js.native
  def setDraggable(gameObjects: js.Array[GameObject]): InputPlugin = js.native
  def setDraggable(gameObjects: js.Array[GameObject], value: Boolean): InputPlugin = js.native
  /**
    * Sets the draggable state of the given array of Game Objects.
    * 
    * They can either be set to be draggable, or can have their draggable state removed by passing `false`.
    * 
    * A Game Object will not fire drag events unless it has been specifically enabled for drag.
    * @param gameObjects An array of Game Objects to change the draggable state on.
    * @param value Set to `true` if the Game Objects should be made draggable, `false` if they should be unset. Default true.
    */
  def setDraggable(gameObjects: GameObject): InputPlugin = js.native
  def setDraggable(gameObjects: GameObject, value: Boolean): InputPlugin = js.native
  /**
    * When set to `true` the global Input Manager will emulate DOM behavior by only emitting events from
    * the top-most Scene in the Scene List. By default, if a Scene receives an input event it will then stop the event
    * from flowing down to any Scenes below it in the Scene list. To disable this behavior call this method with `false`.
    * @param value Set to `true` to stop processing input events on the Scene that receives it, or `false` to let the event continue down the Scene list.
    */
  def setGlobalTopOnly(value: Boolean): InputPlugin = js.native
  def setHitArea(gameObjects: js.Array[GameObject]): InputPlugin = js.native
  def setHitArea(gameObjects: js.Array[GameObject], shape: js.Any): InputPlugin = js.native
  def setHitArea(gameObjects: js.Array[GameObject], shape: js.Any, callback: HitAreaCallback): InputPlugin = js.native
  def setHitArea(gameObjects: js.Array[GameObject], shape: InputConfiguration): InputPlugin = js.native
  def setHitArea(gameObjects: js.Array[GameObject], shape: InputConfiguration, callback: HitAreaCallback): InputPlugin = js.native
  /**
    * Sets the hit area for the given array of Game Objects.
    * 
    * A hit area is typically one of the geometric shapes Phaser provides, such as a `Phaser.Geom.Rectangle`
    * or `Phaser.Geom.Circle`. However, it can be any object as long as it works with the provided callback.
    * 
    * If no hit area is provided a Rectangle is created based on the size of the Game Object, if possible
    * to calculate.
    * 
    * The hit area callback is the function that takes an `x` and `y` coordinate and returns a boolean if
    * those values fall within the area of the shape or not. All of the Phaser geometry objects provide this,
    * such as `Phaser.Geom.Rectangle.Contains`.
    * @param gameObjects An array of Game Objects to set the hit area on.
    * @param shape Either an input configuration object, or a geometric shape that defines the hit area for the Game Object. If not specified a Rectangle will be used.
    * @param callback The 'contains' function to invoke to check if the pointer is within the hit area.
    */
  def setHitArea(gameObjects: GameObject): InputPlugin = js.native
  def setHitArea(gameObjects: GameObject, shape: js.Any): InputPlugin = js.native
  def setHitArea(gameObjects: GameObject, shape: js.Any, callback: HitAreaCallback): InputPlugin = js.native
  def setHitArea(gameObjects: GameObject, shape: InputConfiguration): InputPlugin = js.native
  def setHitArea(gameObjects: GameObject, shape: InputConfiguration, callback: HitAreaCallback): InputPlugin = js.native
  def setHitAreaCircle(gameObjects: js.Array[GameObject], x: Double, y: Double, radius: Double): InputPlugin = js.native
  def setHitAreaCircle(gameObjects: js.Array[GameObject], x: Double, y: Double, radius: Double, callback: HitAreaCallback): InputPlugin = js.native
  /**
    * Sets the hit area for an array of Game Objects to be a `Phaser.Geom.Circle` shape, using
    * the given coordinates and radius to control its position and size.
    * @param gameObjects An array of Game Objects to set as having a circle hit area.
    * @param x The center of the circle.
    * @param y The center of the circle.
    * @param radius The radius of the circle.
    * @param callback The hit area callback. If undefined it uses Circle.Contains.
    */
  def setHitAreaCircle(gameObjects: GameObject, x: Double, y: Double, radius: Double): InputPlugin = js.native
  def setHitAreaCircle(gameObjects: GameObject, x: Double, y: Double, radius: Double, callback: HitAreaCallback): InputPlugin = js.native
  def setHitAreaEllipse(gameObjects: js.Array[GameObject], x: Double, y: Double, width: Double, height: Double): InputPlugin = js.native
  def setHitAreaEllipse(
    gameObjects: js.Array[GameObject],
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    callback: HitAreaCallback
  ): InputPlugin = js.native
  /**
    * Sets the hit area for an array of Game Objects to be a `Phaser.Geom.Ellipse` shape, using
    * the given coordinates and dimensions to control its position and size.
    * @param gameObjects An array of Game Objects to set as having an ellipse hit area.
    * @param x The center of the ellipse.
    * @param y The center of the ellipse.
    * @param width The width of the ellipse.
    * @param height The height of the ellipse.
    * @param callback The hit area callback. If undefined it uses Ellipse.Contains.
    */
  def setHitAreaEllipse(gameObjects: GameObject, x: Double, y: Double, width: Double, height: Double): InputPlugin = js.native
  def setHitAreaEllipse(
    gameObjects: GameObject,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    callback: HitAreaCallback
  ): InputPlugin = js.native
  def setHitAreaFromTexture(gameObjects: js.Array[GameObject]): InputPlugin = js.native
  def setHitAreaFromTexture(gameObjects: js.Array[GameObject], callback: HitAreaCallback): InputPlugin = js.native
  /**
    * Sets the hit area for an array of Game Objects to be a `Phaser.Geom.Rectangle` shape, using
    * the Game Objects texture frame to define the position and size of the hit area.
    * @param gameObjects An array of Game Objects to set as having an ellipse hit area.
    * @param callback The hit area callback. If undefined it uses Rectangle.Contains.
    */
  def setHitAreaFromTexture(gameObjects: GameObject): InputPlugin = js.native
  def setHitAreaFromTexture(gameObjects: GameObject, callback: HitAreaCallback): InputPlugin = js.native
  def setHitAreaRectangle(gameObjects: js.Array[GameObject], x: Double, y: Double, width: Double, height: Double): InputPlugin = js.native
  def setHitAreaRectangle(
    gameObjects: js.Array[GameObject],
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    callback: HitAreaCallback
  ): InputPlugin = js.native
  /**
    * Sets the hit area for an array of Game Objects to be a `Phaser.Geom.Rectangle` shape, using
    * the given coordinates and dimensions to control its position and size.
    * @param gameObjects An array of Game Objects to set as having a rectangular hit area.
    * @param x The top-left of the rectangle.
    * @param y The top-left of the rectangle.
    * @param width The width of the rectangle.
    * @param height The height of the rectangle.
    * @param callback The hit area callback. If undefined it uses Rectangle.Contains.
    */
  def setHitAreaRectangle(gameObjects: GameObject, x: Double, y: Double, width: Double, height: Double): InputPlugin = js.native
  def setHitAreaRectangle(
    gameObjects: GameObject,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    callback: HitAreaCallback
  ): InputPlugin = js.native
  def setHitAreaTriangle(
    gameObjects: js.Array[GameObject],
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double
  ): InputPlugin = js.native
  def setHitAreaTriangle(
    gameObjects: js.Array[GameObject],
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    callback: HitAreaCallback
  ): InputPlugin = js.native
  /**
    * Sets the hit area for an array of Game Objects to be a `Phaser.Geom.Triangle` shape, using
    * the given coordinates to control the position of its points.
    * @param gameObjects An array of Game Objects to set as having a  triangular hit area.
    * @param x1 The x coordinate of the first point of the triangle.
    * @param y1 The y coordinate of the first point of the triangle.
    * @param x2 The x coordinate of the second point of the triangle.
    * @param y2 The y coordinate of the second point of the triangle.
    * @param x3 The x coordinate of the third point of the triangle.
    * @param y3 The y coordinate of the third point of the triangle.
    * @param callback The hit area callback. If undefined it uses Triangle.Contains.
    */
  def setHitAreaTriangle(gameObjects: GameObject, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): InputPlugin = js.native
  def setHitAreaTriangle(
    gameObjects: GameObject,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    callback: HitAreaCallback
  ): InputPlugin = js.native
  /**
    * Sets the Pointers to always poll.
    * 
    * When a pointer is polled it runs a hit test to see which Game Objects are currently below it,
    * or being interacted with it, regardless if the Pointer has actually moved or not.
    * 
    * You should enable this if you want objects in your game to fire over / out events, and the objects
    * are constantly moving, but the pointer may not have. Polling every frame has additional computation
    * costs, especially if there are a large number of interactive objects in your game.
    */
  def setPollAlways(): InputPlugin = js.native
  /**
    * Sets the Pointers to only poll when they are moved or updated.
    * 
    * When a pointer is polled it runs a hit test to see which Game Objects are currently below it,
    * or being interacted with it.
    */
  def setPollOnMove(): InputPlugin = js.native
  /**
    * Sets the poll rate value. This is the amount of time that should have elapsed before a pointer
    * will be polled again. See the `setPollAlways` and `setPollOnMove` methods.
    * @param value The amount of time, in ms, that should elapsed before re-polling the pointers.
    */
  def setPollRate(value: Double): InputPlugin = js.native
  /**
    * When set to `true` this Input Plugin will emulate DOM behavior by only emitting events from
    * the top-most Game Objects in the Display List.
    * 
    * If set to `false` it will emit events from all Game Objects below a Pointer, not just the top one.
    * @param value `true` to only include the top-most Game Object, or `false` to include all Game Objects in a hit test.
    */
  def setTopOnly(value: Boolean): InputPlugin = js.native
  /**
    * Given an array of Game Objects, sort the array and return it, so that the objects are in depth index order
    * with the lowest at the bottom.
    * @param gameObjects An array of Game Objects to be sorted.
    */
  def sortGameObjects(gameObjects: js.Array[GameObject]): js.Array[GameObject] = js.native
  /**
    * This method should be called from within an input event handler, such as `pointerdown`.
    * 
    * When called, it stops the Input Manager from allowing _this specific event_ to be processed by any other Scene
    * not yet handled in the scene list.
    */
  def stopPropagation(): InputPlugin = js.native
  /**
    * This is called automatically by the Input Manager.
    * It emits events for plugins to listen to and also handles polling updates, if enabled.
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def updatePoll(time: Double, delta: Double): Boolean = js.native
}

