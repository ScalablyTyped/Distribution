package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoiAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of a POI, e.g. "Times Square", "Space Needle", followed by its full address if available. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Latitude of the POI rounding to 6th decimal place. */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /** Output only. Longitude of the POI rounding to 6th decimal place. */
  var longitude: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. The radius of the area around the POI that will be targeted. The units of the radius are specified by proximity_radius_unit. Must be 1 to 800 if unit is
    * `DISTANCE_UNIT_KILOMETERS` and 1 to 500 if unit is `DISTANCE_UNIT_MILES`.
    */
  var proximityRadiusAmount: js.UndefOr[Double] = js.undefined
  
  /** Required. The unit of distance by which the targeting radius is measured. */
  var proximityRadiusUnit: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_POI`. Accepted POI targeting option IDs can be retrieved using SearchTargetingOptions. If targeting a
    * specific latitude/longitude coordinate removed from an address or POI name, you can generate the necessary targeting option ID by rounding the desired coordinate values to the 6th
    * decimal place, removing the decimals, and concatenating the string values separated by a semicolon. For example, you can target the latitude/longitude pair of 40.7414691, -74.003387
    * using the targeting option ID "40741469;-74003387".
    */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object PoiAssignedTargetingOptionDetails {
  
  inline def apply(): PoiAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoiAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PoiAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setProximityRadiusAmount(value: Double): Self = StObject.set(x, "proximityRadiusAmount", value.asInstanceOf[js.Any])
    
    inline def setProximityRadiusAmountUndefined: Self = StObject.set(x, "proximityRadiusAmount", js.undefined)
    
    inline def setProximityRadiusUnit(value: String): Self = StObject.set(x, "proximityRadiusUnit", value.asInstanceOf[js.Any])
    
    inline def setProximityRadiusUnitUndefined: Self = StObject.set(x, "proximityRadiusUnit", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
