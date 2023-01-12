package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedAndUnsignedAttributesJson extends StObject {
  
  var attributes: js.Array[AttributeJson]
  
  var `type`: Double
}
object SignedAndUnsignedAttributesJson {
  
  inline def apply(attributes: js.Array[AttributeJson], `type`: Double): SignedAndUnsignedAttributesJson = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedAndUnsignedAttributesJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignedAndUnsignedAttributesJson] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[AttributeJson]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: AttributeJson*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
