package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelToStoreLinkDetails extends StObject {
  
  /** Name of the store. */
  var storeName: js.UndefOr[String] = js.undefined
  
  /** Landing page of the store. */
  var storeUrl: js.UndefOr[String] = js.undefined
}
object ChannelToStoreLinkDetails {
  
  inline def apply(): ChannelToStoreLinkDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelToStoreLinkDetails]
  }
  
  extension [Self <: ChannelToStoreLinkDetails](x: Self) {
    
    inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    
    inline def setStoreUrl(value: String): Self = StObject.set(x, "storeUrl", value.asInstanceOf[js.Any])
    
    inline def setStoreUrlUndefined: Self = StObject.set(x, "storeUrl", js.undefined)
  }
}
