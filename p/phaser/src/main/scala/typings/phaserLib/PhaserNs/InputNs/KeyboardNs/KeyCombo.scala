package typings
package phaserLib.PhaserNs.InputNs.KeyboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("Phaser.Input.Keyboard.KeyCombo")
@js.native
class KeyCombo protected () extends js.Object {
  /**
    * 
    * @param keyboardPlugin A reference to the Keyboard Plugin.
    * @param keys The keys that comprise this combo.
    * @param config A Key Combo configuration object.
    */
  def this(keyboardPlugin: KeyboardPlugin, keys: java.lang.String) = this()
  def this(keyboardPlugin: KeyboardPlugin, keys: js.Array[js.Object | phaserLib.integer]) = this()
  def this(keyboardPlugin: KeyboardPlugin, keys: java.lang.String, config: phaserLib.PhaserNs.TypesNs.InputNs.KeyboardNs.KeyComboConfig) = this()
  def this(keyboardPlugin: KeyboardPlugin, keys: js.Array[js.Object | phaserLib.integer], config: phaserLib.PhaserNs.TypesNs.InputNs.KeyboardNs.KeyComboConfig) = this()
  /**
    * The current keyCode the combo is waiting for.
    */
  var current: phaserLib.integer = js.native
  /**
    * If the combo matches, will it delete itself?
    */
  var deleteOnMatch: scala.Boolean = js.native
  /**
    * A flag that controls if this Key Combo is actively processing keys or not.
    */
  var enabled: scala.Boolean = js.native
  /**
    * The current index of the key being waited for in the 'keys' string.
    */
  var index: phaserLib.integer = js.native
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
  var matched: scala.Boolean = js.native
  /**
    * The max delay in ms between each key press. Above this the combo is reset. 0 means disabled.
    */
  var maxKeyDelay: phaserLib.integer = js.native
  /**
    * How far complete is this combo? A value between 0 and 1.
    */
  val progress: scala.Double = js.native
  /**
    * If previously matched and they press the first key of the combo again, will it reset?
    */
  var resetOnMatch: scala.Boolean = js.native
  /**
    * If they press the wrong key do we reset the combo?
    */
  var resetOnWrongKey: scala.Boolean = js.native
  /**
    * The length of this combo (in keycodes)
    */
  var size: scala.Double = js.native
  /**
    * The time the previous key in the combo was matched.
    */
  var timeLastMatched: scala.Double = js.native
  /**
    * The time the entire combo was matched.
    */
  var timeMatched: scala.Double = js.native
  /**
    * Destroys this Key Combo and all of its references.
    */
  def destroy(): scala.Unit = js.native
}

