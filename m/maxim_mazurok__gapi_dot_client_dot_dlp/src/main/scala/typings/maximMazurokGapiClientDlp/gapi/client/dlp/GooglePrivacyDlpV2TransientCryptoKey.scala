package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2TransientCryptoKey extends StObject {
  
  /**
    * Required. Name of the key. This is an arbitrary string used to differentiate different keys. A unique key is generated per name: two separate `TransientCryptoKey` protos share the
    * same generated key if their names are the same. When the data crypto key is generated, this name is not used in any way (repeating the api call will result in a different key being
    * generated).
    */
  var name: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2TransientCryptoKey {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2TransientCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TransientCryptoKey]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TransientCryptoKeyMutableBuilder[Self <: GooglePrivacyDlpV2TransientCryptoKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
