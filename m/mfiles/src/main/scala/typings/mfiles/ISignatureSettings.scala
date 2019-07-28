package typings.mfiles

import typings.mfiles.MFilesNs.MFSignaturePromptInfoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignatureSettings extends js.Object {
  var AdditionalInfo: String
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
  def Clone(): ISignatureSettings
}

object ISignatureSettings {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(AdditionalInfo = AdditionalInfo, Clone = js.Any.fromFunction0(Clone), FreeFormTextPropertyID = FreeFormTextPropertyID, IsFreeFormTextPrompted = IsFreeFormTextPrompted, IsRequired = IsRequired, IsSeparateSignatureObject = IsSeparateSignatureObject, ManifestationPropertyID = ManifestationPropertyID, PromptInfoType = PromptInfoType, SignatureIdentifier = SignatureIdentifier, SignaturePromptInfoFixed = SignaturePromptInfoFixed, SignaturePromptInfoMetadataBased = SignaturePromptInfoMetadataBased, SignaturePromptInfoSelectable = SignaturePromptInfoSelectable)
  
    __obj.asInstanceOf[ISignatureSettings]
  }
}

