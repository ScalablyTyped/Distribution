package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAccountIsAssociatedWithAnyResponse extends js.Object {
  var email: scala.Null
  var id: scala.Double
  var login: java.lang.String
  var marketplace_pending_change: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChange
  var marketplace_purchase: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchase
  var organization_billing_email: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object AppsCheckAccountIsAssociatedWithAnyResponse {
  @scala.inline
  def apply(
    email: scala.Null,
    id: scala.Double,
    login: java.lang.String,
    marketplace_pending_change: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChange,
    marketplace_purchase: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchase,
    organization_billing_email: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): AppsCheckAccountIsAssociatedWithAnyResponse = {
    val __obj = js.Dynamic.literal(email = email, id = id, login = login, marketplace_pending_change = marketplace_pending_change, marketplace_purchase = marketplace_purchase, organization_billing_email = organization_billing_email, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyResponse]
  }
}

