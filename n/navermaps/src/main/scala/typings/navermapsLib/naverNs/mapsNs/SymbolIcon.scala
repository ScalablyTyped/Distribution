package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolIcon extends js.Object {
  var anchor: js.UndefOr[Point | PointLiteral | Position] = js.undefined
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  var path: SymbolPath | js.Array[Point] | js.Array[PointLiteral]
  var radius: js.UndefOr[scala.Double] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[SymbolStyle] = js.undefined
}

object SymbolIcon {
  @scala.inline
  def apply(
    path: SymbolPath | js.Array[Point] | js.Array[PointLiteral],
    anchor: Point | PointLiteral | Position = null,
    fillColor: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeWeight: scala.Int | scala.Double = null,
    style: SymbolStyle = null
  ): SymbolIcon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
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

