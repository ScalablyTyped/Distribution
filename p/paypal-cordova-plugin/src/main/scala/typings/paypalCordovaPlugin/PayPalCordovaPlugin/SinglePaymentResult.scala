package typings.paypalCordovaPlugin.PayPalCordovaPlugin

import typings.paypalCordovaPlugin.AnonAuthorizationid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinglePaymentResult extends BaseResult {
  var response: AnonAuthorizationid
}

object SinglePaymentResult {
  @scala.inline
  def apply(client: Client, response: AnonAuthorizationid, response_type: String): SinglePaymentResult = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], response_type = response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinglePaymentResult]
  }
}

