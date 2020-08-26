package typings.openlayers.mod.olx.control

import typings.openlayers.mod.MapEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomSliderOptions extends js.Object {
  var className: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var maxResolution: js.UndefOr[Double] = js.native
  var minResolution: js.UndefOr[Double] = js.native
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
}

object ZoomSliderOptions {
  @scala.inline
  def apply(): ZoomSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomSliderOptions]
  }
  @scala.inline
  implicit class ZoomSliderOptionsOps[Self <: ZoomSliderOptions] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setMaxResolution(value: Double): Self = this.set("maxResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResolution: Self = this.set("maxResolution", js.undefined)
    @scala.inline
    def setMinResolution(value: Double): Self = this.set("minResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinResolution: Self = this.set("minResolution", js.undefined)
    @scala.inline
    def setRender(value: /* event */ MapEvent => _): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

