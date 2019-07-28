package typings.osrm.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Limits the search to segments with given bearing in degrees towards true north in clockwise direction. Null or array with [{value},{range}]
    */
  var bearings: js.UndefOr[js.Array[Bearing] | Null] = js.undefined
  /**
    * The coordinates this request will use. Array with [{lon},{lat}] values, in decimal degrees.
    */
  var coordinates: js.UndefOr[js.Array[Coordinate]] = js.undefined
  /**
    * Adds a Hint to the response which can be used in subsequent requests, see hints parameter.
    */
  var generate_hints: js.UndefOr[Boolean] = js.undefined
  /**
    * Hint to derive position in street network. Base64 string
    */
  var hints: js.UndefOr[js.Array[Hint]] = js.undefined
  /**
    * Limits the search to given radius in meters. null or double >= 0 or unlimited (default)
    */
  var radiuses: js.UndefOr[js.Array[Radius] | Null] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bearings: js.Array[Bearing] = null,
    coordinates: js.Array[Coordinate] = null,
    generate_hints: js.UndefOr[Boolean] = js.undefined,
    hints: js.Array[Hint] = null,
    radiuses: js.Array[Radius] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (bearings != null) __obj.updateDynamic("bearings")(bearings)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (!js.isUndefined(generate_hints)) __obj.updateDynamic("generate_hints")(generate_hints)
    if (hints != null) __obj.updateDynamic("hints")(hints)
    if (radiuses != null) __obj.updateDynamic("radiuses")(radiuses)
    __obj.asInstanceOf[Options]
  }
}

