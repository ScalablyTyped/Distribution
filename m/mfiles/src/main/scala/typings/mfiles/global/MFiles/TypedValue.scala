package typings.mfiles.global.MFiles

import typings.mfiles.IExpression
import typings.mfiles.ILookup
import typings.mfiles.ILookups
import typings.mfiles.ITimestamp
import typings.mfiles.ITypedValue
import typings.mfiles.MFiles.MFDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.TypedValue")
@js.native
class TypedValue ()
  extends StObject
     with ITypedValue {
  
  /* CompleteClass */
  override def Clone(): ITypedValue = js.native
  
  /* CompleteClass */
  override def CloneFrom(TypedValue: ITypedValue): Unit = js.native
  
  /* CompleteClass */
  override def CompareTo(TypedValue: ITypedValue): Double = js.native
  
  /* CompleteClass */
  override val DataType: MFDataType = js.native
  
  /* CompleteClass */
  override val DisplayValue: String = js.native
  
  /* CompleteClass */
  override def GetLookupID(): Double = js.native
  
  /* CompleteClass */
  override def GetValueAsLocalizedText(): String = js.native
  
  /* CompleteClass */
  override def GetValueAsLookup(): ILookup = js.native
  
  /* CompleteClass */
  override def GetValueAsLookups(): ILookups = js.native
  
  /* CompleteClass */
  override def GetValueAsText(
    Localized: Boolean,
    NULLAsEmptyString: Boolean,
    EmptyLookupDisplayValuesAsHidden: Boolean,
    LongDateFormat: Boolean,
    NoSeconds: Boolean,
    NumericValueAsKilobytes: Boolean
  ): String = js.native
  
  /* CompleteClass */
  override def GetValueAsTextWithExpression(Expression: IExpression, Locale: Double): String = js.native
  
  /* CompleteClass */
  override def GetValueAsTimestamp(): ITimestamp = js.native
  
  /* CompleteClass */
  override def GetValueAsUnlocalizedText(): String = js.native
  
  /* CompleteClass */
  override def IsNULL(): Boolean = js.native
  
  /* CompleteClass */
  override def IsUninitialized(): Boolean = js.native
  
  /* CompleteClass */
  override def Serialize(): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def SetValue(DataType: MFDataType, Value: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def SetValueToLookup(Lookup: ILookup): Unit = js.native
  
  /* CompleteClass */
  override def SetValueToMultiSelectLookup(MultiSelectLookup: ILookups): Unit = js.native
  
  /* CompleteClass */
  override def SetValueToNULL(DataType: MFDataType): Unit = js.native
  
  /* CompleteClass */
  override def Unserialize(Bytes: js.Array[Double], ReadFromOldSerializingFormat: Boolean): Unit = js.native
  
  /* CompleteClass */
  var Value: js.Any = js.native
}
