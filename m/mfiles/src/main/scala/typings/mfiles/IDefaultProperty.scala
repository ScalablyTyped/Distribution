package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFDefaultPropertyType
import typings.mfiles.MFiles.MFEmailField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaultProperty extends js.Object {
  var DataFixedValueValue: ITypedValue
  var DataFromEmailAddVLItemIfNotFound: Boolean
  var DataFromEmailField: MFEmailField
  var DataFromEmailHeaderAddVLItemIfNotFound: Boolean
  var DataFromEmailHeaderField: String
  var DataFromEmailHeaderTreatLookupAsID: Boolean
  var DataFromEmailTreatLookupAsID: Boolean
  var DataFromHPDSSXMLAddVLItemIfNotFound: Boolean
  var DataFromHPDSSXMLPromptName: String
  var DataFromHPDSSXMLTreatLookupAsID: Boolean
  var DataFromOCRAddVLItemIfNotFound: Boolean
  var DataFromOCRTreatLookupAsID: Boolean
  var DataFromOCRZone: IOCRZone
  var DataFromXMLAddVLItemIfNotFound: Boolean
  var DataFromXMLTreatLookupAsID: Boolean
  var DataFromXMLXPathExpression: String
  var PropertyDefID: MFBuiltInPropertyDef | Double
  val Type: MFDefaultPropertyType
  def Clone(): IDefaultProperty
  def SetFixedValue(TypedValue: ITypedValue): Unit
  def SetFromEmail(EmailField: MFEmailField, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  def SetFromEmailHeader(Field: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  def SetFromHPDSSXML(PromptName: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  def SetFromOCR(OCRZone: IOCRZone, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  def SetFromXML(XPathExpression: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
}

object IDefaultProperty {
  @scala.inline
  def apply(
    Clone: () => IDefaultProperty,
    DataFixedValueValue: ITypedValue,
    DataFromEmailAddVLItemIfNotFound: Boolean,
    DataFromEmailField: MFEmailField,
    DataFromEmailHeaderAddVLItemIfNotFound: Boolean,
    DataFromEmailHeaderField: String,
    DataFromEmailHeaderTreatLookupAsID: Boolean,
    DataFromEmailTreatLookupAsID: Boolean,
    DataFromHPDSSXMLAddVLItemIfNotFound: Boolean,
    DataFromHPDSSXMLPromptName: String,
    DataFromHPDSSXMLTreatLookupAsID: Boolean,
    DataFromOCRAddVLItemIfNotFound: Boolean,
    DataFromOCRTreatLookupAsID: Boolean,
    DataFromOCRZone: IOCRZone,
    DataFromXMLAddVLItemIfNotFound: Boolean,
    DataFromXMLTreatLookupAsID: Boolean,
    DataFromXMLXPathExpression: String,
    PropertyDefID: MFBuiltInPropertyDef | Double,
    SetFixedValue: ITypedValue => Unit,
    SetFromEmail: (MFEmailField, Boolean, Boolean) => Unit,
    SetFromEmailHeader: (String, Boolean, Boolean) => Unit,
    SetFromHPDSSXML: (String, Boolean, Boolean) => Unit,
    SetFromOCR: (IOCRZone, Boolean, Boolean) => Unit,
    SetFromXML: (String, Boolean, Boolean) => Unit,
    Type: MFDefaultPropertyType
  ): IDefaultProperty = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DataFixedValueValue = DataFixedValueValue, DataFromEmailAddVLItemIfNotFound = DataFromEmailAddVLItemIfNotFound, DataFromEmailField = DataFromEmailField, DataFromEmailHeaderAddVLItemIfNotFound = DataFromEmailHeaderAddVLItemIfNotFound, DataFromEmailHeaderField = DataFromEmailHeaderField, DataFromEmailHeaderTreatLookupAsID = DataFromEmailHeaderTreatLookupAsID, DataFromEmailTreatLookupAsID = DataFromEmailTreatLookupAsID, DataFromHPDSSXMLAddVLItemIfNotFound = DataFromHPDSSXMLAddVLItemIfNotFound, DataFromHPDSSXMLPromptName = DataFromHPDSSXMLPromptName, DataFromHPDSSXMLTreatLookupAsID = DataFromHPDSSXMLTreatLookupAsID, DataFromOCRAddVLItemIfNotFound = DataFromOCRAddVLItemIfNotFound, DataFromOCRTreatLookupAsID = DataFromOCRTreatLookupAsID, DataFromOCRZone = DataFromOCRZone, DataFromXMLAddVLItemIfNotFound = DataFromXMLAddVLItemIfNotFound, DataFromXMLTreatLookupAsID = DataFromXMLTreatLookupAsID, DataFromXMLXPathExpression = DataFromXMLXPathExpression, PropertyDefID = PropertyDefID.asInstanceOf[js.Any], SetFixedValue = js.Any.fromFunction1(SetFixedValue), SetFromEmail = js.Any.fromFunction3(SetFromEmail), SetFromEmailHeader = js.Any.fromFunction3(SetFromEmailHeader), SetFromHPDSSXML = js.Any.fromFunction3(SetFromHPDSSXML), SetFromOCR = js.Any.fromFunction3(SetFromOCR), SetFromXML = js.Any.fromFunction3(SetFromXML), Type = Type)
  
    __obj.asInstanceOf[IDefaultProperty]
  }
}

