package typings.atOnfleetNodeDashOnfleet.resourcesOrganizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegatee extends js.Object {
  var country: String
  var email: String
  var id: String
  var name: String
  var timezone: String
}

object Delegatee {
  @scala.inline
  def apply(country: String, email: String, id: String, name: String, timezone: String): Delegatee = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delegatee]
  }
}

