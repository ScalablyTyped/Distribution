package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IPropertyValue
import typings.mfiles.ITypedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.PropertyValue")
@js.native
class PropertyValue () extends IPropertyValue {
  /* CompleteClass */
  override var PropertyDef: MFBuiltInPropertyDef | Double = js.native
  /* CompleteClass */
  override var TypedValue: ITypedValue = js.native
  /* CompleteClass */
  override var Value: ITypedValue = js.native
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
}

@JSGlobal("MFiles.PropertyValue")
@js.native
object PropertyValue extends Instantiable0[IPropertyValue]

