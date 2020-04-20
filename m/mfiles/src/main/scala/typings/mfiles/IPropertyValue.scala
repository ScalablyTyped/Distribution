package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValue extends js.Object {
  var PropertyDef: MFBuiltInPropertyDef | Double
  var TypedValue: ITypedValue
  var Value: ITypedValue
  def Clone(): IPropertyValue
  def CloneFrom(PropertyValue: IPropertyValue): Unit
  def GetValueAsLocalizedText(): String
  def GetValueAsText(
    Localized: Boolean,
    NULLAsEmptyString: Boolean,
    EmptyLookupDisplayValuesAsHidden: Boolean,
    LongDateFormat: Boolean,
    NoSeconds: Boolean,
    NumericValueAsKilobytes: Boolean
  ): String
  def GetValueAsUnlocalizedText(): String
}

object IPropertyValue {
  @scala.inline
  def apply(
    Clone: () => IPropertyValue,
    CloneFrom: IPropertyValue => Unit,
    GetValueAsLocalizedText: () => String,
    GetValueAsText: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String,
    GetValueAsUnlocalizedText: () => String,
    PropertyDef: MFBuiltInPropertyDef | Double,
    TypedValue: ITypedValue,
    Value: ITypedValue
  ): IPropertyValue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), GetValueAsLocalizedText = js.Any.fromFunction0(GetValueAsLocalizedText), GetValueAsText = js.Any.fromFunction6(GetValueAsText), GetValueAsUnlocalizedText = js.Any.fromFunction0(GetValueAsUnlocalizedText), PropertyDef = PropertyDef.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValue]
  }
}

