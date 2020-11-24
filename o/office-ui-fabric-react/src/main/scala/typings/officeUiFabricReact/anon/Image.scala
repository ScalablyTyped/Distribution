package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends js.Object {
  
  var image: js.Array[String | Overflow] = js.native
  
  var placeholder: js.Array[String | WidthString] = js.native
  
  var root: Display = js.native
}
object Image {
  
  @scala.inline
  def apply(image: js.Array[String | Overflow], placeholder: js.Array[String | WidthString], root: Display): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
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
    def setImageVarargs(value: (String | Overflow)*): Self = this.set("image", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: js.Array[String | Overflow]): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderVarargs(value: (String | WidthString)*): Self = this.set("placeholder", js.Array(value :_*))
    
    @scala.inline
    def setPlaceholder(value: js.Array[String | WidthString]): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: Display): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
