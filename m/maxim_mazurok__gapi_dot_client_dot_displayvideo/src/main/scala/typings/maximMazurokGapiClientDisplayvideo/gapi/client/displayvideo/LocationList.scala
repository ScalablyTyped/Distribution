package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationList extends StObject {
  
  /** Required. Immutable. The unique ID of the advertiser the location list belongs to. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** Required. The display name of the location list. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID of the location list. Assigned by the system. */
  var locationListId: js.UndefOr[String] = js.native
  
  /** Required. Immutable. The type of location. All locations in the list will share this type. */
  var locationType: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the location list. */
  var name: js.UndefOr[String] = js.native
}
object LocationList {
  
  @scala.inline
  def apply(): LocationList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationList]
  }
  
  @scala.inline
  implicit class LocationListMutableBuilder[Self <: LocationList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLocationListId(value: String): Self = StObject.set(x, "locationListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationListIdUndefined: Self = StObject.set(x, "locationListId", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
