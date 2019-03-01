package typings
package osrmLib.osrmMod.OSRMNs

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
  var trips_index: scala.Double
  var waypoint_index: scala.Double
}

object TripWaypoint {
  @scala.inline
  def apply(
    distance: scala.Double,
    hint: java.lang.String,
    location: Coordinate,
    name: java.lang.String,
    trips_index: scala.Double,
    waypoint_index: scala.Double
  ): TripWaypoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("hint")(hint)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("trips_index")(trips_index)
    __obj.updateDynamic("waypoint_index")(waypoint_index)
    __obj.asInstanceOf[TripWaypoint]
  }
}

