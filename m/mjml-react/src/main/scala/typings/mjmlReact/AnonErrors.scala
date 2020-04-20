package typings.mjmlReact

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  var errors: js.Array[Error]
  var html: String
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[Error], html: String): AnonErrors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrors]
  }
}

