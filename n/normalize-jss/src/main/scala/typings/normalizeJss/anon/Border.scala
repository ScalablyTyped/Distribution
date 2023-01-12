package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  var border: String
  
  var margin: js.Array[js.Array[Double]]
  
  var padding: js.Array[js.Array[String]]
}
object Border {
  
  inline def apply(border: String, margin: js.Array[js.Array[Double]], padding: js.Array[js.Array[String]]): Border = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginVarargs(value: js.Array[Double]*): Self = StObject.set(x, "margin", js.Array(value*))
    
    inline def setPadding(value: js.Array[js.Array[String]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingVarargs(value: js.Array[String]*): Self = StObject.set(x, "padding", js.Array(value*))
  }
}
