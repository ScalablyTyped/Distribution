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
    Clone: js.Function0[IPropertyValue],
    CloneFrom: js.Function1[IPropertyValue, scala.Unit],
    GetValueAsLocalizedText: js.Function0[java.lang.String],
    GetValueAsText: js.Function6[
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      java.lang.String
    ],
    GetValueAsUnlocalizedText: js.Function0[java.lang.String],
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double,
    TypedValue: ITypedValue,
    Value: ITypedValue
  ): IPropertyValue = {
    val __obj = js.Dynamic.literal(Clone = Clone, CloneFrom = CloneFrom, GetValueAsLocalizedText = GetValueAsLocalizedText, GetValueAsText = GetValueAsText, GetValueAsUnlocalizedText = GetValueAsUnlocalizedText, PropertyDef = PropertyDef.asInstanceOf[js.Any], TypedValue = TypedValue, Value = Value)
  
    __obj.asInstanceOf[IPropertyValue]
  }
}

