package typings.atOnfleetNodeDashOnfleet.resourcesOrganizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnfleetOrganization extends js.Object {
  var country: String
  var delegatees: js.Array[String]
  var email: String
  var id: String
  var image: String
  var name: String
  var timeCreated: Double
  var timeLastModified: Double
  var timezone: String
}

object OnfleetOrganization {
  @scala.inline
  def apply(
    country: String,
    delegatees: js.Array[String],
    email: String,
    id: String,
    image: String,
    name: String,
    timeCreated: Double,
    timeLastModified: Double,
    timezone: String
  ): OnfleetOrganization = {
    val __obj = js.Dynamic.literal(country = country, delegatees = delegatees, email = email, id = id, image = image, name = name, timeCreated = timeCreated, timeLastModified = timeLastModified, timezone = timezone)
  
    __obj.asInstanceOf[OnfleetOrganization]
  }
}

