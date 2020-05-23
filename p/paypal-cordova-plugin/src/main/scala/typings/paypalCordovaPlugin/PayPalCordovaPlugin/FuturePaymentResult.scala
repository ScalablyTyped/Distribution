package typings.paypalCordovaPlugin.PayPalCordovaPlugin

import typings.paypalCordovaPlugin.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuturePaymentResult extends BaseResult {
  var response: Code
}

object FuturePaymentResult {
  @scala.inline
  def apply(client: Client, response: Code, response_type: String): FuturePaymentResult = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], response_type = response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FuturePaymentResult]
  }
}

