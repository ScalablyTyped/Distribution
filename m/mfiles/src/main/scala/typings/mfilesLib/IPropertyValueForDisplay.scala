package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueForDisplay extends js.Object {
  val ContentType: mfilesLib.MFilesNs.MFContentType
  val DataType: mfilesLib.MFilesNs.MFDataType
  val DisplayValue: java.lang.String
  val PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double
  val PropertyDefName: java.lang.String
  val PropertyValue: IPropertyValue
  val ReadOnly: scala.Boolean
  def Clone(): IPropertyValueForDisplay
}

object IPropertyValueForDisplay {
  @scala.inline
  def apply(
    Clone: () => IPropertyValueForDisplay,
    ContentType: mfilesLib.MFilesNs.MFContentType,
    DataType: mfilesLib.MFilesNs.MFDataType,
    DisplayValue: java.lang.String,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double,
    PropertyDefName: java.lang.String,
    PropertyValue: IPropertyValue,
    ReadOnly: scala.Boolean
  ): IPropertyValueForDisplay = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ContentType = ContentType, DataType = DataType, DisplayValue = DisplayValue, PropertyDef = PropertyDef.asInstanceOf[js.Any], PropertyDefName = PropertyDefName, PropertyValue = PropertyValue, ReadOnly = ReadOnly)
  
    __obj.asInstanceOf[IPropertyValueForDisplay]
  }
}

