package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValueSuggestion extends StObject {
  
  def Clone(): IPropertyValueSuggestion
  
  val IsFact: Boolean
  
  val Quality: Double
  
  val TypedValue: ITypedValue
}
object IPropertyValueSuggestion {
  
  inline def apply(Clone: () => IPropertyValueSuggestion, IsFact: Boolean, Quality: Double, TypedValue: ITypedValue): IPropertyValueSuggestion = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IsFact = IsFact.asInstanceOf[js.Any], Quality = Quality.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueSuggestion]
  }
  
  extension [Self <: IPropertyValueSuggestion](x: Self) {
    
    inline def setClone(value: () => IPropertyValueSuggestion): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setIsFact(value: Boolean): Self = StObject.set(x, "IsFact", value.asInstanceOf[js.Any])
    
    inline def setQuality(value: Double): Self = StObject.set(x, "Quality", value.asInstanceOf[js.Any])
    
    inline def setTypedValue(value: ITypedValue): Self = StObject.set(x, "TypedValue", value.asInstanceOf[js.Any])
  }
}
