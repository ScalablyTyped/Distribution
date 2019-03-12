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

object IPropertyValue {
  @scala.inline
  def apply(
    Clone: () => IPropertyValue,
    CloneFrom: IPropertyValue => scala.Unit,
    GetValueAsLocalizedText: () => java.lang.String,
    GetValueAsText: (scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean) => java.lang.String,
    GetValueAsUnlocalizedText: () => java.lang.String,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double,
    TypedValue: ITypedValue,
    Value: ITypedValue
  ): IPropertyValue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), GetValueAsLocalizedText = js.Any.fromFunction0(GetValueAsLocalizedText), GetValueAsText = js.Any.fromFunction6(GetValueAsText), GetValueAsUnlocalizedText = js.Any.fromFunction0(GetValueAsUnlocalizedText), PropertyDef = PropertyDef.asInstanceOf[js.Any], TypedValue = TypedValue, Value = Value)
  
    __obj.asInstanceOf[IPropertyValue]
  }
}

