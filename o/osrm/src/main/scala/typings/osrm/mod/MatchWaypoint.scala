package typings.osrm.mod

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
  var matchings_index: js.Array[Double]
  var waypoint_index: js.Array[Double]
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
}

