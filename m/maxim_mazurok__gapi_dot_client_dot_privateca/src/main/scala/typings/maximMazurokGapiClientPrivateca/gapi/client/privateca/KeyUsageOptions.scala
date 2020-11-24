package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyUsageOptions extends js.Object {
  
  /** The key may be used to sign certificates. */
  var certSign: js.UndefOr[Boolean] = js.native
  
  /** The key may be used for cryptographic commitments. Note that this may also be referred to as "non-repudiation". */
  var contentCommitment: js.UndefOr[Boolean] = js.native
  
  /** The key may be used sign certificate revocation lists. */
  var crlSign: js.UndefOr[Boolean] = js.native
  
  /** The key may be used to encipher data. */
  var dataEncipherment: js.UndefOr[Boolean] = js.native
  
  /** The key may be used to decipher only. */
  var decipherOnly: js.UndefOr[Boolean] = js.native
  
  /** The key may be used for digital signatures. */
  var digitalSignature: js.UndefOr[Boolean] = js.native
  
  /** The key may be used to encipher only. */
  var encipherOnly: js.UndefOr[Boolean] = js.native
  
  /** The key may be used in a key agreement protocol. */
  var keyAgreement: js.UndefOr[Boolean] = js.native
  
  /** The key may be used to encipher other keys. */
  var keyEncipherment: js.UndefOr[Boolean] = js.native
}
object KeyUsageOptions {
  
  @scala.inline
  def apply(): KeyUsageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyUsageOptions]
  }
  
  @scala.inline
  implicit class KeyUsageOptionsOps[Self <: KeyUsageOptions] (val x: Self) extends AnyVal {
    
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
    def setCertSign(value: Boolean): Self = this.set("certSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertSign: Self = this.set("certSign", js.undefined)
    
    @scala.inline
    def setContentCommitment(value: Boolean): Self = this.set("contentCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentCommitment: Self = this.set("contentCommitment", js.undefined)
    
    @scala.inline
    def setCrlSign(value: Boolean): Self = this.set("crlSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrlSign: Self = this.set("crlSign", js.undefined)
    
    @scala.inline
    def setDataEncipherment(value: Boolean): Self = this.set("dataEncipherment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataEncipherment: Self = this.set("dataEncipherment", js.undefined)
    
    @scala.inline
    def setDecipherOnly(value: Boolean): Self = this.set("decipherOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecipherOnly: Self = this.set("decipherOnly", js.undefined)
    
    @scala.inline
    def setDigitalSignature(value: Boolean): Self = this.set("digitalSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigitalSignature: Self = this.set("digitalSignature", js.undefined)
    
    @scala.inline
    def setEncipherOnly(value: Boolean): Self = this.set("encipherOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncipherOnly: Self = this.set("encipherOnly", js.undefined)
    
    @scala.inline
    def setKeyAgreement(value: Boolean): Self = this.set("keyAgreement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAgreement: Self = this.set("keyAgreement", js.undefined)
    
    @scala.inline
    def setKeyEncipherment(value: Boolean): Self = this.set("keyEncipherment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyEncipherment: Self = this.set("keyEncipherment", js.undefined)
  }
}
