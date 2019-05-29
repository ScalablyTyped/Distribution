package typings
package navermapsLib.naverNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotMapOptions extends js.Object {
  var data: js.Array[
    navermapsLib.naverNs.mapsNs.LatLng | navermapsLib.naverNs.mapsNs.PointArrayLiteral | WeightedLocation
  ]
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var map: navermapsLib.naverNs.mapsNs.Map
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeLineCap: js.UndefOr[navermapsLib.naverNs.mapsNs.strokeLineCapType] = js.undefined
  var strokeLineJoin: js.UndefOr[navermapsLib.naverNs.mapsNs.strokeLineJoinType] = js.undefined
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
}

object DotMapOptions {
  @scala.inline
  def apply(
    data: js.Array[
      navermapsLib.naverNs.mapsNs.LatLng | navermapsLib.naverNs.mapsNs.PointArrayLiteral | WeightedLocation
    ],
    map: navermapsLib.naverNs.mapsNs.Map,
    fillColor: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null,
    strokeLineCap: navermapsLib.naverNs.mapsNs.strokeLineCapType = null,
    strokeLineJoin: navermapsLib.naverNs.mapsNs.strokeLineJoinType = null,
    strokeWeight: scala.Int | scala.Double = null
  ): DotMapOptions = {
    val __obj = js.Dynamic.literal(data = data, map = map)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeLineCap != null) __obj.updateDynamic("strokeLineCap")(strokeLineCap)
    if (strokeLineJoin != null) __obj.updateDynamic("strokeLineJoin")(strokeLineJoin)
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotMapOptions]
  }
}

