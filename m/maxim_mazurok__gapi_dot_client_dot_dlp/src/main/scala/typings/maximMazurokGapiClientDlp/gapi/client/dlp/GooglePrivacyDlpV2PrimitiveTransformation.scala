package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2PrimitiveTransformation extends StObject {
  
  /** Bucketing */
  var bucketingConfig: js.UndefOr[GooglePrivacyDlpV2BucketingConfig] = js.undefined
  
  /** Mask */
  var characterMaskConfig: js.UndefOr[GooglePrivacyDlpV2CharacterMaskConfig] = js.undefined
  
  /** Deterministic Crypto */
  var cryptoDeterministicConfig: js.UndefOr[GooglePrivacyDlpV2CryptoDeterministicConfig] = js.undefined
  
  /** Crypto */
  var cryptoHashConfig: js.UndefOr[GooglePrivacyDlpV2CryptoHashConfig] = js.undefined
  
  /** Ffx-Fpe */
  var cryptoReplaceFfxFpeConfig: js.UndefOr[GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig] = js.undefined
  
  /** Date Shift */
  var dateShiftConfig: js.UndefOr[GooglePrivacyDlpV2DateShiftConfig] = js.undefined
  
  /** Fixed size bucketing */
  var fixedSizeBucketingConfig: js.UndefOr[GooglePrivacyDlpV2FixedSizeBucketingConfig] = js.undefined
  
  /** Redact */
  var redactConfig: js.UndefOr[js.Any] = js.undefined
  
  /** Replace */
  var replaceConfig: js.UndefOr[GooglePrivacyDlpV2ReplaceValueConfig] = js.undefined
  
  /** Replace with infotype */
  var replaceWithInfoTypeConfig: js.UndefOr[js.Any] = js.undefined
  
  /** Time extraction */
  var timePartConfig: js.UndefOr[GooglePrivacyDlpV2TimePartConfig] = js.undefined
}
object GooglePrivacyDlpV2PrimitiveTransformation {
  
  inline def apply(): GooglePrivacyDlpV2PrimitiveTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2PrimitiveTransformation]
  }
  
  extension [Self <: GooglePrivacyDlpV2PrimitiveTransformation](x: Self) {
    
    inline def setBucketingConfig(value: GooglePrivacyDlpV2BucketingConfig): Self = StObject.set(x, "bucketingConfig", value.asInstanceOf[js.Any])
    
    inline def setBucketingConfigUndefined: Self = StObject.set(x, "bucketingConfig", js.undefined)
    
    inline def setCharacterMaskConfig(value: GooglePrivacyDlpV2CharacterMaskConfig): Self = StObject.set(x, "characterMaskConfig", value.asInstanceOf[js.Any])
    
    inline def setCharacterMaskConfigUndefined: Self = StObject.set(x, "characterMaskConfig", js.undefined)
    
    inline def setCryptoDeterministicConfig(value: GooglePrivacyDlpV2CryptoDeterministicConfig): Self = StObject.set(x, "cryptoDeterministicConfig", value.asInstanceOf[js.Any])
    
    inline def setCryptoDeterministicConfigUndefined: Self = StObject.set(x, "cryptoDeterministicConfig", js.undefined)
    
    inline def setCryptoHashConfig(value: GooglePrivacyDlpV2CryptoHashConfig): Self = StObject.set(x, "cryptoHashConfig", value.asInstanceOf[js.Any])
    
    inline def setCryptoHashConfigUndefined: Self = StObject.set(x, "cryptoHashConfig", js.undefined)
    
    inline def setCryptoReplaceFfxFpeConfig(value: GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig): Self = StObject.set(x, "cryptoReplaceFfxFpeConfig", value.asInstanceOf[js.Any])
    
    inline def setCryptoReplaceFfxFpeConfigUndefined: Self = StObject.set(x, "cryptoReplaceFfxFpeConfig", js.undefined)
    
    inline def setDateShiftConfig(value: GooglePrivacyDlpV2DateShiftConfig): Self = StObject.set(x, "dateShiftConfig", value.asInstanceOf[js.Any])
    
    inline def setDateShiftConfigUndefined: Self = StObject.set(x, "dateShiftConfig", js.undefined)
    
    inline def setFixedSizeBucketingConfig(value: GooglePrivacyDlpV2FixedSizeBucketingConfig): Self = StObject.set(x, "fixedSizeBucketingConfig", value.asInstanceOf[js.Any])
    
    inline def setFixedSizeBucketingConfigUndefined: Self = StObject.set(x, "fixedSizeBucketingConfig", js.undefined)
    
    inline def setRedactConfig(value: js.Any): Self = StObject.set(x, "redactConfig", value.asInstanceOf[js.Any])
    
    inline def setRedactConfigUndefined: Self = StObject.set(x, "redactConfig", js.undefined)
    
    inline def setReplaceConfig(value: GooglePrivacyDlpV2ReplaceValueConfig): Self = StObject.set(x, "replaceConfig", value.asInstanceOf[js.Any])
    
    inline def setReplaceConfigUndefined: Self = StObject.set(x, "replaceConfig", js.undefined)
    
    inline def setReplaceWithInfoTypeConfig(value: js.Any): Self = StObject.set(x, "replaceWithInfoTypeConfig", value.asInstanceOf[js.Any])
    
    inline def setReplaceWithInfoTypeConfigUndefined: Self = StObject.set(x, "replaceWithInfoTypeConfig", js.undefined)
    
    inline def setTimePartConfig(value: GooglePrivacyDlpV2TimePartConfig): Self = StObject.set(x, "timePartConfig", value.asInstanceOf[js.Any])
    
    inline def setTimePartConfigUndefined: Self = StObject.set(x, "timePartConfig", js.undefined)
  }
}
