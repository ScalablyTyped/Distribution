package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFDefaultPropertyType
import typings.mfiles.MFiles.MFEmailField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDefaultProperty extends StObject {
  
  def Clone(): IDefaultProperty
  
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
  
  def SetFixedValue(TypedValue: ITypedValue): Unit
  
  def SetFromEmail(EmailField: MFEmailField, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  
  def SetFromEmailHeader(Field: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  
  def SetFromHPDSSXML(PromptName: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  
  def SetFromOCR(OCRZone: IOCRZone, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  
  def SetFromXML(XPathExpression: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  
  val Type: MFDefaultPropertyType
}
object IDefaultProperty {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IDefaultProperty] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IDefaultProperty): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setDataFixedValueValue(value: ITypedValue): Self = StObject.set(x, "DataFixedValueValue", value.asInstanceOf[js.Any])
    
    inline def setDataFromEmailAddVLItemIfNotFound(value: Boolean): Self = StObject.set(x, "DataFromEmailAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    
    inline def setDataFromEmailField(value: MFEmailField): Self = StObject.set(x, "DataFromEmailField", value.asInstanceOf[js.Any])
    
    inline def setDataFromEmailHeaderAddVLItemIfNotFound(value: Boolean): Self = StObject.set(x, "DataFromEmailHeaderAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    
    inline def setDataFromEmailHeaderField(value: String): Self = StObject.set(x, "DataFromEmailHeaderField", value.asInstanceOf[js.Any])
    
    inline def setDataFromEmailHeaderTreatLookupAsID(value: Boolean): Self = StObject.set(x, "DataFromEmailHeaderTreatLookupAsID", value.asInstanceOf[js.Any])
    
    inline def setDataFromEmailTreatLookupAsID(value: Boolean): Self = StObject.set(x, "DataFromEmailTreatLookupAsID", value.asInstanceOf[js.Any])
    
    inline def setDataFromHPDSSXMLAddVLItemIfNotFound(value: Boolean): Self = StObject.set(x, "DataFromHPDSSXMLAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    
    inline def setDataFromHPDSSXMLPromptName(value: String): Self = StObject.set(x, "DataFromHPDSSXMLPromptName", value.asInstanceOf[js.Any])
    
    inline def setDataFromHPDSSXMLTreatLookupAsID(value: Boolean): Self = StObject.set(x, "DataFromHPDSSXMLTreatLookupAsID", value.asInstanceOf[js.Any])
    
    inline def setDataFromOCRAddVLItemIfNotFound(value: Boolean): Self = StObject.set(x, "DataFromOCRAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    
    inline def setDataFromOCRTreatLookupAsID(value: Boolean): Self = StObject.set(x, "DataFromOCRTreatLookupAsID", value.asInstanceOf[js.Any])
    
    inline def setDataFromOCRZone(value: IOCRZone): Self = StObject.set(x, "DataFromOCRZone", value.asInstanceOf[js.Any])
    
    inline def setDataFromXMLAddVLItemIfNotFound(value: Boolean): Self = StObject.set(x, "DataFromXMLAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    
    inline def setDataFromXMLTreatLookupAsID(value: Boolean): Self = StObject.set(x, "DataFromXMLTreatLookupAsID", value.asInstanceOf[js.Any])
    
    inline def setDataFromXMLXPathExpression(value: String): Self = StObject.set(x, "DataFromXMLXPathExpression", value.asInstanceOf[js.Any])
    
    inline def setPropertyDefID(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDefID", value.asInstanceOf[js.Any])
    
    inline def setSetFixedValue(value: ITypedValue => Unit): Self = StObject.set(x, "SetFixedValue", js.Any.fromFunction1(value))
    
    inline def setSetFromEmail(value: (MFEmailField, Boolean, Boolean) => Unit): Self = StObject.set(x, "SetFromEmail", js.Any.fromFunction3(value))
    
    inline def setSetFromEmailHeader(value: (String, Boolean, Boolean) => Unit): Self = StObject.set(x, "SetFromEmailHeader", js.Any.fromFunction3(value))
    
    inline def setSetFromHPDSSXML(value: (String, Boolean, Boolean) => Unit): Self = StObject.set(x, "SetFromHPDSSXML", js.Any.fromFunction3(value))
    
    inline def setSetFromOCR(value: (IOCRZone, Boolean, Boolean) => Unit): Self = StObject.set(x, "SetFromOCR", js.Any.fromFunction3(value))
    
    inline def setSetFromXML(value: (String, Boolean, Boolean) => Unit): Self = StObject.set(x, "SetFromXML", js.Any.fromFunction3(value))
    
    inline def setType(value: MFDefaultPropertyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
