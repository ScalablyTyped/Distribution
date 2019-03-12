package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypedValue extends js.Object {
  val DataType: mfilesLib.MFilesNs.MFDataType
  val DisplayValue: java.lang.String
  var Value: js.Any
  def Clone(): ITypedValue
  def CloneFrom(TypedValue: ITypedValue): scala.Unit
  def CompareTo(TypedValue: ITypedValue): scala.Double
  def GetLookupID(): scala.Double
  def GetValueAsLocalizedText(): java.lang.String
  def GetValueAsLookup(): ILookup
  def GetValueAsLookups(): ILookups
  def GetValueAsText(
    Localized: scala.Boolean,
    NULLAsEmptyString: scala.Boolean,
    EmptyLookupDisplayValuesAsHidden: scala.Boolean,
    LongDateFormat: scala.Boolean,
    NoSeconds: scala.Boolean,
    NumericValueAsKilobytes: scala.Boolean
  ): java.lang.String
  def GetValueAsTextWithExpression(Expression: IExpression, Locale: scala.Double): java.lang.String
  def GetValueAsTimestamp(): ITimestamp
  def GetValueAsUnlocalizedText(): java.lang.String
  def IsNULL(): scala.Boolean
  def IsUninitialized(): scala.Boolean
  def Serialize(): js.Array[scala.Double]
  def SetValue(DataType: mfilesLib.MFilesNs.MFDataType, Value: js.Any): scala.Unit
  def SetValueToLookup(Lookup: ILookup): scala.Unit
  def SetValueToMultiSelectLookup(MultiSelectLookup: ILookups): scala.Unit
  def SetValueToNULL(DataType: mfilesLib.MFilesNs.MFDataType): scala.Unit
  def Unserialize(Bytes: js.Array[scala.Double], ReadFromOldSerializingFormat: scala.Boolean): scala.Unit
}

object ITypedValue {
  @scala.inline
  def apply(
    Clone: () => ITypedValue,
    CloneFrom: ITypedValue => scala.Unit,
    CompareTo: ITypedValue => scala.Double,
    DataType: mfilesLib.MFilesNs.MFDataType,
    DisplayValue: java.lang.String,
    GetLookupID: () => scala.Double,
    GetValueAsLocalizedText: () => java.lang.String,
    GetValueAsLookup: () => ILookup,
    GetValueAsLookups: () => ILookups,
    GetValueAsText: (scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean) => java.lang.String,
    GetValueAsTextWithExpression: (IExpression, scala.Double) => java.lang.String,
    GetValueAsTimestamp: () => ITimestamp,
    GetValueAsUnlocalizedText: () => java.lang.String,
    IsNULL: () => scala.Boolean,
    IsUninitialized: () => scala.Boolean,
    Serialize: () => js.Array[scala.Double],
    SetValue: (mfilesLib.MFilesNs.MFDataType, js.Any) => scala.Unit,
    SetValueToLookup: ILookup => scala.Unit,
    SetValueToMultiSelectLookup: ILookups => scala.Unit,
    SetValueToNULL: mfilesLib.MFilesNs.MFDataType => scala.Unit,
    Unserialize: (js.Array[scala.Double], scala.Boolean) => scala.Unit,
    Value: js.Any
  ): ITypedValue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), CompareTo = js.Any.fromFunction1(CompareTo), DataType = DataType, DisplayValue = DisplayValue, GetLookupID = js.Any.fromFunction0(GetLookupID), GetValueAsLocalizedText = js.Any.fromFunction0(GetValueAsLocalizedText), GetValueAsLookup = js.Any.fromFunction0(GetValueAsLookup), GetValueAsLookups = js.Any.fromFunction0(GetValueAsLookups), GetValueAsText = js.Any.fromFunction6(GetValueAsText), GetValueAsTextWithExpression = js.Any.fromFunction2(GetValueAsTextWithExpression), GetValueAsTimestamp = js.Any.fromFunction0(GetValueAsTimestamp), GetValueAsUnlocalizedText = js.Any.fromFunction0(GetValueAsUnlocalizedText), IsNULL = js.Any.fromFunction0(IsNULL), IsUninitialized = js.Any.fromFunction0(IsUninitialized), Serialize = js.Any.fromFunction0(Serialize), SetValue = js.Any.fromFunction2(SetValue), SetValueToLookup = js.Any.fromFunction1(SetValueToLookup), SetValueToMultiSelectLookup = js.Any.fromFunction1(SetValueToMultiSelectLookup), SetValueToNULL = js.Any.fromFunction1(SetValueToNULL), Unserialize = js.Any.fromFunction2(Unserialize), Value = Value)
  
    __obj.asInstanceOf[ITypedValue]
  }
}

