package typings.navermaps.naverNs.mapsNs.visualizationNs

import typings.navermaps.naverNs.mapsNs.LatLng
import typings.navermaps.naverNs.mapsNs.Map
import typings.navermaps.naverNs.mapsNs.PointArrayLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatMapOptions extends js.Object {
  var colorMap: js.UndefOr[SpectrumStyle] = js.undefined
  var data: js.Array[LatLng | PointArrayLiteral | WeightedLocation]
  var map: Map
  var opacity: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object HeatMapOptions {
  @scala.inline
  def apply(
    data: js.Array[LatLng | PointArrayLiteral | WeightedLocation],
    map: Map,
    colorMap: SpectrumStyle = null,
    opacity: Int | Double = null,
    radius: Int | Double = null
  ): HeatMapOptions = {
    val __obj = js.Dynamic.literal(data = data, map = map)
    if (colorMap != null) __obj.updateDynamic("colorMap")(colorMap)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapOptions]
  }
}

