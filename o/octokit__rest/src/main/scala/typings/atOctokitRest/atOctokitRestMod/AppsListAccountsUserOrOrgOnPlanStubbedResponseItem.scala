package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListAccountsUserOrOrgOnPlanStubbedResponseItem extends js.Object {
  var email: Null
  var id: Double
  var login: String
  var marketplace_pending_change: AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePendingChange
  var marketplace_purchase: AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePurchase
  var organization_billing_email: String
  var `type`: String
  var url: String
}

object AppsListAccountsUserOrOrgOnPlanStubbedResponseItem {
  @scala.inline
  def apply(
    email: Null,
    id: Double,
    login: String,
    marketplace_pending_change: AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePendingChange,
    marketplace_purchase: AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePurchase,
    organization_billing_email: String,
    `type`: String,
    url: String
  ): AppsListAccountsUserOrOrgOnPlanStubbedResponseItem = {
    val __obj = js.Dynamic.literal(email = email, id = id, login = login, marketplace_pending_change = marketplace_pending_change, marketplace_purchase = marketplace_purchase, organization_billing_email = organization_billing_email, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AppsListAccountsUserOrOrgOnPlanStubbedResponseItem]
  }
}

