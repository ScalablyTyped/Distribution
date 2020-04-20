package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFContentType
import typings.mfiles.MFiles.MFDataType
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ContentType = ContentType.asInstanceOf[js.Any], DataType = DataType.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], PropertyDefName = PropertyDefName.asInstanceOf[js.Any], PropertyValue = PropertyValue.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueForDisplay]
  }
}

