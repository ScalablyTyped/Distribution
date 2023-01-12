package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardMultiValue extends StObject {
  
  val ID: String
  
  val IsMultiValue: Boolean
  
  val State: Any
  
  val ValueParts: Any
}
object IMetadataCardMultiValue {
  
  inline def apply(ID: String, IsMultiValue: Boolean, State: Any, ValueParts: Any): IMetadataCardMultiValue = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], IsMultiValue = IsMultiValue.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], ValueParts = ValueParts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardMultiValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMetadataCardMultiValue] (val x: Self) extends AnyVal {
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIsMultiValue(value: Boolean): Self = StObject.set(x, "IsMultiValue", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setValueParts(value: Any): Self = StObject.set(x, "ValueParts", value.asInstanceOf[js.Any])
  }
}
