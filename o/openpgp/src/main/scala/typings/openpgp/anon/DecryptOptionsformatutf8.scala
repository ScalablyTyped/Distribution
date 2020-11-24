package typings.openpgp.anon

import typings.openpgp.openpgpBooleans.`false`
import typings.openpgp.openpgpStrings.binary
import typings.openpgp.openpgpStrings.node
import typings.openpgp.openpgpStrings.utf8
import typings.openpgp.openpgpStrings.web
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.DecryptOptions & {  format :'utf8'} */
@js.native
trait DecryptOptionsformatutf8 extends js.Object {
  
  /**
    * (optional) use the given date for verification instead of the current time
    */
  var date: js.UndefOr[Date] = js.native
  
  /**
    * (optional) whether to return data as a string(Stream) or Uint8Array(Stream). If 'utf8' (the default), also normalize newlines.
    */
  var format: (js.UndefOr[utf8 | binary]) with utf8 = js.native
  
  /**
    * the message object with the encrypted data
    */
  var message: typings.openpgp.mod.message.Message = js.native
  
  /**
    * (optional) passwords to decrypt the message
    */
  var passwords: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * (optional) private keys with decrypted secret key data or session key
    */
  var privateKeys: js.UndefOr[typings.openpgp.mod.key.Key | js.Array[typings.openpgp.mod.key.Key]] = js.native
  
  /**
    * (optional) array of public keys or single key, to verify signatures
    */
  var publicKeys: js.UndefOr[typings.openpgp.mod.key.Key | js.Array[typings.openpgp.mod.key.Key]] = js.native
  
  /**
    * (optional) session keys in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKeys: js.UndefOr[Algorithm | js.Array[Algorithm]] = js.native
  
  /**
    * (optional) detached signature for verification
    */
  var signature: js.UndefOr[typings.openpgp.mod.signature.Signature] = js.native
  
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.native
}
object DecryptOptionsformatutf8 {
  
  @scala.inline
  def apply(format: (js.UndefOr[utf8 | binary]) with utf8, message: typings.openpgp.mod.message.Message): DecryptOptionsformatutf8 = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptOptionsformatutf8]
  }
  
  @scala.inline
  implicit class DecryptOptionsformatutf8Ops[Self <: DecryptOptionsformatutf8] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: (js.UndefOr[utf8 | binary]) with utf8): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: typings.openpgp.mod.message.Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setPasswordsVarargs(value: String*): Self = this.set("passwords", js.Array(value :_*))
    
    @scala.inline
    def setPasswords(value: String | js.Array[String]): Self = this.set("passwords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswords: Self = this.set("passwords", js.undefined)
    
    @scala.inline
    def setPrivateKeysVarargs(value: typings.openpgp.mod.key.Key*): Self = this.set("privateKeys", js.Array(value :_*))
    
    @scala.inline
    def setPrivateKeys(value: typings.openpgp.mod.key.Key | js.Array[typings.openpgp.mod.key.Key]): Self = this.set("privateKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeys: Self = this.set("privateKeys", js.undefined)
    
    @scala.inline
    def setPublicKeysVarargs(value: typings.openpgp.mod.key.Key*): Self = this.set("publicKeys", js.Array(value :_*))
    
    @scala.inline
    def setPublicKeys(value: typings.openpgp.mod.key.Key | js.Array[typings.openpgp.mod.key.Key]): Self = this.set("publicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeys: Self = this.set("publicKeys", js.undefined)
    
    @scala.inline
    def setSessionKeysVarargs(value: Algorithm*): Self = this.set("sessionKeys", js.Array(value :_*))
    
    @scala.inline
    def setSessionKeys(value: Algorithm | js.Array[Algorithm]): Self = this.set("sessionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionKeys: Self = this.set("sessionKeys", js.undefined)
    
    @scala.inline
    def setSignature(value: typings.openpgp.mod.signature.Signature): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setStreaming(value: web | node | `false`): Self = this.set("streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreaming: Self = this.set("streaming", js.undefined)
  }
}
