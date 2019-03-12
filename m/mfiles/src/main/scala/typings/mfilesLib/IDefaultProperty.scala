package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaultProperty extends js.Object {
  var DataFixedValueValue: ITypedValue
  var DataFromEmailAddVLItemIfNotFound: scala.Boolean
  var DataFromEmailField: mfilesLib.MFilesNs.MFEmailField
  var DataFromEmailHeaderAddVLItemIfNotFound: scala.Boolean
  var DataFromEmailHeaderField: java.lang.String
  var DataFromEmailHeaderTreatLookupAsID: scala.Boolean
  var DataFromEmailTreatLookupAsID: scala.Boolean
  var DataFromHPDSSXMLAddVLItemIfNotFound: scala.Boolean
  var DataFromHPDSSXMLPromptName: java.lang.String
  var DataFromHPDSSXMLTreatLookupAsID: scala.Boolean
  var DataFromOCRAddVLItemIfNotFound: scala.Boolean
  var DataFromOCRTreatLookupAsID: scala.Boolean
  var DataFromOCRZone: IOCRZone
  var DataFromXMLAddVLItemIfNotFound: scala.Boolean
  var DataFromXMLTreatLookupAsID: scala.Boolean
  var DataFromXMLXPathExpression: java.lang.String
  var PropertyDefID: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double
  val Type: mfilesLib.MFilesNs.MFDefaultPropertyType
  def Clone(): IDefaultProperty
  def SetFixedValue(TypedValue: ITypedValue): scala.Unit
  def SetFromEmail(
    EmailField: mfilesLib.MFilesNs.MFEmailField,
    TreatLookupAsID: scala.Boolean,
    AddVLItemIfNotFound: scala.Boolean
  ): scala.Unit
  def SetFromEmailHeader(Field: java.lang.String, TreatLookupAsID: scala.Boolean, AddVLItemIfNotFound: scala.Boolean): scala.Unit
  def SetFromHPDSSXML(PromptName: java.lang.String, TreatLookupAsID: scala.Boolean, AddVLItemIfNotFound: scala.Boolean): scala.Unit
  def SetFromOCR(OCRZone: IOCRZone, TreatLookupAsID: scala.Boolean, AddVLItemIfNotFound: scala.Boolean): scala.Unit
  def SetFromXML(
    XPathExpression: java.lang.String,
    TreatLookupAsID: scala.Boolean,
    AddVLItemIfNotFound: scala.Boolean
  ): scala.Unit
}

object IDefaultProperty {
  @scala.inline
  def apply(
    Clone: () => IDefaultProperty,
    DataFixedValueValue: ITypedValue,
    DataFromEmailAddVLItemIfNotFound: scala.Boolean,
    DataFromEmailField: mfilesLib.MFilesNs.MFEmailField,
    DataFromEmailHeaderAddVLItemIfNotFound: scala.Boolean,
    DataFromEmailHeaderField: java.lang.String,
    DataFromEmailHeaderTreatLookupAsID: scala.Boolean,
    DataFromEmailTreatLookupAsID: scala.Boolean,
    DataFromHPDSSXMLAddVLItemIfNotFound: scala.Boolean,
    DataFromHPDSSXMLPromptName: java.lang.String,
    DataFromHPDSSXMLTreatLookupAsID: scala.Boolean,
    DataFromOCRAddVLItemIfNotFound: scala.Boolean,
    DataFromOCRTreatLookupAsID: scala.Boolean,
    DataFromOCRZone: IOCRZone,
    DataFromXMLAddVLItemIfNotFound: scala.Boolean,
    DataFromXMLTreatLookupAsID: scala.Boolean,
    DataFromXMLXPathExpression: java.lang.String,
    PropertyDefID: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double,
    SetFixedValue: ITypedValue => scala.Unit,
    SetFromEmail: (mfilesLib.MFilesNs.MFEmailField, scala.Boolean, scala.Boolean) => scala.Unit,
    SetFromEmailHeader: (java.lang.String, scala.Boolean, scala.Boolean) => scala.Unit,
    SetFromHPDSSXML: (java.lang.String, scala.Boolean, scala.Boolean) => scala.Unit,
    SetFromOCR: (IOCRZone, scala.Boolean, scala.Boolean) => scala.Unit,
    SetFromXML: (java.lang.String, scala.Boolean, scala.Boolean) => scala.Unit,
    Type: mfilesLib.MFilesNs.MFDefaultPropertyType
  ): IDefaultProperty = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DataFixedValueValue = DataFixedValueValue, DataFromEmailAddVLItemIfNotFound = DataFromEmailAddVLItemIfNotFound, DataFromEmailField = DataFromEmailField, DataFromEmailHeaderAddVLItemIfNotFound = DataFromEmailHeaderAddVLItemIfNotFound, DataFromEmailHeaderField = DataFromEmailHeaderField, DataFromEmailHeaderTreatLookupAsID = DataFromEmailHeaderTreatLookupAsID, DataFromEmailTreatLookupAsID = DataFromEmailTreatLookupAsID, DataFromHPDSSXMLAddVLItemIfNotFound = DataFromHPDSSXMLAddVLItemIfNotFound, DataFromHPDSSXMLPromptName = DataFromHPDSSXMLPromptName, DataFromHPDSSXMLTreatLookupAsID = DataFromHPDSSXMLTreatLookupAsID, DataFromOCRAddVLItemIfNotFound = DataFromOCRAddVLItemIfNotFound, DataFromOCRTreatLookupAsID = DataFromOCRTreatLookupAsID, DataFromOCRZone = DataFromOCRZone, DataFromXMLAddVLItemIfNotFound = DataFromXMLAddVLItemIfNotFound, DataFromXMLTreatLookupAsID = DataFromXMLTreatLookupAsID, DataFromXMLXPathExpression = DataFromXMLXPathExpression, PropertyDefID = PropertyDefID.asInstanceOf[js.Any], SetFixedValue = js.Any.fromFunction1(SetFixedValue), SetFromEmail = js.Any.fromFunction3(SetFromEmail), SetFromEmailHeader = js.Any.fromFunction3(SetFromEmailHeader), SetFromHPDSSXML = js.Any.fromFunction3(SetFromHPDSSXML), SetFromOCR = js.Any.fromFunction3(SetFromOCR), SetFromXML = js.Any.fromFunction3(SetFromXML), Type = Type)
  
    __obj.asInstanceOf[IDefaultProperty]
  }
}

