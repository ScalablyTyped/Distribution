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

