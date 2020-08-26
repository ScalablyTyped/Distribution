package typings.onfleetNodeOnfleet.recipientsMod

import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnfleetRecipient extends js.Object {
  var id: String = js.native
  var metadata: js.Array[OnfleetMetadata] = js.native
  var name: String = js.native
  var notes: String = js.native
  var organization: String = js.native
  var phone: String = js.native
  var skipSMSNotifications: Boolean = js.native
  var timeCreated: Double = js.native
  var timeLastModified: Double = js.native
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], skipSMSNotifications = skipSMSNotifications.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetRecipient]
  }
  @scala.inline
  implicit class OnfleetRecipientOps[Self <: OnfleetRecipient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataVarargs(value: OnfleetMetadata*): Self = this.set("metadata", js.Array(value :_*))
    @scala.inline
    def setMetadata(value: js.Array[OnfleetMetadata]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipSMSNotifications(value: Boolean): Self = this.set("skipSMSNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeCreated(value: Double): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeLastModified(value: Double): Self = this.set("timeLastModified", value.asInstanceOf[js.Any])
  }
  
}

