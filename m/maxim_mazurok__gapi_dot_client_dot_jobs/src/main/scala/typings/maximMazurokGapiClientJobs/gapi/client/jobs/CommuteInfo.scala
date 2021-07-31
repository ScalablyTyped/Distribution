package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommuteInfo extends StObject {
  
  /** Location used as the destination in the commute calculation. */
  var jobLocation: js.UndefOr[Location] = js.undefined
  
  /**
    * The number of seconds required to travel to the job location from the query location. A duration of 0 seconds indicates that the job is not reachable within the requested duration,
    * but was returned as part of an expanded query.
    */
  var travelDuration: js.UndefOr[String] = js.undefined
}
object CommuteInfo {
  
  @scala.inline
  def apply(): CommuteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommuteInfo]
  }
  
  @scala.inline
  implicit class CommuteInfoMutableBuilder[Self <: CommuteInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobLocation(value: Location): Self = StObject.set(x, "jobLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobLocationUndefined: Self = StObject.set(x, "jobLocation", js.undefined)
    
    @scala.inline
    def setTravelDuration(value: String): Self = StObject.set(x, "travelDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravelDurationUndefined: Self = StObject.set(x, "travelDuration", js.undefined)
  }
}
