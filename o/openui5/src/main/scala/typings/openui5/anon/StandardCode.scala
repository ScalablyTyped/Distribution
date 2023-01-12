package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardCode extends StObject {
  
  var StandardCode: String
  
  var Text: String
  
  var UnitSpecificScale: String
}
object StandardCode {
  
  inline def apply(StandardCode: String, Text: String, UnitSpecificScale: String): StandardCode = {
    val __obj = js.Dynamic.literal(StandardCode = StandardCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], UnitSpecificScale = UnitSpecificScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardCode] (val x: Self) extends AnyVal {
    
    inline def setStandardCode(value: String): Self = StObject.set(x, "StandardCode", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setUnitSpecificScale(value: String): Self = StObject.set(x, "UnitSpecificScale", value.asInstanceOf[js.Any])
  }
}
