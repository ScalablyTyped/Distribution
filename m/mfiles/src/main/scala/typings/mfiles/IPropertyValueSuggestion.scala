package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyValueSuggestion extends StObject {
  
  def Clone(): IPropertyValueSuggestion = js.native
  
  val IsFact: Boolean = js.native
  
  val Quality: Double = js.native
  
  val TypedValue: ITypedValue = js.native
}
object IPropertyValueSuggestion {
  
  @scala.inline
  def apply(Clone: () => IPropertyValueSuggestion, IsFact: Boolean, Quality: Double, TypedValue: ITypedValue): IPropertyValueSuggestion = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IsFact = IsFact.asInstanceOf[js.Any], Quality = Quality.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueSuggestion]
  }
  
  @scala.inline
  implicit class IPropertyValueSuggestionMutableBuilder[Self <: IPropertyValueSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IPropertyValueSuggestion): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFact(value: Boolean): Self = StObject.set(x, "IsFact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "Quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedValue(value: ITypedValue): Self = StObject.set(x, "TypedValue", value.asInstanceOf[js.Any])
  }
}
