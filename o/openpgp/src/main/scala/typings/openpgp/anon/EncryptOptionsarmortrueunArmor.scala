package typings.openpgp.anon

import typings.openpgp.mod.UserID
import typings.openpgp.mod.enums.compression
import typings.openpgp.openpgpBooleans.`false`
import typings.openpgp.openpgpBooleans.`true`
import typings.openpgp.openpgpStrings.node
import typings.openpgp.openpgpStrings.web
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.EncryptOptions & {  armor :true | undefined,   detached :true} */
@js.native
trait EncryptOptionsarmortrueunArmor extends js.Object {
  
  /**
    * (optional) if the return values should be ascii armored or the message/signature objects
    */
  var armor: js.UndefOr[Boolean] with js.UndefOr[`true`] = js.native
  
  /**
    * (optional) which compression algorithm to compress the message with, defaults to what is specified in config
    */
  var compression: js.UndefOr[typings.openpgp.mod.enums.compression] = js.native
  
  /**
    * (optional) override the creation date of the message signature
    */
  var date: js.UndefOr[Date] = js.native
  
  /**
    * (optional) if the signature should be detached (if true, signature will be added to returned object)
    */
  var detached: js.UndefOr[Boolean] with `true` = js.native
  
  /**
    * (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.native
  
  /**
    * message to be encrypted as created by openpgp.message.fromText or openpgp.message.fromBinary
    */
  var message: typings.openpgp.mod.message.Message = js.native
  
  /**
    * (optional) array of passwords or a single password to encrypt the message
    */
  var passwords: js.UndefOr[String | js.Array[_]] = js.native
  
  /**
    * (optional) private keys for signing. If omitted message will not be signed
    */
  var privateKeys: js.UndefOr[typings.openpgp.mod.key.Key | js.Array[_]] = js.native
  
  /**
    * (optional) array of keys or single key, used to encrypt the message
    */
  var publicKeys: js.UndefOr[typings.openpgp.mod.key.Key | js.Array[_]] = js.native
  
  /**
    * (optional) if the unencrypted session key should be added to returned object
    */
  var returnSessionKey: js.UndefOr[Boolean] = js.native
  
  /**
    * (optional) session key in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKey: js.UndefOr[Algorithm] = js.native
  
  /**
    * (optional) a detached signature to add to the encrypted message
    */
  var signature: js.UndefOr[typings.openpgp.mod.signature.Signature] = js.native
  
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.native
  
  /**
    * (optional) array of user IDs to encrypt for, one per key in `publicKeys`, e.g. [ { name:'Robert Receiver', email:'robert@openpgp.org' }]
    */
  var toUserIds: js.UndefOr[js.Array[UserID]] = js.native
  
  /**
    * (optional) use a key ID of 0 instead of the public key IDs
    */
  var wildcard: js.UndefOr[Boolean] = js.native
}
object EncryptOptionsarmortrueunArmor {
  
  @scala.inline
  def apply(
    armor: js.UndefOr[Boolean] with js.UndefOr[`true`],
    detached: js.UndefOr[Boolean] with `true`,
    message: typings.openpgp.mod.message.Message
  ): EncryptOptionsarmortrueunArmor = {
    val __obj = js.Dynamic.literal(armor = armor.asInstanceOf[js.Any], detached = detached.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptOptionsarmortrueunArmor]
  }
  
  @scala.inline
  implicit class EncryptOptionsarmortrueunArmorOps[Self <: EncryptOptionsarmortrueunArmor] (val x: Self) extends AnyVal {
    
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
    def setArmor(value: js.UndefOr[Boolean] with js.UndefOr[`true`]): Self = this.set("armor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetached(value: js.UndefOr[Boolean] with `true`): Self = this.set("detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: typings.openpgp.mod.message.Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompression(value: compression): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setFromUserIdsVarargs(value: UserID*): Self = this.set("fromUserIds", js.Array(value :_*))
    
    @scala.inline
    def setFromUserIds(value: js.Array[UserID]): Self = this.set("fromUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromUserIds: Self = this.set("fromUserIds", js.undefined)
    
    @scala.inline
    def setPasswordsVarargs(value: js.Any*): Self = this.set("passwords", js.Array(value :_*))
    
    @scala.inline
    def setPasswords(value: String | js.Array[_]): Self = this.set("passwords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswords: Self = this.set("passwords", js.undefined)
    
    @scala.inline
    def setPrivateKeysVarargs(value: js.Any*): Self = this.set("privateKeys", js.Array(value :_*))
    
    @scala.inline
    def setPrivateKeys(value: typings.openpgp.mod.key.Key | js.Array[_]): Self = this.set("privateKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeys: Self = this.set("privateKeys", js.undefined)
    
    @scala.inline
    def setPublicKeysVarargs(value: js.Any*): Self = this.set("publicKeys", js.Array(value :_*))
    
    @scala.inline
    def setPublicKeys(value: typings.openpgp.mod.key.Key | js.Array[_]): Self = this.set("publicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeys: Self = this.set("publicKeys", js.undefined)
    
    @scala.inline
    def setReturnSessionKey(value: Boolean): Self = this.set("returnSessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnSessionKey: Self = this.set("returnSessionKey", js.undefined)
    
    @scala.inline
    def setSessionKey(value: Algorithm): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    
    @scala.inline
    def setSignature(value: typings.openpgp.mod.signature.Signature): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setStreaming(value: web | node | `false`): Self = this.set("streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreaming: Self = this.set("streaming", js.undefined)
    
    @scala.inline
    def setToUserIdsVarargs(value: UserID*): Self = this.set("toUserIds", js.Array(value :_*))
    
    @scala.inline
    def setToUserIds(value: js.Array[UserID]): Self = this.set("toUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToUserIds: Self = this.set("toUserIds", js.undefined)
    
    @scala.inline
    def setWildcard(value: Boolean): Self = this.set("wildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWildcard: Self = this.set("wildcard", js.undefined)
  }
}
