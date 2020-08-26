package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureSettings extends js.Object {
  var clickToZoom: js.UndefOr[Boolean] = js.native
  var dblClickToZoom: js.UndefOr[Boolean] = js.native
  var flickEnabled: js.UndefOr[Boolean] = js.native
  var flickMinSpeed: js.UndefOr[Double] = js.native
  var flickMomentum: js.UndefOr[Double] = js.native
  var pinchToZoom: js.UndefOr[Boolean] = js.native
  var scrollToZoom: js.UndefOr[Boolean] = js.native
}

object GestureSettings {
  @scala.inline
  def apply(): GestureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureSettings]
  }
  @scala.inline
  implicit class GestureSettingsOps[Self <: GestureSettings] (val x: Self) extends AnyVal {
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
    def setClickToZoom(value: Boolean): Self = this.set("clickToZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickToZoom: Self = this.set("clickToZoom", js.undefined)
    @scala.inline
    def setDblClickToZoom(value: Boolean): Self = this.set("dblClickToZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDblClickToZoom: Self = this.set("dblClickToZoom", js.undefined)
    @scala.inline
    def setFlickEnabled(value: Boolean): Self = this.set("flickEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlickEnabled: Self = this.set("flickEnabled", js.undefined)
    @scala.inline
    def setFlickMinSpeed(value: Double): Self = this.set("flickMinSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlickMinSpeed: Self = this.set("flickMinSpeed", js.undefined)
    @scala.inline
    def setFlickMomentum(value: Double): Self = this.set("flickMomentum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlickMomentum: Self = this.set("flickMomentum", js.undefined)
    @scala.inline
    def setPinchToZoom(value: Boolean): Self = this.set("pinchToZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinchToZoom: Self = this.set("pinchToZoom", js.undefined)
    @scala.inline
    def setScrollToZoom(value: Boolean): Self = this.set("scrollToZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToZoom: Self = this.set("scrollToZoom", js.undefined)
  }
  
}

