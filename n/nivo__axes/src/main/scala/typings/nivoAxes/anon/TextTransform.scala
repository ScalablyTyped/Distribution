package typings.nivoAxes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTransform extends StObject {
  
  var opacity: Double
  
  var textTransform: String
  
  var transform: String
}
object TextTransform {
  
  inline def apply(opacity: Double, textTransform: String, transform: String): TextTransform = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], textTransform = textTransform.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextTransform] (val x: Self) extends AnyVal {
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setTextTransform(value: String): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
