package typings.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardCommandOptions extends js.Object {
  var alt: Boolean
  var command: String
  var key: String
  var meta: Boolean
  var shift: Boolean
}

object KeyboardCommandOptions {
  @scala.inline
  def apply(alt: Boolean, command: String, key: String, meta: Boolean, shift: Boolean): KeyboardCommandOptions = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyboardCommandOptions]
  }
}

