package typings.osrm.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each Waypoint object has the following additional properties,
  *
  * 1) trips_index: index to trips of the sub-trip the point was matched to, and
  * 2) waypoint_index: index of the point in the trip.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#trip
  */
trait TripWaypoint extends Waypoint {
  var trips_index: Double
  var waypoint_index: Double
}

object TripWaypoint {
  @scala.inline
  def apply(
    distance: Double,
    hint: String,
    location: Coordinate,
    name: String,
    trips_index: Double,
    waypoint_index: Double
  ): TripWaypoint = {
    val __obj = js.Dynamic.literal(distance = distance, hint = hint, location = location, name = name, trips_index = trips_index, waypoint_index = waypoint_index)
  
    __obj.asInstanceOf[TripWaypoint]
  }
}

