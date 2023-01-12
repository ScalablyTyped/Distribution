package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAutomaticMetadataResult extends StObject {
  
  def Clone(): IAutomaticMetadataResult
  
  val PropertyValueSuggestions: IPropertyValueSuggestions
}
object IAutomaticMetadataResult {
  
  inline def apply(Clone: () => IAutomaticMetadataResult, PropertyValueSuggestions: IPropertyValueSuggestions): IAutomaticMetadataResult = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyValueSuggestions = PropertyValueSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutomaticMetadataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAutomaticMetadataResult] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IAutomaticMetadataResult): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setPropertyValueSuggestions(value: IPropertyValueSuggestions): Self = StObject.set(x, "PropertyValueSuggestions", value.asInstanceOf[js.Any])
  }
}
