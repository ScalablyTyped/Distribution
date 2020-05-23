package typings.pdfThumbnail.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ op in pdf-thumbnail.pdf-thumbnail.Operations ]:? pdf-thumbnail.pdf-thumbnail.OperationsParams[op]} */
trait PDFThumbnailOptions extends js.Object {
  var compress: js.UndefOr[CompressParams] = js.undefined
  var crop: js.UndefOr[CropParams] = js.undefined
  var resize: js.UndefOr[ResizeParams] = js.undefined
}

object PDFThumbnailOptions {
  @scala.inline
  def apply(compress: CompressParams = null, crop: CropParams = null, resize: ResizeParams = null): PDFThumbnailOptions = {
    val __obj = js.Dynamic.literal()
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFThumbnailOptions]
  }
}

