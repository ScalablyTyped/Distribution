package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListAccountsForPlanStubbedResponseItem extends js.Object {
  var email: Null
  var id: Double
  var login: String
  var marketplace_pending_change: AppsListAccountsForPlanStubbedResponseItemMarketplacePendingChange
  var marketplace_purchase: AppsListAccountsForPlanStubbedResponseItemMarketplacePurchase
  var organization_billing_email: String
  var `type`: String
  var url: String
}

object AppsListAccountsForPlanStubbedResponseItem {
  @scala.inline
  def apply(
    email: Null,
    id: Double,
    login: String,
    marketplace_pending_change: AppsListAccountsForPlanStubbedResponseItemMarketplacePendingChange,
    marketplace_purchase: AppsListAccountsForPlanStubbedResponseItemMarketplacePurchase,
    organization_billing_email: String,
    `type`: String,
    url: String
  ): AppsListAccountsForPlanStubbedResponseItem = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], marketplace_pending_change = marketplace_pending_change.asInstanceOf[js.Any], marketplace_purchase = marketplace_purchase.asInstanceOf[js.Any], organization_billing_email = organization_billing_email.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListAccountsForPlanStubbedResponseItem]
  }
}

