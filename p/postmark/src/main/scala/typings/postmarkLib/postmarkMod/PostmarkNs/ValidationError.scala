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
    val __obj = js.Dynamic.literal(CharacterPosition = CharacterPosition, Line = Line, Message = Message)
  
    __obj.asInstanceOf[ValidationError]
  }
}

