package typings
package osrmLib.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each Waypoint object includes two additional properties,
  *
  * 1) matchings_index: Index to the Route object in matchings the sub-trace was matched to,
  * 2) waypoint_index: Index of the waypoint inside the matched route.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#match
  */
trait MatchWaypoint extends Waypoint {
  var matchings_index: js.Array[scala.Double]
  var waypoint_index: js.Array[scala.Double]
}

object MatchWaypoint {
  @scala.inline
  def apply(
    distance: scala.Double,
    hint: java.lang.String,
    location: Coordinate,
    matchings_index: js.Array[scala.Double],
    name: java.lang.String,
    waypoint_index: js.Array[scala.Double]
  ): MatchWaypoint = {
    val __obj = js.Dynamic.literal(distance = distance, hint = hint, location = location, matchings_index = matchings_index, name = name, waypoint_index = waypoint_index)
  
    __obj.asInstanceOf[MatchWaypoint]
  }
}

