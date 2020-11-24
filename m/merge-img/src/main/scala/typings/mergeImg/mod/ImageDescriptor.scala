package typings.mergeImg.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageDescriptor extends js.Object {
  
  /**
    * x offset to affect this image
    * @default 0
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * y offset to affect this image
    * @default 0
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * A single image source to concat
    */
  var src: String | Buffer = js.native
}
object ImageDescriptor {
  
  @scala.inline
  def apply(src: String | Buffer): ImageDescriptor = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDescriptor]
  }
  
  @scala.inline
  implicit class ImageDescriptorOps[Self <: ImageDescriptor] (val x: Self) extends AnyVal {
    
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
    def setSrc(value: String | Buffer): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
  }
}
