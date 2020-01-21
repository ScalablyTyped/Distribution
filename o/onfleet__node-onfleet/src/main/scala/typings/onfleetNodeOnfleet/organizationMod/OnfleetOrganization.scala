package typings.onfleetNodeOnfleet.organizationMod

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
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], delegatees = delegatees.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnfleetOrganization]
  }
}

