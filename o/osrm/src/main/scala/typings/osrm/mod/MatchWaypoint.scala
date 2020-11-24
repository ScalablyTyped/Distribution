package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each Waypoint object includes two additional properties,
  *
  * 1) matchings_index: Index to the Route object in matchings the sub-trace was matched to,
  * 2) waypoint_index: Index of the waypoint inside the matched route.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#match
  */
@js.native
trait MatchWaypoint extends Waypoint {
  
  var matchings_index: js.Array[Double] = js.native
  
  var waypoint_index: js.Array[Double] = js.native
}
object MatchWaypoint {
  
  @scala.inline
  def apply(
    distance: Double,
    hint: String,
    location: Coordinate,
    matchings_index: js.Array[Double],
    name: String,
    waypoint_index: js.Array[Double]
  ): MatchWaypoint = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matchings_index = matchings_index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], waypoint_index = waypoint_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchWaypoint]
  }
  
  @scala.inline
  implicit class MatchWaypointOps[Self <: MatchWaypoint] (val x: Self) extends AnyVal {
    
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
    def setMatchings_indexVarargs(value: Double*): Self = this.set("matchings_index", js.Array(value :_*))
    
    @scala.inline
    def setMatchings_index(value: js.Array[Double]): Self = this.set("matchings_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypoint_indexVarargs(value: Double*): Self = this.set("waypoint_index", js.Array(value :_*))
    
    @scala.inline
    def setWaypoint_index(value: js.Array[Double]): Self = this.set("waypoint_index", value.asInstanceOf[js.Any])
  }
}
