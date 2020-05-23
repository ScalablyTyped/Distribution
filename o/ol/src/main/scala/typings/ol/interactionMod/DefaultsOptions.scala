package typings.ol.interactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsOptions extends js.Object {
  var altShiftDragRotate: js.UndefOr[Boolean] = js.undefined
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  var dragPan: js.UndefOr[Boolean] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var mouseWheelZoom: js.UndefOr[Boolean] = js.undefined
  var onFocusOnly: js.UndefOr[Boolean] = js.undefined
  var pinchRotate: js.UndefOr[Boolean] = js.undefined
  var pinchZoom: js.UndefOr[Boolean] = js.undefined
  var shiftDragZoom: js.UndefOr[Boolean] = js.undefined
  var zoomDelta: js.UndefOr[Double] = js.undefined
  var zoomDuration: js.UndefOr[Double] = js.undefined
}

object DefaultsOptions {
  @scala.inline
  def apply(
    altShiftDragRotate: js.UndefOr[Boolean] = js.undefined,
    doubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    dragPan: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mouseWheelZoom: js.UndefOr[Boolean] = js.undefined,
    onFocusOnly: js.UndefOr[Boolean] = js.undefined,
    pinchRotate: js.UndefOr[Boolean] = js.undefined,
    pinchZoom: js.UndefOr[Boolean] = js.undefined,
    shiftDragZoom: js.UndefOr[Boolean] = js.undefined,
    zoomDelta: js.UndefOr[Double] = js.undefined,
    zoomDuration: js.UndefOr[Double] = js.undefined
  ): DefaultsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altShiftDragRotate)) __obj.updateDynamic("altShiftDragRotate")(altShiftDragRotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragPan)) __obj.updateDynamic("dragPan")(dragPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelZoom)) __obj.updateDynamic("mouseWheelZoom")(mouseWheelZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onFocusOnly)) __obj.updateDynamic("onFocusOnly")(onFocusOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinchRotate)) __obj.updateDynamic("pinchRotate")(pinchRotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinchZoom)) __obj.updateDynamic("pinchZoom")(pinchZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftDragZoom)) __obj.updateDynamic("shiftDragZoom")(shiftDragZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomDelta)) __obj.updateDynamic("zoomDelta")(zoomDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomDuration)) __obj.updateDynamic("zoomDuration")(zoomDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsOptions]
  }
}

