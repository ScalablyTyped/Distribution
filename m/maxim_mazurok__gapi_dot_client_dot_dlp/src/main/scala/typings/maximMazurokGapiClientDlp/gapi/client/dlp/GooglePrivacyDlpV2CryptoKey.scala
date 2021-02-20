package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CryptoKey extends StObject {
  
  /** Kms wrapped key */
  var kmsWrapped: js.UndefOr[GooglePrivacyDlpV2KmsWrappedCryptoKey] = js.native
  
  /** Transient crypto key */
  var transient: js.UndefOr[GooglePrivacyDlpV2TransientCryptoKey] = js.native
  
  /** Unwrapped crypto key */
  var unwrapped: js.UndefOr[GooglePrivacyDlpV2UnwrappedCryptoKey] = js.native
}
object GooglePrivacyDlpV2CryptoKey {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CryptoKey]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CryptoKeyMutableBuilder[Self <: GooglePrivacyDlpV2CryptoKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsWrapped(value: GooglePrivacyDlpV2KmsWrappedCryptoKey): Self = StObject.set(x, "kmsWrapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsWrappedUndefined: Self = StObject.set(x, "kmsWrapped", js.undefined)
    
    @scala.inline
    def setTransient(value: GooglePrivacyDlpV2TransientCryptoKey): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
    
    @scala.inline
    def setUnwrapped(value: GooglePrivacyDlpV2UnwrappedCryptoKey): Self = StObject.set(x, "unwrapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnwrappedUndefined: Self = StObject.set(x, "unwrapped", js.undefined)
  }
}
