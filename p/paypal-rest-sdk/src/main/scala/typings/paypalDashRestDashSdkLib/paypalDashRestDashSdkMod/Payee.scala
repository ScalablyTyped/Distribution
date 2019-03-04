package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payee extends js.Object {
  var email: java.lang.String
  var merchant_id: java.lang.String
  var payee_display_metadata: js.UndefOr[paypalDashRestDashSdkLib.Anon_Brandname] = js.undefined
}

object Payee {
  @scala.inline
  def apply(
    email: java.lang.String,
    merchant_id: java.lang.String,
    payee_display_metadata: paypalDashRestDashSdkLib.Anon_Brandname = null
  ): Payee = {
    val __obj = js.Dynamic.literal(email = email, merchant_id = merchant_id)
    if (payee_display_metadata != null) __obj.updateDynamic("payee_display_metadata")(payee_display_metadata)
    __obj.asInstanceOf[Payee]
  }
}

