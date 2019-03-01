package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipseOptions extends js.Object {
  var bounds: Bounds | BoundsLiteral
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeLineCap: js.UndefOr[strokeLineCapType] = js.undefined
  var strokeLineJoin: js.UndefOr[strokeLineJoinType] = js.undefined
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  var strokeStyle: js.UndefOr[strokeStyleType] = js.undefined
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object EllipseOptions {
  @scala.inline
  def apply(
    bounds: Bounds | BoundsLiteral,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    map: Map = null,
    strokeColor: java.lang.String = null,
    strokeLineCap: strokeLineCapType = null,
    strokeLineJoin: strokeLineJoinType = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeStyle: strokeStyleType = null,
    strokeWeight: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): EllipseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeLineCap != null) __obj.updateDynamic("strokeLineCap")(strokeLineCap)
    if (strokeLineJoin != null) __obj.updateDynamic("strokeLineJoin")(strokeLineJoin)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipseOptions]
  }
}

