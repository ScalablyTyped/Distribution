package typings.paypalCordovaPlugin.PayPalCordovaPlugin

import typings.paypalCordovaPlugin.anon.Authorizationid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinglePaymentResult extends BaseResult {
  var response: Authorizationid = js.native
}

object SinglePaymentResult {
  @scala.inline
  def apply(client: Client, response: Authorizationid, response_type: String): SinglePaymentResult = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], response_type = response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinglePaymentResult]
  }
  @scala.inline
  implicit class SinglePaymentResultOps[Self <: SinglePaymentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResponse(value: Authorizationid): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

