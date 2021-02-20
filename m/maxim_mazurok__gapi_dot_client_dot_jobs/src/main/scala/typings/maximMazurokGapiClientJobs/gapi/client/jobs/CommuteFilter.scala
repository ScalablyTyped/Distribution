package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommuteFilter extends StObject {
  
  /**
    * Optional. If true, jobs without "precise" addresses (street level addresses or GPS coordinates) might also be returned. For city and coarser level addresses, text matching is used.
    * If this field is set to false or is not specified, only jobs that include precise addresses are returned by Commute Search. Note: If `allow_imprecise_addresses` is set to true,
    * Commute Search is not able to calculate accurate commute times to jobs with city level and coarser address information. Jobs with imprecise addresses will return a `travel_duration`
    * time of 0 regardless of distance from the job seeker.
    */
  var allowImpreciseAddresses: js.UndefOr[Boolean] = js.native
  
  /** Required. The method of transportation for which to calculate the commute time. */
  var commuteMethod: js.UndefOr[String] = js.native
  
  /**
    * Optional. The departure time used to calculate traffic impact, represented as google.type.TimeOfDay in local time zone. Currently traffic model is restricted to hour level
    * resolution.
    */
  var departureTime: js.UndefOr[TimeOfDay] = js.native
  
  /** Optional. Specifies the traffic density to use when calculating commute time. */
  var roadTraffic: js.UndefOr[String] = js.native
  
  /** Required. The latitude and longitude of the location from which to calculate the commute time. */
  var startCoordinates: js.UndefOr[LatLng] = js.native
  
  /** Required. The maximum travel time in seconds. The maximum allowed value is `3600s` (one hour). Format is `123s`. */
  var travelDuration: js.UndefOr[String] = js.native
}
object CommuteFilter {
  
  @scala.inline
  def apply(): CommuteFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommuteFilter]
  }
  
  @scala.inline
  implicit class CommuteFilterMutableBuilder[Self <: CommuteFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowImpreciseAddresses(value: Boolean): Self = StObject.set(x, "allowImpreciseAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowImpreciseAddressesUndefined: Self = StObject.set(x, "allowImpreciseAddresses", js.undefined)
    
    @scala.inline
    def setCommuteMethod(value: String): Self = StObject.set(x, "commuteMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommuteMethodUndefined: Self = StObject.set(x, "commuteMethod", js.undefined)
    
    @scala.inline
    def setDepartureTime(value: TimeOfDay): Self = StObject.set(x, "departureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartureTimeUndefined: Self = StObject.set(x, "departureTime", js.undefined)
    
    @scala.inline
    def setRoadTraffic(value: String): Self = StObject.set(x, "roadTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadTrafficUndefined: Self = StObject.set(x, "roadTraffic", js.undefined)
    
    @scala.inline
    def setStartCoordinates(value: LatLng): Self = StObject.set(x, "startCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCoordinatesUndefined: Self = StObject.set(x, "startCoordinates", js.undefined)
    
    @scala.inline
    def setTravelDuration(value: String): Self = StObject.set(x, "travelDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravelDurationUndefined: Self = StObject.set(x, "travelDuration", js.undefined)
  }
}
