package typings.openapiResponseValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.Any
  var message: String
}

object Errors {
  @scala.inline
  def apply(errors: js.Any, message: String): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

