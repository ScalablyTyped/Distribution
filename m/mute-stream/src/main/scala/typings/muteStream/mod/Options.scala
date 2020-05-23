package typings.muteStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If you are using a replacement char, and also using a prompt with a readline stream
    * (as for a Password: ***** input), then specify what the prompt is so that backspace
    * will work properly. Otherwise, pressing backspace will overwrite the prompt with the
    * replacement character, which is weird.
    */
  var prompt: js.UndefOr[String] = js.undefined
  /**
    * Set to a string to replace each character with the specified string when muted.
    * (So you can show **** instead of the password, for example.)
    */
  var replace: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(prompt: String = null, replace: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

