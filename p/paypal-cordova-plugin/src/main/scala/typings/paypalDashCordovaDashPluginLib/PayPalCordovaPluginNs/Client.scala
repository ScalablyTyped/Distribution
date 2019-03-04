package typings
package paypalDashCordovaDashPluginLib.PayPalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var environment: java.lang.String
  var paypal_sdk_version: java.lang.String
  var platform: java.lang.String
  var product_name: java.lang.String
}

object Client {
  @scala.inline
  def apply(
    environment: java.lang.String,
    paypal_sdk_version: java.lang.String,
    platform: java.lang.String,
    product_name: java.lang.String
  ): Client = {
    val __obj = js.Dynamic.literal(environment = environment, paypal_sdk_version = paypal_sdk_version, platform = platform, product_name = product_name)
  
    __obj.asInstanceOf[Client]
  }
}

