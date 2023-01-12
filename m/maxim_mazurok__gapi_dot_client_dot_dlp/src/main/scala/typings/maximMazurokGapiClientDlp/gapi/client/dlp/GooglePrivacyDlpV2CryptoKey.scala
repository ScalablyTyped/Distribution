package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2CryptoKey extends StObject {
  
  /** Key wrapped using Cloud KMS */
  var kmsWrapped: js.UndefOr[GooglePrivacyDlpV2KmsWrappedCryptoKey] = js.undefined
  
  /** Transient crypto key */
  var transient: js.UndefOr[GooglePrivacyDlpV2TransientCryptoKey] = js.undefined
  
  /** Unwrapped crypto key */
  var unwrapped: js.UndefOr[GooglePrivacyDlpV2UnwrappedCryptoKey] = js.undefined
}
object GooglePrivacyDlpV2CryptoKey {
  
  inline def apply(): GooglePrivacyDlpV2CryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CryptoKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2CryptoKey] (val x: Self) extends AnyVal {
    
    inline def setKmsWrapped(value: GooglePrivacyDlpV2KmsWrappedCryptoKey): Self = StObject.set(x, "kmsWrapped", value.asInstanceOf[js.Any])
    
    inline def setKmsWrappedUndefined: Self = StObject.set(x, "kmsWrapped", js.undefined)
    
    inline def setTransient(value: GooglePrivacyDlpV2TransientCryptoKey): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
    
    inline def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
    
    inline def setUnwrapped(value: GooglePrivacyDlpV2UnwrappedCryptoKey): Self = StObject.set(x, "unwrapped", value.asInstanceOf[js.Any])
    
    inline def setUnwrappedUndefined: Self = StObject.set(x, "unwrapped", js.undefined)
  }
}
