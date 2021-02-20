package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TripResults extends StObject {
  
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
  implicit class TripResultsMutableBuilder[Self <: TripResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrips(value: js.Array[Route]): Self = StObject.set(x, "trips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTripsVarargs(value: Route*): Self = StObject.set(x, "trips", js.Array(value :_*))
    
    @scala.inline
    def setWaypoints(value: js.Array[TripWaypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointsVarargs(value: TripWaypoint*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
  }
}
