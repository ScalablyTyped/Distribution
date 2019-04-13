package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListMarketplacePurchasesForAuthenticatedUserResponseItemAccount extends js.Object {
  var email: scala.Null
  var id: scala.Double
  var login: java.lang.String
  var organization_billing_email: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object AppsListMarketplacePurchasesForAuthenticatedUserResponseItemAccount {
  @scala.inline
  def apply(
    email: scala.Null,
    id: scala.Double,
    login: java.lang.String,
    organization_billing_email: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): AppsListMarketplacePurchasesForAuthenticatedUserResponseItemAccount = {
    val __obj = js.Dynamic.literal(email = email, id = id, login = login, organization_billing_email = organization_billing_email, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AppsListMarketplacePurchasesForAuthenticatedUserResponseItemAccount]
  }
}

