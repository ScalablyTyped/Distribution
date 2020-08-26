package typings.mobileMessagingCordova.MobileMessagingCordova

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var body: js.UndefOr[String] = js.native
  var category: js.UndefOr[String] = js.native
  var customPayload: js.UndefOr[Record[String, String]] = js.native
  var internalData: js.UndefOr[String] = js.native
  var messageId: String = js.native
  var silent: js.UndefOr[String] = js.native
  var sound: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var vibrate: js.UndefOr[String] = js.native
}

object Message {
  @scala.inline
  def apply(messageId: String): Message = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setCustomPayload(value: Record[String, String]): Self = this.set("customPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomPayload: Self = this.set("customPayload", js.undefined)
    @scala.inline
    def setInternalData(value: String): Self = this.set("internalData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalData: Self = this.set("internalData", js.undefined)
    @scala.inline
    def setSilent(value: String): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVibrate(value: String): Self = this.set("vibrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVibrate: Self = this.set("vibrate", js.undefined)
  }
  
}

