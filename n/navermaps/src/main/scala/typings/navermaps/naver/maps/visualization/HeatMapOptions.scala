package typings.navermaps.naver.maps.visualization

import typings.navermaps.naver.maps.LatLng
import typings.navermaps.naver.maps.Map
import typings.navermaps.naver.maps.PointArrayLiteral
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    if (colorMap != null) __obj.updateDynamic("colorMap")(colorMap.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapOptions]
  }
}

