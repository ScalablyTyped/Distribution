package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// validation
trait ValidationError extends js.Object {
  var CharacterPosition: Double
  var Line: Double
  var Message: String
}

object ValidationError {
  @scala.inline
  def apply(CharacterPosition: Double, Line: Double, Message: String): ValidationError = {
    val __obj = js.Dynamic.literal(CharacterPosition = CharacterPosition, Line = Line, Message = Message)
  
    __obj.asInstanceOf[ValidationError]
  }
}

