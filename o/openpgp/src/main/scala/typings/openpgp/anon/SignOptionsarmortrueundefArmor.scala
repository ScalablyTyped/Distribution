package typings.openpgp.anon

import typings.openpgp.mod.UserID
import typings.openpgp.mod.cleartext.CleartextMessage
import typings.openpgp.openpgpBooleans.`false`
import typings.openpgp.openpgpStrings.node
import typings.openpgp.openpgpStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.SignOptions & {  armor :true | undefined,   detached :true} */
trait SignOptionsarmortrueundefArmor extends StObject {
  
  /**
    * (optional) if the return value should be ascii armored or the message object
    */
  var armor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (optional) override the creation date of the signature
    */
  var date: js.UndefOr[js.Date] = js.undefined
  
  /**
    * (optional) if the return value should contain a detached signature
    */
  var detached: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
  
  /**
    * (cleartext) message to be signed
    */
  var message: CleartextMessage | typings.openpgp.mod.message.Message
  
  /**
    * array of keys or single key with decrypted secret key data to sign cleartext
    */
  var privateKeys: typings.openpgp.mod.key.Key | js.Array[Any]
  
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.undefined
}
object SignOptionsarmortrueundefArmor {
  
  inline def apply(
    message: CleartextMessage | typings.openpgp.mod.message.Message,
    privateKeys: typings.openpgp.mod.key.Key | js.Array[Any]
  ): SignOptionsarmortrueundefArmor = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], privateKeys = privateKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptionsarmortrueundefArmor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignOptionsarmortrueundefArmor] (val x: Self) extends AnyVal {
    
    inline def setArmor(value: Boolean): Self = StObject.set(x, "armor", value.asInstanceOf[js.Any])
    
    inline def setArmorUndefined: Self = StObject.set(x, "armor", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setFromUserIds(value: js.Array[UserID]): Self = StObject.set(x, "fromUserIds", value.asInstanceOf[js.Any])
    
    inline def setFromUserIdsUndefined: Self = StObject.set(x, "fromUserIds", js.undefined)
    
    inline def setFromUserIdsVarargs(value: UserID*): Self = StObject.set(x, "fromUserIds", js.Array(value*))
    
    inline def setMessage(value: CleartextMessage | typings.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeys(value: typings.openpgp.mod.key.Key | js.Array[Any]): Self = StObject.set(x, "privateKeys", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeysVarargs(value: Any*): Self = StObject.set(x, "privateKeys", js.Array(value*))
    
    inline def setStreaming(value: web | node | `false`): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    inline def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
  }
}
