package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayPalError extends js.Object {
  val debug_id: String
  val details: js.Array[ErrorDetails]
  val information_link: String
  val message: String
  val name: String
}

object PayPalError {
  @scala.inline
  def apply(
    debug_id: String,
    details: js.Array[ErrorDetails],
    information_link: String,
    message: String,
    name: String
  ): PayPalError = {
    val __obj = js.Dynamic.literal(debug_id = debug_id.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], information_link = information_link.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PayPalError]
  }
}

