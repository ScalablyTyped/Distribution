package typings.onfleetNodeOnfleet.administratorsMod

import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`super`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnfleetAdmin extends js.Object {
  var email: String = js.native
  var id: String = js.native
  var isActive: Boolean = js.native
  var metadata: OnfleetMetadata = js.native
  var name: String = js.native
  var organization: String = js.native
  var phone: String = js.native
  var timeCreated: Double = js.native
  var timeLastModified: Double = js.native
  var `type`: `super` | standard = js.native
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
  @scala.inline
  implicit class OnfleetAdminOps[Self <: OnfleetAdmin] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: OnfleetMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeCreated(value: Double): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeLastModified(value: Double): Self = this.set("timeLastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `super` | standard): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

