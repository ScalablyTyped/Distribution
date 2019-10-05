package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IDefaultProperty
import typings.mfiles.IOCRZone
import typings.mfiles.ITypedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.DefaultProperty")
@js.native
class DefaultProperty () extends IDefaultProperty {
  /* CompleteClass */
  override var DataFixedValueValue: ITypedValue = js.native
  /* CompleteClass */
  override var DataFromEmailAddVLItemIfNotFound: Boolean = js.native
  /* CompleteClass */
  override var DataFromEmailField: MFEmailField = js.native
  /* CompleteClass */
  override var DataFromEmailHeaderAddVLItemIfNotFound: Boolean = js.native
  /* CompleteClass */
  override var DataFromEmailHeaderField: String = js.native
  /* CompleteClass */
  override var DataFromEmailHeaderTreatLookupAsID: Boolean = js.native
  /* CompleteClass */
  override var DataFromEmailTreatLookupAsID: Boolean = js.native
  /* CompleteClass */
  override var DataFromHPDSSXMLAddVLItemIfNotFound: Boolean = js.native
  /* CompleteClass */
  override var DataFromHPDSSXMLPromptName: String = js.native
  /* CompleteClass */
  override var DataFromHPDSSXMLTreatLookupAsID: Boolean = js.native
  /* CompleteClass */
  override var DataFromOCRAddVLItemIfNotFound: Boolean = js.native
  /* CompleteClass */
  override var DataFromOCRTreatLookupAsID: Boolean = js.native
  /* CompleteClass */
  override var DataFromOCRZone: IOCRZone = js.native
  /* CompleteClass */
  override var DataFromXMLAddVLItemIfNotFound: Boolean = js.native
  /* CompleteClass */
  override var DataFromXMLTreatLookupAsID: Boolean = js.native
  /* CompleteClass */
  override var DataFromXMLXPathExpression: String = js.native
  /* CompleteClass */
  override var PropertyDefID: MFBuiltInPropertyDef | Double = js.native
  /* CompleteClass */
  override val Type: MFDefaultPropertyType = js.native
  /* CompleteClass */
  override def Clone(): IDefaultProperty = js.native
  /* CompleteClass */
  override def SetFixedValue(TypedValue: ITypedValue): Unit = js.native
  /* CompleteClass */
  override def SetFromEmail(EmailField: MFEmailField, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
  /* CompleteClass */
  override def SetFromEmailHeader(Field: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
  /* CompleteClass */
  override def SetFromHPDSSXML(PromptName: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
  /* CompleteClass */
  override def SetFromOCR(OCRZone: IOCRZone, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
  /* CompleteClass */
  override def SetFromXML(XPathExpression: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
}

@JSGlobal("MFiles.DefaultProperty")
@js.native
object DefaultProperty extends Instantiable0[IDefaultProperty]

