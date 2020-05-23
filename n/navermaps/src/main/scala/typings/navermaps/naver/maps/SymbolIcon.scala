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
    fillOpacity: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    strokeColor: String = null,
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeWeight: js.UndefOr[Double] = js.undefined,
    style: SymbolStyle = null
  ): SymbolIcon = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWeight)) __obj.updateDynamic("strokeWeight")(strokeWeight.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolIcon]
  }
}

