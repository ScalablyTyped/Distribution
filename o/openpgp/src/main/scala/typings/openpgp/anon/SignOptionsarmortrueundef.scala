package typings.openpgp.anon

import typings.openpgp.mod.UserID
import typings.openpgp.mod.cleartext.CleartextMessage
import typings.openpgp.openpgpBooleans.`false`
import typings.openpgp.openpgpBooleans.`true`
import typings.openpgp.openpgpStrings.node
import typings.openpgp.openpgpStrings.web
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.SignOptions & {  armor :true | undefined,   detached :false | undefined} */
trait SignOptionsarmortrueundef extends StObject {
  
  /**
    * (optional) if the return value should be ascii armored or the message object
    */
  var armor: js.UndefOr[Boolean] & js.UndefOr[`true`]
  
  /**
    * (optional) override the creation date of the signature
    */
  var date: js.UndefOr[Date] = js.undefined
  
  /**
    * (optional) if the return value should contain a detached signature
    */
  var detached: js.UndefOr[Boolean] & js.UndefOr[`false`]
  
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
  var privateKeys: typings.openpgp.mod.key.Key | js.Array[js.Any]
  
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.undefined
}
object SignOptionsarmortrueundef {
  
  @scala.inline
  def apply(
    armor: js.UndefOr[Boolean] & js.UndefOr[`true`],
    detached: js.UndefOr[Boolean] & js.UndefOr[`false`],
    message: CleartextMessage | typings.openpgp.mod.message.Message,
    privateKeys: typings.openpgp.mod.key.Key | js.Array[js.Any]
  ): SignOptionsarmortrueundef = {
    val __obj = js.Dynamic.literal(armor = armor.asInstanceOf[js.Any], detached = detached.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], privateKeys = privateKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptionsarmortrueundef]
  }
  
  @scala.inline
  implicit class SignOptionsarmortrueundefMutableBuilder[Self <: SignOptionsarmortrueundef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArmor(value: js.UndefOr[Boolean] & js.UndefOr[`true`]): Self = StObject.set(x, "armor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDetached(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUserIds(value: js.Array[UserID]): Self = StObject.set(x, "fromUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUserIdsUndefined: Self = StObject.set(x, "fromUserIds", js.undefined)
    
    @scala.inline
    def setFromUserIdsVarargs(value: UserID*): Self = StObject.set(x, "fromUserIds", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: CleartextMessage | typings.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeys(value: typings.openpgp.mod.key.Key | js.Array[js.Any]): Self = StObject.set(x, "privateKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeysVarargs(value: js.Any*): Self = StObject.set(x, "privateKeys", js.Array(value :_*))
    
    @scala.inline
    def setStreaming(value: web | node | `false`): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
  }
}
