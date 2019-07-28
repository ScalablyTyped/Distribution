package typings.plaidDashLink.plaidDashLinkMod.PlaidNs

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
    val __obj = js.Dynamic.literal(display_message = display_message, error_code = error_code, error_message = error_message, error_type = error_type)
  
    __obj.asInstanceOf[Error]
  }
}

