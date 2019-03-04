package typings
package paypalDashCordovaDashPluginLib.PayPalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinglePaymentResult extends BaseResult {
  var response: paypalDashCordovaDashPluginLib.Anon_Authorizationid
}

object SinglePaymentResult {
  @scala.inline
  def apply(
    client: Client,
    response: paypalDashCordovaDashPluginLib.Anon_Authorizationid,
    response_type: java.lang.String
  ): SinglePaymentResult = {
    val __obj = js.Dynamic.literal(client = client, response = response, response_type = response_type)
  
    __obj.asInstanceOf[SinglePaymentResult]
  }
}

