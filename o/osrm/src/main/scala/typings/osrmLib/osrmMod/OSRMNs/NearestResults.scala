package typings
package osrmLib.osrmMod.OSRMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NearestResults extends js.Object {
  var waypoints: js.Array[Waypoint]
}

object NearestResults {
  @scala.inline
  def apply(waypoints: js.Array[Waypoint]): NearestResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("waypoints")(waypoints)
    __obj.asInstanceOf[NearestResults]
  }
}

