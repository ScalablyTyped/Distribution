package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organizationbillingemail extends js.Object {
  var email: String
  var id: Double
  var login: String
  var organization_billing_email: String
  var `type`: String
  var url: String
}

object Organizationbillingemail {
  @scala.inline
  def apply(
    email: String,
    id: Double,
    login: String,
    organization_billing_email: String,
    `type`: String,
    url: String
  ): Organizationbillingemail = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], organization_billing_email = organization_billing_email.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organizationbillingemail]
  }
}

