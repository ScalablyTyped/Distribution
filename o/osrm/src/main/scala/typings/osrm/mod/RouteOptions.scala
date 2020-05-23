package typings.osrm.mod

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
  var alternatives: js.UndefOr[Boolean] = js.undefined
  /**
    * Return annotations for each route leg for duration, nodes, distance, weight, datasources and/or speed.
    * Annotations can be false or true (no/full annotations) or an array of strings with duration, nodes, distance, weight, datasources, speed. (optional, default false)
    */
  var annotations: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * Forces the route to keep going straight at waypoints and don't do a uturn even if it would be faster. Default value depends on the profile. null/true/false
    */
  var continue_straight: js.UndefOr[Boolean] = js.undefined
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
  var steps: js.UndefOr[Boolean] = js.undefined
}

object RouteOptions {
  @scala.inline
  def apply(
    alternatives: js.UndefOr[Boolean] = js.undefined,
    annotations: Boolean | js.Array[String] = null,
    bearings: js.UndefOr[Null | js.Array[Bearing]] = js.undefined,
    continue_straight: js.UndefOr[Boolean] = js.undefined,
    coordinates: js.Array[Coordinate] = null,
    generate_hints: js.UndefOr[Boolean] = js.undefined,
    geometries: GeometriesTypes = null,
    hints: js.Array[Hint] = null,
    overview: OverviewTypes = null,
    radiuses: js.UndefOr[Null | js.Array[Radius]] = js.undefined,
    steps: js.UndefOr[Boolean] = js.undefined
  ): RouteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alternatives)) __obj.updateDynamic("alternatives")(alternatives.get.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (!js.isUndefined(bearings)) __obj.updateDynamic("bearings")(bearings.asInstanceOf[js.Any])
    if (!js.isUndefined(continue_straight)) __obj.updateDynamic("continue_straight")(continue_straight.get.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (!js.isUndefined(generate_hints)) __obj.updateDynamic("generate_hints")(generate_hints.get.asInstanceOf[js.Any])
    if (geometries != null) __obj.updateDynamic("geometries")(geometries.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (!js.isUndefined(radiuses)) __obj.updateDynamic("radiuses")(radiuses.asInstanceOf[js.Any])
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptions]
  }
}

