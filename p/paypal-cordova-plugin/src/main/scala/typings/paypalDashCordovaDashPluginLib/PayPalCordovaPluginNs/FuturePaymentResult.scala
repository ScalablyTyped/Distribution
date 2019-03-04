package typings
package paypalDashCordovaDashPluginLib.PayPalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuturePaymentResult extends BaseResult {
  var response: paypalDashCordovaDashPluginLib.Anon_Code
}

object FuturePaymentResult {
  @scala.inline
  def apply(
    client: Client,
    response: paypalDashCordovaDashPluginLib.Anon_Code,
    response_type: java.lang.String
  ): FuturePaymentResult = {
    val __obj = js.Dynamic.literal(client = client, response = response, response_type = response_type)
  
    __obj.asInstanceOf[FuturePaymentResult]
  }
}

