package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Billingcycle
import typings.octokitTypes.anon.Effectivedate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsGetSubscriptionPlanForAccountStubbedResponseData extends js.Object {
  var email: String
  var id: Double
  var login: String
  var marketplace_pending_change: Effectivedate
  var marketplace_purchase: Billingcycle
  var organization_billing_email: String
  var `type`: String
  var url: String
}

object AppsGetSubscriptionPlanForAccountStubbedResponseData {
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
  ): AppsGetSubscriptionPlanForAccountStubbedResponseData = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], marketplace_pending_change = marketplace_pending_change.asInstanceOf[js.Any], marketplace_purchase = marketplace_purchase.asInstanceOf[js.Any], organization_billing_email = organization_billing_email.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetSubscriptionPlanForAccountStubbedResponseData]
  }
}

