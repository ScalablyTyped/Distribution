package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolIcon extends js.Object {
  var anchor: js.UndefOr[Point | PointLiteral | Position] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var path: SymbolPath | (js.Array[Point | PointLiteral])
  var radius: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[SymbolStyle] = js.undefined
}

object SymbolIcon {
  @scala.inline
  def apply(
    path: SymbolPath | (js.Array[Point | PointLiteral]),
    anchor: Point | PointLiteral | Position = null,
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    radius: Int | Double = null,
    strokeColor: String = null,
    strokeOpacity: Int | Double = null,
    strokeWeight: Int | Double = null,
    style: SymbolStyle = null
  ): SymbolIcon = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SymbolIcon]
  }
}

