package typings.mfiles

import typings.mfiles.MFiles.MFDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITypedValue extends js.Object {
  val DataType: MFDataType = js.native
  val DisplayValue: String = js.native
  var Value: js.Any = js.native
  def Clone(): ITypedValue = js.native
  def CloneFrom(TypedValue: ITypedValue): Unit = js.native
  def CompareTo(TypedValue: ITypedValue): Double = js.native
  def GetLookupID(): Double = js.native
  def GetValueAsLocalizedText(): String = js.native
  def GetValueAsLookup(): ILookup = js.native
  def GetValueAsLookups(): ILookups = js.native
  def GetValueAsText(
    Localized: Boolean,
    NULLAsEmptyString: Boolean,
    EmptyLookupDisplayValuesAsHidden: Boolean,
    LongDateFormat: Boolean,
    NoSeconds: Boolean,
    NumericValueAsKilobytes: Boolean
  ): String = js.native
  def GetValueAsTextWithExpression(Expression: IExpression, Locale: Double): String = js.native
  def GetValueAsTimestamp(): ITimestamp = js.native
  def GetValueAsUnlocalizedText(): String = js.native
  def IsNULL(): Boolean = js.native
  def IsUninitialized(): Boolean = js.native
  def Serialize(): js.Array[Double] = js.native
  def SetValue(DataType: MFDataType, Value: js.Any): Unit = js.native
  def SetValueToLookup(Lookup: ILookup): Unit = js.native
  def SetValueToMultiSelectLookup(MultiSelectLookup: ILookups): Unit = js.native
  def SetValueToNULL(DataType: MFDataType): Unit = js.native
  def Unserialize(Bytes: js.Array[Double], ReadFromOldSerializingFormat: Boolean): Unit = js.native
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
  @scala.inline
  implicit class ITypedValueOps[Self <: ITypedValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: () => ITypedValue): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCloneFrom(value: ITypedValue => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    @scala.inline
    def setCompareTo(value: ITypedValue => Double): Self = this.set("CompareTo", js.Any.fromFunction1(value))
    @scala.inline
    def setDataType(value: MFDataType): Self = this.set("DataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayValue(value: String): Self = this.set("DisplayValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLookupID(value: () => Double): Self = this.set("GetLookupID", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValueAsLocalizedText(value: () => String): Self = this.set("GetValueAsLocalizedText", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValueAsLookup(value: () => ILookup): Self = this.set("GetValueAsLookup", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValueAsLookups(value: () => ILookups): Self = this.set("GetValueAsLookups", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValueAsText(value: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String): Self = this.set("GetValueAsText", js.Any.fromFunction6(value))
    @scala.inline
    def setGetValueAsTextWithExpression(value: (IExpression, Double) => String): Self = this.set("GetValueAsTextWithExpression", js.Any.fromFunction2(value))
    @scala.inline
    def setGetValueAsTimestamp(value: () => ITimestamp): Self = this.set("GetValueAsTimestamp", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValueAsUnlocalizedText(value: () => String): Self = this.set("GetValueAsUnlocalizedText", js.Any.fromFunction0(value))
    @scala.inline
    def setIsNULL(value: () => Boolean): Self = this.set("IsNULL", js.Any.fromFunction0(value))
    @scala.inline
    def setIsUninitialized(value: () => Boolean): Self = this.set("IsUninitialized", js.Any.fromFunction0(value))
    @scala.inline
    def setSerialize(value: () => js.Array[Double]): Self = this.set("Serialize", js.Any.fromFunction0(value))
    @scala.inline
    def setSetValue(value: (MFDataType, js.Any) => Unit): Self = this.set("SetValue", js.Any.fromFunction2(value))
    @scala.inline
    def setSetValueToLookup(value: ILookup => Unit): Self = this.set("SetValueToLookup", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValueToMultiSelectLookup(value: ILookups => Unit): Self = this.set("SetValueToMultiSelectLookup", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValueToNULL(value: MFDataType => Unit): Self = this.set("SetValueToNULL", js.Any.fromFunction1(value))
    @scala.inline
    def setUnserialize(value: (js.Array[Double], Boolean) => Unit): Self = this.set("Unserialize", js.Any.fromFunction2(value))
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

