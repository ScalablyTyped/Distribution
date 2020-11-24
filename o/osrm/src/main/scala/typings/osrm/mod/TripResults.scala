package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TripResults extends js.Object {
  
  var trips: js.Array[Route] = js.native
  
  var waypoints: js.Array[TripWaypoint] = js.native
}
object TripResults {
  
  @scala.inline
  def apply(trips: js.Array[Route], waypoints: js.Array[TripWaypoint]): TripResults = {
    val __obj = js.Dynamic.literal(trips = trips.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripResults]
  }
  
  @scala.inline
  implicit class TripResultsOps[Self <: TripResults] (val x: Self) extends AnyVal {
    
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
    def setTripsVarargs(value: Route*): Self = this.set("trips", js.Array(value :_*))
    
    @scala.inline
    def setTrips(value: js.Array[Route]): Self = this.set("trips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointsVarargs(value: TripWaypoint*): Self = this.set("waypoints", js.Array(value :_*))
    
    @scala.inline
    def setWaypoints(value: js.Array[TripWaypoint]): Self = this.set("waypoints", value.asInstanceOf[js.Any])
  }
}
