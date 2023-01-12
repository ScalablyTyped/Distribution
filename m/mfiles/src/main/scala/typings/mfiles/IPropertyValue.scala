package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValue extends StObject {
  
  def Clone(): IPropertyValue
  
  def CloneFrom(PropertyValue: IPropertyValue): Unit
  
  def GetValueAsLocalizedText(): String
  
  def GetValueAsText(
    Localized: Boolean,
    NULLAsEmptyString: Boolean,
    EmptyLookupDisplayValuesAsHidden: Boolean,
    LongDateFormat: Boolean,
    NoSeconds: Boolean,
    NumericValueAsKilobytes: Boolean
  ): String
  
  def GetValueAsUnlocalizedText(): String
  
  var PropertyDef: MFBuiltInPropertyDef | Double
  
  var TypedValue: ITypedValue
  
  var Value: ITypedValue
}
object IPropertyValue {
  
  inline def apply(
    Clone: () => IPropertyValue,
    CloneFrom: IPropertyValue => Unit,
    GetValueAsLocalizedText: () => String,
    GetValueAsText: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String,
    GetValueAsUnlocalizedText: () => String,
    PropertyDef: MFBuiltInPropertyDef | Double,
    TypedValue: ITypedValue,
    Value: ITypedValue
  ): IPropertyValue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), GetValueAsLocalizedText = js.Any.fromFunction0(GetValueAsLocalizedText), GetValueAsText = js.Any.fromFunction6(GetValueAsText), GetValueAsUnlocalizedText = js.Any.fromFunction0(GetValueAsUnlocalizedText), PropertyDef = PropertyDef.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPropertyValue] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IPropertyValue): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCloneFrom(value: IPropertyValue => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    inline def setGetValueAsLocalizedText(value: () => String): Self = StObject.set(x, "GetValueAsLocalizedText", js.Any.fromFunction0(value))
    
    inline def setGetValueAsText(value: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String): Self = StObject.set(x, "GetValueAsText", js.Any.fromFunction6(value))
    
    inline def setGetValueAsUnlocalizedText(value: () => String): Self = StObject.set(x, "GetValueAsUnlocalizedText", js.Any.fromFunction0(value))
    
    inline def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    inline def setTypedValue(value: ITypedValue): Self = StObject.set(x, "TypedValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ITypedValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
