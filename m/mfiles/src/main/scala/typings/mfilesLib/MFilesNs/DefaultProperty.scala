package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.DefaultProperty")
@js.native
class DefaultProperty ()
  extends mfilesLib.IDefaultProperty {
  /* CompleteClass */
  override var DataFixedValueValue: mfilesLib.ITypedValue = js.native
  /* CompleteClass */
  override var DataFromEmailAddVLItemIfNotFound: scala.Boolean = js.native
  /* CompleteClass */
  override var DataFromEmailField: MFEmailField = js.native
  /* CompleteClass */
  override var DataFromEmailHeaderAddVLItemIfNotFound: scala.Boolean = js.native
  /* CompleteClass */
  override var DataFromEmailHeaderField: java.lang.String = js.native
  /* CompleteClass */
  override var DataFromEmailHeaderTreatLookupAsID: scala.Boolean = js.native
  /* CompleteClass */
  override var DataFromEmailTreatLookupAsID: scala.Boolean = js.native
  /* CompleteClass */
  override var DataFromHPDSSXMLAddVLItemIfNotFound: scala.Boolean = js.native
  /* CompleteClass */
  override var DataFromHPDSSXMLPromptName: java.lang.String = js.native
  /* CompleteClass */
  override var DataFromHPDSSXMLTreatLookupAsID: scala.Boolean = js.native
  /* CompleteClass */
  override var DataFromOCRAddVLItemIfNotFound: scala.Boolean = js.native
  /* CompleteClass */
  override var DataFromOCRTreatLookupAsID: scala.Boolean = js.native
  /* CompleteClass */
  override var DataFromOCRZone: mfilesLib.IOCRZone = js.native
  /* CompleteClass */
  override var DataFromXMLAddVLItemIfNotFound: scala.Boolean = js.native
  /* CompleteClass */
  override var DataFromXMLTreatLookupAsID: scala.Boolean = js.native
  /* CompleteClass */
  override var DataFromXMLXPathExpression: java.lang.String = js.native
  /* CompleteClass */
  override var PropertyDefID: MFBuiltInPropertyDef | scala.Double = js.native
  /* CompleteClass */
  override val Type: MFDefaultPropertyType = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IDefaultProperty = js.native
  /* CompleteClass */
  override def SetFixedValue(TypedValue: mfilesLib.ITypedValue): scala.Unit = js.native
  /* CompleteClass */
  override def SetFromEmail(EmailField: MFEmailField, TreatLookupAsID: scala.Boolean, AddVLItemIfNotFound: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def SetFromEmailHeader(Field: java.lang.String, TreatLookupAsID: scala.Boolean, AddVLItemIfNotFound: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def SetFromHPDSSXML(PromptName: java.lang.String, TreatLookupAsID: scala.Boolean, AddVLItemIfNotFound: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def SetFromOCR(OCRZone: mfilesLib.IOCRZone, TreatLookupAsID: scala.Boolean, AddVLItemIfNotFound: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def SetFromXML(
    XPathExpression: java.lang.String,
    TreatLookupAsID: scala.Boolean,
    AddVLItemIfNotFound: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("MFiles.DefaultProperty")
@js.native
object DefaultProperty
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IDefaultProperty]

