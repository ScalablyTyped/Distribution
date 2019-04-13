package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.TypedValue")
@js.native
class TypedValue ()
  extends mfilesLib.ITypedValue {
  /* CompleteClass */
  override val DataType: MFDataType = js.native
  /* CompleteClass */
  override val DisplayValue: java.lang.String = js.native
  /* CompleteClass */
  override var Value: js.Any = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ITypedValue = js.native
  /* CompleteClass */
  override def CloneFrom(TypedValue: mfilesLib.ITypedValue): scala.Unit = js.native
  /* CompleteClass */
  override def CompareTo(TypedValue: mfilesLib.ITypedValue): scala.Double = js.native
  /* CompleteClass */
  override def GetLookupID(): scala.Double = js.native
  /* CompleteClass */
  override def GetValueAsLocalizedText(): java.lang.String = js.native
  /* CompleteClass */
  override def GetValueAsLookup(): mfilesLib.ILookup = js.native
  /* CompleteClass */
  override def GetValueAsLookups(): mfilesLib.ILookups = js.native
  /* CompleteClass */
  override def GetValueAsText(
    Localized: scala.Boolean,
    NULLAsEmptyString: scala.Boolean,
    EmptyLookupDisplayValuesAsHidden: scala.Boolean,
    LongDateFormat: scala.Boolean,
    NoSeconds: scala.Boolean,
    NumericValueAsKilobytes: scala.Boolean
  ): java.lang.String = js.native
  /* CompleteClass */
  override def GetValueAsTextWithExpression(Expression: mfilesLib.IExpression, Locale: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def GetValueAsTimestamp(): mfilesLib.ITimestamp = js.native
  /* CompleteClass */
  override def GetValueAsUnlocalizedText(): java.lang.String = js.native
  /* CompleteClass */
  override def IsNULL(): scala.Boolean = js.native
  /* CompleteClass */
  override def IsUninitialized(): scala.Boolean = js.native
  /* CompleteClass */
  override def Serialize(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def SetValue(DataType: MFDataType, Value: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def SetValueToLookup(Lookup: mfilesLib.ILookup): scala.Unit = js.native
  /* CompleteClass */
  override def SetValueToMultiSelectLookup(MultiSelectLookup: mfilesLib.ILookups): scala.Unit = js.native
  /* CompleteClass */
  override def SetValueToNULL(DataType: MFDataType): scala.Unit = js.native
  /* CompleteClass */
  override def Unserialize(Bytes: js.Array[scala.Double], ReadFromOldSerializingFormat: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("MFiles.TypedValue")
@js.native
object TypedValue
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.ITypedValue]

