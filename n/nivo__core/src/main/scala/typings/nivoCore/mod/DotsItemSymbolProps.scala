package typings.nivoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotsItemSymbolProps extends StObject {
  
  var borderColor: String
  
  var borderWidth: Double
  
  var color: String
  
  var size: Double
}
object DotsItemSymbolProps {
  
  inline def apply(borderColor: String, borderWidth: Double, color: String, size: Double): DotsItemSymbolProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotsItemSymbolProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DotsItemSymbolProps] (val x: Self) extends AnyVal {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
