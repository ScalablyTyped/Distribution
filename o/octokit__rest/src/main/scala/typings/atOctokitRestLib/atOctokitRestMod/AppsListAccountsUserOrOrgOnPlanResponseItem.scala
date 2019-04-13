package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListAccountsUserOrOrgOnPlanResponseItem extends js.Object {
  var email: scala.Null
  var id: scala.Double
  var login: java.lang.String
  var marketplace_pending_change: AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChange
  var marketplace_purchase: AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchase
  var organization_billing_email: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object AppsListAccountsUserOrOrgOnPlanResponseItem {
  @scala.inline
  def apply(
    email: scala.Null,
    id: scala.Double,
    login: java.lang.String,
    marketplace_pending_change: AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChange,
    marketplace_purchase: AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchase,
    organization_billing_email: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): AppsListAccountsUserOrOrgOnPlanResponseItem = {
    val __obj = js.Dynamic.literal(email = email, id = id, login = login, marketplace_pending_change = marketplace_pending_change, marketplace_purchase = marketplace_purchase, organization_billing_email = organization_billing_email, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AppsListAccountsUserOrOrgOnPlanResponseItem]
  }
}

