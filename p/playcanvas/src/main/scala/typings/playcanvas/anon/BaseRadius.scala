package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseRadius extends js.Object {
  var baseRadius: js.UndefOr[Double] = js.native
  var capSegments: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var heightSegments: js.UndefOr[Double] = js.native
  var peakRadius: js.UndefOr[Double] = js.native
}

object BaseRadius {
  @scala.inline
  def apply(): BaseRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRadius]
  }
  @scala.inline
  implicit class BaseRadiusOps[Self <: BaseRadius] (val x: Self) extends AnyVal {
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
    def setBaseRadius(value: Double): Self = this.set("baseRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseRadius: Self = this.set("baseRadius", js.undefined)
    @scala.inline
    def setCapSegments(value: Double): Self = this.set("capSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapSegments: Self = this.set("capSegments", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightSegments(value: Double): Self = this.set("heightSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightSegments: Self = this.set("heightSegments", js.undefined)
    @scala.inline
    def setPeakRadius(value: Double): Self = this.set("peakRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeakRadius: Self = this.set("peakRadius", js.undefined)
  }
  
}

