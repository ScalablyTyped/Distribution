package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2PrimitiveTransformation extends StObject {
  
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
  implicit class GooglePrivacyDlpV2PrimitiveTransformationMutableBuilder[Self <: GooglePrivacyDlpV2PrimitiveTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketingConfig(value: GooglePrivacyDlpV2BucketingConfig): Self = StObject.set(x, "bucketingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketingConfigUndefined: Self = StObject.set(x, "bucketingConfig", js.undefined)
    
    @scala.inline
    def setCharacterMaskConfig(value: GooglePrivacyDlpV2CharacterMaskConfig): Self = StObject.set(x, "characterMaskConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterMaskConfigUndefined: Self = StObject.set(x, "characterMaskConfig", js.undefined)
    
    @scala.inline
    def setCryptoDeterministicConfig(value: GooglePrivacyDlpV2CryptoDeterministicConfig): Self = StObject.set(x, "cryptoDeterministicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoDeterministicConfigUndefined: Self = StObject.set(x, "cryptoDeterministicConfig", js.undefined)
    
    @scala.inline
    def setCryptoHashConfig(value: GooglePrivacyDlpV2CryptoHashConfig): Self = StObject.set(x, "cryptoHashConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoHashConfigUndefined: Self = StObject.set(x, "cryptoHashConfig", js.undefined)
    
    @scala.inline
    def setCryptoReplaceFfxFpeConfig(value: GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig): Self = StObject.set(x, "cryptoReplaceFfxFpeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoReplaceFfxFpeConfigUndefined: Self = StObject.set(x, "cryptoReplaceFfxFpeConfig", js.undefined)
    
    @scala.inline
    def setDateShiftConfig(value: GooglePrivacyDlpV2DateShiftConfig): Self = StObject.set(x, "dateShiftConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateShiftConfigUndefined: Self = StObject.set(x, "dateShiftConfig", js.undefined)
    
    @scala.inline
    def setFixedSizeBucketingConfig(value: GooglePrivacyDlpV2FixedSizeBucketingConfig): Self = StObject.set(x, "fixedSizeBucketingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedSizeBucketingConfigUndefined: Self = StObject.set(x, "fixedSizeBucketingConfig", js.undefined)
    
    @scala.inline
    def setRedactConfig(value: js.Any): Self = StObject.set(x, "redactConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactConfigUndefined: Self = StObject.set(x, "redactConfig", js.undefined)
    
    @scala.inline
    def setReplaceConfig(value: GooglePrivacyDlpV2ReplaceValueConfig): Self = StObject.set(x, "replaceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceConfigUndefined: Self = StObject.set(x, "replaceConfig", js.undefined)
    
    @scala.inline
    def setReplaceWithInfoTypeConfig(value: js.Any): Self = StObject.set(x, "replaceWithInfoTypeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceWithInfoTypeConfigUndefined: Self = StObject.set(x, "replaceWithInfoTypeConfig", js.undefined)
    
    @scala.inline
    def setTimePartConfig(value: GooglePrivacyDlpV2TimePartConfig): Self = StObject.set(x, "timePartConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePartConfigUndefined: Self = StObject.set(x, "timePartConfig", js.undefined)
  }
}
