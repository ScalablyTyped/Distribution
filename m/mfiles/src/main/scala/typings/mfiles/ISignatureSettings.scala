package typings.mfiles

import typings.mfiles.MFiles.MFSignaturePromptInfoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignatureSettings extends js.Object {
  var AdditionalInfo: String = js.native
  var FreeFormTextPropertyID: Double = js.native
  var IsFreeFormTextPrompted: Boolean = js.native
  var IsRequired: Boolean = js.native
  var IsSeparateSignatureObject: Boolean = js.native
  var ManifestationPropertyID: Double = js.native
  val PromptInfoType: MFSignaturePromptInfoType = js.native
  var SignatureIdentifier: String = js.native
  var SignaturePromptInfoFixed: ISignaturePromptInfo = js.native
  var SignaturePromptInfoMetadataBased: ISignaturePromptInfoMetadataBased = js.native
  var SignaturePromptInfoSelectable: ISignaturePromptInfoSelectable = js.native
  def Clone(): ISignatureSettings = js.native
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
  @scala.inline
  implicit class ISignatureSettingsOps[Self <: ISignatureSettings] (val x: Self) extends AnyVal {
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
    def setAdditionalInfo(value: String): Self = this.set("AdditionalInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => ISignatureSettings): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setFreeFormTextPropertyID(value: Double): Self = this.set("FreeFormTextPropertyID", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFreeFormTextPrompted(value: Boolean): Self = this.set("IsFreeFormTextPrompted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("IsRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSeparateSignatureObject(value: Boolean): Self = this.set("IsSeparateSignatureObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifestationPropertyID(value: Double): Self = this.set("ManifestationPropertyID", value.asInstanceOf[js.Any])
    @scala.inline
    def setPromptInfoType(value: MFSignaturePromptInfoType): Self = this.set("PromptInfoType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignatureIdentifier(value: String): Self = this.set("SignatureIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignaturePromptInfoFixed(value: ISignaturePromptInfo): Self = this.set("SignaturePromptInfoFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignaturePromptInfoMetadataBased(value: ISignaturePromptInfoMetadataBased): Self = this.set("SignaturePromptInfoMetadataBased", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignaturePromptInfoSelectable(value: ISignaturePromptInfoSelectable): Self = this.set("SignaturePromptInfoSelectable", value.asInstanceOf[js.Any])
  }
  
}

