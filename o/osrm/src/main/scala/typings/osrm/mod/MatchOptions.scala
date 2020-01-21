package typings.osrm.mod

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
  var annotations: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
    */
  var geometries: js.UndefOr[String] = js.undefined
  /**
    * Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all (false). (optional, default simplified)
    */
  var overview: js.UndefOr[String] = js.undefined
  /**
    * Standard deviation of GPS precision used for map matching. If applicable use GPS accuracy (double >= 0, default 5m).
    */
  @JSName("radiuses")
  var radiuses_MatchOptions: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Return route steps for each route. (optional, default false)
    */
  var steps: js.UndefOr[Boolean] = js.undefined
  /**
    * Timestamp of the input location (integers, UNIX-like timestamp).
    */
  var timestamps: js.UndefOr[js.Array[Double]] = js.undefined
}

object MatchOptions {
  @scala.inline
  def apply(
    annotations: Boolean | js.Array[String] = null,
    bearings: js.Array[Bearing] = null,
    coordinates: js.Array[Coordinate] = null,
    generate_hints: js.UndefOr[Boolean] = js.undefined,
    geometries: String = null,
    hints: js.Array[Hint] = null,
    overview: String = null,
    radiuses: js.Array[Double] = null,
    steps: js.UndefOr[Boolean] = js.undefined,
    timestamps: js.Array[Double] = null
  ): MatchOptions = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (bearings != null) __obj.updateDynamic("bearings")(bearings.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (!js.isUndefined(generate_hints)) __obj.updateDynamic("generate_hints")(generate_hints.asInstanceOf[js.Any])
    if (geometries != null) __obj.updateDynamic("geometries")(geometries.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (radiuses != null) __obj.updateDynamic("radiuses")(radiuses.asInstanceOf[js.Any])
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (timestamps != null) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchOptions]
  }
}

