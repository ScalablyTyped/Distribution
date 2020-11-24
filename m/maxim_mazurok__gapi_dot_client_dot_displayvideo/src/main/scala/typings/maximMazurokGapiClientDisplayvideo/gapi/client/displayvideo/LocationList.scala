package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationList extends js.Object {
  
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
  implicit class LocationListOps[Self <: LocationList] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLocationListId(value: String): Self = this.set("locationListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationListId: Self = this.set("locationListId", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
