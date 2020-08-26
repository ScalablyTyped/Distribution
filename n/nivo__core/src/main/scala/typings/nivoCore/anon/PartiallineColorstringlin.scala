package typings.nivoCore.anon

import typings.nivoCore.nivoCoreNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  lineColor :string,   lineStrokeWidth :number,   textColor :string,   fontSize :string | 0}> */
@js.native
trait PartiallineColorstringlin extends js.Object {
  var fontSize: js.UndefOr[String | `0`] = js.native
  var lineColor: js.UndefOr[String] = js.native
  var lineStrokeWidth: js.UndefOr[Double] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object PartiallineColorstringlin {
  @scala.inline
  def apply(): PartiallineColorstringlin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartiallineColorstringlin]
  }
  @scala.inline
  implicit class PartiallineColorstringlinOps[Self <: PartiallineColorstringlin] (val x: Self) extends AnyVal {
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
    def setFontSize(value: String | `0`): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    @scala.inline
    def setLineStrokeWidth(value: Double): Self = this.set("lineStrokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStrokeWidth: Self = this.set("lineStrokeWidth", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
  
}

