package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeMargin extends StObject {
  
  var fontSize: String
  
  var margin: js.Array[js.Array[String]]
}
object FontSizeMargin {
  
  inline def apply(fontSize: String, margin: js.Array[js.Array[String]]): FontSizeMargin = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeMargin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontSizeMargin] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: js.Array[js.Array[String]]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginVarargs(value: js.Array[String]*): Self = StObject.set(x, "margin", js.Array(value*))
  }
}
