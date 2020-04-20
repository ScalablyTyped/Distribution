package typings.paypalCordovaPlugin.PayPalCordovaPlugin

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
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], paypal_sdk_version = paypal_sdk_version.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

