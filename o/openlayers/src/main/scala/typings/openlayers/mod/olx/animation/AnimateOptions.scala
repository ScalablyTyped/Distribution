package typings.openlayers.mod.olx.animation

import typings.openlayers.mod.Coordinate_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Animation options. Multiple animations can be run in series by passing
  * multiple options objects. To run multiple animations in parallel, call
  * the method multiple times. An optional callback can be provided as a
  * final argument. The callback will be called with a boolean indicating
  * whether the animation completed without being cancelled.
  */
@js.native
trait AnimateOptions extends js.Object {
  var anchor: js.UndefOr[Coordinate_] = js.native
  var center: js.UndefOr[Coordinate_] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.native
  var resolution: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object AnimateOptions {
  @scala.inline
  def apply(): AnimateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimateOptions]
  }
  @scala.inline
  implicit class AnimateOptionsOps[Self <: AnimateOptions] (val x: Self) extends AnyVal {
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
    def setAnchor(value: Coordinate_): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setCenter(value: Coordinate_): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: /* t */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

