package typings
package navermapsLib.naverNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatMapOptions extends js.Object {
  var colorMap: js.UndefOr[SpectrumStyle] = js.undefined
  var data: js.Array[
    navermapsLib.naverNs.mapsNs.LatLng | navermapsLib.naverNs.mapsNs.PointArrayLiteral | WeightedLocation
  ]
  var map: navermapsLib.naverNs.mapsNs.Map
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
}

object HeatMapOptions {
  @scala.inline
  def apply(
    data: js.Array[
      navermapsLib.naverNs.mapsNs.LatLng | navermapsLib.naverNs.mapsNs.PointArrayLiteral | WeightedLocation
    ],
    map: navermapsLib.naverNs.mapsNs.Map,
    colorMap: SpectrumStyle = null,
    opacity: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null
  ): HeatMapOptions = {
    val __obj = js.Dynamic.literal(data = data, map = map)
    if (colorMap != null) __obj.updateDynamic("colorMap")(colorMap)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapOptions]
  }
}

