package typings.mfiles

import typings.mfiles.MFiles.MFSignaturePromptInfoType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignatureSettings extends StObject {
  
  var AdditionalInfo: String
  
  def Clone(): ISignatureSettings
  
  var FreeFormTextPropertyID: Double
  
  var IsFreeFormTextPrompted: Boolean
  
  var IsRequired: Boolean
  
  var IsSeparateSignatureObject: Boolean
  
  var ManifestationPropertyID: Double
  
  val PromptInfoType: MFSignaturePromptInfoType
  
  var SignatureIdentifier: String
  
  var SignaturePromptInfoFixed: ISignaturePromptInfo
  
  var SignaturePromptInfoMetadataBased: ISignaturePromptInfoMetadataBased
  
  var SignaturePromptInfoSelectable: ISignaturePromptInfoSelectable
}
object ISignatureSettings {
  
  inline def apply(
    AdditionalInfo: String,
    Clone: () => ISignatureSettings,
    FreeFormTextPropertyID: Double,
    IsFreeFormTextPrompted: Boolean,
    IsRequired: Boolean,
    IsSeparateSignatureObject: Boolean,
    ManifestationPropertyID: Double,
    PromptInfoType: MFSignaturePromptInfoType,
    SignatureIdentifier: String,
    SignaturePromptInfoFixed: ISignaturePromptInfo,
    SignaturePromptInfoMetadataBased: ISignaturePromptInfoMetadataBased,
    SignaturePromptInfoSelectable: ISignaturePromptInfoSelectable
  ): ISignatureSettings = {
    val __obj = js.Dynamic.literal(AdditionalInfo = AdditionalInfo.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), FreeFormTextPropertyID = FreeFormTextPropertyID.asInstanceOf[js.Any], IsFreeFormTextPrompted = IsFreeFormTextPrompted.asInstanceOf[js.Any], IsRequired = IsRequired.asInstanceOf[js.Any], IsSeparateSignatureObject = IsSeparateSignatureObject.asInstanceOf[js.Any], ManifestationPropertyID = ManifestationPropertyID.asInstanceOf[js.Any], PromptInfoType = PromptInfoType.asInstanceOf[js.Any], SignatureIdentifier = SignatureIdentifier.asInstanceOf[js.Any], SignaturePromptInfoFixed = SignaturePromptInfoFixed.asInstanceOf[js.Any], SignaturePromptInfoMetadataBased = SignaturePromptInfoMetadataBased.asInstanceOf[js.Any], SignaturePromptInfoSelectable = SignaturePromptInfoSelectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignatureSettings]
  }
  
  extension [Self <: ISignatureSettings](x: Self) {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "AdditionalInfo", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => ISignatureSettings): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setFreeFormTextPropertyID(value: Double): Self = StObject.set(x, "FreeFormTextPropertyID", value.asInstanceOf[js.Any])
    
    inline def setIsFreeFormTextPrompted(value: Boolean): Self = StObject.set(x, "IsFreeFormTextPrompted", value.asInstanceOf[js.Any])
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "IsRequired", value.asInstanceOf[js.Any])
    
    inline def setIsSeparateSignatureObject(value: Boolean): Self = StObject.set(x, "IsSeparateSignatureObject", value.asInstanceOf[js.Any])
    
    inline def setManifestationPropertyID(value: Double): Self = StObject.set(x, "ManifestationPropertyID", value.asInstanceOf[js.Any])
    
    inline def setPromptInfoType(value: MFSignaturePromptInfoType): Self = StObject.set(x, "PromptInfoType", value.asInstanceOf[js.Any])
    
    inline def setSignatureIdentifier(value: String): Self = StObject.set(x, "SignatureIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSignaturePromptInfoFixed(value: ISignaturePromptInfo): Self = StObject.set(x, "SignaturePromptInfoFixed", value.asInstanceOf[js.Any])
    
    inline def setSignaturePromptInfoMetadataBased(value: ISignaturePromptInfoMetadataBased): Self = StObject.set(x, "SignaturePromptInfoMetadataBased", value.asInstanceOf[js.Any])
    
    inline def setSignaturePromptInfoSelectable(value: ISignaturePromptInfoSelectable): Self = StObject.set(x, "SignaturePromptInfoSelectable", value.asInstanceOf[js.Any])
  }
}
