package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NearestResults extends js.Object {
  var waypoints: js.Array[Waypoint]
}

object NearestResults {
  @scala.inline
  def apply(waypoints: js.Array[Waypoint]): NearestResults = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestResults]
  }
}

