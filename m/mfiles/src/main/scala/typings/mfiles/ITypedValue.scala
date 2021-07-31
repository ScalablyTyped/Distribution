package typings.mfiles

import typings.mfiles.MFiles.MFDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITypedValue extends StObject {
  
  def Clone(): ITypedValue
  
  def CloneFrom(TypedValue: ITypedValue): Unit
  
  def CompareTo(TypedValue: ITypedValue): Double
  
  val DataType: MFDataType
  
  val DisplayValue: String
  
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
  
  var Value: js.Any
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
  implicit class ITypedValueMutableBuilder[Self <: ITypedValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => ITypedValue): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: ITypedValue => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompareTo(value: ITypedValue => Double): Self = StObject.set(x, "CompareTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataType(value: MFDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValue(value: String): Self = StObject.set(x, "DisplayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLookupID(value: () => Double): Self = StObject.set(x, "GetLookupID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueAsLocalizedText(value: () => String): Self = StObject.set(x, "GetValueAsLocalizedText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueAsLookup(value: () => ILookup): Self = StObject.set(x, "GetValueAsLookup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueAsLookups(value: () => ILookups): Self = StObject.set(x, "GetValueAsLookups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueAsText(value: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String): Self = StObject.set(x, "GetValueAsText", js.Any.fromFunction6(value))
    
    @scala.inline
    def setGetValueAsTextWithExpression(value: (IExpression, Double) => String): Self = StObject.set(x, "GetValueAsTextWithExpression", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetValueAsTimestamp(value: () => ITimestamp): Self = StObject.set(x, "GetValueAsTimestamp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueAsUnlocalizedText(value: () => String): Self = StObject.set(x, "GetValueAsUnlocalizedText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNULL(value: () => Boolean): Self = StObject.set(x, "IsNULL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUninitialized(value: () => Boolean): Self = StObject.set(x, "IsUninitialized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSerialize(value: () => js.Array[Double]): Self = StObject.set(x, "Serialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValue(value: (MFDataType, js.Any) => Unit): Self = StObject.set(x, "SetValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValueToLookup(value: ILookup => Unit): Self = StObject.set(x, "SetValueToLookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueToMultiSelectLookup(value: ILookups => Unit): Self = StObject.set(x, "SetValueToMultiSelectLookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueToNULL(value: MFDataType => Unit): Self = StObject.set(x, "SetValueToNULL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnserialize(value: (js.Array[Double], Boolean) => Unit): Self = StObject.set(x, "Unserialize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
