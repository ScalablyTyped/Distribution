package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelStatus extends js.Object {
  
  /** If true, then the user is linked to either a YouTube username or G+ account. Otherwise, the user doesn't have a public YouTube identity. */
  var isLinked: js.UndefOr[Boolean] = js.native
  
  /** The long uploads status of this channel. See https://support.google.com/youtube/answer/71673 for more information. */
  var longUploadsStatus: js.UndefOr[String] = js.native
  
  var madeForKids: js.UndefOr[Boolean] = js.native
  
  /** Privacy status of the channel. */
  var privacyStatus: js.UndefOr[String] = js.native
  
  var selfDeclaredMadeForKids: js.UndefOr[Boolean] = js.native
}
object ChannelStatus {
  
  @scala.inline
  def apply(): ChannelStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStatus]
  }
  
  @scala.inline
  implicit class ChannelStatusOps[Self <: ChannelStatus] (val x: Self) extends AnyVal {
    
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
    def setIsLinked(value: Boolean): Self = this.set("isLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLinked: Self = this.set("isLinked", js.undefined)
    
    @scala.inline
    def setLongUploadsStatus(value: String): Self = this.set("longUploadsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongUploadsStatus: Self = this.set("longUploadsStatus", js.undefined)
    
    @scala.inline
    def setMadeForKids(value: Boolean): Self = this.set("madeForKids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMadeForKids: Self = this.set("madeForKids", js.undefined)
    
    @scala.inline
    def setPrivacyStatus(value: String): Self = this.set("privacyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyStatus: Self = this.set("privacyStatus", js.undefined)
    
    @scala.inline
    def setSelfDeclaredMadeForKids(value: Boolean): Self = this.set("selfDeclaredMadeForKids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfDeclaredMadeForKids: Self = this.set("selfDeclaredMadeForKids", js.undefined)
  }
}
