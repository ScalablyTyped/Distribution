package typings.mfiles

import typings.mfiles.MFiles.MFDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypedValue extends js.Object {
  val DataType: MFDataType
  val DisplayValue: String
  var Value: js.Any
  def Clone(): ITypedValue
  def CloneFrom(TypedValue: ITypedValue): Unit
  def CompareTo(TypedValue: ITypedValue): Double
  def GetLookupID(): Double
  def GetValueAsLocalizedText(): String
  def GetValueAsLookup(): ILookup
  def GetValueAsLookups(): ILookups
  def GetValueAsText(
    Localized: Boolean,
    NULLAsEmptyString: Boolean,
    EmptyLookupDisplayValuesAsHidden: Boolean,
    LongDateFormat: Boolean,
    NoSeconds: Boolean,
    NumericValueAsKilobytes: Boolean
  ): String
  def GetValueAsTextWithExpression(Expression: IExpression, Locale: Double): String
  def GetValueAsTimestamp(): ITimestamp
  def GetValueAsUnlocalizedText(): String
  def IsNULL(): Boolean
  def IsUninitialized(): Boolean
  def Serialize(): js.Array[Double]
  def SetValue(DataType: MFDataType, Value: js.Any): Unit
  def SetValueToLookup(Lookup: ILookup): Unit
  def SetValueToMultiSelectLookup(MultiSelectLookup: ILookups): Unit
  def SetValueToNULL(DataType: MFDataType): Unit
  def Unserialize(Bytes: js.Array[Double], ReadFromOldSerializingFormat: Boolean): Unit
}

object ITypedValue {
  @scala.inline
  def apply(
    Clone: () => ITypedValue,
    CloneFrom: ITypedValue => Unit,
    CompareTo: ITypedValue => Double,
    DataType: MFDataType,
    DisplayValue: String,
    GetLookupID: () => Double,
    GetValueAsLocalizedText: () => String,
    GetValueAsLookup: () => ILookup,
    GetValueAsLookups: () => ILookups,
    GetValueAsText: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String,
    GetValueAsTextWithExpression: (IExpression, Double) => String,
    GetValueAsTimestamp: () => ITimestamp,
    GetValueAsUnlocalizedText: () => String,
    IsNULL: () => Boolean,
    IsUninitialized: () => Boolean,
    Serialize: () => js.Array[Double],
    SetValue: (MFDataType, js.Any) => Unit,
    SetValueToLookup: ILookup => Unit,
    SetValueToMultiSelectLookup: ILookups => Unit,
    SetValueToNULL: MFDataType => Unit,
    Unserialize: (js.Array[Double], Boolean) => Unit,
    Value: js.Any
  ): ITypedValue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), CompareTo = js.Any.fromFunction1(CompareTo), DataType = DataType.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], GetLookupID = js.Any.fromFunction0(GetLookupID), GetValueAsLocalizedText = js.Any.fromFunction0(GetValueAsLocalizedText), GetValueAsLookup = js.Any.fromFunction0(GetValueAsLookup), GetValueAsLookups = js.Any.fromFunction0(GetValueAsLookups), GetValueAsText = js.Any.fromFunction6(GetValueAsText), GetValueAsTextWithExpression = js.Any.fromFunction2(GetValueAsTextWithExpression), GetValueAsTimestamp = js.Any.fromFunction0(GetValueAsTimestamp), GetValueAsUnlocalizedText = js.Any.fromFunction0(GetValueAsUnlocalizedText), IsNULL = js.Any.fromFunction0(IsNULL), IsUninitialized = js.Any.fromFunction0(IsUninitialized), Serialize = js.Any.fromFunction0(Serialize), SetValue = js.Any.fromFunction2(SetValue), SetValueToLookup = js.Any.fromFunction1(SetValueToLookup), SetValueToMultiSelectLookup = js.Any.fromFunction1(SetValueToMultiSelectLookup), SetValueToNULL = js.Any.fromFunction1(SetValueToNULL), Unserialize = js.Any.fromFunction2(Unserialize), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypedValue]
  }
}

