package typings.phaser.global.Phaser.Input

import typings.phaser.Phaser.Types.Input.Keyboard.KeyComboConfig
import typings.phaser.integer
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
  class Key protected ()
    extends typings.phaser.Phaser.Input.Keyboard.Key {
    /**
      * 
      * @param plugin The Keyboard Plugin instance that owns this Key object.
      * @param keyCode The keycode of this key.
      */
    def this(plugin: typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin, keyCode: integer) = this()
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
  class KeyCombo protected ()
    extends typings.phaser.Phaser.Input.Keyboard.KeyCombo {
    /**
      * 
      * @param keyboardPlugin A reference to the Keyboard Plugin.
      * @param keys The keys that comprise this combo.
      * @param config A Key Combo configuration object.
      */
    def this(keyboardPlugin: typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin, keys: String) = this()
    def this(
      keyboardPlugin: typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin,
      keys: js.Array[js.Object | integer]
    ) = this()
    def this(
      keyboardPlugin: typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin,
      keys: String,
      config: KeyComboConfig
    ) = this()
    def this(
      keyboardPlugin: typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin,
      keys: js.Array[js.Object | integer],
      config: KeyComboConfig
    ) = this()
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
  class KeyboardManager protected ()
    extends typings.phaser.Phaser.Input.Keyboard.KeyboardManager {
    /**
      * 
      * @param inputManager A reference to the Input Manager.
      */
    def this(inputManager: typings.phaser.Phaser.Input.InputManager) = this()
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
  class KeyboardPlugin protected ()
    extends typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin {
    /**
      * 
      * @param sceneInputPlugin A reference to the Scene Input Plugin that the KeyboardPlugin belongs to.
      */
    def this(sceneInputPlugin: typings.phaser.Phaser.Input.InputPlugin) = this()
  }
  
  /**
    * Returns `true` if the Key was pressed down within the `duration` value given, based on the current
    * game clock time. Or `false` if it either isn't down, or was pressed down longer ago than the given duration.
    * @param key The Key object to test.
    * @param duration The duration, in ms, within which the key must have been pressed down. Default 50.
    */
  def DownDuration(key: typings.phaser.Phaser.Input.Keyboard.Key): Boolean = js.native
  def DownDuration(key: typings.phaser.Phaser.Input.Keyboard.Key, duration: integer): Boolean = js.native
  /**
    * The justDown value allows you to test if this Key has just been pressed down or not.
    * 
    * When you check this value it will return `true` if the Key is down, otherwise `false`.
    * 
    * You can only call justDown once per key press. It will only return `true` once, until the Key is released and pressed down again.
    * This allows you to use it in situations where you want to check if this key is down without using an event, such as in a core game loop.
    * @param key The Key to check to see if it's just down or not.
    */
  def JustDown(key: typings.phaser.Phaser.Input.Keyboard.Key): Boolean = js.native
  /**
    * The justUp value allows you to test if this Key has just been released or not.
    * 
    * When you check this value it will return `true` if the Key is up, otherwise `false`.
    * 
    * You can only call JustUp once per key release. It will only return `true` once, until the Key is pressed down and released again.
    * This allows you to use it in situations where you want to check if this key is up without using an event, such as in a core game loop.
    * @param key The Key to check to see if it's just up or not.
    */
  def JustUp(key: typings.phaser.Phaser.Input.Keyboard.Key): Boolean = js.native
  /**
    * Returns `true` if the Key was released within the `duration` value given, based on the current
    * game clock time. Or returns `false` if it either isn't up, or was released longer ago than the given duration.
    * @param key The Key object to test.
    * @param duration The duration, in ms, within which the key must have been released. Default 50.
    */
  def UpDuration(key: typings.phaser.Phaser.Input.Keyboard.Key): Boolean = js.native
  def UpDuration(key: typings.phaser.Phaser.Input.Keyboard.Key, duration: integer): Boolean = js.native
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
      * The Numpad Addition (+) key.
      */
    var NUMPAD_ADD: integer = js.native
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
      * The Numpad Subtraction (-) key.
      */
    var NUMPAD_SUBTRACT: integer = js.native
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

