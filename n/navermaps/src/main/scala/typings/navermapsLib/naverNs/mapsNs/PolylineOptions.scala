package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineOptions extends js.Object {
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var endIcon: js.UndefOr[PointingIcon] = js.undefined
  var endIconSize: js.UndefOr[scala.Double] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var path: ArrayOfCoords | KVOArrayOfCoords | ArrayOfCoordsLiteral
  var startIcon: js.UndefOr[PointingIcon] = js.undefined
  var startIconSize: js.UndefOr[scala.Double] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeLineCap: js.UndefOr[strokeLineCapType] = js.undefined
  var strokeLineJoin: js.UndefOr[strokeLineJoinType] = js.undefined
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  var strokeStyle: js.UndefOr[strokeStyleType] = js.undefined
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object PolylineOptions {
  @scala.inline
  def apply(
    path: ArrayOfCoords | KVOArrayOfCoords | ArrayOfCoordsLiteral,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    endIcon: PointingIcon = null,
    endIconSize: scala.Int | scala.Double = null,
    map: Map = null,
    startIcon: PointingIcon = null,
    startIconSize: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null,
    strokeLineCap: strokeLineCapType = null,
    strokeLineJoin: strokeLineJoinType = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeStyle: strokeStyleType = null,
    strokeWeight: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (endIcon != null) __obj.updateDynamic("endIcon")(endIcon)
    if (endIconSize != null) __obj.updateDynamic("endIconSize")(endIconSize.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (startIcon != null) __obj.updateDynamic("startIcon")(startIcon)
    if (startIconSize != null) __obj.updateDynamic("startIconSize")(startIconSize.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeLineCap != null) __obj.updateDynamic("strokeLineCap")(strokeLineCap)
    if (strokeLineJoin != null) __obj.updateDynamic("strokeLineJoin")(strokeLineJoin)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineOptions]
  }
}

