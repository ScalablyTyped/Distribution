package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.X
import typings.pdfmake.pdfmakeStrings.polyline
import typings.pdfmake.pdfmakeStrings.round
import typings.pdfmake.pdfmakeStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasPolyline
  extends CanvasLineElement
     with CanvasFilledElement
     with CanvasElement {
  var closePath: js.UndefOr[Boolean] = js.native
  var lineCap: js.UndefOr[round | square] = js.native
  var points: js.Array[X] = js.native
  var `type`: polyline = js.native
}

object CanvasPolyline {
  @scala.inline
  def apply(points: js.Array[X], `type`: polyline): CanvasPolyline = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasPolyline]
  }
  @scala.inline
  implicit class CanvasPolylineOps[Self <: CanvasPolyline] (val x: Self) extends AnyVal {
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
    def setPointsVarargs(value: X*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[X]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: polyline): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosePath(value: Boolean): Self = this.set("closePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosePath: Self = this.set("closePath", js.undefined)
    @scala.inline
    def setLineCap(value: round | square): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
  }
  
}

