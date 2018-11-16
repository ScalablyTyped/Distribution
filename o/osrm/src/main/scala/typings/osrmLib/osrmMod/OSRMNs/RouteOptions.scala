package typings
package osrmLib.osrmMod.OSRMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Returns the fastest route between two or more coordinates while visiting the waypoints in order.
     *
     * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#route
     */

trait RouteOptions extends Options {
  /**
           * Search for alternative routes and return as well. Please note that even if an alternative route is requested, a result cannot be guaranteed. (optional, default false)
           */
  var alternatives: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Return annotations for each route leg for duration, nodes, distance, weight, datasources and/or speed.
           * Annotations can be false or true (no/full annotations) or an array of strings with duration, nodes, distance, weight, datasources, speed. (optional, default false)
           */
  var annotations: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
           * Forces the route to keep going straight at waypoints and don't do a uturn even if it would be faster. Default value depends on the profile. null/true/false
           */
  var continue_straight: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
           */
  var geometries: js.UndefOr[GeometriesTypes] = js.undefined
  /**
           * Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all (false). (optional, default simplified)
           */
  var overview: js.UndefOr[OverviewTypes] = js.undefined
  /**
           * Return route steps for each route leg. (optional, default false)
           */
  var steps: js.UndefOr[scala.Boolean] = js.undefined
}

