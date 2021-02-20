package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListZonesResponse extends StObject {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** All GTM Zones of a GTM Container. */
  var zone: js.UndefOr[js.Array[Zone]] = js.native
}
object ListZonesResponse {
  
  @scala.inline
  def apply(): ListZonesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListZonesResponse]
  }
  
  @scala.inline
  implicit class ListZonesResponseMutableBuilder[Self <: ListZonesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setZone(value: js.Array[Zone]): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    
    @scala.inline
    def setZoneVarargs(value: Zone*): Self = StObject.set(x, "zone", js.Array(value :_*))
  }
}
