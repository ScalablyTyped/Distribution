package typings.onfleetNodeOnfleet.administratorsMod

import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`super`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnfleetAdmin extends js.Object {
  var email: String
  var id: String
  var isActive: Boolean
  var metadata: OnfleetMetadata
  var name: String
  var organization: String
  var phone: String
  var timeCreated: Double
  var timeLastModified: Double
  var `type`: `super` | standard
}

object OnfleetAdmin {
  @scala.inline
  def apply(
    email: String,
    id: String,
    isActive: Boolean,
    metadata: OnfleetMetadata,
    name: String,
    organization: String,
    phone: String,
    timeCreated: Double,
    timeLastModified: Double,
    `type`: `super` | standard
  ): OnfleetAdmin = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetAdmin]
  }
}

