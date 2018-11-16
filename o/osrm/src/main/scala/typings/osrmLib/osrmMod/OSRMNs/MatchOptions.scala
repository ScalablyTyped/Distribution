package typings
package osrmLib.osrmMod.OSRMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Map matching matches given GPS points to the road network in the most plausible way.
     * Please note the request might result multiple sub-traces.
     * Large jumps in the timestamps (>60s) or improbable transitions lead to trace splits if a complete matching could not be found.
     * The algorithm might not be able to match all points. Outliers are removed if they can not be matched successfully.
     *
     * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#tile
     */

trait MatchOptions extends Options {
  /**
           * Return annotations for each route leg for duration, nodes, distance, weight, datasources and/or speed.
           * Annotations can be false or true (no/full annotations) or an array of strings with duration, nodes, distance, weight, datasources, speed. (optional, default false)
           */
  var annotations: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
           * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
           */
  var geometries: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all (false). (optional, default simplified)
           */
  var overview: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Standard deviation of GPS precision used for map matching. If applicable use GPS accuracy (double >= 0, default 5m).
           */
  @JSName("radiuses")
  var radiuses_MatchOptions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
           * Return route steps for each route. (optional, default false)
           */
  var steps: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Timestamp of the input location (integers, UNIX-like timestamp).
           */
  var timestamps: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

