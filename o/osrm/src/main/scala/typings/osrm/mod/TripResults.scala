package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripResults extends js.Object {
  var trips: js.Array[Route]
  var waypoints: js.Array[TripWaypoint]
}

object TripResults {
  @scala.inline
  def apply(trips: js.Array[Route], waypoints: js.Array[TripWaypoint]): TripResults = {
    val __obj = js.Dynamic.literal(trips = trips.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripResults]
  }
}

