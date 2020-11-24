package typings.pdfThumbnail.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsParams extends js.Object {
  
  var compress: CompressParams = js.native
  
  var crop: CropParams = js.native
  
  var resize: ResizeParams = js.native
}
object OperationsParams {
  
  @scala.inline
  def apply(compress: CompressParams, crop: CropParams, resize: ResizeParams): OperationsParams = {
    val __obj = js.Dynamic.literal(compress = compress.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationsParams]
  }
  
  @scala.inline
  implicit class OperationsParamsOps[Self <: OperationsParams] (val x: Self) extends AnyVal {
    
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
    def setCrop(value: CropParams): Self = this.set("crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize(value: ResizeParams): Self = this.set("resize", value.asInstanceOf[js.Any])
  }
}
