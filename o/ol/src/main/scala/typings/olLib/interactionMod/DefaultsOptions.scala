package typings
package olLib.interactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsOptions extends js.Object {
  var altShiftDragRotate: js.UndefOr[scala.Boolean] = js.undefined
  var constrainResolution: js.UndefOr[scala.Boolean] = js.undefined
  var doubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined
  var dragPan: js.UndefOr[scala.Boolean] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var mouseWheelZoom: js.UndefOr[scala.Boolean] = js.undefined
  var onFocusOnly: js.UndefOr[scala.Boolean] = js.undefined
  var pinchRotate: js.UndefOr[scala.Boolean] = js.undefined
  var pinchZoom: js.UndefOr[scala.Boolean] = js.undefined
  var shiftDragZoom: js.UndefOr[scala.Boolean] = js.undefined
  var zoomDelta: js.UndefOr[scala.Double] = js.undefined
  var zoomDuration: js.UndefOr[scala.Double] = js.undefined
}

object DefaultsOptions {
  @scala.inline
  def apply(
    altShiftDragRotate: js.UndefOr[scala.Boolean] = js.undefined,
    constrainResolution: js.UndefOr[scala.Boolean] = js.undefined,
    doubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined,
    dragPan: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    mouseWheelZoom: js.UndefOr[scala.Boolean] = js.undefined,
    onFocusOnly: js.UndefOr[scala.Boolean] = js.undefined,
    pinchRotate: js.UndefOr[scala.Boolean] = js.undefined,
    pinchZoom: js.UndefOr[scala.Boolean] = js.undefined,
    shiftDragZoom: js.UndefOr[scala.Boolean] = js.undefined,
    zoomDelta: scala.Int | scala.Double = null,
    zoomDuration: scala.Int | scala.Double = null
  ): DefaultsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altShiftDragRotate)) __obj.updateDynamic("altShiftDragRotate")(altShiftDragRotate)
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution)
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom)
    if (!js.isUndefined(dragPan)) __obj.updateDynamic("dragPan")(dragPan)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (!js.isUndefined(mouseWheelZoom)) __obj.updateDynamic("mouseWheelZoom")(mouseWheelZoom)
    if (!js.isUndefined(onFocusOnly)) __obj.updateDynamic("onFocusOnly")(onFocusOnly)
    if (!js.isUndefined(pinchRotate)) __obj.updateDynamic("pinchRotate")(pinchRotate)
    if (!js.isUndefined(pinchZoom)) __obj.updateDynamic("pinchZoom")(pinchZoom)
    if (!js.isUndefined(shiftDragZoom)) __obj.updateDynamic("shiftDragZoom")(shiftDragZoom)
    if (zoomDelta != null) __obj.updateDynamic("zoomDelta")(zoomDelta.asInstanceOf[js.Any])
    if (zoomDuration != null) __obj.updateDynamic("zoomDuration")(zoomDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsOptions]
  }
}

