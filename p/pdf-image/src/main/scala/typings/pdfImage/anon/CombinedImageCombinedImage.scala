package typings.pdfImage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinedImageCombinedImage[CombinedImage /* <: Boolean */] extends js.Object {
  
  var combinedImage: CombinedImage = js.native
}
object CombinedImageCombinedImage {
  
  @scala.inline
  def apply[CombinedImage /* <: Boolean */](combinedImage: CombinedImage): CombinedImageCombinedImage[CombinedImage] = {
    val __obj = js.Dynamic.literal(combinedImage = combinedImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedImageCombinedImage[CombinedImage]]
  }
  
  @scala.inline
  implicit class CombinedImageCombinedImageOps[Self <: CombinedImageCombinedImage[_], CombinedImage /* <: Boolean */] (val x: Self with CombinedImageCombinedImage[CombinedImage]) extends AnyVal {
    
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
    def setCombinedImage(value: CombinedImage): Self = this.set("combinedImage", value.asInstanceOf[js.Any])
  }
}
