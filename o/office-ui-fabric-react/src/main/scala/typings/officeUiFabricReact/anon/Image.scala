package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var image: js.Array[String | Overflow]
  
  var placeholder: js.Array[String | WidthString]
  
  var root: Display
}
object Image {
  
  inline def apply(image: js.Array[String | Overflow], placeholder: js.Array[String | WidthString], root: Display): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    inline def setImage(value: js.Array[String | Overflow]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageVarargs(value: (String | Overflow)*): Self = StObject.set(x, "image", js.Array(value*))
    
    inline def setPlaceholder(value: js.Array[String | WidthString]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderVarargs(value: (String | WidthString)*): Self = StObject.set(x, "placeholder", js.Array(value*))
    
    inline def setRoot(value: Display): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
