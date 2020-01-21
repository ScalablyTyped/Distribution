package typings.paypalRestSdk.mod

import typings.paypalRestSdk.AnonBrandname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payee extends js.Object {
  var email: String
  var merchant_id: String
  var payee_display_metadata: js.UndefOr[AnonBrandname] = js.undefined
}

object Payee {
  @scala.inline
  def apply(email: String, merchant_id: String, payee_display_metadata: AnonBrandname = null): Payee = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], merchant_id = merchant_id.asInstanceOf[js.Any])
    if (payee_display_metadata != null) __obj.updateDynamic("payee_display_metadata")(payee_display_metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payee]
  }
}

