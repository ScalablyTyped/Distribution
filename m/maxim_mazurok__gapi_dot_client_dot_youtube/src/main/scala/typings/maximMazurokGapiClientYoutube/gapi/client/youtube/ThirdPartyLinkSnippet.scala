package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyLinkSnippet extends js.Object {
  
  /** Information specific to a link between a channel and a store on a merchandising platform. */
  var channelToStoreLink: js.UndefOr[ChannelToStoreLinkDetails] = js.native
  
  /** Type of the link named after the entities that are being linked. */
  var `type`: js.UndefOr[String] = js.native
}
object ThirdPartyLinkSnippet {
  
  @scala.inline
  def apply(): ThirdPartyLinkSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyLinkSnippet]
  }
  
  @scala.inline
  implicit class ThirdPartyLinkSnippetOps[Self <: ThirdPartyLinkSnippet] (val x: Self) extends AnyVal {
    
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
    def setChannelToStoreLink(value: ChannelToStoreLinkDetails): Self = this.set("channelToStoreLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelToStoreLink: Self = this.set("channelToStoreLink", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
