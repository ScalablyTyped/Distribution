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

