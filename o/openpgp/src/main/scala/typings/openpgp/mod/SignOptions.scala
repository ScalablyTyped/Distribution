package typings.openpgp.mod

import typings.openpgp.mod.cleartext.CleartextMessage
import typings.openpgp.mod.key.Key
import typings.openpgp.mod.message.Message
import typings.openpgp.openpgpBooleans.`false`
import typings.openpgp.openpgpStrings.node
import typings.openpgp.openpgpStrings.web
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignOptions extends StObject {
  
  /**
    * (optional) if the return value should be ascii armored or the message object
    */
  var armor: js.UndefOr[Boolean] = js.native
  
  /**
    * (optional) override the creation date of the signature
    */
  var date: js.UndefOr[Date] = js.native
  
  /**
    * (optional) if the return value should contain a detached signature
    */
  var detached: js.UndefOr[Boolean] = js.native
  
  /**
    *  (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.native
  
  /**
    * (cleartext) message to be signed
    */
  var message: CleartextMessage | Message = js.native
  
  /**
    * array of keys or single key with decrypted secret key data to sign cleartext
    */
  var privateKeys: Key | js.Array[_] = js.native
  
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.native
}
object SignOptions {
  
  @scala.inline
  def apply(message: CleartextMessage | Message, privateKeys: Key | js.Array[_]): SignOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], privateKeys = privateKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptions]
  }
  
  @scala.inline
  implicit class SignOptionsMutableBuilder[Self <: SignOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArmor(value: Boolean): Self = StObject.set(x, "armor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArmorUndefined: Self = StObject.set(x, "armor", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    @scala.inline
    def setFromUserIds(value: js.Array[UserID]): Self = StObject.set(x, "fromUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUserIdsUndefined: Self = StObject.set(x, "fromUserIds", js.undefined)
    
    @scala.inline
    def setFromUserIdsVarargs(value: UserID*): Self = StObject.set(x, "fromUserIds", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: CleartextMessage | Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeys(value: Key | js.Array[_]): Self = StObject.set(x, "privateKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeysVarargs(value: js.Any*): Self = StObject.set(x, "privateKeys", js.Array(value :_*))
    
    @scala.inline
    def setStreaming(value: web | node | `false`): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
  }
}
