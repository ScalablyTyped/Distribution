package typings.phaser.Phaser.Input.Keyboard

import typings.phaser.integer
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
trait KeyCombo extends js.Object {
  /**
    * The current keyCode the combo is waiting for.
    */
  var current: integer
  /**
    * If the combo matches, will it delete itself?
    */
  var deleteOnMatch: Boolean
  /**
    * A flag that controls if this Key Combo is actively processing keys or not.
    */
  var enabled: Boolean
  /**
    * The current index of the key being waited for in the 'keys' string.
    */
  var index: integer
  /**
    * An array of the keycodes that comprise this combo.
    */
  var keyCodes: js.Array[_]
  /**
    * A reference to the Keyboard Manager
    */
  var manager: KeyboardPlugin
  /**
    * Has this Key Combo been matched yet?
    */
  var matched: Boolean
  /**
    * The max delay in ms between each key press. Above this the combo is reset. 0 means disabled.
    */
  var maxKeyDelay: integer
  /**
    * How far complete is this combo? A value between 0 and 1.
    */
  val progress: Double
  /**
    * If previously matched and they press the first key of the combo again, will it reset?
    */
  var resetOnMatch: Boolean
  /**
    * If they press the wrong key do we reset the combo?
    */
  var resetOnWrongKey: Boolean
  /**
    * The length of this combo (in keycodes)
    */
  var size: Double
  /**
    * The time the previous key in the combo was matched.
    */
  var timeLastMatched: Double
  /**
    * The time the entire combo was matched.
    */
  var timeMatched: Double
  /**
    * Destroys this Key Combo and all of its references.
    */
  def destroy(): Unit
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
}

