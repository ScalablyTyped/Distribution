package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Recipients.CreateRecipientProps> */
@js.native
trait PartialCreateRecipientPro extends js.Object {
  var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.native
  var name: js.UndefOr[String] = js.native
  var notes: js.UndefOr[String] = js.native
  var phone: js.UndefOr[String] = js.native
  var skipPhoneNumberValidation: js.UndefOr[Boolean] = js.native
  var skipSMSNotifications: js.UndefOr[Boolean] = js.native
}

object PartialCreateRecipientPro {
  @scala.inline
  def apply(): PartialCreateRecipientPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateRecipientPro]
  }
  @scala.inline
  implicit class PartialCreateRecipientProOps[Self <: PartialCreateRecipientPro] (val x: Self) extends AnyVal {
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
    def setMetadataVarargs(value: OnfleetMetadata*): Self = this.set("metadata", js.Array(value :_*))
    @scala.inline
    def setMetadata(value: js.Array[OnfleetMetadata]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setSkipPhoneNumberValidation(value: Boolean): Self = this.set("skipPhoneNumberValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipPhoneNumberValidation: Self = this.set("skipPhoneNumberValidation", js.undefined)
    @scala.inline
    def setSkipSMSNotifications(value: Boolean): Self = this.set("skipSMSNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipSMSNotifications: Self = this.set("skipSMSNotifications", js.undefined)
  }
  
}

