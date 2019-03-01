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

object RouteOptions {
  @scala.inline
  def apply(
    alternatives: js.UndefOr[scala.Boolean] = js.undefined,
    annotations: scala.Boolean | js.Array[java.lang.String] = null,
    bearings: js.Array[Bearing] = null,
    continue_straight: js.UndefOr[scala.Boolean] = js.undefined,
    coordinates: js.Array[Coordinate] = null,
    generate_hints: js.UndefOr[scala.Boolean] = js.undefined,
    geometries: GeometriesTypes = null,
    hints: js.Array[Hint] = null,
    overview: OverviewTypes = null,
    radiuses: js.Array[Radius] = null,
    steps: js.UndefOr[scala.Boolean] = js.undefined
  ): RouteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alternatives)) __obj.updateDynamic("alternatives")(alternatives)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (bearings != null) __obj.updateDynamic("bearings")(bearings)
    if (!js.isUndefined(continue_straight)) __obj.updateDynamic("continue_straight")(continue_straight)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (!js.isUndefined(generate_hints)) __obj.updateDynamic("generate_hints")(generate_hints)
    if (geometries != null) __obj.updateDynamic("geometries")(geometries)
    if (hints != null) __obj.updateDynamic("hints")(hints)
    if (overview != null) __obj.updateDynamic("overview")(overview)
    if (radiuses != null) __obj.updateDynamic("radiuses")(radiuses)
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps)
    __obj.asInstanceOf[RouteOptions]
  }
}

