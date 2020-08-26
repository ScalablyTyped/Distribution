package typings.pdfFillForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.pdfFillForm.mod.Options because Already inherited */ @js.native
trait ImgPdfOptions extends PdfOptions {
  var endPage: js.UndefOr[Double] = js.native
  var startPage: js.UndefOr[Double] = js.native
}

object ImgPdfOptions {
  @scala.inline
  def apply(): ImgPdfOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImgPdfOptions]
  }
  @scala.inline
  implicit class ImgPdfOptionsOps[Self <: ImgPdfOptions] (val x: Self) extends AnyVal {
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
    def setEndPage(value: Double): Self = this.set("endPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndPage: Self = this.set("endPage", js.undefined)
    @scala.inline
    def setStartPage(value: Double): Self = this.set("startPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPage: Self = this.set("startPage", js.undefined)
  }
  
}

