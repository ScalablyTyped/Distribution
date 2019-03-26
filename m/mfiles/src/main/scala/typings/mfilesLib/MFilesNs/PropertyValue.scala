package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.PropertyValue")
@js.native
class PropertyValue ()
  extends mfilesLib.IPropertyValue {
  /* CompleteClass */
  override var PropertyDef: MFBuiltInPropertyDef | scala.Double = js.native
  /* CompleteClass */
  override var TypedValue: mfilesLib.ITypedValue = js.native
  /* CompleteClass */
  override var Value: mfilesLib.ITypedValue = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IPropertyValue = js.native
  /* CompleteClass */
  override def CloneFrom(PropertyValue: mfilesLib.IPropertyValue): scala.Unit = js.native
  /* CompleteClass */
  override def GetValueAsLocalizedText(): java.lang.String = js.native
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
  override def GetValueAsUnlocalizedText(): java.lang.String = js.native
}

