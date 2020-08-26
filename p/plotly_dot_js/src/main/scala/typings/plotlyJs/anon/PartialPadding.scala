package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.arraydraw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Padding> */
@js.native
trait PartialPadding extends js.Object {
  var b: js.UndefOr[Double] = js.native
  var editType: js.UndefOr[arraydraw] = js.native
  var l: js.UndefOr[Double] = js.native
  var r: js.UndefOr[Double] = js.native
  var t: js.UndefOr[Double] = js.native
}

object PartialPadding {
  @scala.inline
  def apply(): PartialPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPadding]
  }
  @scala.inline
  implicit class PartialPaddingOps[Self <: PartialPadding] (val x: Self) extends AnyVal {
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
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
    @scala.inline
    def setEditType(value: arraydraw): Self = this.set("editType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditType: Self = this.set("editType", js.undefined)
    @scala.inline
    def setL(value: Double): Self = this.set("l", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteL: Self = this.set("l", js.undefined)
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setT(value: Double): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteT: Self = this.set("t", js.undefined)
  }
  
}

