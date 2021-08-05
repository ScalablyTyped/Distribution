package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardMultiValue extends StObject {
  
  val ID: String
  
  val IsMultiValue: Boolean
  
  val State: js.Any
  
  val ValueParts: js.Any
}
object IMetadataCardMultiValue {
  
  inline def apply(ID: String, IsMultiValue: Boolean, State: js.Any, ValueParts: js.Any): IMetadataCardMultiValue = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], IsMultiValue = IsMultiValue.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], ValueParts = ValueParts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardMultiValue]
  }
  
  extension [Self <: IMetadataCardMultiValue](x: Self) {
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIsMultiValue(value: Boolean): Self = StObject.set(x, "IsMultiValue", value.asInstanceOf[js.Any])
    
    inline def setState(value: js.Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setValueParts(value: js.Any): Self = StObject.set(x, "ValueParts", value.asInstanceOf[js.Any])
  }
}
