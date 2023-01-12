package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFContentType
import typings.mfiles.MFiles.MFDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValueForDisplay extends StObject {
  
  def Clone(): IPropertyValueForDisplay
  
  val ContentType: MFContentType
  
  val DataType: MFDataType
  
  val DisplayValue: String
  
  val PropertyDef: MFBuiltInPropertyDef | Double
  
  val PropertyDefName: String
  
  val PropertyValue: IPropertyValue
  
  val ReadOnly: Boolean
}
object IPropertyValueForDisplay {
  
  inline def apply(
    Clone: () => IPropertyValueForDisplay,
    ContentType: MFContentType,
    DataType: MFDataType,
    DisplayValue: String,
    PropertyDef: MFBuiltInPropertyDef | Double,
    PropertyDefName: String,
    PropertyValue: IPropertyValue,
    ReadOnly: Boolean
  ): IPropertyValueForDisplay = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ContentType = ContentType.asInstanceOf[js.Any], DataType = DataType.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], PropertyDefName = PropertyDefName.asInstanceOf[js.Any], PropertyValue = PropertyValue.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueForDisplay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPropertyValueForDisplay] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IPropertyValueForDisplay): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setContentType(value: MFContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: MFDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDisplayValue(value: String): Self = StObject.set(x, "DisplayValue", value.asInstanceOf[js.Any])
    
    inline def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    inline def setPropertyDefName(value: String): Self = StObject.set(x, "PropertyDefName", value.asInstanceOf[js.Any])
    
    inline def setPropertyValue(value: IPropertyValue): Self = StObject.set(x, "PropertyValue", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
  }
}
