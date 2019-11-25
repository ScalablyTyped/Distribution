package typings.navermaps.naver.maps.visualization

import typings.navermaps.naver.maps.LatLng
import typings.navermaps.naver.maps.Map
import typings.navermaps.naver.maps.PointArrayLiteral
import typings.navermaps.naver.maps.strokeLineCapType
import typings.navermaps.naver.maps.strokeLineJoinType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotMapOptions extends js.Object {
  var data: js.Array[LatLng | PointArrayLiteral | WeightedLocation]
  var fillColor: js.UndefOr[String] = js.undefined
  var map: Map
  var opacity: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeLineCap: js.UndefOr[strokeLineCapType] = js.undefined
  var strokeLineJoin: js.UndefOr[strokeLineJoinType] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
}

object DotMapOptions {
  @scala.inline
  def apply(
    data: js.Array[LatLng | PointArrayLiteral | WeightedLocation],
    map: Map,
    fillColor: String = null,
    opacity: Int | Double = null,
    radius: Int | Double = null,
    strokeColor: String = null,
    strokeLineCap: strokeLineCapType = null,
    strokeLineJoin: strokeLineJoinType = null,
    strokeWeight: Int | Double = null
  ): DotMapOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeLineCap != null) __obj.updateDynamic("strokeLineCap")(strokeLineCap.asInstanceOf[js.Any])
    if (strokeLineJoin != null) __obj.updateDynamic("strokeLineJoin")(strokeLineJoin.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotMapOptions]
  }
}

