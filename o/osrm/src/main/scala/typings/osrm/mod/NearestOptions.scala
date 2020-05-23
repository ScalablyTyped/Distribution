package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Snaps a coordinate to the street network and returns the nearest n matches.
  *
  * Note: coordinates in the general options only supports a single {longitude},{latitude} entry.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#nearest
  */
trait NearestOptions extends Options {
  /**
    * Number of nearest segments that should be returned. Must be an integer greater than or equal to 1. (optional, default 1)
    */
  var number: js.UndefOr[Double] = js.undefined
}

object NearestOptions {
  @scala.inline
  def apply(
    bearings: js.UndefOr[Null | js.Array[Bearing]] = js.undefined,
    coordinates: js.Array[Coordinate] = null,
    generate_hints: js.UndefOr[Boolean] = js.undefined,
    hints: js.Array[Hint] = null,
    number: js.UndefOr[Double] = js.undefined,
    radiuses: js.UndefOr[Null | js.Array[Radius]] = js.undefined
  ): NearestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bearings)) __obj.updateDynamic("bearings")(bearings.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (!js.isUndefined(generate_hints)) __obj.updateDynamic("generate_hints")(generate_hints.get.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiuses)) __obj.updateDynamic("radiuses")(radiuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestOptions]
  }
}

