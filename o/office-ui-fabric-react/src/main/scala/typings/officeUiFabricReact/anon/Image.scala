package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends StObject {
  
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
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: js.Array[String | Overflow]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVarargs(value: (String | Overflow)*): Self = StObject.set(x, "image", js.Array(value :_*))
    
    @scala.inline
    def setPlaceholder(value: js.Array[String | WidthString]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderVarargs(value: (String | WidthString)*): Self = StObject.set(x, "placeholder", js.Array(value :_*))
    
    @scala.inline
    def setRoot(value: Display): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
