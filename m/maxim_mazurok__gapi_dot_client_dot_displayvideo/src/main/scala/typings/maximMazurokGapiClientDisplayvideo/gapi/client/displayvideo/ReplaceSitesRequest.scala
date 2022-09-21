package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceSitesRequest extends StObject {
  
  /** The ID of the advertiser that owns the parent channel. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** The sites that will replace the existing sites assigned to the channel, specified as a list of Sites. */
  var newSites: js.UndefOr[js.Array[Site]] = js.undefined
  
  /** The ID of the partner that owns the parent channel. */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ReplaceSitesRequest {
  
  inline def apply(): ReplaceSitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceSitesRequest]
  }
  
  extension [Self <: ReplaceSitesRequest](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setNewSites(value: js.Array[Site]): Self = StObject.set(x, "newSites", value.asInstanceOf[js.Any])
    
    inline def setNewSitesUndefined: Self = StObject.set(x, "newSites", js.undefined)
    
    inline def setNewSitesVarargs(value: Site*): Self = StObject.set(x, "newSites", js.Array(value*))
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
