package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2PrimitiveTransformation extends js.Object {
  
  /** Bucketing */
  var bucketingConfig: js.UndefOr[GooglePrivacyDlpV2BucketingConfig] = js.native
  
  /** Mask */
  var characterMaskConfig: js.UndefOr[GooglePrivacyDlpV2CharacterMaskConfig] = js.native
  
  /** Deterministic Crypto */
  var cryptoDeterministicConfig: js.UndefOr[GooglePrivacyDlpV2CryptoDeterministicConfig] = js.native
  
  /** Crypto */
  var cryptoHashConfig: js.UndefOr[GooglePrivacyDlpV2CryptoHashConfig] = js.native
  
  /** Ffx-Fpe */
  var cryptoReplaceFfxFpeConfig: js.UndefOr[GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig] = js.native
  
  /** Date Shift */
  var dateShiftConfig: js.UndefOr[GooglePrivacyDlpV2DateShiftConfig] = js.native
  
  /** Fixed size bucketing */
  var fixedSizeBucketingConfig: js.UndefOr[GooglePrivacyDlpV2FixedSizeBucketingConfig] = js.native
  
  /** Redact */
  var redactConfig: js.UndefOr[js.Any] = js.native
  
  /** Replace */
  var replaceConfig: js.UndefOr[GooglePrivacyDlpV2ReplaceValueConfig] = js.native
  
  /** Replace with infotype */
  var replaceWithInfoTypeConfig: js.UndefOr[js.Any] = js.native
  
  /** Time extraction */
  var timePartConfig: js.UndefOr[GooglePrivacyDlpV2TimePartConfig] = js.native
}
object GooglePrivacyDlpV2PrimitiveTransformation {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2PrimitiveTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2PrimitiveTransformation]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2PrimitiveTransformationOps[Self <: GooglePrivacyDlpV2PrimitiveTransformation] (val x: Self) extends AnyVal {
    
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
    def setBucketingConfig(value: GooglePrivacyDlpV2BucketingConfig): Self = this.set("bucketingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketingConfig: Self = this.set("bucketingConfig", js.undefined)
    
    @scala.inline
    def setCharacterMaskConfig(value: GooglePrivacyDlpV2CharacterMaskConfig): Self = this.set("characterMaskConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterMaskConfig: Self = this.set("characterMaskConfig", js.undefined)
    
    @scala.inline
    def setCryptoDeterministicConfig(value: GooglePrivacyDlpV2CryptoDeterministicConfig): Self = this.set("cryptoDeterministicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoDeterministicConfig: Self = this.set("cryptoDeterministicConfig", js.undefined)
    
    @scala.inline
    def setCryptoHashConfig(value: GooglePrivacyDlpV2CryptoHashConfig): Self = this.set("cryptoHashConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoHashConfig: Self = this.set("cryptoHashConfig", js.undefined)
    
    @scala.inline
    def setCryptoReplaceFfxFpeConfig(value: GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig): Self = this.set("cryptoReplaceFfxFpeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoReplaceFfxFpeConfig: Self = this.set("cryptoReplaceFfxFpeConfig", js.undefined)
    
    @scala.inline
    def setDateShiftConfig(value: GooglePrivacyDlpV2DateShiftConfig): Self = this.set("dateShiftConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateShiftConfig: Self = this.set("dateShiftConfig", js.undefined)
    
    @scala.inline
    def setFixedSizeBucketingConfig(value: GooglePrivacyDlpV2FixedSizeBucketingConfig): Self = this.set("fixedSizeBucketingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedSizeBucketingConfig: Self = this.set("fixedSizeBucketingConfig", js.undefined)
    
    @scala.inline
    def setRedactConfig(value: js.Any): Self = this.set("redactConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedactConfig: Self = this.set("redactConfig", js.undefined)
    
    @scala.inline
    def setReplaceConfig(value: GooglePrivacyDlpV2ReplaceValueConfig): Self = this.set("replaceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceConfig: Self = this.set("replaceConfig", js.undefined)
    
    @scala.inline
    def setReplaceWithInfoTypeConfig(value: js.Any): Self = this.set("replaceWithInfoTypeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceWithInfoTypeConfig: Self = this.set("replaceWithInfoTypeConfig", js.undefined)
    
    @scala.inline
    def setTimePartConfig(value: GooglePrivacyDlpV2TimePartConfig): Self = this.set("timePartConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePartConfig: Self = this.set("timePartConfig", js.undefined)
  }
}
