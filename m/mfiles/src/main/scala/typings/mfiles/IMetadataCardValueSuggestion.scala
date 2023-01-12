package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardValueSuggestion extends StObject {
  
  val IsNewValue: Boolean
  
  val Name: String
  
  val Value: Any
}
object IMetadataCardValueSuggestion {
  
  inline def apply(IsNewValue: Boolean, Name: String, Value: Any): IMetadataCardValueSuggestion = {
    val __obj = js.Dynamic.literal(IsNewValue = IsNewValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardValueSuggestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMetadataCardValueSuggestion] (val x: Self) extends AnyVal {
    
    inline def setIsNewValue(value: Boolean): Self = StObject.set(x, "IsNewValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
