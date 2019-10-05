package typings.phaser.Phaser.Input

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Game
import typings.phaser.Phaser.Input.Keyboard.Key
import typings.phaser.Phaser.Input.Keyboard.KeyCombo
import typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.Input.Keyboard.CursorKeys
import typings.phaser.Phaser.Types.Input.Keyboard.KeyComboConfig
import typings.phaser.Phaser.Types.Scenes.SettingsObject
import typings.phaser.integer
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Input.Keyboard")
@js.native
object Keyboard extends js.Object {
  /**
    * A generic Key object which can be passed to the Process functions (and so on)
    * keycode must be an integer
    */
  @js.native
  class Key protected () extends EventEmitter {
    /**
      * 
      * @param plugin The Keyboard Plugin instance that owns this Key object.
      * @param keyCode The keycode of this key.
      */
    def this(plugin: KeyboardPlugin, keyCode: integer) = this()
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
      * Resets this Key object back to its default un-pressed state.
      */
    def reset(): Key = js.native
    /**
      * Controls if this Key will continuously emit a `down` event while being held down (true),
      * or emit the event just once, on first press, and then skip future events (false).
      * @param value Emit `down` events on repeated key down actions, or just once?
      */
    def setEmitOnRepeat(value: Boolean): Key = js.native
  }
  
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
  class KeyCombo protected () extends js.Object {
    /**
      * 
      * @param keyboardPlugin A reference to the Keyboard Plugin.
      * @param keys The keys that comprise this combo.
      * @param config A Key Combo configuration object.
      */
    def this(keyboardPlugin: KeyboardPlugin, keys: String) = this()
    def this(keyboardPlugin: KeyboardPlugin, keys: js.Array[js.Object | integer]) = this()
    def this(keyboardPlugin: KeyboardPlugin, keys: String, config: KeyComboConfig) = this()
    def this(keyboardPlugin: KeyboardPlugin, keys: js.Array[js.Object | integer], config: KeyComboConfig) = this()
    /**
      * The current keyCode the combo is waiting for.
      */
    var current: integer = js.native
    /**
      * If the combo matches, will it delete itself?
      */
    var deleteOnMatch: Boolean = js.native
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
    /**
      * Destroys this Key Combo and all of its references.
      */
    def destroy(): Unit = js.native
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
  class KeyboardManager protected () extends js.Object {
    /**
      * 
      * @param inputManager A reference to the Input Manager.
      */
    def this(inputManager: InputManager) = this()
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
      * The Keyboard Event target, as defined in the Game Config.
      * Typically the window in which the game is rendering, but can be any interactive DOM element.
      */
    var target: js.Any = js.native
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
      * Removes all keyboard captures and sets the `preventDefault` property to `false`.
      */
    def clearCaptures(): Unit = js.native
    /**
      * Destroys this Keyboard Manager instance.
      */
    def destroy(): Unit = js.native
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
  class KeyboardPlugin protected () extends EventEmitter {
    /**
      * 
      * @param sceneInputPlugin A reference to the Scene Input Plugin that the KeyboardPlugin belongs to.
      */
    def this(sceneInputPlugin: InputPlugin) = this()
    /**
      * An array of KeyCombo objects to process.
      */
    var combos: js.Array[KeyCombo] = js.native
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
      * An array of Key objects to process.
      */
    var keys: js.Array[Key] = js.native
    /**
      * A reference to the global Keyboard Manager.
      */
    var manager: InputPlugin = js.native
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
    def addCapture(keycode: String): KeyboardPlugin = js.native
    def addCapture(keycode: js.Array[_ | integer]): KeyboardPlugin = js.native
    def addCapture(keycode: integer): KeyboardPlugin = js.native
    def addKey(key: String): Key = js.native
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
    def addKey(key: Key, enableCapture: Boolean): Key = js.native
    def addKey(key: Key, enableCapture: Boolean, emitOnRepeat: Boolean): Key = js.native
    def addKey(key: integer): Key = js.native
    def addKey(key: integer, enableCapture: Boolean): Key = js.native
    def addKey(key: integer, enableCapture: Boolean, emitOnRepeat: Boolean): Key = js.native
    def addKeys(keys: String): js.Object = js.native
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
    def clearCaptures(): KeyboardPlugin = js.native
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
    def disableGlobalCapture(): KeyboardPlugin = js.native
    /**
      * Allows Phaser to prevent any key captures you may have defined from bubbling up the browser.
      * You can use this to re-enable event capturing if you had paused it via `disableGlobalCapture`.
      */
    def enableGlobalCapture(): KeyboardPlugin = js.native
    /**
      * Returns an array that contains all of the keyboard captures currently enabled.
      */
    def getCaptures(): js.Array[integer] = js.native
    /**
      * Checks to see if both this plugin and the Scene to which it belongs is active.
      */
    def isActive(): Boolean = js.native
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
    def removeCapture(keycode: String): KeyboardPlugin = js.native
    def removeCapture(keycode: js.Array[_ | integer]): KeyboardPlugin = js.native
    def removeCapture(keycode: integer): KeyboardPlugin = js.native
    def removeKey(key: String): KeyboardPlugin = js.native
    def removeKey(key: String, destroy: Boolean): KeyboardPlugin = js.native
    /**
      * Removes a Key object from this Keyboard Plugin.
      * 
      * The given argument can be either a Key object, a string, such as `A` or `SPACE`, or a key code value.
      * @param key Either a Key object, a string, such as `A` or `SPACE`, or a key code value.
      * @param destroy Call `Key.destroy` on the removed Key object? Default false.
      */
    def removeKey(key: Key): KeyboardPlugin = js.native
    def removeKey(key: Key, destroy: Boolean): KeyboardPlugin = js.native
    def removeKey(key: integer): KeyboardPlugin = js.native
    def removeKey(key: integer, destroy: Boolean): KeyboardPlugin = js.native
    /**
      * Resets all Key objects created by _this_ Keyboard Plugin back to their default un-pressed states.
      * This can only reset keys created via the `addKey`, `addKeys` or `createCursorKeys` methods.
      * If you have created a Key object directly you'll need to reset it yourself.
      * 
      * This method is called automatically when the Keyboard Plugin shuts down, but can be
      * invoked directly at any time you require.
      */
    def resetKeys(): KeyboardPlugin = js.native
  }
  
  /**
    * Returns `true` if the Key was pressed down within the `duration` value given, based on the current
    * game clock time. Or `false` if it either isn't down, or was pressed down longer ago than the given duration.
    * @param key The Key object to test.
    * @param duration The duration, in ms, within which the key must have been pressed down. Default 50.
    */
  def DownDuration(key: Key): Boolean = js.native
  def DownDuration(key: Key, duration: integer): Boolean = js.native
  /**
    * The justDown value allows you to test if this Key has just been pressed down or not.
    * 
    * When you check this value it will return `true` if the Key is down, otherwise `false`.
    * 
    * You can only call justDown once per key press. It will only return `true` once, until the Key is released and pressed down again.
    * This allows you to use it in situations where you want to check if this key is down without using an event, such as in a core game loop.
    * @param key The Key to check to see if it's just down or not.
    */
  def JustDown(key: Key): Boolean = js.native
  /**
    * The justUp value allows you to test if this Key has just been released or not.
    * 
    * When you check this value it will return `true` if the Key is up, otherwise `false`.
    * 
    * You can only call JustUp once per key release. It will only return `true` once, until the Key is pressed down and released again.
    * This allows you to use it in situations where you want to check if this key is up without using an event, such as in a core game loop.
    * @param key The Key to check to see if it's just up or not.
    */
  def JustUp(key: Key): Boolean = js.native
  /**
    * Returns `true` if the Key was released within the `duration` value given, based on the current
    * game clock time. Or returns `false` if it either isn't up, or was released longer ago than the given duration.
    * @param key The Key object to test.
    * @param duration The duration, in ms, within which the key must have been released. Default 50.
    */
  def UpDuration(key: Key): Boolean = js.native
  def UpDuration(key: Key, duration: integer): Boolean = js.native
  @js.native
  object Events extends js.Object {
    /**
      * The Global Key Down Event.
      * 
      * This event is dispatched by the Keyboard Plugin when any key on the keyboard is pressed down.
      * 
      * Listen to this event from within a Scene using: `this.input.keyboard.on('keydown', listener)`.
      * 
      * You can also listen for a specific key being pressed. See [Keyboard.Events.KEY_DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:KEY_DOWN} for details.
      * 
      * Finally, you can create Key objects, which you can also listen for events from. See [Keyboard.Events.DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:DOWN} for details.
      * 
      * _Note_: Many keyboards are unable to process certain combinations of keys due to hardware limitations known as ghosting.
      * Read [this article on ghosting]{@link http://www.html5gamedevs.com/topic/4876-impossible-to-use-more-than-2-keyboard-input-buttons-at-the-same-time/} for details.
      * 
      * Also, please be aware that some browser extensions can disable or override Phaser keyboard handling.
      * For example, the Chrome extension vimium is known to disable Phaser from using the D key, while EverNote disables the backtick key.
      * There are others. So, please check your extensions if you find you have specific keys that don't work.
      */
    val ANY_KEY_DOWN: js.Any = js.native
    /**
      * The Global Key Up Event.
      * 
      * This event is dispatched by the Keyboard Plugin when any key on the keyboard is released.
      * 
      * Listen to this event from within a Scene using: `this.input.keyboard.on('keyup', listener)`.
      * 
      * You can also listen for a specific key being released. See [Keyboard.Events.KEY_UP]{@linkcode Phaser.Input.Keyboard.Events#event:KEY_UP} for details.
      * 
      * Finally, you can create Key objects, which you can also listen for events from. See [Keyboard.Events.UP]{@linkcode Phaser.Input.Keyboard.Events#event:UP} for details.
      */
    val ANY_KEY_UP: js.Any = js.native
    /**
      * The Key Combo Match Event.
      * 
      * This event is dispatched by the Keyboard Plugin when a [Key Combo]{@link Phaser.Input.Keyboard.KeyCombo} is matched.
      * 
      * Listen for this event from the Key Plugin after a combo has been created:
      * 
      * ```javascript
      * this.input.keyboard.createCombo([ 38, 38, 40, 40, 37, 39, 37, 39, 66, 65, 13 ], { resetOnMatch: true });
      * 
      * this.input.keyboard.on('keycombomatch', function (event) {
      *     console.log('Konami Code entered!');
      * });
      * ```
      */
    val COMBO_MATCH: js.Any = js.native
    /**
      * The Key Down Event.
      * 
      * This event is dispatched by a [Key]{@link Phaser.Input.Keyboard.Key} object when it is pressed.
      * 
      * Listen for this event from the Key object instance directly:
      * 
      * ```javascript
      * var spaceBar = this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.SPACE);
      * 
      * spaceBar.on('down', listener)
      * ```
      * 
      * You can also create a generic 'global' listener. See [Keyboard.Events.ANY_KEY_DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:ANY_KEY_DOWN} for details.
      */
    val DOWN: js.Any = js.native
    /**
      * The Key Down Event.
      * 
      * This event is dispatched by the Keyboard Plugin when any key on the keyboard is pressed down.
      * 
      * Unlike the `ANY_KEY_DOWN` event, this one has a special dynamic event name. For example, to listen for the `A` key being pressed
      * use the following from within a Scene: `this.input.keyboard.on('keydown-A', listener)`. You can replace the `-A` part of the event
      * name with any valid [Key Code string]{@link Phaser.Input.Keyboard.KeyCodes}. For example, this will listen for the space bar: 
      * `this.input.keyboard.on('keydown-SPACE', listener)`.
      * 
      * You can also create a generic 'global' listener. See [Keyboard.Events.ANY_KEY_DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:ANY_KEY_DOWN} for details.
      * 
      * Finally, you can create Key objects, which you can also listen for events from. See [Keyboard.Events.DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:DOWN} for details.
      * 
      * _Note_: Many keyboards are unable to process certain combinations of keys due to hardware limitations known as ghosting.
      * Read [this article on ghosting]{@link http://www.html5gamedevs.com/topic/4876-impossible-to-use-more-than-2-keyboard-input-buttons-at-the-same-time/} for details.
      * 
      * Also, please be aware that some browser extensions can disable or override Phaser keyboard handling.
      * For example, the Chrome extension vimium is known to disable Phaser from using the D key, while EverNote disables the backtick key.
      * There are others. So, please check your extensions if you find you have specific keys that don't work.
      */
    val KEY_DOWN: js.Any = js.native
    /**
      * The Key Up Event.
      * 
      * This event is dispatched by the Keyboard Plugin when any key on the keyboard is released.
      * 
      * Unlike the `ANY_KEY_UP` event, this one has a special dynamic event name. For example, to listen for the `A` key being released
      * use the following from within a Scene: `this.input.keyboard.on('keyup-A', listener)`. You can replace the `-A` part of the event
      * name with any valid [Key Code string]{@link Phaser.Input.Keyboard.KeyCodes}. For example, this will listen for the space bar: 
      * `this.input.keyboard.on('keyup-SPACE', listener)`.
      * 
      * You can also create a generic 'global' listener. See [Keyboard.Events.ANY_KEY_UP]{@linkcode Phaser.Input.Keyboard.Events#event:ANY_KEY_UP} for details.
      * 
      * Finally, you can create Key objects, which you can also listen for events from. See [Keyboard.Events.UP]{@linkcode Phaser.Input.Keyboard.Events#event:UP} for details.
      */
    val KEY_UP: js.Any = js.native
    /**
      * The Key Up Event.
      * 
      * This event is dispatched by a [Key]{@link Phaser.Input.Keyboard.Key} object when it is released.
      * 
      * Listen for this event from the Key object instance directly:
      * 
      * ```javascript
      * var spaceBar = this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.SPACE);
      * 
      * spaceBar.on('up', listener)
      * ```
      * 
      * You can also create a generic 'global' listener. See [Keyboard.Events.ANY_KEY_UP]{@linkcode Phaser.Input.Keyboard.Events#event:ANY_KEY_UP} for details.
      */
    val UP: js.Any = js.native
  }
  
  /**
    * Keyboard Codes.
    */
  @js.native
  object KeyCodes extends js.Object {
    /**
      * The A key.
      */
    var A: integer = js.native
    /**
      * The ALT key.
      */
    var ALT: integer = js.native
    /**
      * The B key.
      */
    var B: integer = js.native
    /**
      * The BACKSPACE key.
      */
    var BACKSPACE: integer = js.native
    /**
      * The BACKTICK key.
      */
    var BACKTICK: integer = js.native
    /**
      * The BACK_SLASH key.
      */
    var BACK_SLASH: integer = js.native
    /**
      * The BRACKET_LEFT_FIREFOX key.
      */
    var BRACKET_LEFT_FIREFOX: integer = js.native
    /**
      * The BRACKET_RIGHT_FIREFOX key.
      */
    var BRACKET_RIGHT_FIREFOX: integer = js.native
    /**
      * The C key.
      */
    var C: integer = js.native
    /**
      * The CAPS_LOCK key.
      */
    var CAPS_LOCK: integer = js.native
    /**
      * The CLOSED_BRACKET key.
      */
    var CLOSED_BRACKET: integer = js.native
    /**
      * The COLON key.
      */
    var COLON: integer = js.native
    /**
      * The COMMA key.
      */
    var COMMA: integer = js.native
    /**
      * The COMMA_FIREFOX key.
      */
    var COMMA_FIREFOX: integer = js.native
    /**
      * The COMMA_FIREFOX_WINDOWS key.
      */
    var COMMA_FIREFOX_WINDOWS: integer = js.native
    /**
      * The CTRL key.
      */
    var CTRL: integer = js.native
    /**
      * The D key.
      */
    var D: integer = js.native
    /**
      * The DELETE key.
      */
    var DELETE: integer = js.native
    /**
      * The DOWN key.
      */
    var DOWN: integer = js.native
    /**
      * The E key.
      */
    var E: integer = js.native
    /**
      * The EIGHT key.
      */
    var EIGHT: integer = js.native
    /**
      * The END key.
      */
    var END: integer = js.native
    /**
      * The ENTER key.
      */
    var ENTER: integer = js.native
    /**
      * The ESC key.
      */
    var ESC: integer = js.native
    /**
      * The F key.
      */
    var F: integer = js.native
    /**
      * The F1 key.
      */
    var F1: integer = js.native
    /**
      * The F10 key.
      */
    var F10: integer = js.native
    /**
      * The F11 key.
      */
    var F11: integer = js.native
    /**
      * The F12 key.
      */
    var F12: integer = js.native
    /**
      * The F2 key.
      */
    var F2: integer = js.native
    /**
      * The F3 key.
      */
    var F3: integer = js.native
    /**
      * The F4 key.
      */
    var F4: integer = js.native
    /**
      * The F5 key.
      */
    var F5: integer = js.native
    /**
      * The F6 key.
      */
    var F6: integer = js.native
    /**
      * The F7 key.
      */
    var F7: integer = js.native
    /**
      * The F8 key.
      */
    var F8: integer = js.native
    /**
      * The F9 key.
      */
    var F9: integer = js.native
    /**
      * The FIVE key.
      */
    var FIVE: integer = js.native
    /**
      * The FORWARD_SLASH key.
      */
    var FORWARD_SLASH: integer = js.native
    /**
      * The FOUR key.
      */
    var FOUR: integer = js.native
    /**
      * The G key.
      */
    var G: integer = js.native
    /**
      * The H key.
      */
    var H: integer = js.native
    /**
      * The HOME key.
      */
    var HOME: integer = js.native
    /**
      * The I key.
      */
    var I: integer = js.native
    /**
      * The INSERT key.
      */
    var INSERT: integer = js.native
    /**
      * The J key.
      */
    var J: integer = js.native
    /**
      * The K key.
      */
    var K: integer = js.native
    /**
      * The L key.
      */
    var L: integer = js.native
    /**
      * The LEFT key.
      */
    var LEFT: integer = js.native
    /**
      * The M key.
      */
    var M: integer = js.native
    /**
      * The MINUS key.
      */
    var MINUS: integer = js.native
    /**
      * The N key.
      */
    var N: integer = js.native
    /**
      * The NINE key.
      */
    var NINE: integer = js.native
    /**
      * The NUMPAD_EIGHT key.
      */
    var NUMPAD_EIGHT: integer = js.native
    /**
      * The NUMPAD_FIVE key.
      */
    var NUMPAD_FIVE: integer = js.native
    /**
      * The NUMPAD_FOUR key.
      */
    var NUMPAD_FOUR: integer = js.native
    /**
      * The NUMPAD_NINE key.
      */
    var NUMPAD_NINE: integer = js.native
    /**
      * The NUMPAD_ONE key.
      */
    var NUMPAD_ONE: integer = js.native
    /**
      * The NUMPAD_SEVEN key.
      */
    var NUMPAD_SEVEN: integer = js.native
    /**
      * The NUMPAD_SIX key.
      */
    var NUMPAD_SIX: integer = js.native
    /**
      * The NUMPAD_THREE key.
      */
    var NUMPAD_THREE: integer = js.native
    /**
      * The NUMPAD_TWO key.
      */
    var NUMPAD_TWO: integer = js.native
    /**
      * The NUMPAD_ZERO key.
      */
    var NUMPAD_ZERO: integer = js.native
    /**
      * The O key.
      */
    var O: integer = js.native
    /**
      * The ONE key.
      */
    var ONE: integer = js.native
    /**
      * The OPEN_BRACKET key.
      */
    var OPEN_BRACKET: integer = js.native
    /**
      * The P key.
      */
    var P: integer = js.native
    /**
      * The PAGE_DOWN key.
      */
    var PAGE_DOWN: integer = js.native
    /**
      * The PAGE_UP key.
      */
    var PAGE_UP: integer = js.native
    /**
      * The PAUSE key.
      */
    var PAUSE: integer = js.native
    /**
      * The PERIOD key.
      */
    var PERIOD: integer = js.native
    /**
      * The PLUS key.
      */
    var PLUS: integer = js.native
    /**
      * The PRINT_SCREEN key.
      */
    var PRINT_SCREEN: integer = js.native
    /**
      * The Q key.
      */
    var Q: integer = js.native
    /**
      * The QUOTES key.
      */
    var QUOTES: integer = js.native
    /**
      * The R key.
      */
    var R: integer = js.native
    /**
      * The RIGHT key.
      */
    var RIGHT: integer = js.native
    /**
      * The S key.
      */
    var S: integer = js.native
    /**
      * The SEMICOLON key.
      */
    var SEMICOLON: integer = js.native
    /**
      * The SEMICOLON_FIREFOX key.
      */
    var SEMICOLON_FIREFOX: integer = js.native
    /**
      * The SEVEN key.
      */
    var SEVEN: integer = js.native
    /**
      * The SHIFT key.
      */
    var SHIFT: integer = js.native
    /**
      * The SIX key.
      */
    var SIX: integer = js.native
    /**
      * The SPACE key.
      */
    var SPACE: integer = js.native
    /**
      * The T key.
      */
    var T: integer = js.native
    /**
      * The TAB key.
      */
    var TAB: integer = js.native
    /**
      * The THREE key.
      */
    var THREE: integer = js.native
    /**
      * The TWO key.
      */
    var TWO: integer = js.native
    /**
      * The U key.
      */
    var U: integer = js.native
    /**
      * The UP key.
      */
    var UP: integer = js.native
    /**
      * The V key.
      */
    var V: integer = js.native
    /**
      * The W key.
      */
    var W: integer = js.native
    /**
      * The X key.
      */
    var X: integer = js.native
    /**
      * The Y key.
      */
    var Y: integer = js.native
    /**
      * The Z key.
      */
    var Z: integer = js.native
    /**
      * The ZERO key.
      */
    var ZERO: integer = js.native
  }
  
}

