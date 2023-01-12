package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommuteFilter extends StObject {
  
  /**
    * If `true`, jobs without street level addresses may also be returned. For city level addresses, the city center is used. For state and coarser level addresses, text matching is used.
    * If this field is set to `false` or isn't specified, only jobs that include street level addresses will be returned by commute search.
    */
  var allowImpreciseAddresses: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The method of transportation to calculate the commute time for. */
  var commuteMethod: js.UndefOr[String] = js.undefined
  
  /** The departure time used to calculate traffic impact, represented as google.type.TimeOfDay in local time zone. Currently traffic model is restricted to hour level resolution. */
  var departureTime: js.UndefOr[TimeOfDay] = js.undefined
  
  /** Specifies the traffic density to use when calculating commute time. */
  var roadTraffic: js.UndefOr[String] = js.undefined
  
  /** Required. The latitude and longitude of the location to calculate the commute time from. */
  var startCoordinates: js.UndefOr[LatLng] = js.undefined
  
  /** Required. The maximum travel time in seconds. The maximum allowed value is `3600s` (one hour). Format is `123s`. */
  var travelDuration: js.UndefOr[String] = js.undefined
}
object CommuteFilter {
  
  inline def apply(): CommuteFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommuteFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommuteFilter] (val x: Self) extends AnyVal {
    
    inline def setAllowImpreciseAddresses(value: Boolean): Self = StObject.set(x, "allowImpreciseAddresses", value.asInstanceOf[js.Any])
    
    inline def setAllowImpreciseAddressesUndefined: Self = StObject.set(x, "allowImpreciseAddresses", js.undefined)
    
    inline def setCommuteMethod(value: String): Self = StObject.set(x, "commuteMethod", value.asInstanceOf[js.Any])
    
    inline def setCommuteMethodUndefined: Self = StObject.set(x, "commuteMethod", js.undefined)
    
    inline def setDepartureTime(value: TimeOfDay): Self = StObject.set(x, "departureTime", value.asInstanceOf[js.Any])
    
    inline def setDepartureTimeUndefined: Self = StObject.set(x, "departureTime", js.undefined)
    
    inline def setRoadTraffic(value: String): Self = StObject.set(x, "roadTraffic", value.asInstanceOf[js.Any])
    
    inline def setRoadTrafficUndefined: Self = StObject.set(x, "roadTraffic", js.undefined)
    
    inline def setStartCoordinates(value: LatLng): Self = StObject.set(x, "startCoordinates", value.asInstanceOf[js.Any])
    
    inline def setStartCoordinatesUndefined: Self = StObject.set(x, "startCoordinates", js.undefined)
    
    inline def setTravelDuration(value: String): Self = StObject.set(x, "travelDuration", value.asInstanceOf[js.Any])
    
    inline def setTravelDurationUndefined: Self = StObject.set(x, "travelDuration", js.undefined)
  }
}
