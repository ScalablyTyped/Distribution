package typings.openpgp.mod

import typings.openpgp.anon.Algorithm
import typings.openpgp.mod.key.Key
import typings.openpgp.mod.message.Message
import typings.openpgp.mod.signature.Signature
import typings.openpgp.openpgpBooleans.`false`
import typings.openpgp.openpgpStrings.binary
import typings.openpgp.openpgpStrings.node
import typings.openpgp.openpgpStrings.utf8
import typings.openpgp.openpgpStrings.web
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecryptOptions extends StObject {
  
  /**
    * (optional) use the given date for verification instead of the current time
    */
  var date: js.UndefOr[Date] = js.native
  
  /**
    * (optional) whether to return data as a string(Stream) or Uint8Array(Stream). If 'utf8' (the default), also normalize newlines.
    */
  var format: js.UndefOr[utf8 | binary] = js.native
  
  /**
    * the message object with the encrypted data
    */
  var message: Message = js.native
  
  /**
    * (optional) passwords to decrypt the message
    */
  var passwords: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * (optional) private keys with decrypted secret key data or session key
    */
  var privateKeys: js.UndefOr[Key | js.Array[Key]] = js.native
  
  /**
    * (optional) array of public keys or single key, to verify signatures
    */
  var publicKeys: js.UndefOr[Key | js.Array[Key]] = js.native
  
  /**
    * (optional) session keys in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKeys: js.UndefOr[Algorithm | js.Array[Algorithm]] = js.native
  
  /**
    * (optional) detached signature for verification
    */
  var signature: js.UndefOr[Signature] = js.native
  
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.native
}
object DecryptOptions {
  
  @scala.inline
  def apply(message: Message): DecryptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptOptions]
  }
  
  @scala.inline
  implicit class DecryptOptionsMutableBuilder[Self <: DecryptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setFormat(value: utf8 | binary): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswords(value: String | js.Array[String]): Self = StObject.set(x, "passwords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordsUndefined: Self = StObject.set(x, "passwords", js.undefined)
    
    @scala.inline
    def setPasswordsVarargs(value: String*): Self = StObject.set(x, "passwords", js.Array(value :_*))
    
    @scala.inline
    def setPrivateKeys(value: Key | js.Array[Key]): Self = StObject.set(x, "privateKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeysUndefined: Self = StObject.set(x, "privateKeys", js.undefined)
    
    @scala.inline
    def setPrivateKeysVarargs(value: Key*): Self = StObject.set(x, "privateKeys", js.Array(value :_*))
    
    @scala.inline
    def setPublicKeys(value: Key | js.Array[Key]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeysUndefined: Self = StObject.set(x, "publicKeys", js.undefined)
    
    @scala.inline
    def setPublicKeysVarargs(value: Key*): Self = StObject.set(x, "publicKeys", js.Array(value :_*))
    
    @scala.inline
    def setSessionKeys(value: Algorithm | js.Array[Algorithm]): Self = StObject.set(x, "sessionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKeysUndefined: Self = StObject.set(x, "sessionKeys", js.undefined)
    
    @scala.inline
    def setSessionKeysVarargs(value: Algorithm*): Self = StObject.set(x, "sessionKeys", js.Array(value :_*))
    
    @scala.inline
    def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setStreaming(value: web | node | `false`): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
  }
}
