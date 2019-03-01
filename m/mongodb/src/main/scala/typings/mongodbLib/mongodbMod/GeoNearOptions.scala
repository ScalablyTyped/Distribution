package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoNearOptions extends js.Object {
  var distanceMultiplier: js.UndefOr[scala.Double] = js.undefined
  var includeLocs: js.UndefOr[scala.Boolean] = js.undefined
  var maxDistance: js.UndefOr[scala.Double] = js.undefined
  var minDistance: js.UndefOr[scala.Double] = js.undefined
  var num: js.UndefOr[scala.Double] = js.undefined
  var query: js.UndefOr[js.Object] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  var spherical: js.UndefOr[scala.Boolean] = js.undefined
  var uniqueDocs: js.UndefOr[scala.Boolean] = js.undefined
}

object GeoNearOptions {
  @scala.inline
  def apply(
    distanceMultiplier: scala.Int | scala.Double = null,
    includeLocs: js.UndefOr[scala.Boolean] = js.undefined,
    maxDistance: scala.Int | scala.Double = null,
    minDistance: scala.Int | scala.Double = null,
    num: scala.Int | scala.Double = null,
    query: js.Object = null,
    readPreference: ReadPreference | java.lang.String = null,
    spherical: js.UndefOr[scala.Boolean] = js.undefined,
    uniqueDocs: js.UndefOr[scala.Boolean] = js.undefined
  ): GeoNearOptions = {
    val __obj = js.Dynamic.literal()
    if (distanceMultiplier != null) __obj.updateDynamic("distanceMultiplier")(distanceMultiplier.asInstanceOf[js.Any])
    if (!js.isUndefined(includeLocs)) __obj.updateDynamic("includeLocs")(includeLocs)
    if (maxDistance != null) __obj.updateDynamic("maxDistance")(maxDistance.asInstanceOf[js.Any])
    if (minDistance != null) __obj.updateDynamic("minDistance")(minDistance.asInstanceOf[js.Any])
    if (num != null) __obj.updateDynamic("num")(num.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(spherical)) __obj.updateDynamic("spherical")(spherical)
    if (!js.isUndefined(uniqueDocs)) __obj.updateDynamic("uniqueDocs")(uniqueDocs)
    __obj.asInstanceOf[GeoNearOptions]
  }
}

