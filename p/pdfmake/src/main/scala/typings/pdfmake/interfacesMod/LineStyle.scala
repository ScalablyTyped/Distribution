package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineStyle extends js.Object {
  var dash: js.UndefOr[Length] = js.native
}

object LineStyle {
  @scala.inline
  def apply(): LineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStyle]
  }
  @scala.inline
  implicit class LineStyleOps[Self <: LineStyle] (val x: Self) extends AnyVal {
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
    def setDash(value: Length): Self = this.set("dash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDash: Self = this.set("dash", js.undefined)
  }
  
}

