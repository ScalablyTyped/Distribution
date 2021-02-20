package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NearestResults extends StObject {
  
  var waypoints: js.Array[Waypoint] = js.native
}
object NearestResults {
  
  @scala.inline
  def apply(waypoints: js.Array[Waypoint]): NearestResults = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestResults]
  }
  
  @scala.inline
  implicit class NearestResultsMutableBuilder[Self <: NearestResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWaypoints(value: js.Array[Waypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointsVarargs(value: Waypoint*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
  }
}
