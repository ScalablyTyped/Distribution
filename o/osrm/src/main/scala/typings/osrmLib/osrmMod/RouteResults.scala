package typings
package osrmLib.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteResults extends js.Object {
  var routes: js.Array[Route]
  var waypoints: js.Array[Waypoint]
}

object RouteResults {
  @scala.inline
  def apply(routes: js.Array[Route], waypoints: js.Array[Waypoint]): RouteResults = {
    val __obj = js.Dynamic.literal(routes = routes, waypoints = waypoints)
  
    __obj.asInstanceOf[RouteResults]
  }
}

