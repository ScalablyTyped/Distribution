package typings.meteor.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedError
  extends typings.std.Error {
  var errorType: String
}

object TypedError {
  @scala.inline
  def apply(errorType: String, message: String, name: String, stack: String = null): TypedError = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedError]
  }
}

