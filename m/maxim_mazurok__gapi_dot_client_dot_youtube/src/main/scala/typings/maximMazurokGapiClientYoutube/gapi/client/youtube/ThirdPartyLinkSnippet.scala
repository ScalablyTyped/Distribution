package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyLinkSnippet extends StObject {
  
  /** Information specific to a link between a channel and a store on a merchandising platform. */
  var channelToStoreLink: js.UndefOr[ChannelToStoreLinkDetails] = js.undefined
  
  /** Type of the link named after the entities that are being linked. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ThirdPartyLinkSnippet {
  
  inline def apply(): ThirdPartyLinkSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyLinkSnippet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThirdPartyLinkSnippet] (val x: Self) extends AnyVal {
    
    inline def setChannelToStoreLink(value: ChannelToStoreLinkDetails): Self = StObject.set(x, "channelToStoreLink", value.asInstanceOf[js.Any])
    
    inline def setChannelToStoreLinkUndefined: Self = StObject.set(x, "channelToStoreLink", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
