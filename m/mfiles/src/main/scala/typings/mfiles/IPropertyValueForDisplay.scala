package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFContentType
import typings.mfiles.MFiles.MFDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyValueForDisplay extends js.Object {
  
  def Clone(): IPropertyValueForDisplay = js.native
  
  val ContentType: MFContentType = js.native
  
  val DataType: MFDataType = js.native
  
  val DisplayValue: String = js.native
  
  val PropertyDef: MFBuiltInPropertyDef | Double = js.native
  
  val PropertyDefName: String = js.native
  
  val PropertyValue: IPropertyValue = js.native
  
  val ReadOnly: Boolean = js.native
}
object IPropertyValueForDisplay {
  
  @scala.inline
  def apply(
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
  implicit class IPropertyValueForDisplayOps[Self <: IPropertyValueForDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClone(value: () => IPropertyValueForDisplay): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContentType(value: MFContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: MFDataType): Self = this.set("DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValue(value: String): Self = this.set("DisplayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = this.set("PropertyDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDefName(value: String): Self = this.set("PropertyDefName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyValue(value: IPropertyValue): Self = this.set("PropertyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
  }
}
