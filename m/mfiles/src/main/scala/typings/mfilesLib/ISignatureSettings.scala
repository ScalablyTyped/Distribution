package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignatureSettings extends js.Object {
  var AdditionalInfo: java.lang.String
  var FreeFormTextPropertyID: scala.Double
  var IsFreeFormTextPrompted: scala.Boolean
  var IsRequired: scala.Boolean
  var IsSeparateSignatureObject: scala.Boolean
  var ManifestationPropertyID: scala.Double
  val PromptInfoType: mfilesLib.MFilesNs.MFSignaturePromptInfoType
  var SignatureIdentifier: java.lang.String
  var SignaturePromptInfoFixed: ISignaturePromptInfo
  var SignaturePromptInfoMetadataBased: ISignaturePromptInfoMetadataBased
  var SignaturePromptInfoSelectable: ISignaturePromptInfoSelectable
  def Clone(): ISignatureSettings
}

object ISignatureSettings {
  @scala.inline
  def apply(
    AdditionalInfo: java.lang.String,
    Clone: () => ISignatureSettings,
    FreeFormTextPropertyID: scala.Double,
    IsFreeFormTextPrompted: scala.Boolean,
    IsRequired: scala.Boolean,
    IsSeparateSignatureObject: scala.Boolean,
    ManifestationPropertyID: scala.Double,
    PromptInfoType: mfilesLib.MFilesNs.MFSignaturePromptInfoType,
    SignatureIdentifier: java.lang.String,
    SignaturePromptInfoFixed: ISignaturePromptInfo,
    SignaturePromptInfoMetadataBased: ISignaturePromptInfoMetadataBased,
    SignaturePromptInfoSelectable: ISignaturePromptInfoSelectable
  ): ISignatureSettings = {
    val __obj = js.Dynamic.literal(AdditionalInfo = AdditionalInfo, Clone = js.Any.fromFunction0(Clone), FreeFormTextPropertyID = FreeFormTextPropertyID, IsFreeFormTextPrompted = IsFreeFormTextPrompted, IsRequired = IsRequired, IsSeparateSignatureObject = IsSeparateSignatureObject, ManifestationPropertyID = ManifestationPropertyID, PromptInfoType = PromptInfoType, SignatureIdentifier = SignatureIdentifier, SignaturePromptInfoFixed = SignaturePromptInfoFixed, SignaturePromptInfoMetadataBased = SignaturePromptInfoMetadataBased, SignaturePromptInfoSelectable = SignaturePromptInfoSelectable)
  
    __obj.asInstanceOf[ISignatureSettings]
  }
}

