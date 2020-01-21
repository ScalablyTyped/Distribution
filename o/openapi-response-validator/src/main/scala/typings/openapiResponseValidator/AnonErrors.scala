package typings.openapiResponseValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  var errors: js.Any
  var message: String
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Any, message: String): AnonErrors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrors]
  }
}

