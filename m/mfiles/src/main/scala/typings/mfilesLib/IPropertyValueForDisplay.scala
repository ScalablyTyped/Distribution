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
    Clone: js.Function0[IPropertyValueForDisplay],
    ContentType: mfilesLib.MFilesNs.MFContentType,
    DataType: mfilesLib.MFilesNs.MFDataType,
    DisplayValue: java.lang.String,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double,
    PropertyDefName: java.lang.String,
    PropertyValue: IPropertyValue,
    ReadOnly: scala.Boolean
  ): IPropertyValueForDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("ContentType")(ContentType)
    __obj.updateDynamic("DataType")(DataType)
    __obj.updateDynamic("DisplayValue")(DisplayValue)
    __obj.updateDynamic("PropertyDef")(PropertyDef.asInstanceOf[js.Any])
    __obj.updateDynamic("PropertyDefName")(PropertyDefName)
    __obj.updateDynamic("PropertyValue")(PropertyValue)
    __obj.updateDynamic("ReadOnly")(ReadOnly)
    __obj.asInstanceOf[IPropertyValueForDisplay]
  }
}

