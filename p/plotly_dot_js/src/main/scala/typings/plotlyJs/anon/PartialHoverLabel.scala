package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.HoverLabel> */
@js.native
trait PartialHoverLabel extends js.Object {
  var align: js.UndefOr[left | right | auto] = js.native
  var bgcolor: js.UndefOr[String] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var font: js.UndefOr[PartialFont] = js.native
  var namelength: js.UndefOr[Double] = js.native
}

object PartialHoverLabel {
  @scala.inline
  def apply(): PartialHoverLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHoverLabel]
  }
  @scala.inline
  implicit class PartialHoverLabelOps[Self <: PartialHoverLabel] (val x: Self) extends AnyVal {
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
    def setAlign(value: left | right | auto): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setBgcolor(value: String): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    @scala.inline
    def setBordercolor(value: String): Self = this.set("bordercolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordercolor: Self = this.set("bordercolor", js.undefined)
    @scala.inline
    def setFont(value: PartialFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setNamelength(value: Double): Self = this.set("namelength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamelength: Self = this.set("namelength", js.undefined)
  }
  
}

