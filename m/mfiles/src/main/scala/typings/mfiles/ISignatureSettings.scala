package typings.mfiles

import typings.mfiles.MFiles.MFSignaturePromptInfoType
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
    val __obj = js.Dynamic.literal(AdditionalInfo = AdditionalInfo.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), FreeFormTextPropertyID = FreeFormTextPropertyID.asInstanceOf[js.Any], IsFreeFormTextPrompted = IsFreeFormTextPrompted.asInstanceOf[js.Any], IsRequired = IsRequired.asInstanceOf[js.Any], IsSeparateSignatureObject = IsSeparateSignatureObject.asInstanceOf[js.Any], ManifestationPropertyID = ManifestationPropertyID.asInstanceOf[js.Any], PromptInfoType = PromptInfoType.asInstanceOf[js.Any], SignatureIdentifier = SignatureIdentifier.asInstanceOf[js.Any], SignaturePromptInfoFixed = SignaturePromptInfoFixed.asInstanceOf[js.Any], SignaturePromptInfoMetadataBased = SignaturePromptInfoMetadataBased.asInstanceOf[js.Any], SignaturePromptInfoSelectable = SignaturePromptInfoSelectable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISignatureSettings]
  }
}

