package typings.paypalDashCordovaDashPlugin.PayPalCordovaPluginNs

import typings.paypalDashCordovaDashPlugin.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuturePaymentResult extends BaseResult {
  var response: Anon_Code
}

object FuturePaymentResult {
  @scala.inline
  def apply(client: Client, response: Anon_Code, response_type: String): FuturePaymentResult = {
    val __obj = js.Dynamic.literal(client = client, response = response, response_type = response_type)
  
    __obj.asInstanceOf[FuturePaymentResult]
  }
}

