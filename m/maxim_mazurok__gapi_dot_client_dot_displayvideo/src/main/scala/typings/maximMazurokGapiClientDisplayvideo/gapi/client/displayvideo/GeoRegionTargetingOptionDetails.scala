package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoRegionTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the geographic region (e.g., "Ontario, Canada"). */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The type of geographic region targeting. */
  var geoRegionType: js.UndefOr[String] = js.undefined
}
object GeoRegionTargetingOptionDetails {
  
  @scala.inline
  def apply(): GeoRegionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoRegionTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class GeoRegionTargetingOptionDetailsMutableBuilder[Self <: GeoRegionTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGeoRegionType(value: String): Self = StObject.set(x, "geoRegionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoRegionTypeUndefined: Self = StObject.set(x, "geoRegionType", js.undefined)
  }
}
