package typings
package osrmLib.osrmMod.OSRMNs

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
  var number: js.UndefOr[scala.Double] = js.undefined
}

object NearestOptions {
  @scala.inline
  def apply(
    bearings: js.Array[Bearing] = null,
    coordinates: js.Array[Coordinate] = null,
    generate_hints: js.UndefOr[scala.Boolean] = js.undefined,
    hints: js.Array[Hint] = null,
    number: scala.Int | scala.Double = null,
    radiuses: js.Array[Radius] = null
  ): NearestOptions = {
    val __obj = js.Dynamic.literal()
    if (bearings != null) __obj.updateDynamic("bearings")(bearings)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (!js.isUndefined(generate_hints)) __obj.updateDynamic("generate_hints")(generate_hints)
    if (hints != null) __obj.updateDynamic("hints")(hints)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (radiuses != null) __obj.updateDynamic("radiuses")(radiuses)
    __obj.asInstanceOf[NearestOptions]
  }
}

