package typings.atOnfleetNodeDashOnfleet.resourcesRecipientsMod

import typings.atOnfleetNodeDashOnfleet.metadataMod.OnfleetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnfleetRecipient extends js.Object {
  var id: String
  var metadata: js.Array[OnfleetMetadata]
  var name: String
  var notes: String
  var organization: String
  var phone: String
  var skipSMSNotifications: Boolean
  var timeCreated: Double
  var timeLastModified: Double
}

object OnfleetRecipient {
  @scala.inline
  def apply(
    id: String,
    metadata: js.Array[OnfleetMetadata],
    name: String,
    notes: String,
    organization: String,
    phone: String,
    skipSMSNotifications: Boolean,
    timeCreated: Double,
    timeLastModified: Double
  ): OnfleetRecipient = {
    val __obj = js.Dynamic.literal(id = id, metadata = metadata, name = name, notes = notes, organization = organization, phone = phone, skipSMSNotifications = skipSMSNotifications, timeCreated = timeCreated, timeLastModified = timeLastModified)
  
    __obj.asInstanceOf[OnfleetRecipient]
  }
}

