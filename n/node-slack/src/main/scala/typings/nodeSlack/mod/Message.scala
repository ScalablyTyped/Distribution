package typings.nodeSlack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  var attachments: js.UndefOr[js.Array[_]] = js.native
  
  var channel: js.UndefOr[String] = js.native
  
  var icon_emoji: js.UndefOr[String] = js.native
  
  var link_names: js.UndefOr[Double] = js.native
  
  var text: String = js.native
  
  var unfurl_links: js.UndefOr[Boolean] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object Message {
  
  @scala.inline
  def apply(text: String): Message = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsVarargs(value: js.Any*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[_]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setIcon_emoji(value: String): Self = this.set("icon_emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon_emoji: Self = this.set("icon_emoji", js.undefined)
    
    @scala.inline
    def setLink_names(value: Double): Self = this.set("link_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink_names: Self = this.set("link_names", js.undefined)
    
    @scala.inline
    def setUnfurl_links(value: Boolean): Self = this.set("unfurl_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnfurl_links: Self = this.set("unfurl_links", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
