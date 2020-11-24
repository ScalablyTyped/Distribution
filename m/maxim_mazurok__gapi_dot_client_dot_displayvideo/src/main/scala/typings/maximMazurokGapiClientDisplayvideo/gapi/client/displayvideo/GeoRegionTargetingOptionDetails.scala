package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoRegionTargetingOptionDetails extends js.Object {
  
  /** Output only. The display name of the geographic region (e.g., "Ontario, Canada"). */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The type of geographic region targeting. */
  var geoRegionType: js.UndefOr[String] = js.native
}
object GeoRegionTargetingOptionDetails {
  
  @scala.inline
  def apply(): GeoRegionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoRegionTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class GeoRegionTargetingOptionDetailsOps[Self <: GeoRegionTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setGeoRegionType(value: String): Self = this.set("geoRegionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoRegionType: Self = this.set("geoRegionType", js.undefined)
  }
}
