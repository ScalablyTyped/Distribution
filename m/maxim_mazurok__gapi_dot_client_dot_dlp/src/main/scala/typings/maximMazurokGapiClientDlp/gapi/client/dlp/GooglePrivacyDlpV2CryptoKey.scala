package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CryptoKey extends js.Object {
  
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
  implicit class GooglePrivacyDlpV2CryptoKeyOps[Self <: GooglePrivacyDlpV2CryptoKey] (val x: Self) extends AnyVal {
    
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
    def setKmsWrapped(value: GooglePrivacyDlpV2KmsWrappedCryptoKey): Self = this.set("kmsWrapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsWrapped: Self = this.set("kmsWrapped", js.undefined)
    
    @scala.inline
    def setTransient(value: GooglePrivacyDlpV2TransientCryptoKey): Self = this.set("transient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransient: Self = this.set("transient", js.undefined)
    
    @scala.inline
    def setUnwrapped(value: GooglePrivacyDlpV2UnwrappedCryptoKey): Self = this.set("unwrapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnwrapped: Self = this.set("unwrapped", js.undefined)
  }
}
