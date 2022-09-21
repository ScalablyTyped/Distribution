package typings.mfiles.global.MFiles

import typings.mfiles.IDefaultProperty
import typings.mfiles.IOCRZone
import typings.mfiles.ITypedValue
import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFDefaultPropertyType
import typings.mfiles.MFiles.MFEmailField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.DefaultProperty")
@js.native
open class DefaultProperty ()
  extends StObject
     with IDefaultProperty {
  
  /* CompleteClass */
  override def Clone(): IDefaultProperty = js.native
  
  /* CompleteClass */
  var DataFixedValueValue: ITypedValue = js.native
  
  /* CompleteClass */
  var DataFromEmailAddVLItemIfNotFound: Boolean = js.native
  
  /* CompleteClass */
  var DataFromEmailField: MFEmailField = js.native
  
  /* CompleteClass */
  var DataFromEmailHeaderAddVLItemIfNotFound: Boolean = js.native
  
  /* CompleteClass */
  var DataFromEmailHeaderField: String = js.native
  
  /* CompleteClass */
  var DataFromEmailHeaderTreatLookupAsID: Boolean = js.native
  
  /* CompleteClass */
  var DataFromEmailTreatLookupAsID: Boolean = js.native
  
  /* CompleteClass */
  var DataFromHPDSSXMLAddVLItemIfNotFound: Boolean = js.native
  
  /* CompleteClass */
  var DataFromHPDSSXMLPromptName: String = js.native
  
  /* CompleteClass */
  var DataFromHPDSSXMLTreatLookupAsID: Boolean = js.native
  
  /* CompleteClass */
  var DataFromOCRAddVLItemIfNotFound: Boolean = js.native
  
  /* CompleteClass */
  var DataFromOCRTreatLookupAsID: Boolean = js.native
  
  /* CompleteClass */
  var DataFromOCRZone: IOCRZone = js.native
  
  /* CompleteClass */
  var DataFromXMLAddVLItemIfNotFound: Boolean = js.native
  
  /* CompleteClass */
  var DataFromXMLTreatLookupAsID: Boolean = js.native
  
  /* CompleteClass */
  var DataFromXMLXPathExpression: String = js.native
  
  /* CompleteClass */
  var PropertyDefID: MFBuiltInPropertyDef | Double = js.native
  
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
  
  /* CompleteClass */
  override val Type: MFDefaultPropertyType = js.native
}
