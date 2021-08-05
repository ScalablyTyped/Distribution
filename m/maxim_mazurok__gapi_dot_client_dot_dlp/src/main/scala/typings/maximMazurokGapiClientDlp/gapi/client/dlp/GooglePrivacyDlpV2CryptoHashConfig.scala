package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2CryptoHashConfig extends StObject {
  
  /** The key used by the hash function. */
  var cryptoKey: js.UndefOr[GooglePrivacyDlpV2CryptoKey] = js.undefined
}
object GooglePrivacyDlpV2CryptoHashConfig {
  
  inline def apply(): GooglePrivacyDlpV2CryptoHashConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CryptoHashConfig]
  }
  
  extension [Self <: GooglePrivacyDlpV2CryptoHashConfig](x: Self) {
    
    inline def setCryptoKey(value: GooglePrivacyDlpV2CryptoKey): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyUndefined: Self = StObject.set(x, "cryptoKey", js.undefined)
  }
}
