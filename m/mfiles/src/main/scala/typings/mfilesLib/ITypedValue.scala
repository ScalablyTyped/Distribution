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
    Clone: js.Function0[ITypedValue],
    CloneFrom: js.Function1[ITypedValue, scala.Unit],
    CompareTo: js.Function1[ITypedValue, scala.Double],
    DataType: mfilesLib.MFilesNs.MFDataType,
    DisplayValue: java.lang.String,
    GetLookupID: js.Function0[scala.Double],
    GetValueAsLocalizedText: js.Function0[java.lang.String],
    GetValueAsLookup: js.Function0[ILookup],
    GetValueAsLookups: js.Function0[ILookups],
    GetValueAsText: js.Function6[
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      java.lang.String
    ],
    GetValueAsTextWithExpression: js.Function2[IExpression, scala.Double, java.lang.String],
    GetValueAsTimestamp: js.Function0[ITimestamp],
    GetValueAsUnlocalizedText: js.Function0[java.lang.String],
    IsNULL: js.Function0[scala.Boolean],
    IsUninitialized: js.Function0[scala.Boolean],
    Serialize: js.Function0[js.Array[scala.Double]],
    SetValue: js.Function2[mfilesLib.MFilesNs.MFDataType, js.Any, scala.Unit],
    SetValueToLookup: js.Function1[ILookup, scala.Unit],
    SetValueToMultiSelectLookup: js.Function1[ILookups, scala.Unit],
    SetValueToNULL: js.Function1[mfilesLib.MFilesNs.MFDataType, scala.Unit],
    Unserialize: js.Function2[js.Array[scala.Double], scala.Boolean, scala.Unit],
    Value: js.Any
  ): ITypedValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("CloneFrom")(CloneFrom)
    __obj.updateDynamic("CompareTo")(CompareTo)
    __obj.updateDynamic("DataType")(DataType)
    __obj.updateDynamic("DisplayValue")(DisplayValue)
    __obj.updateDynamic("GetLookupID")(GetLookupID)
    __obj.updateDynamic("GetValueAsLocalizedText")(GetValueAsLocalizedText)
    __obj.updateDynamic("GetValueAsLookup")(GetValueAsLookup)
    __obj.updateDynamic("GetValueAsLookups")(GetValueAsLookups)
    __obj.updateDynamic("GetValueAsText")(GetValueAsText)
    __obj.updateDynamic("GetValueAsTextWithExpression")(GetValueAsTextWithExpression)
    __obj.updateDynamic("GetValueAsTimestamp")(GetValueAsTimestamp)
    __obj.updateDynamic("GetValueAsUnlocalizedText")(GetValueAsUnlocalizedText)
    __obj.updateDynamic("IsNULL")(IsNULL)
    __obj.updateDynamic("IsUninitialized")(IsUninitialized)
    __obj.updateDynamic("Serialize")(Serialize)
    __obj.updateDynamic("SetValue")(SetValue)
    __obj.updateDynamic("SetValueToLookup")(SetValueToLookup)
    __obj.updateDynamic("SetValueToMultiSelectLookup")(SetValueToMultiSelectLookup)
    __obj.updateDynamic("SetValueToNULL")(SetValueToNULL)
    __obj.updateDynamic("Unserialize")(Unserialize)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ITypedValue]
  }
}

