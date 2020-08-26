package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chat extends js.Object {
  /**
    * @deprecated since version Telegram Bot API 4.4 - July 29, 2019
    */
  var all_members_are_administrators: js.UndefOr[Boolean] = js.native
  var can_set_sticker_set: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  var first_name: js.UndefOr[String] = js.native
  var id: Double = js.native
  var invite_link: js.UndefOr[String] = js.native
  var last_name: js.UndefOr[String] = js.native
  var permissions: js.UndefOr[ChatPermissions] = js.native
  var photo: js.UndefOr[ChatPhoto] = js.native
  var pinned_message: js.UndefOr[Message] = js.native
  var sticker_set_name: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: ChatType = js.native
  var username: js.UndefOr[String] = js.native
}

object Chat {
  @scala.inline
  def apply(id: Double, `type`: ChatType): Chat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chat]
  }
  @scala.inline
  implicit class ChatOps[Self <: Chat] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ChatType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAll_members_are_administrators(value: Boolean): Self = this.set("all_members_are_administrators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll_members_are_administrators: Self = this.set("all_members_are_administrators", js.undefined)
    @scala.inline
    def setCan_set_sticker_set(value: Boolean): Self = this.set("can_set_sticker_set", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCan_set_sticker_set: Self = this.set("can_set_sticker_set", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst_name: Self = this.set("first_name", js.undefined)
    @scala.inline
    def setInvite_link(value: String): Self = this.set("invite_link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvite_link: Self = this.set("invite_link", js.undefined)
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
    @scala.inline
    def setPermissions(value: ChatPermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    @scala.inline
    def setPhoto(value: ChatPhoto): Self = this.set("photo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    @scala.inline
    def setPinned_message(value: Message): Self = this.set("pinned_message", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned_message: Self = this.set("pinned_message", js.undefined)
    @scala.inline
    def setSticker_set_name(value: String): Self = this.set("sticker_set_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticker_set_name: Self = this.set("sticker_set_name", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

