package typings.pdfThumbnail.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsParams extends js.Object {
  var compress: CompressParams
  var crop: CropParams
  var resize: ResizeParams
}

object OperationsParams {
  @scala.inline
  def apply(compress: CompressParams, crop: CropParams, resize: ResizeParams): OperationsParams = {
    val __obj = js.Dynamic.literal(compress = compress.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationsParams]
  }
}

