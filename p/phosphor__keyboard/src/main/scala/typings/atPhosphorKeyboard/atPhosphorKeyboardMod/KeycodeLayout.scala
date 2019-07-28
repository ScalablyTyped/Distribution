package typings.atPhosphorKeyboard.atPhosphorKeyboardMod

import typings.atPhosphorKeyboard.atPhosphorKeyboardMod.KeycodeLayoutNs.CodeMap
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/keyboard", "KeycodeLayout")
@js.native
class KeycodeLayout protected () extends IKeyboardLayout {
  /**
    * Construct a new keycode layout.
    *
    * @param name - The human readable name for the layout.
    *
    * @param codes - A mapping of keycode to key value.
    */
  def this(name: String, codes: CodeMap) = this()
  var _codes: js.Any = js.native
  var _keys: js.Any = js.native
  /**
    * The human readable name of the layout.
    *
    * This value is used primarily for display and debugging purposes.
    */
  /* CompleteClass */
  override val name: String = js.native
  /**
    * Test whether the given key is a valid value for the layout.
    *
    * @param key - The user provided key to test for validity.
    *
    * @returns `true` if the key is valid, `false` otherwise.
    */
  /* CompleteClass */
  override def isValidKey(key: String): Boolean = js.native
  /**
    * Get the key for a `'keydown'` event.
    *
    * @param event - The event object for a `'keydown'` event.
    *
    * @returns The associated key value, or an empty string if the event
    *   does not represent a valid primary key.
    */
  /* CompleteClass */
  override def keyForKeydownEvent(event: KeyboardEvent): String = js.native
  /**
    * Get an array of all key values supported by the layout.
    *
    * @returns A new array of the supported key values.
    *
    * #### Notes
    * This can be useful for authoring tools and debugging, when it's
    * necessary to know which keys are available for shortcut use.
    */
  /* CompleteClass */
  override def keys(): js.Array[String] = js.native
}

