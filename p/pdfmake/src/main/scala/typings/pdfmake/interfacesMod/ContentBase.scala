package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentBase extends Style {
  var absolutePosition: js.UndefOr[X] = js.native
  var headlineLevel: js.UndefOr[Double] = js.native
  var pageBreak: js.UndefOr[PageBreak] = js.native
  var pageOrientation: js.UndefOr[PageOrientation] = js.native
  var relativePosition: js.UndefOr[X] = js.native
  var style: js.UndefOr[String | js.Array[String] | Style] = js.native
}

object ContentBase {
  @scala.inline
  def apply(): ContentBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentBase]
  }
  @scala.inline
  implicit class ContentBaseOps[Self <: ContentBase] (val x: Self) extends AnyVal {
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
    def setAbsolutePosition(value: X): Self = this.set("absolutePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsolutePosition: Self = this.set("absolutePosition", js.undefined)
    @scala.inline
    def setHeadlineLevel(value: Double): Self = this.set("headlineLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadlineLevel: Self = this.set("headlineLevel", js.undefined)
    @scala.inline
    def setPageBreak(value: PageBreak): Self = this.set("pageBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageBreak: Self = this.set("pageBreak", js.undefined)
    @scala.inline
    def setPageOrientation(value: PageOrientation): Self = this.set("pageOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageOrientation: Self = this.set("pageOrientation", js.undefined)
    @scala.inline
    def setRelativePosition(value: X): Self = this.set("relativePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativePosition: Self = this.set("relativePosition", js.undefined)
    @scala.inline
    def setStyleVarargs(value: String*): Self = this.set("style", js.Array(value :_*))
    @scala.inline
    def setStyle(value: String | js.Array[String] | Style): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

