package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2KmsWrappedCryptoKey extends js.Object {
  
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
  implicit class GooglePrivacyDlpV2KmsWrappedCryptoKeyOps[Self <: GooglePrivacyDlpV2KmsWrappedCryptoKey] (val x: Self) extends AnyVal {
    
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
    def setCryptoKeyName(value: String): Self = this.set("cryptoKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoKeyName: Self = this.set("cryptoKeyName", js.undefined)
    
    @scala.inline
    def setWrappedKey(value: String): Self = this.set("wrappedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrappedKey: Self = this.set("wrappedKey", js.undefined)
  }
}
