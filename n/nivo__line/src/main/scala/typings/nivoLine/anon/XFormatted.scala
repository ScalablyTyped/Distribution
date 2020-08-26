package typings.nivoLine.anon

import typings.nivoLine.mod.DatumValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XFormatted extends js.Object {
  var x: DatumValue = js.native
  var xFormatted: String | Double = js.native
  var y: DatumValue = js.native
  var yFormatted: String | Double = js.native
  var yStacked: js.UndefOr[Double] = js.native
}

object XFormatted {
  @scala.inline
  def apply(x: DatumValue, xFormatted: String | Double, y: DatumValue, yFormatted: String | Double): XFormatted = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], xFormatted = xFormatted.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yFormatted = yFormatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[XFormatted]
  }
  @scala.inline
  implicit class XFormattedOps[Self <: XFormatted] (val x: Self) extends AnyVal {
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
    def setX(value: DatumValue): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setXFormatted(value: String | Double): Self = this.set("xFormatted", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: DatumValue): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setYFormatted(value: String | Double): Self = this.set("yFormatted", value.asInstanceOf[js.Any])
    @scala.inline
    def setYStacked(value: Double): Self = this.set("yStacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYStacked: Self = this.set("yStacked", js.undefined)
  }
  
}

