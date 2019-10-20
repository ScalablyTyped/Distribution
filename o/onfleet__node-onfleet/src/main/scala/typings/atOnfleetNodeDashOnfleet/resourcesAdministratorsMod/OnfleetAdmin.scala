package typings.atOnfleetNodeDashOnfleet.resourcesAdministratorsMod

import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetStrings.`super`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetStrings.standard
import typings.atOnfleetNodeDashOnfleet.metadataMod.OnfleetMetadata
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
    val __obj = js.Dynamic.literal(email = email, id = id, isActive = isActive, metadata = metadata, name = name, organization = organization, phone = phone, timeCreated = timeCreated, timeLastModified = timeLastModified)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetAdmin]
  }
}

