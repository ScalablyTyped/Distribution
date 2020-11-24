package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatBanSnippet extends js.Object {
  
  /** The duration of a ban, only filled if the ban has type TEMPORARY. */
  var banDurationSeconds: js.UndefOr[String] = js.native
  
  var bannedUserDetails: js.UndefOr[ChannelProfileDetails] = js.native
  
  /** The chat this ban is pertinent to. */
  var liveChatId: js.UndefOr[String] = js.native
  
  /** The type of ban. */
  var `type`: js.UndefOr[String] = js.native
}
object LiveChatBanSnippet {
  
  @scala.inline
  def apply(): LiveChatBanSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatBanSnippet]
  }
  
  @scala.inline
  implicit class LiveChatBanSnippetOps[Self <: LiveChatBanSnippet] (val x: Self) extends AnyVal {
    
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
    def setBanDurationSeconds(value: String): Self = this.set("banDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBanDurationSeconds: Self = this.set("banDurationSeconds", js.undefined)
    
    @scala.inline
    def setBannedUserDetails(value: ChannelProfileDetails): Self = this.set("bannedUserDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannedUserDetails: Self = this.set("bannedUserDetails", js.undefined)
    
    @scala.inline
    def setLiveChatId(value: String): Self = this.set("liveChatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveChatId: Self = this.set("liveChatId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
