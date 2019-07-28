package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItemAccount extends js.Object {
  var email: Null
  var id: Double
  var login: String
  var organization_billing_email: String
  var `type`: String
  var url: String
}

object AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItemAccount {
  @scala.inline
  def apply(
    email: Null,
    id: Double,
    login: String,
    organization_billing_email: String,
    `type`: String,
    url: String
  ): AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItemAccount = {
    val __obj = js.Dynamic.literal(email = email, id = id, login = login, organization_billing_email = organization_billing_email, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItemAccount]
  }
}

