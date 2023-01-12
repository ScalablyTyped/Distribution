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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAttributeTypeAndValue] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: AttributeValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
