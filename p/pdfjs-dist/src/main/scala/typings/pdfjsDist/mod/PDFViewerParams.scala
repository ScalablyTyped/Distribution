package typings.pdfjsDist.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerParams extends js.Object {
  var container: HTMLElement = js.native
  var viewer: js.UndefOr[HTMLElement] = js.native
}

object PDFViewerParams {
  @scala.inline
  def apply(container: HTMLElement): PDFViewerParams = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerParams]
  }
  @scala.inline
  implicit class PDFViewerParamsOps[Self <: PDFViewerParams] (val x: Self) extends AnyVal {
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
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewer(value: HTMLElement): Self = this.set("viewer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewer: Self = this.set("viewer", js.undefined)
  }
  
}

