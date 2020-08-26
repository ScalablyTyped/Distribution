package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.line
import typings.pdfmake.pdfmakeStrings.round
import typings.pdfmake.pdfmakeStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasLine
  extends CanvasLineElement
     with CanvasElement {
  var lineCap: js.UndefOr[round | square] = js.native
  var `type`: line = js.native
  var x1: Double = js.native
  var x2: Double = js.native
  var y1: Double = js.native
  var y2: Double = js.native
}

object CanvasLine {
  @scala.inline
  def apply(`type`: line, x1: Double, x2: Double, y1: Double, y2: Double): CanvasLine = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasLine]
  }
  @scala.inline
  implicit class CanvasLineOps[Self <: CanvasLine] (val x: Self) extends AnyVal {
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
    def setType(value: line): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineCap(value: round | square): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
  }
  
}

