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
    Clone: js.Function0[IDefaultProperty],
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
    SetFixedValue: js.Function1[ITypedValue, scala.Unit],
    SetFromEmail: js.Function3[mfilesLib.MFilesNs.MFEmailField, scala.Boolean, scala.Boolean, scala.Unit],
    SetFromEmailHeader: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    SetFromHPDSSXML: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    SetFromOCR: js.Function3[IOCRZone, scala.Boolean, scala.Boolean, scala.Unit],
    SetFromXML: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    Type: mfilesLib.MFilesNs.MFDefaultPropertyType
  ): IDefaultProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("DataFixedValueValue")(DataFixedValueValue)
    __obj.updateDynamic("DataFromEmailAddVLItemIfNotFound")(DataFromEmailAddVLItemIfNotFound)
    __obj.updateDynamic("DataFromEmailField")(DataFromEmailField)
    __obj.updateDynamic("DataFromEmailHeaderAddVLItemIfNotFound")(DataFromEmailHeaderAddVLItemIfNotFound)
    __obj.updateDynamic("DataFromEmailHeaderField")(DataFromEmailHeaderField)
    __obj.updateDynamic("DataFromEmailHeaderTreatLookupAsID")(DataFromEmailHeaderTreatLookupAsID)
    __obj.updateDynamic("DataFromEmailTreatLookupAsID")(DataFromEmailTreatLookupAsID)
    __obj.updateDynamic("DataFromHPDSSXMLAddVLItemIfNotFound")(DataFromHPDSSXMLAddVLItemIfNotFound)
    __obj.updateDynamic("DataFromHPDSSXMLPromptName")(DataFromHPDSSXMLPromptName)
    __obj.updateDynamic("DataFromHPDSSXMLTreatLookupAsID")(DataFromHPDSSXMLTreatLookupAsID)
    __obj.updateDynamic("DataFromOCRAddVLItemIfNotFound")(DataFromOCRAddVLItemIfNotFound)
    __obj.updateDynamic("DataFromOCRTreatLookupAsID")(DataFromOCRTreatLookupAsID)
    __obj.updateDynamic("DataFromOCRZone")(DataFromOCRZone)
    __obj.updateDynamic("DataFromXMLAddVLItemIfNotFound")(DataFromXMLAddVLItemIfNotFound)
    __obj.updateDynamic("DataFromXMLTreatLookupAsID")(DataFromXMLTreatLookupAsID)
    __obj.updateDynamic("DataFromXMLXPathExpression")(DataFromXMLXPathExpression)
    __obj.updateDynamic("PropertyDefID")(PropertyDefID.asInstanceOf[js.Any])
    __obj.updateDynamic("SetFixedValue")(SetFixedValue)
    __obj.updateDynamic("SetFromEmail")(SetFromEmail)
    __obj.updateDynamic("SetFromEmailHeader")(SetFromEmailHeader)
    __obj.updateDynamic("SetFromHPDSSXML")(SetFromHPDSSXML)
    __obj.updateDynamic("SetFromOCR")(SetFromOCR)
    __obj.updateDynamic("SetFromXML")(SetFromXML)
    __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[IDefaultProperty]
  }
}

