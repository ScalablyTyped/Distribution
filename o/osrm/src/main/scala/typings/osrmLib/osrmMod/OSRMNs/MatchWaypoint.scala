package typings
package osrmLib.osrmMod.OSRMNs

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

