package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyLinkSnippet extends StObject {
  
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
  implicit class ThirdPartyLinkSnippetMutableBuilder[Self <: ThirdPartyLinkSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelToStoreLink(value: ChannelToStoreLinkDetails): Self = StObject.set(x, "channelToStoreLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelToStoreLinkUndefined: Self = StObject.set(x, "channelToStoreLink", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
