package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2KmsWrappedCryptoKey extends StObject {
  
  /** Required. The resource name of the KMS CryptoKey to use for unwrapping. */
  var cryptoKeyName: js.UndefOr[String] = js.undefined
  
  /** Required. The wrapped data crypto key. */
  var wrappedKey: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2KmsWrappedCryptoKey {
  
  inline def apply(): GooglePrivacyDlpV2KmsWrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KmsWrappedCryptoKey]
  }
  
  extension [Self <: GooglePrivacyDlpV2KmsWrappedCryptoKey](x: Self) {
    
    inline def setCryptoKeyName(value: String): Self = StObject.set(x, "cryptoKeyName", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyNameUndefined: Self = StObject.set(x, "cryptoKeyName", js.undefined)
    
    inline def setWrappedKey(value: String): Self = StObject.set(x, "wrappedKey", value.asInstanceOf[js.Any])
    
    inline def setWrappedKeyUndefined: Self = StObject.set(x, "wrappedKey", js.undefined)
  }
}
