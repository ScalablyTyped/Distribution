package typings.paypalDashCordovaDashPlugin.PayPalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayPalClientIds extends js.Object {
  var PayPalEnvironmentProduction: String
  var PayPalEnvironmentSandbox: String
}

object PayPalClientIds {
  @scala.inline
  def apply(PayPalEnvironmentProduction: String, PayPalEnvironmentSandbox: String): PayPalClientIds = {
    val __obj = js.Dynamic.literal(PayPalEnvironmentProduction = PayPalEnvironmentProduction, PayPalEnvironmentSandbox = PayPalEnvironmentSandbox)
  
    __obj.asInstanceOf[PayPalClientIds]
  }
}

