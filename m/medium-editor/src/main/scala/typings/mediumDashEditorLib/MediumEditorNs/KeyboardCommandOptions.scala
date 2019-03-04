package typings
package mediumDashEditorLib.MediumEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardCommandOptions extends js.Object {
  var alt: scala.Boolean
  var command: java.lang.String
  var key: java.lang.String
  var meta: scala.Boolean
  var shift: scala.Boolean
}

object KeyboardCommandOptions {
  @scala.inline
  def apply(
    alt: scala.Boolean,
    command: java.lang.String,
    key: java.lang.String,
    meta: scala.Boolean,
    shift: scala.Boolean
  ): KeyboardCommandOptions = {
    val __obj = js.Dynamic.literal(alt = alt, command = command, key = key, meta = meta, shift = shift)
  
    __obj.asInstanceOf[KeyboardCommandOptions]
  }
}

