package typings
package plaidDashLinkLib.plaidDashLinkMod.PlaidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var display_message: java.lang.String
  var error_code: java.lang.String
  var error_message: java.lang.String
  var error_type: java.lang.String
}

object Error {
  @scala.inline
  def apply(
    display_message: java.lang.String,
    error_code: java.lang.String,
    error_message: java.lang.String,
    error_type: java.lang.String
  ): Error = {
    val __obj = js.Dynamic.literal(display_message = display_message, error_code = error_code, error_message = error_message, error_type = error_type)
  
    __obj.asInstanceOf[Error]
  }
}

