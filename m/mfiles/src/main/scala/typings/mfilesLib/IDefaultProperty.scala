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

