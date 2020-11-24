package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatModeratorSnippet extends js.Object {
  
  /** The ID of the live chat this moderator can act on. */
  var liveChatId: js.UndefOr[String] = js.native
  
  /** Details about the moderator. */
  var moderatorDetails: js.UndefOr[ChannelProfileDetails] = js.native
}
object LiveChatModeratorSnippet {
  
  @scala.inline
  def apply(): LiveChatModeratorSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatModeratorSnippet]
  }
  
  @scala.inline
  implicit class LiveChatModeratorSnippetOps[Self <: LiveChatModeratorSnippet] (val x: Self) extends AnyVal {
    
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
    def setLiveChatId(value: String): Self = this.set("liveChatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveChatId: Self = this.set("liveChatId", js.undefined)
    
    @scala.inline
    def setModeratorDetails(value: ChannelProfileDetails): Self = this.set("moderatorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModeratorDetails: Self = this.set("moderatorDetails", js.undefined)
  }
}
