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
    val __obj = js.Dynamic.literal(country = country, email = email, id = id, name = name, timezone = timezone)
  
    __obj.asInstanceOf[Delegatee]
  }
}

