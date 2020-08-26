package typings.pdfThumbnail.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ op in pdf-thumbnail.pdf-thumbnail.Operations ]:? pdf-thumbnail.pdf-thumbnail.OperationsParams[op]} */
@js.native
trait PDFThumbnailOptions extends js.Object {
  var compress: js.UndefOr[CompressParams] = js.native
  var crop: js.UndefOr[CropParams] = js.native
  var resize: js.UndefOr[ResizeParams] = js.native
}

object PDFThumbnailOptions {
  @scala.inline
  def apply(): PDFThumbnailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFThumbnailOptions]
  }
  @scala.inline
  implicit class PDFThumbnailOptionsOps[Self <: PDFThumbnailOptions] (val x: Self) extends AnyVal {
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
    def setCompress(value: CompressParams): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setCrop(value: CropParams): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    @scala.inline
    def setResize(value: ResizeParams): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
  }
  
}

