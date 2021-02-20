package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelToStoreLinkDetails extends StObject {
  
  /** Name of the store. */
  var storeName: js.UndefOr[String] = js.native
  
  /** Landing page of the store. */
  var storeUrl: js.UndefOr[String] = js.native
}
object ChannelToStoreLinkDetails {
  
  @scala.inline
  def apply(): ChannelToStoreLinkDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelToStoreLinkDetails]
  }
  
  @scala.inline
  implicit class ChannelToStoreLinkDetailsMutableBuilder[Self <: ChannelToStoreLinkDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    
    @scala.inline
    def setStoreUrl(value: String): Self = StObject.set(x, "storeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUrlUndefined: Self = StObject.set(x, "storeUrl", js.undefined)
  }
}
