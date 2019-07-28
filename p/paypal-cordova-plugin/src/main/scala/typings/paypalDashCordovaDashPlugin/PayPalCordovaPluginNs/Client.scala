package typings.paypalDashCordovaDashPlugin.PayPalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var environment: String
  var paypal_sdk_version: String
  var platform: String
  var product_name: String
}

object Client {
  @scala.inline
  def apply(environment: String, paypal_sdk_version: String, platform: String, product_name: String): Client = {
    val __obj = js.Dynamic.literal(environment = environment, paypal_sdk_version = paypal_sdk_version, platform = platform, product_name = product_name)
  
    __obj.asInstanceOf[Client]
  }
}

