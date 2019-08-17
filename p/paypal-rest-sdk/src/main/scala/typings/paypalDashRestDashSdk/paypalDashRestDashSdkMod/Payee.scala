package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import typings.paypalDashRestDashSdk.Anon_Brandname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payee extends js.Object {
  var email: String
  var merchant_id: String
  var payee_display_metadata: js.UndefOr[Anon_Brandname] = js.undefined
}

object Payee {
  @scala.inline
  def apply(email: String, merchant_id: String, payee_display_metadata: Anon_Brandname = null): Payee = {
    val __obj = js.Dynamic.literal(email = email, merchant_id = merchant_id)
    if (payee_display_metadata != null) __obj.updateDynamic("payee_display_metadata")(payee_display_metadata)
    __obj.asInstanceOf[Payee]
  }
}

