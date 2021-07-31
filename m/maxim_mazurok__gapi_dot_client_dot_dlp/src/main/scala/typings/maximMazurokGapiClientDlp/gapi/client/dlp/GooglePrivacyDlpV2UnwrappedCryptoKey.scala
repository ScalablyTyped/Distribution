package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2UnwrappedCryptoKey extends StObject {
  
  /** Required. A 128/192/256 bit key. */
  var key: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2UnwrappedCryptoKey {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2UnwrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2UnwrappedCryptoKey]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2UnwrappedCryptoKeyMutableBuilder[Self <: GooglePrivacyDlpV2UnwrappedCryptoKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
