package typings.openpgp.mod

import typings.openpgp.mod.cleartext.CleartextMessage
import typings.openpgp.mod.key.Key
import typings.openpgp.mod.message.Message
import typings.openpgp.mod.signature.Signature
import typings.openpgp.openpgpBooleans.`false`
import typings.openpgp.openpgpStrings.node
import typings.openpgp.openpgpStrings.web
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyOptions extends StObject {
  
  /**
    * (optional) use the given date for verification instead of the current time
    */
  var date: js.UndefOr[Date] = js.undefined
  
  /**
    * (cleartext) message object with signatures
    */
  var message: CleartextMessage | Message
  
  /**
    * array of publicKeys or single key, to verify signatures
    */
  var publicKeys: Key | js.Array[js.Any]
  
  /**
    * (optional) detached signature for verification
    */
  var signature: js.UndefOr[Signature] = js.undefined
  
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.undefined
}
object VerifyOptions {
  
  @scala.inline
  def apply(message: CleartextMessage | Message, publicKeys: Key | js.Array[js.Any]): VerifyOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], publicKeys = publicKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions]
  }
  
  @scala.inline
  implicit class VerifyOptionsMutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setMessage(value: CleartextMessage | Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeys(value: Key | js.Array[js.Any]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeysVarargs(value: js.Any*): Self = StObject.set(x, "publicKeys", js.Array(value :_*))
    
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
