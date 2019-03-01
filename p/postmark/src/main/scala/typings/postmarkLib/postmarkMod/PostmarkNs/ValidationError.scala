package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// validation
trait ValidationError extends js.Object {
  var CharacterPosition: scala.Double
  var Line: scala.Double
  var Message: java.lang.String
}

object ValidationError {
  @scala.inline
  def apply(CharacterPosition: scala.Double, Line: scala.Double, Message: java.lang.String): ValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CharacterPosition")(CharacterPosition)
    __obj.updateDynamic("Line")(Line)
    __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[ValidationError]
  }
}

