package typings
package phaserLib.PhaserNs.InputNs.KeyboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("Phaser.Input.Keyboard.KeyboardPlugin")
@js.native
class KeyboardPlugin protected ()
  extends phaserLib.PhaserNs.EventsNs.EventEmitter {
  /**
    * 
    * @param sceneInputPlugin A reference to the Scene Input Plugin that the KeyboardPlugin belongs to.
    */
  def this(sceneInputPlugin: phaserLib.PhaserNs.InputNs.InputPlugin) = this()
  /**
    * An array of KeyCombo objects to process.
    */
  var combos: js.Array[KeyCombo] = js.native
  /**
    * A boolean that controls if this Keyboard Plugin is enabled or not.
    * Can be toggled on the fly.
    */
  var enabled: scala.Boolean = js.native
  /**
    * A reference to the core game, so we can listen for visibility events.
    */
  var game: phaserLib.PhaserNs.Game = js.native
  /**
    * An array of Key objects to process.
    */
  var keys: js.Array[Key] = js.native
  /**
    * A reference to the global Keyboard Manager.
    */
  var manager: phaserLib.PhaserNs.InputNs.InputPlugin = js.native
  /**
    * A reference to the Scene that this Input Plugin is responsible for.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * A reference to the Scene Input Plugin that created this Keyboard Plugin.
    */
  var sceneInputPlugin: phaserLib.PhaserNs.InputNs.InputPlugin = js.native
  /**
    * A reference to the Scene Systems Settings.
    */
  var settings: phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsObject = js.native
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
  def addCapture(keycode: java.lang.String): KeyboardPlugin = js.native
  def addCapture(keycode: js.Array[_ | phaserLib.integer]): KeyboardPlugin = js.native
  def addCapture(keycode: phaserLib.integer): KeyboardPlugin = js.native
  def addKey(key: java.lang.String): Key = js.native
  def addKey(key: java.lang.String, enableCapture: scala.Boolean): Key = js.native
  def addKey(key: java.lang.String, enableCapture: scala.Boolean, emitOnRepeat: scala.Boolean): Key = js.native
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
  def addKey(key: Key, enableCapture: scala.Boolean): Key = js.native
  def addKey(key: Key, enableCapture: scala.Boolean, emitOnRepeat: scala.Boolean): Key = js.native
  def addKey(key: phaserLib.integer): Key = js.native
  def addKey(key: phaserLib.integer, enableCapture: scala.Boolean): Key = js.native
  def addKey(key: phaserLib.integer, enableCapture: scala.Boolean, emitOnRepeat: scala.Boolean): Key = js.native
  def addKeys(keys: java.lang.String): js.Object = js.native
  def addKeys(keys: java.lang.String, enableCapture: scala.Boolean): js.Object = js.native
  def addKeys(keys: java.lang.String, enableCapture: scala.Boolean, emitOnRepeat: scala.Boolean): js.Object = js.native
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
  def addKeys(keys: js.Object, enableCapture: scala.Boolean): js.Object = js.native
  def addKeys(keys: js.Object, enableCapture: scala.Boolean, emitOnRepeat: scala.Boolean): js.Object = js.native
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
  def checkDown(key: Key): scala.Boolean = js.native
  def checkDown(key: Key, duration: scala.Double): scala.Boolean = js.native
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
  def createCombo(keys: java.lang.String): KeyCombo = js.native
  def createCombo(keys: java.lang.String, config: phaserLib.PhaserNs.TypesNs.InputNs.KeyboardNs.KeyComboConfig): KeyCombo = js.native
  def createCombo(keys: js.Array[js.Object | phaserLib.integer]): KeyCombo = js.native
  def createCombo(
    keys: js.Array[js.Object | phaserLib.integer],
    config: phaserLib.PhaserNs.TypesNs.InputNs.KeyboardNs.KeyComboConfig
  ): KeyCombo = js.native
  /**
    * Creates and returns an object containing 4 hotkeys for Up, Down, Left and Right, and also Space Bar and shift.
    */
  def createCursorKeys(): phaserLib.PhaserNs.TypesNs.InputNs.KeyboardNs.CursorKeys = js.native
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
  def getCaptures(): js.Array[phaserLib.integer] = js.native
  /**
    * Checks to see if both this plugin and the Scene to which it belongs is active.
    */
  def isActive(): scala.Boolean = js.native
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
  def removeCapture(keycode: java.lang.String): KeyboardPlugin = js.native
  def removeCapture(keycode: js.Array[_ | phaserLib.integer]): KeyboardPlugin = js.native
  def removeCapture(keycode: phaserLib.integer): KeyboardPlugin = js.native
  def removeKey(key: java.lang.String): KeyboardPlugin = js.native
  def removeKey(key: java.lang.String, destroy: scala.Boolean): KeyboardPlugin = js.native
  /**
    * Removes a Key object from this Keyboard Plugin.
    * 
    * The given argument can be either a Key object, a string, such as `A` or `SPACE`, or a key code value.
    * @param key Either a Key object, a string, such as `A` or `SPACE`, or a key code value.
    * @param destroy Call `Key.destroy` on the removed Key object? Default false.
    */
  def removeKey(key: Key): KeyboardPlugin = js.native
  def removeKey(key: Key, destroy: scala.Boolean): KeyboardPlugin = js.native
  def removeKey(key: phaserLib.integer): KeyboardPlugin = js.native
  def removeKey(key: phaserLib.integer, destroy: scala.Boolean): KeyboardPlugin = js.native
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

