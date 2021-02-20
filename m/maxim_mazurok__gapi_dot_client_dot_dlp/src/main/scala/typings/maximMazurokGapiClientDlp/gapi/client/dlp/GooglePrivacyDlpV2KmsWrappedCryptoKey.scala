package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2KmsWrappedCryptoKey extends StObject {
  
  /** Required. The resource name of the KMS CryptoKey to use for unwrapping. */
  var cryptoKeyName: js.UndefOr[String] = js.native
  
  /** Required. The wrapped data crypto key. */
  var wrappedKey: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2KmsWrappedCryptoKey {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2KmsWrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KmsWrappedCryptoKey]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2KmsWrappedCryptoKeyMutableBuilder[Self <: GooglePrivacyDlpV2KmsWrappedCryptoKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCryptoKeyName(value: String): Self = StObject.set(x, "cryptoKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoKeyNameUndefined: Self = StObject.set(x, "cryptoKeyName", js.undefined)
    
    @scala.inline
    def setWrappedKey(value: String): Self = StObject.set(x, "wrappedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappedKeyUndefined: Self = StObject.set(x, "wrappedKey", js.undefined)
  }
}
