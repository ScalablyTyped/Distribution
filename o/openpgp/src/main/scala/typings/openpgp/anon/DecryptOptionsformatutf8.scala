package typings.openpgp.anon

import typings.openpgp.openpgpBooleans.`false`
import typings.openpgp.openpgpStrings.binary
import typings.openpgp.openpgpStrings.node
import typings.openpgp.openpgpStrings.utf8
import typings.openpgp.openpgpStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.DecryptOptions & {  format :'utf8'} */
trait DecryptOptionsformatutf8 extends StObject {
  
  /**
    * (optional) use the given date for verification instead of the current time
    */
  var date: js.UndefOr[js.Date] = js.undefined
  
  /**
    * (optional) whether to return data as a string(Stream) or Uint8Array(Stream). If 'utf8' (the default), also normalize newlines.
    */
  var format: js.UndefOr[utf8 | binary] = js.undefined
  
  /**
    * the message object with the encrypted data
    */
  var message: typings.openpgp.mod.message.Message
  
  /**
    * (optional) passwords to decrypt the message
    */
  var passwords: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * (optional) private keys with decrypted secret key data or session key
    */
  var privateKeys: js.UndefOr[typings.openpgp.mod.key.Key | js.Array[typings.openpgp.mod.key.Key]] = js.undefined
  
  /**
    * (optional) array of public keys or single key, to verify signatures
    */
  var publicKeys: js.UndefOr[typings.openpgp.mod.key.Key | js.Array[typings.openpgp.mod.key.Key]] = js.undefined
  
  /**
    * (optional) session keys in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKeys: js.UndefOr[Algorithm | js.Array[Algorithm]] = js.undefined
  
  /**
    * (optional) detached signature for verification
    */
  var signature: js.UndefOr[typings.openpgp.mod.signature.Signature] = js.undefined
  
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.undefined
}
object DecryptOptionsformatutf8 {
  
  inline def apply(message: typings.openpgp.mod.message.Message): DecryptOptionsformatutf8 = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptOptionsformatutf8]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecryptOptionsformatutf8] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setFormat(value: utf8 | binary): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMessage(value: typings.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPasswords(value: String | js.Array[String]): Self = StObject.set(x, "passwords", value.asInstanceOf[js.Any])
    
    inline def setPasswordsUndefined: Self = StObject.set(x, "passwords", js.undefined)
    
    inline def setPasswordsVarargs(value: String*): Self = StObject.set(x, "passwords", js.Array(value*))
    
    inline def setPrivateKeys(value: typings.openpgp.mod.key.Key | js.Array[typings.openpgp.mod.key.Key]): Self = StObject.set(x, "privateKeys", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeysUndefined: Self = StObject.set(x, "privateKeys", js.undefined)
    
    inline def setPrivateKeysVarargs(value: typings.openpgp.mod.key.Key*): Self = StObject.set(x, "privateKeys", js.Array(value*))
    
    inline def setPublicKeys(value: typings.openpgp.mod.key.Key | js.Array[typings.openpgp.mod.key.Key]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    inline def setPublicKeysUndefined: Self = StObject.set(x, "publicKeys", js.undefined)
    
    inline def setPublicKeysVarargs(value: typings.openpgp.mod.key.Key*): Self = StObject.set(x, "publicKeys", js.Array(value*))
    
    inline def setSessionKeys(value: Algorithm | js.Array[Algorithm]): Self = StObject.set(x, "sessionKeys", value.asInstanceOf[js.Any])
    
    inline def setSessionKeysUndefined: Self = StObject.set(x, "sessionKeys", js.undefined)
    
    inline def setSessionKeysVarargs(value: Algorithm*): Self = StObject.set(x, "sessionKeys", js.Array(value*))
    
    inline def setSignature(value: typings.openpgp.mod.signature.Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setStreaming(value: web | node | `false`): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    inline def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
  }
}
