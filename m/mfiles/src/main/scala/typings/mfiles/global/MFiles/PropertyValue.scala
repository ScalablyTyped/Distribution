package typings.mfiles.global.MFiles

import typings.mfiles.IPropertyValue
import typings.mfiles.ITypedValue
import typings.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.PropertyValue")
@js.native
open class PropertyValue ()
  extends StObject
     with IPropertyValue {
  
  /* CompleteClass */
  override def Clone(): IPropertyValue = js.native
  
  /* CompleteClass */
  override def CloneFrom(PropertyValue: IPropertyValue): Unit = js.native
  
  /* CompleteClass */
  override def GetValueAsLocalizedText(): String = js.native
  
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
  override def GetValueAsUnlocalizedText(): String = js.native
  
  /* CompleteClass */
  var PropertyDef: MFBuiltInPropertyDef | Double = js.native
  
  /* CompleteClass */
  var TypedValue: ITypedValue = js.native
  
  /* CompleteClass */
  var Value: ITypedValue = js.native
}
