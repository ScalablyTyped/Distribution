package typings.octokitRest.mod

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
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], organization_billing_email = organization_billing_email.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItemAccount]
  }
}

