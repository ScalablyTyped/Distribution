package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttributeTypeAndValue extends StObject {
  
  var `type`: String
  
  var value: AttributeValueType
}
object IAttributeTypeAndValue {
  
  inline def apply(`type`: String, value: AttributeValueType): IAttributeTypeAndValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttributeTypeAndValue]
  }
  
  extension [Self <: IAttributeTypeAndValue](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: AttributeValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
