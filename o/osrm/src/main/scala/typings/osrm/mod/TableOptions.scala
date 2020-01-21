package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Computes duration tables for the given locations. Allows for both symmetric and asymmetric tables.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#table
  */
trait TableOptions extends Options {
  /**
    * to use location with given index as destination. Default is to use all.
    */
  var destinations: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * to use location with given index as source. Default is to use all.
    */
  var sources: js.UndefOr[js.Array[Double]] = js.undefined
}

object TableOptions {
  @scala.inline
  def apply(
    bearings: js.Array[Bearing] = null,
    coordinates: js.Array[Coordinate] = null,
    destinations: js.Array[Double] = null,
    generate_hints: js.UndefOr[Boolean] = js.undefined,
    hints: js.Array[Hint] = null,
    radiuses: js.Array[Radius] = null,
    sources: js.Array[Double] = null
  ): TableOptions = {
    val __obj = js.Dynamic.literal()
    if (bearings != null) __obj.updateDynamic("bearings")(bearings.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (destinations != null) __obj.updateDynamic("destinations")(destinations.asInstanceOf[js.Any])
    if (!js.isUndefined(generate_hints)) __obj.updateDynamic("generate_hints")(generate_hints.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (radiuses != null) __obj.updateDynamic("radiuses")(radiuses.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
}

