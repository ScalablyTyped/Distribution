package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardValueSuggestion extends StObject {
  
  val IsNewValue: Boolean = js.native
  
  val Name: String = js.native
  
  val Value: js.Any = js.native
}
object IMetadataCardValueSuggestion {
  
  @scala.inline
  def apply(IsNewValue: Boolean, Name: String, Value: js.Any): IMetadataCardValueSuggestion = {
    val __obj = js.Dynamic.literal(IsNewValue = IsNewValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardValueSuggestion]
  }
  
  @scala.inline
  implicit class IMetadataCardValueSuggestionMutableBuilder[Self <: IMetadataCardValueSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsNewValue(value: Boolean): Self = StObject.set(x, "IsNewValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
