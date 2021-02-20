package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAutomaticMetadataResult extends StObject {
  
  def Clone(): IAutomaticMetadataResult = js.native
  
  val PropertyValueSuggestions: IPropertyValueSuggestions = js.native
}
object IAutomaticMetadataResult {
  
  @scala.inline
  def apply(Clone: () => IAutomaticMetadataResult, PropertyValueSuggestions: IPropertyValueSuggestions): IAutomaticMetadataResult = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyValueSuggestions = PropertyValueSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutomaticMetadataResult]
  }
  
  @scala.inline
  implicit class IAutomaticMetadataResultMutableBuilder[Self <: IAutomaticMetadataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IAutomaticMetadataResult): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPropertyValueSuggestions(value: IPropertyValueSuggestions): Self = StObject.set(x, "PropertyValueSuggestions", value.asInstanceOf[js.Any])
  }
}
