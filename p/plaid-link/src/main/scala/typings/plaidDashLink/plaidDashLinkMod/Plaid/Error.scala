package typings.plaidDashLink.plaidDashLinkMod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var display_message: String
  var error_code: String
  var error_message: String
  var error_type: String
}

object Error {
  @scala.inline
  def apply(display_message: String, error_code: String, error_message: String, error_type: String): Error = {
    val __obj = js.Dynamic.literal(display_message = display_message.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Error]
  }
}

