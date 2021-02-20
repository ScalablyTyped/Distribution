package typings.phaser.Phaser

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Cameras.Scene2D.CameraManager
import typings.phaser.Phaser.Core.Config
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.GameObjects.DisplayList
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Input.Gamepad.GamepadPlugin
import typings.phaser.Phaser.Input.Keyboard.KeyboardManager
import typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin
import typings.phaser.Phaser.Input.Mouse.MouseManager
import typings.phaser.Phaser.Input.Touch.TouchManager
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Scale.ScaleManager
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Types.Input.HitAreaCallback
import typings.phaser.Phaser.Types.Input.InputConfiguration
import typings.phaser.Phaser.Types.Input.InteractiveObject
import typings.phaser.Phaser.Types.Input.Keyboard.CursorKeys
import typings.phaser.Phaser.Types.Input.Keyboard.KeyComboConfig
import typings.phaser.Phaser.Types.Scenes.SettingsObject
import typings.phaser.integer
import typings.std.GamepadHapticActuator
import typings.std.HTMLCanvasElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  object Gamepad {
    
    /**
      * Contains information about a specific Gamepad Axis.
      * Axis objects are created automatically by the Gamepad as they are needed.
      */
    @js.native
    trait Axis extends StObject {
      
      /**
        * Destroys this Axis instance and releases external references it holds.
        */
      def destroy(): Unit = js.native
      
      /**
        * An event emitter to use to emit the axis events.
        */
      var events: EventEmitter = js.native
      
      /**
        * Applies the `threshold` value to the axis and returns it.
        */
      def getValue(): Double = js.native
      
      /**
        * The index of this Axis.
        */
      var index: integer = js.native
      
      /**
        * A reference to the Gamepad that this Axis belongs to.
        */
      var pad: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
      
      /**
        * Movement tolerance threshold below which axis values are ignored in `getValue`.
        */
      var threshold: Double = js.native
      
      /**
        * The raw axis value, between -1 and 1 with 0 being dead center.
        * Use the method `getValue` to get a normalized value with the threshold applied.
        */
      var value: Double = js.native
    }
    object Axis {
      
      @scala.inline
      def apply(
        destroy: () => Unit,
        events: EventEmitter,
        getValue: () => Double,
        index: integer,
        pad: typings.phaser.Phaser.Input.Gamepad.Gamepad,
        threshold: Double,
        value: Double
      ): Axis = {
        val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getValue = js.Any.fromFunction0(getValue), index = index.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Axis]
      }
      
      @scala.inline
      implicit class AxisMutableBuilder[Self <: Axis] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEvents(value: EventEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetValue(value: () => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIndex(value: integer): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPad(value: typings.phaser.Phaser.Input.Gamepad.Gamepad): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Contains information about a specific button on a Gamepad.
      * Button objects are created automatically by the Gamepad as they are needed.
      */
    @js.native
    trait Button extends StObject {
      
      /**
        * Destroys this Button instance and releases external references it holds.
        */
      def destroy(): Unit = js.native
      
      /**
        * An event emitter to use to emit the button events.
        */
      var events: EventEmitter = js.native
      
      /**
        * The index of this Button.
        */
      var index: integer = js.native
      
      /**
        * A reference to the Gamepad that this Button belongs to.
        */
      var pad: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
      
      /**
        * Is the Button being pressed down or not?
        */
      var pressed: Boolean = js.native
      
      /**
        * Can be set for analogue buttons to enable a 'pressure' threshold,
        * before a button is considered as being 'pressed'.
        */
      var threshold: Double = js.native
      
      /**
        * Between 0 and 1.
        */
      var value: Double = js.native
    }
    object Button {
      
      @scala.inline
      def apply(
        destroy: () => Unit,
        events: EventEmitter,
        index: integer,
        pad: typings.phaser.Phaser.Input.Gamepad.Gamepad,
        pressed: Boolean,
        threshold: Double,
        value: Double
      ): Button = {
        val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Button]
      }
      
      @scala.inline
      implicit class ButtonMutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEvents(value: EventEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndex(value: integer): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPad(value: typings.phaser.Phaser.Input.Gamepad.Gamepad): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A single Gamepad.
      * 
      * These are created, updated and managed by the Gamepad Plugin.
      */
    @js.native
    trait Gamepad extends EventEmitter {
      
      /**
        * Is the Gamepad's bottom button in the right button cluster being pressed?
        * If the Gamepad doesn't have this button it will always return false.
        * On a Dual Shock controller it's the X button.
        * On an XBox controller it's the A button.
        */
      var A: Boolean = js.native
      
      /**
        * Is the Gamepad's right button in the right button cluster being pressed?
        * If the Gamepad doesn't have this button it will always return false.
        * On a Dual Shock controller it's the Circle button.
        * On an XBox controller it's the B button.
        */
      var B: Boolean = js.native
      
      /**
        * Returns the value of the Gamepad's top left shoulder button.
        * If the Gamepad doesn't have this button it will always return zero.
        * The value is a float between 0 and 1, corresponding to how depressed the button is.
        * On a Dual Shock controller it's the L1 button.
        * On an XBox controller it's the LB button.
        */
      var L1: Double = js.native
      
      /**
        * Returns the value of the Gamepad's bottom left shoulder button.
        * If the Gamepad doesn't have this button it will always return zero.
        * The value is a float between 0 and 1, corresponding to how depressed the button is.
        * On a Dual Shock controller it's the L2 button.
        * On an XBox controller it's the LT button.
        */
      var L2: Double = js.native
      
      /**
        * Returns the value of the Gamepad's top right shoulder button.
        * If the Gamepad doesn't have this button it will always return zero.
        * The value is a float between 0 and 1, corresponding to how depressed the button is.
        * On a Dual Shock controller it's the R1 button.
        * On an XBox controller it's the RB button.
        */
      var R1: Double = js.native
      
      /**
        * Returns the value of the Gamepad's bottom right shoulder button.
        * If the Gamepad doesn't have this button it will always return zero.
        * The value is a float between 0 and 1, corresponding to how depressed the button is.
        * On a Dual Shock controller it's the R2 button.
        * On an XBox controller it's the RT button.
        */
      var R2: Double = js.native
      
      /**
        * Is the Gamepad's left button in the right button cluster being pressed?
        * If the Gamepad doesn't have this button it will always return false.
        * On a Dual Shock controller it's the Square button.
        * On an XBox controller it's the X button.
        */
      var X: Boolean = js.native
      
      /**
        * Is the Gamepad's top button in the right button cluster being pressed?
        * If the Gamepad doesn't have this button it will always return false.
        * On a Dual Shock controller it's the Triangle button.
        * On an XBox controller it's the Y button.
        */
      var Y: Boolean = js.native
      
      /**
        * An array of Gamepad Axis objects, corresponding to the different axes available on the Gamepad, if any.
        */
      var axes: js.Array[Axis] = js.native
      
      /**
        * An array of Gamepad Button objects, corresponding to the different buttons available on the Gamepad.
        */
      var buttons: js.Array[Button] = js.native
      
      /**
        * Is this Gamepad currently connected or not?
        */
      var connected: Boolean = js.native
      
      /**
        * Is the Gamepad's Down button being pressed?
        * If the Gamepad doesn't have this button it will always return false.
        * This is the d-pad down button under standard Gamepad mapping.
        */
      var down: Boolean = js.native
      
      /**
        * Gets the total number of axis this Gamepad claims to support.
        */
      def getAxisTotal(): integer = js.native
      
      /**
        * Gets the value of an axis based on the given index.
        * The index must be valid within the range of axes supported by this Gamepad.
        * The return value will be a float between 0 and 1.
        * @param index The index of the axes to get the value for.
        */
      def getAxisValue(index: integer): Double = js.native
      
      /**
        * Gets the total number of buttons this Gamepad claims to have.
        */
      def getButtonTotal(): integer = js.native
      
      /**
        * Gets the value of a button based on the given index.
        * The index must be valid within the range of buttons supported by this Gamepad.
        * 
        * The return value will be either 0 or 1 for an analogue button, or a float between 0 and 1
        * for a pressure-sensitive digital button, such as the shoulder buttons on a Dual Shock.
        * @param index The index of the button to get the value for.
        */
      def getButtonValue(index: integer): Double = js.native
      
      /**
        * A string containing some information about the controller.
        * 
        * This is not strictly specified, but in Firefox it will contain three pieces of information
        * separated by dashes (-): two 4-digit hexadecimal strings containing the USB vendor and
        * product id of the controller, and the name of the controller as provided by the driver.
        * In Chrome it will contain the name of the controller as provided by the driver,
        * followed by vendor and product 4-digit hexadecimal strings.
        */
      var id: String = js.native
      
      /**
        * An integer that is unique for each Gamepad currently connected to the system.
        * This can be used to distinguish multiple controllers.
        * Note that disconnecting a device and then connecting a new device may reuse the previous index.
        */
      var index: Double = js.native
      
      /**
        * Returns if the button is pressed down or not.
        * The index must be valid within the range of buttons supported by this Gamepad.
        * @param index The index of the button to get the value for.
        */
      def isButtonDown(index: integer): Boolean = js.native
      
      /**
        * Is the Gamepad's Left button being pressed?
        * If the Gamepad doesn't have this button it will always return false.
        * This is the d-pad left button under standard Gamepad mapping.
        */
      var left: Boolean = js.native
      
      /**
        * A Vector2 containing the most recent values from the Gamepad's left axis stick.
        * This is updated automatically as part of the Gamepad.update cycle.
        * The H Axis is mapped to the `Vector2.x` property, and the V Axis to the `Vector2.y` property.
        * The values are based on the Axis thresholds.
        * If the Gamepad does not have a left axis stick, the values will always be zero.
        */
      var leftStick: Vector2 = js.native
      
      /**
        * A reference to the Gamepad Plugin.
        */
      var manager: GamepadPlugin = js.native
      
      /**
        * A reference to the native Gamepad object that is connected to the browser.
        */
      var pad: js.Any = js.native
      
      /**
        * Is the Gamepad's Right button being pressed?
        * If the Gamepad doesn't have this button it will always return false.
        * This is the d-pad right button under standard Gamepad mapping.
        */
      var right: Boolean = js.native
      
      /**
        * A Vector2 containing the most recent values from the Gamepad's right axis stick.
        * This is updated automatically as part of the Gamepad.update cycle.
        * The H Axis is mapped to the `Vector2.x` property, and the V Axis to the `Vector2.y` property.
        * The values are based on the Axis thresholds.
        * If the Gamepad does not have a right axis stick, the values will always be zero.
        */
      var rightStick: Vector2 = js.native
      
      /**
        * Sets the threshold value of all axis on this Gamepad.
        * The value is a float between 0 and 1 and is the amount below which the axis is considered as not having been moved.
        * @param value A value between 0 and 1.
        */
      def setAxisThreshold(value: Double): Unit = js.native
      
      /**
        * A timestamp containing the most recent time this Gamepad was updated.
        */
      var timestamp: Double = js.native
      
      /**
        * Is the Gamepad's Up button being pressed?
        * If the Gamepad doesn't have this button it will always return false.
        * This is the d-pad up button under standard Gamepad mapping.
        */
      var up: Boolean = js.native
      
      /**
        * The Gamepad's Haptic Actuator (Vibration / Rumble support).
        * This is highly experimental and only set if both present on the device,
        * and exposed by both the hardware and browser.
        */
      var vibration: GamepadHapticActuator = js.native
    }
    
    /**
      * The Gamepad Plugin is an input plugin that belongs to the Scene-owned Input system.
      * 
      * Its role is to listen for native DOM Gamepad Events and then process them.
      * 
      * You do not need to create this class directly, the Input system will create an instance of it automatically.
      * 
      * You can access it from within a Scene using `this.input.gamepad`.
      * 
      * To listen for a gamepad being connected:
      * 
      * ```javascript
      * this.input.gamepad.once('connected', function (pad) {
      *     //   'pad' is a reference to the gamepad that was just connected
      * });
      * ```
      * 
      * Note that the browser may require you to press a button on a gamepad before it will allow you to access it,
      * this is for security reasons. However, it may also trust the page already, in which case you won't get the
      * 'connected' event and instead should check `GamepadPlugin.total` to see if it thinks there are any gamepads
      * already connected.
      * 
      * Once you have received the connected event, or polled the gamepads and found them enabled, you can access
      * them via the built-in properties `GamepadPlugin.pad1` to `pad4`, for up to 4 game pads. With a reference
      * to the gamepads you can poll its buttons and axis sticks. See the properties and methods available on
      * the `Gamepad` class for more details.
      * 
      * For more information about Gamepad support in browsers see the following resources:
      * 
      * https://developer.mozilla.org/en-US/docs/Web/API/Gamepad_API
      * https://developer.mozilla.org/en-US/docs/Web/API/Gamepad_API/Using_the_Gamepad_API
      * https://www.smashingmagazine.com/2015/11/gamepad-api-in-web-games/
      * http://html5gamepad.com/
      */
    @js.native
    trait GamepadPlugin extends EventEmitter {
      
      /**
        * Disconnects all current Gamepads.
        */
      def disconnectAll(): Unit = js.native
      
      /**
        * A boolean that controls if the Gamepad Manager is enabled or not.
        * Can be toggled on the fly.
        */
      var enabled: Boolean = js.native
      
      /**
        * An array of the connected Gamepads.
        */
      var gamepads: js.Array[typings.phaser.Phaser.Input.Gamepad.Gamepad] = js.native
      
      /**
        * Returns an array of all currently connected Gamepads.
        */
      def getAll(): js.Array[typings.phaser.Phaser.Input.Gamepad.Gamepad] = js.native
      
      /**
        * Looks-up a single Gamepad based on the given index value.
        * @param index The index of the Gamepad to get.
        */
      def getPad(index: Double): typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
      
      /**
        * Checks to see if both this plugin and the Scene to which it belongs is active.
        */
      def isActive(): Boolean = js.native
      
      /**
        * A reference to the first connected Gamepad.
        * 
        * This will be undefined if either no pads are connected, or the browser
        * has not yet issued a gamepadconnect, which can happen even if a Gamepad
        * is plugged in, but hasn't yet had any buttons pressed on it.
        */
      var pad1: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
      
      /**
        * A reference to the second connected Gamepad.
        * 
        * This will be undefined if either no pads are connected, or the browser
        * has not yet issued a gamepadconnect, which can happen even if a Gamepad
        * is plugged in, but hasn't yet had any buttons pressed on it.
        */
      var pad2: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
      
      /**
        * A reference to the third connected Gamepad.
        * 
        * This will be undefined if either no pads are connected, or the browser
        * has not yet issued a gamepadconnect, which can happen even if a Gamepad
        * is plugged in, but hasn't yet had any buttons pressed on it.
        */
      var pad3: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
      
      /**
        * A reference to the fourth connected Gamepad.
        * 
        * This will be undefined if either no pads are connected, or the browser
        * has not yet issued a gamepadconnect, which can happen even if a Gamepad
        * is plugged in, but hasn't yet had any buttons pressed on it.
        */
      var pad4: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
      
      /**
        * A reference to the Scene that this Input Plugin is responsible for.
        */
      var scene: Scene = js.native
      
      /**
        * A reference to the Scene Input Plugin that created this Keyboard Plugin.
        */
      var sceneInputPlugin: InputPlugin = js.native
      
      /**
        * A reference to the Scene Systems Settings.
        */
      var settings: SettingsObject = js.native
      
      /**
        * The Gamepad Event target, as defined in the Game Config.
        * Typically the browser window, but can be any interactive DOM element.
        */
      var target: js.Any = js.native
      
      /**
        * The total number of connected game pads.
        */
      var total: integer = js.native
    }
  }
  
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
  @js.native
  trait InputManager extends StObject {
    
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
      * Destroys the Input Manager and all of its systems.
      * 
      * There is no way to recover from doing this.
      */
    def destroy(): Unit = js.native
    
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
      * The time this Input Manager was last updated.
      * This value is populated by the Game Step each frame.
      */
    val time: Double = js.native
    
    /**
      * A reference to the Touch Manager class, if enabled via the `input.touch` Game Config property.
      */
    var touch: TouchManager = js.native
    
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
  @js.native
  trait InputPlugin extends EventEmitter {
    
    /**
      * The current active input Pointer.
      */
    val activePointer: Pointer = js.native
    
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
      * A reference to the Scene Cameras Manager. This property is set during the `boot` method.
      */
    var cameras: CameraManager = js.native
    
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
    def enable(gameObject: GameObject): this.type = js.native
    def enable(
      gameObject: GameObject,
      shape: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      dropZone: Boolean
    ): this.type = js.native
    def enable(gameObject: GameObject, shape: js.UndefOr[scala.Nothing], callback: HitAreaCallback): this.type = js.native
    def enable(
      gameObject: GameObject,
      shape: js.UndefOr[scala.Nothing],
      callback: HitAreaCallback,
      dropZone: Boolean
    ): this.type = js.native
    def enable(gameObject: GameObject, shape: js.Any): this.type = js.native
    def enable(gameObject: GameObject, shape: js.Any, callback: js.UndefOr[scala.Nothing], dropZone: Boolean): this.type = js.native
    def enable(gameObject: GameObject, shape: js.Any, callback: HitAreaCallback): this.type = js.native
    def enable(gameObject: GameObject, shape: js.Any, callback: HitAreaCallback, dropZone: Boolean): this.type = js.native
    def enable(gameObject: GameObject, shape: InputConfiguration): this.type = js.native
    def enable(
      gameObject: GameObject,
      shape: InputConfiguration,
      callback: js.UndefOr[scala.Nothing],
      dropZone: Boolean
    ): this.type = js.native
    def enable(gameObject: GameObject, shape: InputConfiguration, callback: HitAreaCallback): this.type = js.native
    def enable(gameObject: GameObject, shape: InputConfiguration, callback: HitAreaCallback, dropZone: Boolean): this.type = js.native
    
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
    def enableDebug(gameObject: GameObject): this.type = js.native
    def enableDebug(gameObject: GameObject, color: Double): this.type = js.native
    
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
      * Are any mouse or touch pointers currently over the game canvas?
      */
    val isOver: Boolean = js.native
    
    /**
      * An instance of the Keyboard Plugin class, if enabled via the `input.keyboard` Scene or Game Config property.
      * Use this to create Key objects and listen for keyboard specific events.
      */
    var keyboard: KeyboardPlugin = js.native
    
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
      * Removes an Input Debug Shape from the given Game Object.
      * 
      * The shape is destroyed immediately and the `hitAreaDebug` property is set to `null`.
      * @param gameObject The Game Object to remove the input debug shape from.
      */
    def removeDebug(gameObject: GameObject): this.type = js.native
    
    /**
      * A reference to the Scene that this Input Plugin is responsible for.
      */
    var scene: Scene = js.native
    
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
    def setDefaultCursor(cursor: String): this.type = js.native
    
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
    
    def setDraggable(gameObjects: js.Array[GameObject]): this.type = js.native
    def setDraggable(gameObjects: js.Array[GameObject], value: Boolean): this.type = js.native
    /**
      * Sets the draggable state of the given array of Game Objects.
      * 
      * They can either be set to be draggable, or can have their draggable state removed by passing `false`.
      * 
      * A Game Object will not fire drag events unless it has been specifically enabled for drag.
      * @param gameObjects An array of Game Objects to change the draggable state on.
      * @param value Set to `true` if the Game Objects should be made draggable, `false` if they should be unset. Default true.
      */
    def setDraggable(gameObjects: GameObject): this.type = js.native
    def setDraggable(gameObjects: GameObject, value: Boolean): this.type = js.native
    
    /**
      * When set to `true` the global Input Manager will emulate DOM behavior by only emitting events from
      * the top-most Scene in the Scene List. By default, if a Scene receives an input event it will then stop the event
      * from flowing down to any Scenes below it in the Scene list. To disable this behavior call this method with `false`.
      * @param value Set to `true` to stop processing input events on the Scene that receives it, or `false` to let the event continue down the Scene list.
      */
    def setGlobalTopOnly(value: Boolean): this.type = js.native
    
    def setHitArea(gameObjects: js.Array[GameObject]): this.type = js.native
    def setHitArea(gameObjects: js.Array[GameObject], shape: js.UndefOr[scala.Nothing], callback: HitAreaCallback): this.type = js.native
    def setHitArea(gameObjects: js.Array[GameObject], shape: js.Any): this.type = js.native
    def setHitArea(gameObjects: js.Array[GameObject], shape: js.Any, callback: HitAreaCallback): this.type = js.native
    def setHitArea(gameObjects: js.Array[GameObject], shape: InputConfiguration): this.type = js.native
    def setHitArea(gameObjects: js.Array[GameObject], shape: InputConfiguration, callback: HitAreaCallback): this.type = js.native
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
    def setHitArea(gameObjects: GameObject): this.type = js.native
    def setHitArea(gameObjects: GameObject, shape: js.UndefOr[scala.Nothing], callback: HitAreaCallback): this.type = js.native
    def setHitArea(gameObjects: GameObject, shape: js.Any): this.type = js.native
    def setHitArea(gameObjects: GameObject, shape: js.Any, callback: HitAreaCallback): this.type = js.native
    def setHitArea(gameObjects: GameObject, shape: InputConfiguration): this.type = js.native
    def setHitArea(gameObjects: GameObject, shape: InputConfiguration, callback: HitAreaCallback): this.type = js.native
    
    def setHitAreaCircle(gameObjects: js.Array[GameObject], x: Double, y: Double, radius: Double): this.type = js.native
    def setHitAreaCircle(gameObjects: js.Array[GameObject], x: Double, y: Double, radius: Double, callback: HitAreaCallback): this.type = js.native
    /**
      * Sets the hit area for an array of Game Objects to be a `Phaser.Geom.Circle` shape, using
      * the given coordinates and radius to control its position and size.
      * @param gameObjects An array of Game Objects to set as having a circle hit area.
      * @param x The center of the circle.
      * @param y The center of the circle.
      * @param radius The radius of the circle.
      * @param callback The hit area callback. If undefined it uses Circle.Contains.
      */
    def setHitAreaCircle(gameObjects: GameObject, x: Double, y: Double, radius: Double): this.type = js.native
    def setHitAreaCircle(gameObjects: GameObject, x: Double, y: Double, radius: Double, callback: HitAreaCallback): this.type = js.native
    
    def setHitAreaEllipse(gameObjects: js.Array[GameObject], x: Double, y: Double, width: Double, height: Double): this.type = js.native
    def setHitAreaEllipse(
      gameObjects: js.Array[GameObject],
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      callback: HitAreaCallback
    ): this.type = js.native
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
    def setHitAreaEllipse(gameObjects: GameObject, x: Double, y: Double, width: Double, height: Double): this.type = js.native
    def setHitAreaEllipse(
      gameObjects: GameObject,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      callback: HitAreaCallback
    ): this.type = js.native
    
    def setHitAreaFromTexture(gameObjects: js.Array[GameObject]): this.type = js.native
    def setHitAreaFromTexture(gameObjects: js.Array[GameObject], callback: HitAreaCallback): this.type = js.native
    /**
      * Sets the hit area for an array of Game Objects to be a `Phaser.Geom.Rectangle` shape, using
      * the Game Objects texture frame to define the position and size of the hit area.
      * @param gameObjects An array of Game Objects to set as having an ellipse hit area.
      * @param callback The hit area callback. If undefined it uses Rectangle.Contains.
      */
    def setHitAreaFromTexture(gameObjects: GameObject): this.type = js.native
    def setHitAreaFromTexture(gameObjects: GameObject, callback: HitAreaCallback): this.type = js.native
    
    def setHitAreaRectangle(gameObjects: js.Array[GameObject], x: Double, y: Double, width: Double, height: Double): this.type = js.native
    def setHitAreaRectangle(
      gameObjects: js.Array[GameObject],
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      callback: HitAreaCallback
    ): this.type = js.native
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
    def setHitAreaRectangle(gameObjects: GameObject, x: Double, y: Double, width: Double, height: Double): this.type = js.native
    def setHitAreaRectangle(
      gameObjects: GameObject,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      callback: HitAreaCallback
    ): this.type = js.native
    
    def setHitAreaTriangle(
      gameObjects: js.Array[GameObject],
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double
    ): this.type = js.native
    def setHitAreaTriangle(
      gameObjects: js.Array[GameObject],
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      callback: HitAreaCallback
    ): this.type = js.native
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
    def setHitAreaTriangle(gameObjects: GameObject, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): this.type = js.native
    def setHitAreaTriangle(
      gameObjects: GameObject,
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      callback: HitAreaCallback
    ): this.type = js.native
    
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
    def setPollAlways(): this.type = js.native
    
    /**
      * Sets the Pointers to only poll when they are moved or updated.
      * 
      * When a pointer is polled it runs a hit test to see which Game Objects are currently below it,
      * or being interacted with it.
      */
    def setPollOnMove(): this.type = js.native
    
    /**
      * Sets the poll rate value. This is the amount of time that should have elapsed before a pointer
      * will be polled again. See the `setPollAlways` and `setPollOnMove` methods.
      * @param value The amount of time, in ms, that should elapsed before re-polling the pointers.
      */
    def setPollRate(value: Double): this.type = js.native
    
    /**
      * When set to `true` this Input Plugin will emulate DOM behavior by only emitting events from
      * the top-most Game Objects in the Display List.
      * 
      * If set to `false` it will emit events from all Game Objects below a Pointer, not just the top one.
      * @param value `true` to only include the top-most Game Object, or `false` to include all Game Objects in a hit test.
      */
    def setTopOnly(value: Boolean): this.type = js.native
    
    /**
      * A reference to the Scene Systems Settings.
      */
    var settings: SettingsObject = js.native
    
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
    def stopPropagation(): this.type = js.native
    
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
      * This is called automatically by the Input Manager.
      * It emits events for plugins to listen to and also handles polling updates, if enabled.
      * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def updatePoll(time: Double, delta: Double): Boolean = js.native
    
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
  }
  
  object Keyboard {
    
    /**
      * A generic Key object which can be passed to the Process functions (and so on)
      * keycode must be an integer
      */
    @js.native
    trait Key extends EventEmitter {
      
      /**
        * The down state of the ALT key, if pressed at the same time as this key.
        */
      var altKey: Boolean = js.native
      
      /**
        * The down state of the CTRL key, if pressed at the same time as this key.
        */
      var ctrlKey: Boolean = js.native
      
      /**
        * The number of milliseconds this key was held down for in the previous down - up sequence.
        * This value isn't updated every game step, only when the Key changes state.
        * To get the current duration use the `getDuration` method.
        */
      var duration: Double = js.native
      
      /**
        * When a key is held down should it continuously fire the `down` event each time it repeats?
        * 
        * By default it will emit the `down` event just once, but if you wish to receive the event
        * for each repeat as well, enable this property.
        */
      var emitOnRepeat: Boolean = js.native
      
      /**
        * Can this Key be processed?
        */
      var enabled: Boolean = js.native
      
      /**
        * Returns the duration, in ms, that the Key has been held down for.
        * 
        * If the key is not currently down it will return zero.
        * 
        * The get the duration the Key was held down for in the previous up-down cycle,
        * use the `Key.duration` property value instead.
        */
      def getDuration(): Double = js.native
      
      /**
        * The "down" state of the key. This will remain `true` for as long as the keyboard thinks this key is held down.
        */
      var isDown: Boolean = js.native
      
      /**
        * The "up" state of the key. This will remain `true` for as long as the keyboard thinks this key is up.
        */
      var isUp: Boolean = js.native
      
      /**
        * The keycode of this key.
        */
      var keyCode: integer = js.native
      
      /**
        * The location of the modifier key. 0 for standard (or unknown), 1 for left, 2 for right, 3 for numpad.
        */
      var location: Double = js.native
      
      /**
        * The down state of the Meta key, if pressed at the same time as this key.
        * On a Mac the Meta Key is the Command key. On Windows keyboards, it's the Windows key.
        */
      var metaKey: Boolean = js.native
      
      /**
        * Processes the Key Down action for this Key.
        * Called automatically by the Keyboard Plugin.
        * @param event The native DOM Keyboard event.
        */
      def onDown(event: KeyboardEvent): Unit = js.native
      
      /**
        * Processes the Key Up action for this Key.
        * Called automatically by the Keyboard Plugin.
        * @param event The native DOM Keyboard event.
        */
      def onUp(event: KeyboardEvent): Unit = js.native
      
      /**
        * The original DOM event.
        */
      var originalEvent: KeyboardEvent = js.native
      
      /**
        * The Keyboard Plugin instance that owns this Key object.
        */
      var plugin: KeyboardPlugin = js.native
      
      /**
        * If a key is held down this holds down the number of times the key has 'repeated'.
        */
      var repeats: Double = js.native
      
      /**
        * Resets this Key object back to its default un-pressed state.
        */
      def reset(): this.type = js.native
      
      /**
        * Controls if this Key will continuously emit a `down` event while being held down (true),
        * or emit the event just once, on first press, and then skip future events (false).
        * @param value Emit `down` events on repeated key down actions, or just once?
        */
      def setEmitOnRepeat(value: Boolean): this.type = js.native
      
      /**
        * The down state of the SHIFT key, if pressed at the same time as this key.
        */
      var shiftKey: Boolean = js.native
      
      /**
        * The timestamp when the key was last pressed down.
        */
      var timeDown: Double = js.native
      
      /**
        * The timestamp when the key was last released.
        */
      var timeUp: Double = js.native
    }
    
    /**
      * Keyboard Codes.
      */
    object KeyCodes
    
    /**
      * A KeyCombo will listen for a specific string of keys from the Keyboard, and when it receives them
      * it will emit a `keycombomatch` event from the Keyboard Manager.
      * 
      * The keys to be listened for can be defined as:
      * 
      * A string (i.e. 'ATARI')
      * An array of either integers (key codes) or strings, or a mixture of both
      * An array of objects (such as Key objects) with a public 'keyCode' property
      * 
      * For example, to listen for the Konami code (up, up, down, down, left, right, left, right, b, a, enter)
      * you could pass the following array of key codes:
      * 
      * ```javascript
      * this.input.keyboard.createCombo([ 38, 38, 40, 40, 37, 39, 37, 39, 66, 65, 13 ], { resetOnMatch: true });
      * 
      * this.input.keyboard.on('keycombomatch', function (event) {
      *     console.log('Konami Code entered!');
      * });
      * ```
      * 
      * Or, to listen for the user entering the word PHASER:
      * 
      * ```javascript
      * this.input.keyboard.createCombo('PHASER');
      * ```
      */
    @js.native
    trait KeyCombo extends StObject {
      
      /**
        * The current keyCode the combo is waiting for.
        */
      var current: integer = js.native
      
      /**
        * If the combo matches, will it delete itself?
        */
      var deleteOnMatch: Boolean = js.native
      
      /**
        * Destroys this Key Combo and all of its references.
        */
      def destroy(): Unit = js.native
      
      /**
        * A flag that controls if this Key Combo is actively processing keys or not.
        */
      var enabled: Boolean = js.native
      
      /**
        * The current index of the key being waited for in the 'keys' string.
        */
      var index: integer = js.native
      
      /**
        * An array of the keycodes that comprise this combo.
        */
      var keyCodes: js.Array[_] = js.native
      
      /**
        * A reference to the Keyboard Manager
        */
      var manager: KeyboardPlugin = js.native
      
      /**
        * Has this Key Combo been matched yet?
        */
      var matched: Boolean = js.native
      
      /**
        * The max delay in ms between each key press. Above this the combo is reset. 0 means disabled.
        */
      var maxKeyDelay: integer = js.native
      
      /**
        * How far complete is this combo? A value between 0 and 1.
        */
      val progress: Double = js.native
      
      /**
        * If previously matched and they press the first key of the combo again, will it reset?
        */
      var resetOnMatch: Boolean = js.native
      
      /**
        * If they press the wrong key do we reset the combo?
        */
      var resetOnWrongKey: Boolean = js.native
      
      /**
        * The length of this combo (in keycodes)
        */
      var size: Double = js.native
      
      /**
        * The time the previous key in the combo was matched.
        */
      var timeLastMatched: Double = js.native
      
      /**
        * The time the entire combo was matched.
        */
      var timeMatched: Double = js.native
    }
    object KeyCombo {
      
      @scala.inline
      def apply(
        current: integer,
        deleteOnMatch: Boolean,
        destroy: () => Unit,
        enabled: Boolean,
        index: integer,
        keyCodes: js.Array[_],
        manager: KeyboardPlugin,
        matched: Boolean,
        maxKeyDelay: integer,
        progress: Double,
        resetOnMatch: Boolean,
        resetOnWrongKey: Boolean,
        size: Double,
        timeLastMatched: Double,
        timeMatched: Double
      ): KeyCombo = {
        val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], deleteOnMatch = deleteOnMatch.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], keyCodes = keyCodes.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], maxKeyDelay = maxKeyDelay.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], resetOnMatch = resetOnMatch.asInstanceOf[js.Any], resetOnWrongKey = resetOnWrongKey.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeLastMatched = timeLastMatched.asInstanceOf[js.Any], timeMatched = timeMatched.asInstanceOf[js.Any])
        __obj.asInstanceOf[KeyCombo]
      }
      
      @scala.inline
      implicit class KeyComboMutableBuilder[Self <: KeyCombo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrent(value: integer): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteOnMatch(value: Boolean): Self = StObject.set(x, "deleteOnMatch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndex(value: integer): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyCodes(value: js.Array[_]): Self = StObject.set(x, "keyCodes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyCodesVarargs(value: js.Any*): Self = StObject.set(x, "keyCodes", js.Array(value :_*))
        
        @scala.inline
        def setManager(value: KeyboardPlugin): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMatched(value: Boolean): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxKeyDelay(value: integer): Self = StObject.set(x, "maxKeyDelay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResetOnMatch(value: Boolean): Self = StObject.set(x, "resetOnMatch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResetOnWrongKey(value: Boolean): Self = StObject.set(x, "resetOnWrongKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeLastMatched(value: Double): Self = StObject.set(x, "timeLastMatched", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeMatched(value: Double): Self = StObject.set(x, "timeMatched", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The Keyboard Manager is a helper class that belongs to the global Input Manager.
      * 
      * Its role is to listen for native DOM Keyboard Events and then store them for further processing by the Keyboard Plugin.
      * 
      * You do not need to create this class directly, the Input Manager will create an instance of it automatically if keyboard
      * input has been enabled in the Game Config.
      */
    @js.native
    trait KeyboardManager extends StObject {
      
      /**
        * By default when a key is pressed Phaser will not stop the event from propagating up to the browser.
        * There are some keys this can be annoying for, like the arrow keys or space bar, which make the browser window scroll.
        * 
        * This `addCapture` method enables consuming keyboard event for specific keys so it doesn't bubble up to the the browser
        * and cause the default browser behavior.
        * 
        * Please note that keyboard captures are global. This means that if you call this method from within a Scene, to say prevent
        * the SPACE BAR from triggering a page scroll, then it will prevent it for any Scene in your game, not just the calling one.
        * 
        * You can pass in a single key code value, or an array of key codes, or a string:
        * 
        * ```javascript
        * this.input.keyboard.addCapture(62);
        * ```
        * 
        * An array of key codes:
        * 
        * ```javascript
        * this.input.keyboard.addCapture([ 62, 63, 64 ]);
        * ```
        * 
        * Or a string:
        * 
        * ```javascript
        * this.input.keyboard.addCapture('W,S,A,D');
        * ```
        * 
        * To use non-alpha numeric keys, use a string, such as 'UP', 'SPACE' or 'LEFT'.
        * 
        * You can also provide an array mixing both strings and key code integers.
        * 
        * If there are active captures after calling this method, the `preventDefault` property is set to `true`.
        * @param keycode The Key Codes to enable capture for, preventing them reaching the browser.
        */
      def addCapture(keycode: String): Unit = js.native
      def addCapture(keycode: js.Array[_ | integer]): Unit = js.native
      def addCapture(keycode: integer): Unit = js.native
      
      /**
        * An array of Key Code values that will automatically have `preventDefault` called on them,
        * as long as the `KeyboardManager.preventDefault` boolean is set to `true`.
        * 
        * By default the array is empty.
        * 
        * The key must be non-modified when pressed in order to be captured.
        * 
        * A non-modified key is one that doesn't have a modifier key held down with it. The modifier keys are
        * shift, control, alt and the meta key (Command on a Mac, the Windows Key on Windows).
        * Therefore, if the user presses shift + r, it won't prevent this combination, because of the modifier.
        * However, if the user presses just the r key on its own, it will have its event prevented.
        * 
        * If you wish to stop capturing the keys, for example switching out to a DOM based element, then
        * you can toggle the `KeyboardManager.preventDefault` boolean at run-time.
        * 
        * If you need more specific control, you can create Key objects and set the flag on each of those instead.
        * 
        * This array can be populated via the Game Config by setting the `input.keyboard.capture` array, or you
        * can call the `addCapture` method. See also `removeCapture` and `clearCaptures`.
        */
      var captures: js.Array[integer] = js.native
      
      /**
        * Removes all keyboard captures and sets the `preventDefault` property to `false`.
        */
      def clearCaptures(): Unit = js.native
      
      /**
        * Destroys this Keyboard Manager instance.
        */
      def destroy(): Unit = js.native
      
      /**
        * A boolean that controls if the Keyboard Manager is enabled or not.
        * Can be toggled on the fly.
        */
      var enabled: Boolean = js.native
      
      /**
        * A reference to the Input Manager.
        */
      var manager: InputManager = js.native
      
      /**
        * The Key Down Event handler.
        * This function is sent the native DOM KeyEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      var onKeyDown: js.Function = js.native
      
      /**
        * The Key Up Event handler.
        * This function is sent the native DOM KeyEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      var onKeyUp: js.Function = js.native
      
      /**
        * A flag that controls if the non-modified keys, matching those stored in the `captures` array,
        * have `preventDefault` called on them or not.
        * 
        * A non-modified key is one that doesn't have a modifier key held down with it. The modifier keys are
        * shift, control, alt and the meta key (Command on a Mac, the Windows Key on Windows).
        * Therefore, if the user presses shift + r, it won't prevent this combination, because of the modifier.
        * However, if the user presses just the r key on its own, it will have its event prevented.
        * 
        * If you wish to stop capturing the keys, for example switching out to a DOM based element, then
        * you can toggle this property at run-time.
        */
      var preventDefault: Boolean = js.native
      
      /**
        * Removes an existing key capture.
        * 
        * Please note that keyboard captures are global. This means that if you call this method from within a Scene, to remove
        * the capture of a key, then it will remove it for any Scene in your game, not just the calling one.
        * 
        * You can pass in a single key code value, or an array of key codes, or a string:
        * 
        * ```javascript
        * this.input.keyboard.removeCapture(62);
        * ```
        * 
        * An array of key codes:
        * 
        * ```javascript
        * this.input.keyboard.removeCapture([ 62, 63, 64 ]);
        * ```
        * 
        * Or a string:
        * 
        * ```javascript
        * this.input.keyboard.removeCapture('W,S,A,D');
        * ```
        * 
        * To use non-alpha numeric keys, use a string, such as 'UP', 'SPACE' or 'LEFT'.
        * 
        * You can also provide an array mixing both strings and key code integers.
        * 
        * If there are no captures left after calling this method, the `preventDefault` property is set to `false`.
        * @param keycode The Key Codes to disable capture for, allowing them reaching the browser again.
        */
      def removeCapture(keycode: String): Unit = js.native
      def removeCapture(keycode: js.Array[_ | integer]): Unit = js.native
      def removeCapture(keycode: integer): Unit = js.native
      
      /**
        * Starts the Keyboard Event listeners running.
        * This is called automatically and does not need to be manually invoked.
        */
      def startListeners(): Unit = js.native
      
      /**
        * Stops the Key Event listeners.
        * This is called automatically and does not need to be manually invoked.
        */
      def stopListeners(): Unit = js.native
      
      /**
        * The Keyboard Event target, as defined in the Game Config.
        * Typically the window in which the game is rendering, but can be any interactive DOM element.
        */
      var target: js.Any = js.native
    }
    
    /**
      * The Keyboard Plugin is an input plugin that belongs to the Scene-owned Input system.
      * 
      * Its role is to listen for native DOM Keyboard Events and then process them.
      * 
      * You do not need to create this class directly, the Input system will create an instance of it automatically.
      * 
      * You can access it from within a Scene using `this.input.keyboard`. For example, you can do:
      * 
      * ```javascript
      * this.input.keyboard.on('keydown', callback, context);
      * ```
      * 
      * Or, to listen for a specific key:
      * 
      * ```javascript
      * this.input.keyboard.on('keydown-A', callback, context);
      * ```
      * 
      * You can also create Key objects, which you can then poll in your game loop:
      * 
      * ```javascript
      * var spaceBar = this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.SPACE);
      * ```
      * 
      * If you have multiple parallel Scenes, each trying to get keyboard input, be sure to disable capture on them to stop them from
      * stealing input from another Scene in the list. You can do this with `this.input.keyboard.enabled = false` within the
      * Scene to stop all input, or `this.input.keyboard.preventDefault = false` to stop a Scene halting input on another Scene.
      * 
      * _Note_: Many keyboards are unable to process certain combinations of keys due to hardware limitations known as ghosting.
      * See http://www.html5gamedevs.com/topic/4876-impossible-to-use-more-than-2-keyboard-input-buttons-at-the-same-time/ for more details.
      * 
      * Also please be aware that certain browser extensions can disable or override Phaser keyboard handling.
      * For example the Chrome extension vimium is known to disable Phaser from using the D key, while EverNote disables the backtick key.
      * And there are others. So, please check your extensions before opening Phaser issues about keys that don't work.
      */
    @js.native
    trait KeyboardPlugin extends EventEmitter {
      
      /**
        * By default when a key is pressed Phaser will not stop the event from propagating up to the browser.
        * There are some keys this can be annoying for, like the arrow keys or space bar, which make the browser window scroll.
        * 
        * This `addCapture` method enables consuming keyboard events for specific keys, so they don't bubble up the browser
        * and cause the default behaviors.
        * 
        * Please note that keyboard captures are global. This means that if you call this method from within a Scene, to say prevent
        * the SPACE BAR from triggering a page scroll, then it will prevent it for any Scene in your game, not just the calling one.
        * 
        * You can pass a single key code value:
        * 
        * ```javascript
        * this.input.keyboard.addCapture(62);
        * ```
        * 
        * An array of key codes:
        * 
        * ```javascript
        * this.input.keyboard.addCapture([ 62, 63, 64 ]);
        * ```
        * 
        * Or, a comma-delimited string:
        * 
        * ```javascript
        * this.input.keyboard.addCapture('W,S,A,D');
        * ```
        * 
        * To use non-alpha numeric keys, use a string, such as 'UP', 'SPACE' or 'LEFT'.
        * 
        * You can also provide an array mixing both strings and key code integers.
        * @param keycode The Key Codes to enable event capture for.
        */
      def addCapture(keycode: String): this.type = js.native
      def addCapture(keycode: js.Array[_ | integer]): this.type = js.native
      def addCapture(keycode: integer): this.type = js.native
      
      def addKey(key: String): Key = js.native
      def addKey(key: String, enableCapture: js.UndefOr[scala.Nothing], emitOnRepeat: Boolean): Key = js.native
      def addKey(key: String, enableCapture: Boolean): Key = js.native
      def addKey(key: String, enableCapture: Boolean, emitOnRepeat: Boolean): Key = js.native
      /**
        * Adds a Key object to this Keyboard Plugin.
        * 
        * The given argument can be either an existing Key object, a string, such as `A` or `SPACE`, or a key code value.
        * 
        * If a Key object is given, and one already exists matching the same key code, the existing one is replaced with the new one.
        * @param key Either a Key object, a string, such as `A` or `SPACE`, or a key code value.
        * @param enableCapture Automatically call `preventDefault` on the native DOM browser event for the key codes being added. Default true.
        * @param emitOnRepeat Controls if the Key will continuously emit a 'down' event while being held down (true), or emit the event just once (false, the default). Default false.
        */
      def addKey(key: Key): Key = js.native
      def addKey(key: Key, enableCapture: js.UndefOr[scala.Nothing], emitOnRepeat: Boolean): Key = js.native
      def addKey(key: Key, enableCapture: Boolean): Key = js.native
      def addKey(key: Key, enableCapture: Boolean, emitOnRepeat: Boolean): Key = js.native
      def addKey(key: integer): Key = js.native
      def addKey(key: integer, enableCapture: js.UndefOr[scala.Nothing], emitOnRepeat: Boolean): Key = js.native
      def addKey(key: integer, enableCapture: Boolean): Key = js.native
      def addKey(key: integer, enableCapture: Boolean, emitOnRepeat: Boolean): Key = js.native
      
      def addKeys(keys: String): js.Object = js.native
      def addKeys(keys: String, enableCapture: js.UndefOr[scala.Nothing], emitOnRepeat: Boolean): js.Object = js.native
      def addKeys(keys: String, enableCapture: Boolean): js.Object = js.native
      def addKeys(keys: String, enableCapture: Boolean, emitOnRepeat: Boolean): js.Object = js.native
      /**
        * A practical way to create an object containing user selected hotkeys.
        * 
        * For example:
        * 
        * ```javascript
        * this.input.keyboard.addKeys({ 'up': Phaser.Input.Keyboard.KeyCodes.W, 'down': Phaser.Input.Keyboard.KeyCodes.S });
        * ```
        * 
        * would return an object containing the properties (`up` and `down`) mapped to W and S {@link Phaser.Input.Keyboard.Key} objects.
        * 
        * You can also pass in a comma-separated string:
        * 
        * ```javascript
        * this.input.keyboard.addKeys('W,S,A,D');
        * ```
        * 
        * Which will return an object with the properties W, S, A and D mapped to the relevant Key objects.
        * 
        * To use non-alpha numeric keys, use a string, such as 'UP', 'SPACE' or 'LEFT'.
        * @param keys An object containing Key Codes, or a comma-separated string.
        * @param enableCapture Automatically call `preventDefault` on the native DOM browser event for the key codes being added. Default true.
        * @param emitOnRepeat Controls if the Key will continuously emit a 'down' event while being held down (true), or emit the event just once (false, the default). Default false.
        */
      def addKeys(keys: js.Object): js.Object = js.native
      def addKeys(keys: js.Object, enableCapture: js.UndefOr[scala.Nothing], emitOnRepeat: Boolean): js.Object = js.native
      def addKeys(keys: js.Object, enableCapture: Boolean): js.Object = js.native
      def addKeys(keys: js.Object, enableCapture: Boolean, emitOnRepeat: Boolean): js.Object = js.native
      
      /**
        * Checks if the given Key object is currently being held down.
        * 
        * The difference between this method and checking the `Key.isDown` property directly is that you can provide
        * a duration to this method. For example, if you wanted a key press to fire a bullet, but you only wanted
        * it to be able to fire every 100ms, then you can call this method with a `duration` of 100 and it
        * will only return `true` every 100ms.
        * 
        * If the Keyboard Plugin has been disabled, this method will always return `false`.
        * @param key A Key object.
        * @param duration The duration which must have elapsed before this Key is considered as being down. Default 0.
        */
      def checkDown(key: Key): Boolean = js.native
      def checkDown(key: Key, duration: Double): Boolean = js.native
      
      /**
        * Removes all keyboard captures.
        * 
        * Note that this is a global change. It will clear all event captures across your game, not just for this specific Scene.
        */
      def clearCaptures(): this.type = js.native
      
      /**
        * An array of KeyCombo objects to process.
        */
      var combos: js.Array[KeyCombo] = js.native
      
      /**
        * Creates a new KeyCombo.
        * 
        * A KeyCombo will listen for a specific string of keys from the Keyboard, and when it receives them
        * it will emit a `keycombomatch` event from this Keyboard Plugin.
        * 
        * The keys to be listened for can be defined as:
        * 
        * A string (i.e. 'ATARI')
        * An array of either integers (key codes) or strings, or a mixture of both
        * An array of objects (such as Key objects) with a public 'keyCode' property
        * 
        * For example, to listen for the Konami code (up, up, down, down, left, right, left, right, b, a, enter)
        * you could pass the following array of key codes:
        * 
        * ```javascript
        * this.input.keyboard.createCombo([ 38, 38, 40, 40, 37, 39, 37, 39, 66, 65, 13 ], { resetOnMatch: true });
        * 
        * this.input.keyboard.on('keycombomatch', function (event) {
        *     console.log('Konami Code entered!');
        * });
        * ```
        * 
        * Or, to listen for the user entering the word PHASER:
        * 
        * ```javascript
        * this.input.keyboard.createCombo('PHASER');
        * ```
        * @param keys The keys that comprise this combo.
        * @param config A Key Combo configuration object.
        */
      def createCombo(keys: String): KeyCombo = js.native
      def createCombo(keys: String, config: KeyComboConfig): KeyCombo = js.native
      def createCombo(keys: js.Array[js.Object | integer]): KeyCombo = js.native
      def createCombo(keys: js.Array[js.Object | integer], config: KeyComboConfig): KeyCombo = js.native
      
      /**
        * Creates and returns an object containing 4 hotkeys for Up, Down, Left and Right, and also Space Bar and shift.
        */
      def createCursorKeys(): CursorKeys = js.native
      
      /**
        * Disables Phaser from preventing any key captures you may have defined, without actually removing them.
        * You can use this to temporarily disable event capturing if, for example, you swap to a DOM element.
        */
      def disableGlobalCapture(): this.type = js.native
      
      /**
        * Allows Phaser to prevent any key captures you may have defined from bubbling up the browser.
        * You can use this to re-enable event capturing if you had paused it via `disableGlobalCapture`.
        */
      def enableGlobalCapture(): this.type = js.native
      
      /**
        * A boolean that controls if this Keyboard Plugin is enabled or not.
        * Can be toggled on the fly.
        */
      var enabled: Boolean = js.native
      
      /**
        * A reference to the core game, so we can listen for visibility events.
        */
      var game: Game = js.native
      
      /**
        * Returns an array that contains all of the keyboard captures currently enabled.
        */
      def getCaptures(): js.Array[integer] = js.native
      
      /**
        * Checks to see if both this plugin and the Scene to which it belongs is active.
        */
      def isActive(): Boolean = js.native
      
      /**
        * An array of Key objects to process.
        */
      var keys: js.Array[Key] = js.native
      
      /**
        * A reference to the global Keyboard Manager.
        */
      var manager: InputPlugin = js.native
      
      /**
        * Removes all Key objects created by _this_ Keyboard Plugin.
        * @param destroy Call `Key.destroy` on each removed Key object? Default false.
        */
      def removeAllKeys(): this.type = js.native
      def removeAllKeys(destroy: Boolean): this.type = js.native
      
      /**
        * Removes an existing key capture.
        * 
        * Please note that keyboard captures are global. This means that if you call this method from within a Scene, to remove
        * the capture of a key, then it will remove it for any Scene in your game, not just the calling one.
        * 
        * You can pass a single key code value:
        * 
        * ```javascript
        * this.input.keyboard.removeCapture(62);
        * ```
        * 
        * An array of key codes:
        * 
        * ```javascript
        * this.input.keyboard.removeCapture([ 62, 63, 64 ]);
        * ```
        * 
        * Or, a comma-delimited string:
        * 
        * ```javascript
        * this.input.keyboard.removeCapture('W,S,A,D');
        * ```
        * 
        * To use non-alpha numeric keys, use a string, such as 'UP', 'SPACE' or 'LEFT'.
        * 
        * You can also provide an array mixing both strings and key code integers.
        * @param keycode The Key Codes to disable event capture for.
        */
      def removeCapture(keycode: String): this.type = js.native
      def removeCapture(keycode: js.Array[_ | integer]): this.type = js.native
      def removeCapture(keycode: integer): this.type = js.native
      
      def removeKey(key: String): this.type = js.native
      def removeKey(key: String, destroy: Boolean): this.type = js.native
      /**
        * Removes a Key object from this Keyboard Plugin.
        * 
        * The given argument can be either a Key object, a string, such as `A` or `SPACE`, or a key code value.
        * @param key Either a Key object, a string, such as `A` or `SPACE`, or a key code value.
        * @param destroy Call `Key.destroy` on the removed Key object? Default false.
        */
      def removeKey(key: Key): this.type = js.native
      def removeKey(key: Key, destroy: Boolean): this.type = js.native
      def removeKey(key: integer): this.type = js.native
      def removeKey(key: integer, destroy: Boolean): this.type = js.native
      
      /**
        * Resets all Key objects created by _this_ Keyboard Plugin back to their default un-pressed states.
        * This can only reset keys created via the `addKey`, `addKeys` or `createCursorKeys` methods.
        * If you have created a Key object directly you'll need to reset it yourself.
        * 
        * This method is called automatically when the Keyboard Plugin shuts down, but can be
        * invoked directly at any time you require.
        */
      def resetKeys(): this.type = js.native
      
      /**
        * A reference to the Scene that this Input Plugin is responsible for.
        */
      var scene: Scene = js.native
      
      /**
        * A reference to the Scene Input Plugin that created this Keyboard Plugin.
        */
      var sceneInputPlugin: InputPlugin = js.native
      
      /**
        * A reference to the Scene Systems Settings.
        */
      var settings: SettingsObject = js.native
    }
  }
  
  object Mouse {
    
    /**
      * The Mouse Manager is a helper class that belongs to the Input Manager.
      * 
      * Its role is to listen for native DOM Mouse Events and then pass them onto the Input Manager for further processing.
      * 
      * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
      */
    @js.native
    trait MouseManager extends StObject {
      
      /**
        * If true the DOM mouse events will have event.preventDefault applied to them, if false they will propagate fully.
        */
      var capture: Boolean = js.native
      
      /**
        * Destroys this Mouse Manager instance.
        */
      def destroy(): Unit = js.native
      
      /**
        * Attempts to disable the context menu from appearing if you right-click on the browser.
        * 
        * Works by listening for the `contextmenu` event and prevent defaulting it.
        * 
        * Use this if you need to enable right-button mouse support in your game, and the browser
        * menu keeps getting in the way.
        */
      def disableContextMenu(): this.type = js.native
      
      /**
        * A boolean that controls if the Mouse Manager is enabled or not.
        * Can be toggled on the fly.
        */
      var enabled: Boolean = js.native
      
      /**
        * If the mouse has been pointer locked successfully this will be set to true.
        */
      var locked: Boolean = js.native
      
      /**
        * A reference to the Input Manager.
        */
      var manager: InputManager = js.native
      
      /**
        * The Mouse Down Event handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      var onMouseDown: js.Function = js.native
      
      /**
        * The Mouse Down Event handler specifically for events on the Window.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      var onMouseDownWindow: js.Function = js.native
      
      /**
        * The Mouse Move Event handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      var onMouseMove: js.Function = js.native
      
      /**
        * The Mouse Out Event handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      var onMouseOut: js.Function = js.native
      
      /**
        * The Mouse Over Event handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      var onMouseOver: js.Function = js.native
      
      /**
        * The Mouse Up Event handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      var onMouseUp: js.Function = js.native
      
      /**
        * The Mouse Up Event handler specifically for events on the Window.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      var onMouseUpWindow: js.Function = js.native
      
      /**
        * The Mouse Wheel Event handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      var onMouseWheel: js.Function = js.native
      
      /**
        * Internal pointerLockChange handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      var pointerLockChange: js.Function = js.native
      
      /**
        * If the browser supports pointer lock, this will request that the pointer lock is released. If
        * the browser successfully enters a locked state, a 'POINTER_LOCK_CHANGE_EVENT' will be
        * dispatched - from the game's input manager - with an `isPointerLocked` property.
        */
      def releasePointerLock(): Unit = js.native
      
      /**
        * If the browser supports it, you can request that the pointer be locked to the browser window.
        * 
        * This is classically known as 'FPS controls', where the pointer can't leave the browser until
        * the user presses an exit key.
        * 
        * If the browser successfully enters a locked state, a `POINTER_LOCK_CHANGE_EVENT` will be dispatched,
        * from the games Input Manager, with an `isPointerLocked` property.
        * 
        * It is important to note that pointer lock can only be enabled after an 'engagement gesture',
        * see: https://w3c.github.io/pointerlock/#dfn-engagement-gesture.
        */
      def requestPointerLock(): Unit = js.native
      
      /**
        * Starts the Mouse Event listeners running.
        * This is called automatically and does not need to be manually invoked.
        */
      def startListeners(): Unit = js.native
      
      /**
        * Stops the Mouse Event listeners.
        * This is called automatically and does not need to be manually invoked.
        */
      def stopListeners(): Unit = js.native
      
      /**
        * The Mouse target, as defined in the Game Config.
        * Typically the canvas to which the game is rendering, but can be any interactive DOM element.
        */
      var target: js.Any = js.native
    }
    object MouseManager {
      
      @scala.inline
      def apply(
        capture: Boolean,
        destroy: () => Unit,
        disableContextMenu: () => MouseManager,
        enabled: Boolean,
        locked: Boolean,
        manager: InputManager,
        onMouseDown: js.Function,
        onMouseDownWindow: js.Function,
        onMouseMove: js.Function,
        onMouseOut: js.Function,
        onMouseOver: js.Function,
        onMouseUp: js.Function,
        onMouseUpWindow: js.Function,
        onMouseWheel: js.Function,
        pointerLockChange: js.Function,
        releasePointerLock: () => Unit,
        requestPointerLock: () => Unit,
        startListeners: () => Unit,
        stopListeners: () => Unit,
        target: js.Any
      ): MouseManager = {
        val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disableContextMenu = js.Any.fromFunction0(disableContextMenu), enabled = enabled.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], onMouseDown = onMouseDown.asInstanceOf[js.Any], onMouseDownWindow = onMouseDownWindow.asInstanceOf[js.Any], onMouseMove = onMouseMove.asInstanceOf[js.Any], onMouseOut = onMouseOut.asInstanceOf[js.Any], onMouseOver = onMouseOver.asInstanceOf[js.Any], onMouseUp = onMouseUp.asInstanceOf[js.Any], onMouseUpWindow = onMouseUpWindow.asInstanceOf[js.Any], onMouseWheel = onMouseWheel.asInstanceOf[js.Any], pointerLockChange = pointerLockChange.asInstanceOf[js.Any], releasePointerLock = js.Any.fromFunction0(releasePointerLock), requestPointerLock = js.Any.fromFunction0(requestPointerLock), startListeners = js.Any.fromFunction0(startListeners), stopListeners = js.Any.fromFunction0(stopListeners), target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[MouseManager]
      }
      
      @scala.inline
      implicit class MouseManagerMutableBuilder[Self <: MouseManager] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDisableContextMenu(value: () => MouseManager): Self = StObject.set(x, "disableContextMenu", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManager(value: InputManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseDown(value: js.Function): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseDownWindow(value: js.Function): Self = StObject.set(x, "onMouseDownWindow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseMove(value: js.Function): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseOut(value: js.Function): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseOver(value: js.Function): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseUp(value: js.Function): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseUpWindow(value: js.Function): Self = StObject.set(x, "onMouseUpWindow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseWheel(value: js.Function): Self = StObject.set(x, "onMouseWheel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPointerLockChange(value: js.Function): Self = StObject.set(x, "pointerLockChange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReleasePointerLock(value: () => Unit): Self = StObject.set(x, "releasePointerLock", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRequestPointerLock(value: () => Unit): Self = StObject.set(x, "requestPointerLock", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStartListeners(value: () => Unit): Self = StObject.set(x, "startListeners", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStopListeners(value: () => Unit): Self = StObject.set(x, "stopListeners", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * A Pointer object encapsulates both mouse and touch input within Phaser.
    * 
    * By default, Phaser will create 2 pointers for your game to use. If you require more, i.e. for a multi-touch
    * game, then use the `InputPlugin.addPointer` method to do so, rather than instantiating this class directly,
    * otherwise it won't be managed by the input system.
    * 
    * You can reference the current active pointer via `InputPlugin.activePointer`. You can also use the properties
    * `InputPlugin.pointer1` through to `pointer10`, for each pointer you have enabled in your game.
    * 
    * The properties of this object are set by the Input Plugin during processing. This object is then sent in all
    * input related events that the Input Plugin emits, so you can reference properties from it directly in your
    * callbacks.
    */
  @js.native
  trait Pointer extends StObject {
    
    /**
      * An active Pointer is one that is currently pressed down on the display.
      * A Mouse is always considered as active.
      */
    var active: Boolean = js.native
    
    /**
      * The current angle the Pointer is moving, in radians, based on its previous and current position.
      * 
      * The angle is based on the old position facing to the current position.
      * 
      * This property is updated whenever the Pointer moves, regardless of any button states. In other words,
      * it changes based on movement alone - a button doesn't have to be pressed first.
      */
    val angle: Double = js.native
    
    /**
      * Checks to see if the back button is being held down on this Pointer.
      */
    def backButtonDown(): Boolean = js.native
    
    /**
      * Checks to see if the back button was just released on this Pointer.
      */
    def backButtonReleased(): Boolean = js.native
    
    /**
      * A read-only property that indicates which button was pressed, or released, on the pointer
      * during the most recent event. It is only set during `up` and `down` events.
      * 
      * On Touch devices the value is always 0.
      * 
      * Users may change the configuration of buttons on their pointing device so that if an event's button property
      * is zero, it may not have been caused by the button that is physically left–most on the pointing device;
      * however, it should behave as if the left button was clicked in the standard button layout.
      */
    val button: integer = js.native
    
    /**
      * 0: No button or un-initialized
      * 1: Left button
      * 2: Right button
      * 4: Wheel button or middle button
      * 8: 4th button (typically the "Browser Back" button)
      * 16: 5th button (typically the "Browser Forward" button)
      * 
      * For a mouse configured for left-handed use, the button actions are reversed.
      * In this case, the values are read from right to left.
      */
    var buttons: integer = js.native
    
    /**
      * The camera the Pointer interacted with during its last update.
      * 
      * A Pointer can only ever interact with one camera at once, which will be the top-most camera
      * in the list should multiple cameras be positioned on-top of each other.
      */
    var camera: Camera = js.native
    
    /**
      * The horizontal scroll amount that occurred due to the user moving a mouse wheel or similar input device.
      */
    var deltaX: Double = js.native
    
    /**
      * The vertical scroll amount that occurred due to the user moving a mouse wheel or similar input device.
      * This value will typically be less than 0 if the user scrolls up and greater than zero if scrolling down.
      */
    var deltaY: Double = js.native
    
    /**
      * The z-axis scroll amount that occurred due to the user moving a mouse wheel or similar input device.
      */
    var deltaZ: Double = js.native
    
    /**
      * Destroys this Pointer instance and resets its external references.
      */
    def destroy(): Unit = js.native
    
    /**
      * The distance the Pointer has moved, based on its previous and current position.
      * 
      * This value is smoothed out each frame, according to the `motionFactor` property.
      * 
      * This property is updated whenever the Pointer moves, regardless of any button states. In other words,
      * it changes based on movement alone - a button doesn't have to be pressed first.
      * 
      * If you need the total distance travelled since the primary buttons was pressed down,
      * then use the `Pointer.getDistance` method.
      */
    val distance: Double = js.native
    
    /**
      * The DOM element the Pointer was pressed down on, taken from the DOM event.
      * In a default set-up this will be the Canvas that Phaser is rendering to, or the Window element.
      */
    val downElement: js.Any = js.native
    
    /**
      * Time when Button 1 (left button), or Touch, was pressed, used for dragging objects.
      */
    var downTime: Double = js.native
    
    /**
      * X coordinate of the Pointer when Button 1 (left button), or Touch, was pressed, used for dragging objects.
      */
    var downX: Double = js.native
    
    /**
      * Y coordinate of the Pointer when Button 1 (left button), or Touch, was pressed, used for dragging objects.
      */
    var downY: Double = js.native
    
    /**
      * The most recent native DOM Event this Pointer has processed.
      */
    var event: TouchEvent | MouseEvent = js.native
    
    /**
      * Checks to see if the forward button is being held down on this Pointer.
      */
    def forwardButtonDown(): Boolean = js.native
    
    /**
      * Checks to see if the forward button was just released on this Pointer.
      */
    def forwardButtonReleased(): Boolean = js.native
    
    /**
      * If the Pointer has a button pressed down at the time this method is called, it will return the
      * angle between the Pointer's `downX` and `downY` values and the current position.
      * 
      * If no button is held down, it will return the last recorded angle, based on where
      * the Pointer was when the button was released.
      * 
      * The angle is based on the old position facing to the current position.
      * 
      * If you wish to get the current angle, based on the velocity of the Pointer, then
      * see the `Pointer.angle` property.
      */
    def getAngle(): Double = js.native
    
    /**
      * If the Pointer has a button pressed down at the time this method is called, it will return the
      * distance between the Pointer's `downX` and `downY` values and the current position.
      * 
      * If no button is held down, it will return the last recorded distance, based on where
      * the Pointer was when the button was released.
      * 
      * If you wish to get the distance being travelled currently, based on the velocity of the Pointer,
      * then see the `Pointer.distance` property.
      */
    def getDistance(): Double = js.native
    
    /**
      * If the Pointer has a button pressed down at the time this method is called, it will return the
      * horizontal distance between the Pointer's `downX` and `downY` values and the current position.
      * 
      * If no button is held down, it will return the last recorded horizontal distance, based on where
      * the Pointer was when the button was released.
      */
    def getDistanceX(): Double = js.native
    
    /**
      * If the Pointer has a button pressed down at the time this method is called, it will return the
      * vertical distance between the Pointer's `downX` and `downY` values and the current position.
      * 
      * If no button is held down, it will return the last recorded vertical distance, based on where
      * the Pointer was when the button was released.
      */
    def getDistanceY(): Double = js.native
    
    /**
      * If the Pointer has a button pressed down at the time this method is called, it will return the
      * duration since the button was pressed down.
      * 
      * If no button is held down, it will return the last recorded duration, based on the time
      * the Pointer button was released.
      */
    def getDuration(): Double = js.native
    
    /**
      * Takes the previous and current Pointer positions and then generates an array of interpolated values between
      * the two. The array will be populated up to the size of the `steps` argument.
      * 
      * ```javaScript
      * var points = pointer.getInterpolatedPosition(4);
      * 
      * // points[0] = { x: 0, y: 0 }
      * // points[1] = { x: 2, y: 1 }
      * // points[2] = { x: 3, y: 2 }
      * // points[3] = { x: 6, y: 3 }
      * ```
      * 
      * Use this if you need to get smoothed values between the previous and current pointer positions. DOM pointer
      * events can often fire faster than the main browser loop, and this will help you avoid janky movement
      * especially if you have an object following a Pointer.
      * 
      * Note that if you provide an output array it will only be populated up to the number of steps provided.
      * It will not clear any previous data that may have existed beyond the range of the steps count.
      * 
      * Internally it uses the Smooth Step interpolation calculation.
      * @param steps The number of interpolation steps to use. Default 10.
      * @param out An array to store the results in. If not provided a new one will be created.
      */
    def getInterpolatedPosition(): js.Array[_] = js.native
    def getInterpolatedPosition(steps: js.UndefOr[scala.Nothing], out: js.Array[_]): js.Array[_] = js.native
    def getInterpolatedPosition(steps: integer): js.Array[_] = js.native
    def getInterpolatedPosition(steps: integer, out: js.Array[_]): js.Array[_] = js.native
    
    /**
      * The internal ID of this Pointer.
      */
    val id: integer = js.native
    
    /**
      * The identifier property of the Pointer as set by the DOM event when this Pointer is started.
      */
    var identifier: Double = js.native
    
    /**
      * Is _any_ button on this pointer considered as being down?
      */
    var isDown: Boolean = js.native
    
    /**
      * Checks to see if the left button is being held down on this Pointer.
      */
    def leftButtonDown(): Boolean = js.native
    
    /**
      * Checks to see if the left button was just released on this Pointer.
      */
    def leftButtonReleased(): Boolean = js.native
    
    /**
      * Is this pointer Pointer Locked?
      * 
      * Only a mouse pointer can be locked and it only becomes locked when requested via
      * the browsers Pointer Lock API.
      * 
      * You can request this by calling the `this.input.mouse.requestPointerLock()` method from
      * a `pointerdown` or `pointerup` event handler.
      */
    val locked: Boolean = js.native
    
    /**
      * A reference to the Input Manager.
      */
    var manager: InputManager = js.native
    
    /**
      * Checks to see if the middle button is being held down on this Pointer.
      */
    def middleButtonDown(): Boolean = js.native
    
    /**
      * Checks to see if the middle button was just released on this Pointer.
      */
    def middleButtonReleased(): Boolean = js.native
    
    /**
      * The factor applied to the motion smoothing each frame.
      * 
      * This value is passed to the Smooth Step Interpolation that is used to calculate the velocity,
      * angle and distance of the Pointer. It's applied every frame, until the midPoint reaches the current
      * position of the Pointer. 0.2 provides a good average but can be increased if you need a
      * quicker update and are working in a high performance environment. Never set this value to
      * zero.
      */
    var motionFactor: Double = js.native
    
    /**
      * Time when this Pointer was most recently moved (regardless of the state of its buttons, if any)
      */
    var moveTime: Double = js.native
    
    /**
      * If the mouse is locked, the horizontal relative movement of the Pointer in pixels since last frame.
      */
    var movementX: Double = js.native
    
    /**
      * If the mouse is locked, the vertical relative movement of the Pointer in pixels since last frame.
      */
    var movementY: Double = js.native
    
    /**
      * Checks to see if any buttons are being held down on this Pointer.
      */
    def noButtonDown(): Boolean = js.native
    
    /**
      * The pointerId property of the Pointer as set by the DOM event when this Pointer is started.
      * The browser can and will recycle this value.
      */
    var pointerId: Double = js.native
    
    /**
      * The position of the Pointer in screen space.
      */
    val position: Vector2 = js.native
    
    /**
      * Takes a Camera and returns a Vector2 containing the translated position of this Pointer
      * within that Camera. This can be used to convert this Pointers position into camera space.
      * @param camera The Camera to use for the translation.
      * @param output A Vector2-like object in which to store the translated position.
      */
    def positionToCamera(camera: Camera): Vector2 | js.Object = js.native
    def positionToCamera(camera: Camera, output: js.Object): Vector2 | js.Object = js.native
    def positionToCamera(camera: Camera, output: Vector2): Vector2 | js.Object = js.native
    
    /**
      * The previous position of the Pointer in screen space.
      * 
      * The old x and y values are stored in here during the InputManager.transformPointer call.
      * 
      * Use the properties `velocity`, `angle` and `distance` to create your own gesture recognition.
      */
    val prevPosition: Vector2 = js.native
    
    /**
      * Is the primary button down? (usually button 0, the left mouse button)
      */
    var primaryDown: Boolean = js.native
    
    /**
      * Checks to see if the right button is being held down on this Pointer.
      */
    def rightButtonDown(): Boolean = js.native
    
    /**
      * Checks to see if the right button was just released on this Pointer.
      */
    def rightButtonReleased(): Boolean = js.native
    
    /**
      * The smoothing factor to apply to the Pointer position.
      * 
      * Due to their nature, pointer positions are inherently noisy. While this is fine for lots of games, if you need cleaner positions
      * then you can set this value to apply an automatic smoothing to the positions as they are recorded.
      * 
      * The default value of zero means 'no smoothing'.
      * Set to a small value, such as 0.2, to apply an average level of smoothing between positions. You can do this by changing this
      * value directly, or by setting the `input.smoothFactor` property in the Game Config.
      * 
      * Positions are only smoothed when the pointer moves. If the primary button on this Pointer enters an Up or Down state, then the position
      * is always precise, and not smoothed.
      */
    var smoothFactor: Double = js.native
    
    /**
      * Time when this Pointer was most recently updated by a DOM Event.
      * This comes directly from the `event.timeStamp` property.
      * If no event has yet taken place, it will return zero.
      */
    val time: Double = js.native
    
    /**
      * The DOM element the Pointer was released on, taken from the DOM event.
      * In a default set-up this will be the Canvas that Phaser is rendering to, or the Window element.
      */
    val upElement: js.Any = js.native
    
    /**
      * Time when Button 1 (left button), or Touch, was released, used for dragging objects.
      */
    var upTime: Double = js.native
    
    /**
      * X coordinate of the Pointer when Button 1 (left button), or Touch, was released, used for dragging objects.
      */
    var upX: Double = js.native
    
    /**
      * Y coordinate of the Pointer when Button 1 (left button), or Touch, was released, used for dragging objects.
      */
    var upY: Double = js.native
    
    /**
      * Takes a Camera and updates this Pointer's `worldX` and `worldY` values so they are
      * the result of a translation through the given Camera.
      * 
      * Note that the values will be automatically replaced the moment the Pointer is
      * updated by an input event, such as a mouse move, so should be used immediately.
      * @param camera The Camera which is being tested against.
      */
    def updateWorldPoint(camera: Camera): this.type = js.native
    
    /**
      * The current velocity of the Pointer, based on its current and previous positions.
      * 
      * This value is smoothed out each frame, according to the `motionFactor` property.
      * 
      * This property is updated whenever the Pointer moves, regardless of any button states. In other words,
      * it changes based on movement alone - a button doesn't have to be pressed first.
      */
    val velocity: Vector2 = js.native
    
    /**
      * Did this Pointer get canceled by a touchcancel event?
      * 
      * Note: "canceled" is the American-English spelling of "cancelled". Please don't submit PRs correcting it!
      */
    var wasCanceled: Boolean = js.native
    
    /**
      * Did the previous input event come from a Touch input (true) or Mouse? (false)
      */
    var wasTouch: Boolean = js.native
    
    /**
      * The x position of this Pointer, translated into the coordinate space of the most recent Camera it interacted with.
      * 
      * If you wish to use this value _outside_ of an input event handler then you should update it first by calling
      * the `Pointer.updateWorldPoint` method.
      */
    var worldX: Double = js.native
    
    /**
      * The y position of this Pointer, translated into the coordinate space of the most recent Camera it interacted with.
      * 
      * If you wish to use this value _outside_ of an input event handler then you should update it first by calling
      * the `Pointer.updateWorldPoint` method.
      */
    var worldY: Double = js.native
    
    /**
      * The x position of this Pointer.
      * The value is in screen space.
      * See `worldX` to get a camera converted position.
      */
    var x: Double = js.native
    
    /**
      * The y position of this Pointer.
      * The value is in screen space.
      * See `worldY` to get a camera converted position.
      */
    var y: Double = js.native
  }
  
  object Touch {
    
    /**
      * The Touch Manager is a helper class that belongs to the Input Manager.
      * 
      * Its role is to listen for native DOM Touch Events and then pass them onto the Input Manager for further processing.
      * 
      * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
      */
    @js.native
    trait TouchManager extends StObject {
      
      /**
        * If true the DOM events will have event.preventDefault applied to them, if false they will propagate fully.
        */
      var capture: Boolean = js.native
      
      /**
        * Destroys this Touch Manager instance.
        */
      def destroy(): Unit = js.native
      
      /**
        * Attempts to disable the context menu from appearing if you touch-hold on the browser.
        * 
        * Works by listening for the `contextmenu` event and prevent defaulting it.
        * 
        * Use this if you need to disable the OS context menu on mobile.
        */
      def disableContextMenu(): this.type = js.native
      
      /**
        * A boolean that controls if the Touch Manager is enabled or not.
        * Can be toggled on the fly.
        */
      var enabled: Boolean = js.native
      
      /**
        * A reference to the Input Manager.
        */
      var manager: InputManager = js.native
      
      /**
        * The Touch Cancel event handler function.
        * Initially empty and bound in the `startListeners` method.
        */
      var onTouchCancel: js.Function = js.native
      
      /**
        * The Touch Cancel event handler function specifically for events on the Window.
        * Initially empty and bound in the `startListeners` method.
        */
      var onTouchCancelWindow: js.Function = js.native
      
      /**
        * The Touch End event handler function.
        * Initially empty and bound in the `startListeners` method.
        */
      var onTouchEnd: js.Function = js.native
      
      /**
        * The Touch End event handler function specifically for events on the Window.
        * Initially empty and bound in the `startListeners` method.
        */
      var onTouchEndWindow: js.Function = js.native
      
      /**
        * The Touch Move event handler function.
        * Initially empty and bound in the `startListeners` method.
        */
      var onTouchMove: js.Function = js.native
      
      /**
        * The Touch Out event handler function.
        * Initially empty and bound in the `startListeners` method.
        */
      var onTouchOut: js.Function = js.native
      
      /**
        * The Touch Over event handler function.
        * Initially empty and bound in the `startListeners` method.
        */
      var onTouchOver: js.Function = js.native
      
      /**
        * The Touch Start event handler function.
        * Initially empty and bound in the `startListeners` method.
        */
      var onTouchStart: js.Function = js.native
      
      /**
        * The Touch Start event handler function specifically for events on the Window.
        * Initially empty and bound in the `startListeners` method.
        */
      var onTouchStartWindow: js.Function = js.native
      
      /**
        * Starts the Touch Event listeners running as long as an input target is set.
        * 
        * This method is called automatically if Touch Input is enabled in the game config,
        * which it is by default. However, you can call it manually should you need to
        * delay input capturing until later in the game.
        */
      def startListeners(): Unit = js.native
      
      /**
        * Stops the Touch Event listeners.
        * This is called automatically and does not need to be manually invoked.
        */
      def stopListeners(): Unit = js.native
      
      /**
        * The Touch Event target, as defined in the Game Config.
        * Typically the canvas to which the game is rendering, but can be any interactive DOM element.
        */
      var target: js.Any = js.native
    }
    object TouchManager {
      
      @scala.inline
      def apply(
        capture: Boolean,
        destroy: () => Unit,
        disableContextMenu: () => TouchManager,
        enabled: Boolean,
        manager: InputManager,
        onTouchCancel: js.Function,
        onTouchCancelWindow: js.Function,
        onTouchEnd: js.Function,
        onTouchEndWindow: js.Function,
        onTouchMove: js.Function,
        onTouchOut: js.Function,
        onTouchOver: js.Function,
        onTouchStart: js.Function,
        onTouchStartWindow: js.Function,
        startListeners: () => Unit,
        stopListeners: () => Unit,
        target: js.Any
      ): TouchManager = {
        val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disableContextMenu = js.Any.fromFunction0(disableContextMenu), enabled = enabled.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchCancelWindow = onTouchCancelWindow.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchEndWindow = onTouchEndWindow.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchOut = onTouchOut.asInstanceOf[js.Any], onTouchOver = onTouchOver.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTouchStartWindow = onTouchStartWindow.asInstanceOf[js.Any], startListeners = js.Any.fromFunction0(startListeners), stopListeners = js.Any.fromFunction0(stopListeners), target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[TouchManager]
      }
      
      @scala.inline
      implicit class TouchManagerMutableBuilder[Self <: TouchManager] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDisableContextMenu(value: () => TouchManager): Self = StObject.set(x, "disableContextMenu", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManager(value: InputManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchCancel(value: js.Function): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchCancelWindow(value: js.Function): Self = StObject.set(x, "onTouchCancelWindow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchEnd(value: js.Function): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchEndWindow(value: js.Function): Self = StObject.set(x, "onTouchEndWindow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchMove(value: js.Function): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchOut(value: js.Function): Self = StObject.set(x, "onTouchOut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchOver(value: js.Function): Self = StObject.set(x, "onTouchOver", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchStart(value: js.Function): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchStartWindow(value: js.Function): Self = StObject.set(x, "onTouchStartWindow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartListeners(value: () => Unit): Self = StObject.set(x, "startListeners", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStopListeners(value: () => Unit): Self = StObject.set(x, "stopListeners", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
  }
}
