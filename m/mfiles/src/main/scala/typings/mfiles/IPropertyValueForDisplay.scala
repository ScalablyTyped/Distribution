package typings.mfiles

import typings.mfiles.MFilesNs.MFBuiltInPropertyDef
import typings.mfiles.MFilesNs.MFContentType
import typings.mfiles.MFilesNs.MFDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueForDisplay extends js.Object {
  val ContentType: MFContentType
  val DataType: MFDataType
  val DisplayValue: String
  val PropertyDef: MFBuiltInPropertyDef | Double
  val PropertyDefName: String
  val PropertyValue: IPropertyValue
  val ReadOnly: Boolean
  def Clone(): IPropertyValueForDisplay
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ContentType = ContentType, DataType = DataType, DisplayValue = DisplayValue, PropertyDef = PropertyDef.asInstanceOf[js.Any], PropertyDefName = PropertyDefName, PropertyValue = PropertyValue, ReadOnly = ReadOnly)
  
    __obj.asInstanceOf[IPropertyValueForDisplay]
  }
}

