package typings.openlayers.mod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interactions for the map. Default is `true` for all options.
  */
@js.native
trait DefaultsOptions extends js.Object {
  var altShiftDragRotate: js.UndefOr[Boolean] = js.native
  var constrainResolution: js.UndefOr[Boolean] = js.native
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  var dragPan: js.UndefOr[Boolean] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var mouseWheelZoom: js.UndefOr[Boolean] = js.native
  var pinchRotate: js.UndefOr[Boolean] = js.native
  var pinchZoom: js.UndefOr[Boolean] = js.native
  var shiftDragZoom: js.UndefOr[Boolean] = js.native
  var zoomDelta: js.UndefOr[Double] = js.native
  var zoomDuration: js.UndefOr[Double] = js.native
}

object DefaultsOptions {
  @scala.inline
  def apply(): DefaultsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultsOptions]
  }
  @scala.inline
  implicit class DefaultsOptionsOps[Self <: DefaultsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAltShiftDragRotate(value: Boolean): Self = this.set("altShiftDragRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltShiftDragRotate: Self = this.set("altShiftDragRotate", js.undefined)
    @scala.inline
    def setConstrainResolution(value: Boolean): Self = this.set("constrainResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainResolution: Self = this.set("constrainResolution", js.undefined)
    @scala.inline
    def setDoubleClickZoom(value: Boolean): Self = this.set("doubleClickZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleClickZoom: Self = this.set("doubleClickZoom", js.undefined)
    @scala.inline
    def setDragPan(value: Boolean): Self = this.set("dragPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragPan: Self = this.set("dragPan", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setMouseWheelZoom(value: Boolean): Self = this.set("mouseWheelZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseWheelZoom: Self = this.set("mouseWheelZoom", js.undefined)
    @scala.inline
    def setPinchRotate(value: Boolean): Self = this.set("pinchRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinchRotate: Self = this.set("pinchRotate", js.undefined)
    @scala.inline
    def setPinchZoom(value: Boolean): Self = this.set("pinchZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinchZoom: Self = this.set("pinchZoom", js.undefined)
    @scala.inline
    def setShiftDragZoom(value: Boolean): Self = this.set("shiftDragZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftDragZoom: Self = this.set("shiftDragZoom", js.undefined)
    @scala.inline
    def setZoomDelta(value: Double): Self = this.set("zoomDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomDelta: Self = this.set("zoomDelta", js.undefined)
    @scala.inline
    def setZoomDuration(value: Double): Self = this.set("zoomDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomDuration: Self = this.set("zoomDuration", js.undefined)
  }
  
}

