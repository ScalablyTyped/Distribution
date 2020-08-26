package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Login extends js.Object {
  var email: String = js.native
  var id: Double = js.native
  var login: String = js.native
  var marketplace_pending_change: Effectivedate = js.native
  var marketplace_purchase: Billingcycle = js.native
  var organization_billing_email: String = js.native
  var `type`: String = js.native
  var url: String = js.native
}

object Login {
  @scala.inline
  def apply(
    email: String,
    id: Double,
    login: String,
    marketplace_pending_change: Effectivedate,
    marketplace_purchase: Billingcycle,
    organization_billing_email: String,
    `type`: String,
    url: String
  ): Login = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], marketplace_pending_change = marketplace_pending_change.asInstanceOf[js.Any], marketplace_purchase = marketplace_purchase.asInstanceOf[js.Any], organization_billing_email = organization_billing_email.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Login]
  }
  @scala.inline
  implicit class LoginOps[Self <: Login] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarketplace_pending_change(value: Effectivedate): Self = this.set("marketplace_pending_change", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarketplace_purchase(value: Billingcycle): Self = this.set("marketplace_purchase", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganization_billing_email(value: String): Self = this.set("organization_billing_email", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

