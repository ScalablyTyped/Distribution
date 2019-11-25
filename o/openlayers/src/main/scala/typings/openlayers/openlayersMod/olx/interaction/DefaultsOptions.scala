package typings.openlayers.openlayersMod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interactions for the map. Default is `true` for all options.
  */
trait DefaultsOptions extends js.Object {
  var altShiftDragRotate: js.UndefOr[Boolean] = js.undefined
  var constrainResolution: js.UndefOr[Boolean] = js.undefined
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  var dragPan: js.UndefOr[Boolean] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var mouseWheelZoom: js.UndefOr[Boolean] = js.undefined
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
    constrainResolution: js.UndefOr[Boolean] = js.undefined,
    doubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    dragPan: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mouseWheelZoom: js.UndefOr[Boolean] = js.undefined,
    pinchRotate: js.UndefOr[Boolean] = js.undefined,
    pinchZoom: js.UndefOr[Boolean] = js.undefined,
    shiftDragZoom: js.UndefOr[Boolean] = js.undefined,
    zoomDelta: Int | Double = null,
    zoomDuration: Int | Double = null
  ): DefaultsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altShiftDragRotate)) __obj.updateDynamic("altShiftDragRotate")(altShiftDragRotate.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(dragPan)) __obj.updateDynamic("dragPan")(dragPan.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelZoom)) __obj.updateDynamic("mouseWheelZoom")(mouseWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(pinchRotate)) __obj.updateDynamic("pinchRotate")(pinchRotate.asInstanceOf[js.Any])
    if (!js.isUndefined(pinchZoom)) __obj.updateDynamic("pinchZoom")(pinchZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftDragZoom)) __obj.updateDynamic("shiftDragZoom")(shiftDragZoom.asInstanceOf[js.Any])
    if (zoomDelta != null) __obj.updateDynamic("zoomDelta")(zoomDelta.asInstanceOf[js.Any])
    if (zoomDuration != null) __obj.updateDynamic("zoomDuration")(zoomDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsOptions]
  }
}

