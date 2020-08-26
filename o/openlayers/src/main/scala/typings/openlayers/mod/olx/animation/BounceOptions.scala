package typings.openlayers.mod.olx.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BounceOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.native
  var resolution: Double = js.native
  var start: js.UndefOr[Double] = js.native
}

object BounceOptions {
  @scala.inline
  def apply(resolution: Double): BounceOptions = {
    val __obj = js.Dynamic.literal(resolution = resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceOptions]
  }
  @scala.inline
  implicit class BounceOptionsOps[Self <: BounceOptions] (val x: Self) extends AnyVal {
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
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: /* t */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

