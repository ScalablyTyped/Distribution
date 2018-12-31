package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValue extends js.Object {
  var PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double
  var TypedValue: ITypedValue
  var Value: ITypedValue
  def Clone(): IPropertyValue
  def CloneFrom(PropertyValue: IPropertyValue): scala.Unit
  def GetValueAsLocalizedText(): java.lang.String
  def GetValueAsText(
    Localized: scala.Boolean,
    NULLAsEmptyString: scala.Boolean,
    EmptyLookupDisplayValuesAsHidden: scala.Boolean,
    LongDateFormat: scala.Boolean,
    NoSeconds: scala.Boolean,
    NumericValueAsKilobytes: scala.Boolean
  ): java.lang.String
  def GetValueAsUnlocalizedText(): java.lang.String
}

