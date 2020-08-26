package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFDefaultPropertyType
import typings.mfiles.MFiles.MFEmailField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDefaultProperty extends js.Object {
  var DataFixedValueValue: ITypedValue = js.native
  var DataFromEmailAddVLItemIfNotFound: Boolean = js.native
  var DataFromEmailField: MFEmailField = js.native
  var DataFromEmailHeaderAddVLItemIfNotFound: Boolean = js.native
  var DataFromEmailHeaderField: String = js.native
  var DataFromEmailHeaderTreatLookupAsID: Boolean = js.native
  var DataFromEmailTreatLookupAsID: Boolean = js.native
  var DataFromHPDSSXMLAddVLItemIfNotFound: Boolean = js.native
  var DataFromHPDSSXMLPromptName: String = js.native
  var DataFromHPDSSXMLTreatLookupAsID: Boolean = js.native
  var DataFromOCRAddVLItemIfNotFound: Boolean = js.native
  var DataFromOCRTreatLookupAsID: Boolean = js.native
  var DataFromOCRZone: IOCRZone = js.native
  var DataFromXMLAddVLItemIfNotFound: Boolean = js.native
  var DataFromXMLTreatLookupAsID: Boolean = js.native
  var DataFromXMLXPathExpression: String = js.native
  var PropertyDefID: MFBuiltInPropertyDef | Double = js.native
  val Type: MFDefaultPropertyType = js.native
  def Clone(): IDefaultProperty = js.native
  def SetFixedValue(TypedValue: ITypedValue): Unit = js.native
  def SetFromEmail(EmailField: MFEmailField, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
  def SetFromEmailHeader(Field: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
  def SetFromHPDSSXML(PromptName: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
  def SetFromOCR(OCRZone: IOCRZone, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
  def SetFromXML(XPathExpression: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DataFixedValueValue = DataFixedValueValue.asInstanceOf[js.Any], DataFromEmailAddVLItemIfNotFound = DataFromEmailAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromEmailField = DataFromEmailField.asInstanceOf[js.Any], DataFromEmailHeaderAddVLItemIfNotFound = DataFromEmailHeaderAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromEmailHeaderField = DataFromEmailHeaderField.asInstanceOf[js.Any], DataFromEmailHeaderTreatLookupAsID = DataFromEmailHeaderTreatLookupAsID.asInstanceOf[js.Any], DataFromEmailTreatLookupAsID = DataFromEmailTreatLookupAsID.asInstanceOf[js.Any], DataFromHPDSSXMLAddVLItemIfNotFound = DataFromHPDSSXMLAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromHPDSSXMLPromptName = DataFromHPDSSXMLPromptName.asInstanceOf[js.Any], DataFromHPDSSXMLTreatLookupAsID = DataFromHPDSSXMLTreatLookupAsID.asInstanceOf[js.Any], DataFromOCRAddVLItemIfNotFound = DataFromOCRAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromOCRTreatLookupAsID = DataFromOCRTreatLookupAsID.asInstanceOf[js.Any], DataFromOCRZone = DataFromOCRZone.asInstanceOf[js.Any], DataFromXMLAddVLItemIfNotFound = DataFromXMLAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromXMLTreatLookupAsID = DataFromXMLTreatLookupAsID.asInstanceOf[js.Any], DataFromXMLXPathExpression = DataFromXMLXPathExpression.asInstanceOf[js.Any], PropertyDefID = PropertyDefID.asInstanceOf[js.Any], SetFixedValue = js.Any.fromFunction1(SetFixedValue), SetFromEmail = js.Any.fromFunction3(SetFromEmail), SetFromEmailHeader = js.Any.fromFunction3(SetFromEmailHeader), SetFromHPDSSXML = js.Any.fromFunction3(SetFromHPDSSXML), SetFromOCR = js.Any.fromFunction3(SetFromOCR), SetFromXML = js.Any.fromFunction3(SetFromXML), Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaultProperty]
  }
  @scala.inline
  implicit class IDefaultPropertyOps[Self <: IDefaultProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: () => IDefaultProperty): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setDataFixedValueValue(value: ITypedValue): Self = this.set("DataFixedValueValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromEmailAddVLItemIfNotFound(value: Boolean): Self = this.set("DataFromEmailAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromEmailField(value: MFEmailField): Self = this.set("DataFromEmailField", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromEmailHeaderAddVLItemIfNotFound(value: Boolean): Self = this.set("DataFromEmailHeaderAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromEmailHeaderField(value: String): Self = this.set("DataFromEmailHeaderField", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromEmailHeaderTreatLookupAsID(value: Boolean): Self = this.set("DataFromEmailHeaderTreatLookupAsID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromEmailTreatLookupAsID(value: Boolean): Self = this.set("DataFromEmailTreatLookupAsID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromHPDSSXMLAddVLItemIfNotFound(value: Boolean): Self = this.set("DataFromHPDSSXMLAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromHPDSSXMLPromptName(value: String): Self = this.set("DataFromHPDSSXMLPromptName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromHPDSSXMLTreatLookupAsID(value: Boolean): Self = this.set("DataFromHPDSSXMLTreatLookupAsID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromOCRAddVLItemIfNotFound(value: Boolean): Self = this.set("DataFromOCRAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromOCRTreatLookupAsID(value: Boolean): Self = this.set("DataFromOCRTreatLookupAsID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromOCRZone(value: IOCRZone): Self = this.set("DataFromOCRZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromXMLAddVLItemIfNotFound(value: Boolean): Self = this.set("DataFromXMLAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromXMLTreatLookupAsID(value: Boolean): Self = this.set("DataFromXMLTreatLookupAsID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFromXMLXPathExpression(value: String): Self = this.set("DataFromXMLXPathExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyDefID(value: MFBuiltInPropertyDef | Double): Self = this.set("PropertyDefID", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetFixedValue(value: ITypedValue => Unit): Self = this.set("SetFixedValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFromEmail(value: (MFEmailField, Boolean, Boolean) => Unit): Self = this.set("SetFromEmail", js.Any.fromFunction3(value))
    @scala.inline
    def setSetFromEmailHeader(value: (String, Boolean, Boolean) => Unit): Self = this.set("SetFromEmailHeader", js.Any.fromFunction3(value))
    @scala.inline
    def setSetFromHPDSSXML(value: (String, Boolean, Boolean) => Unit): Self = this.set("SetFromHPDSSXML", js.Any.fromFunction3(value))
    @scala.inline
    def setSetFromOCR(value: (IOCRZone, Boolean, Boolean) => Unit): Self = this.set("SetFromOCR", js.Any.fromFunction3(value))
    @scala.inline
    def setSetFromXML(value: (String, Boolean, Boolean) => Unit): Self = this.set("SetFromXML", js.Any.fromFunction3(value))
    @scala.inline
    def setType(value: MFDefaultPropertyType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

