package typings.openpgp

import typings.openpgp.mod.UserID
import typings.openpgp.mod.enums.compression
import typings.openpgp.mod.key.Key
import typings.openpgp.mod.message.Message
import typings.openpgp.mod.signature.Signature
import typings.openpgp.openpgpBooleans.`false`
import typings.openpgp.openpgpStrings.node
import typings.openpgp.openpgpStrings.web
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptOptions & {  armor  :false,   detached ? :false} */
trait EncryptOptionsarmorfalsed extends js.Object {
  /**
    * (optional) if the return values should be ascii armored or the message/signature objects
    */
  var armor: js.UndefOr[Boolean with `false`] = js.undefined
  /**
    * (optional) which compression algorithm to compress the message with, defaults to what is specified in config
    */
  var compression: js.UndefOr[typings.openpgp.mod.enums.compression] = js.undefined
  /**
    * (optional) override the creation date of the message signature
    */
  var date: js.UndefOr[Date] = js.undefined
  /**
    * (optional) if the signature should be detached (if true, signature will be added to returned object)
    */
  var detached: js.UndefOr[Boolean with `false`] = js.undefined
  /**
    * (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
  /**
    * message to be encrypted as created by openpgp.message.fromText or openpgp.message.fromBinary
    */
  var message: Message
  /**
    * (optional) array of passwords or a single password to encrypt the message
    */
  var passwords: js.UndefOr[String | js.Array[_]] = js.undefined
  /**
    * (optional) private keys for signing. If omitted message will not be signed
    */
  var privateKeys: js.UndefOr[Key | js.Array[_]] = js.undefined
  /**
    * (optional) array of keys or single key, used to encrypt the message
    */
  var publicKeys: js.UndefOr[Key | js.Array[_]] = js.undefined
  /**
    * (optional) if the unencrypted session key should be added to returned object
    */
  var returnSessionKey: js.UndefOr[Boolean] = js.undefined
  /**
    * (optional) session key in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKey: js.UndefOr[AnonAlgorithm] = js.undefined
  /**
    * (optional) a detached signature to add to the encrypted message
    */
  var signature: js.UndefOr[Signature] = js.undefined
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.undefined
  /**
    * (optional) array of user IDs to encrypt for, one per key in `publicKeys`, e.g. [ { name:'Robert Receiver', email:'robert@openpgp.org' }]
    */
  var toUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
  /**
    * (optional) use a key ID of 0 instead of the public key IDs
    */
  var wildcard: js.UndefOr[Boolean] = js.undefined
}

object EncryptOptionsarmorfalsed {
  @scala.inline
  def apply(
    message: Message,
    armor: js.UndefOr[Boolean with `false`] = js.undefined,
    compression: compression = null,
    date: Date = null,
    detached: js.UndefOr[Boolean with `false`] = js.undefined,
    fromUserIds: js.Array[UserID] = null,
    passwords: String | js.Array[_] = null,
    privateKeys: Key | js.Array[_] = null,
    publicKeys: Key | js.Array[_] = null,
    returnSessionKey: js.UndefOr[Boolean] = js.undefined,
    sessionKey: AnonAlgorithm = null,
    signature: Signature = null,
    streaming: web | node | `false` = null,
    toUserIds: js.Array[UserID] = null,
    wildcard: js.UndefOr[Boolean] = js.undefined
  ): EncryptOptionsarmorfalsed = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(armor)) __obj.updateDynamic("armor")(armor.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (fromUserIds != null) __obj.updateDynamic("fromUserIds")(fromUserIds.asInstanceOf[js.Any])
    if (passwords != null) __obj.updateDynamic("passwords")(passwords.asInstanceOf[js.Any])
    if (privateKeys != null) __obj.updateDynamic("privateKeys")(privateKeys.asInstanceOf[js.Any])
    if (publicKeys != null) __obj.updateDynamic("publicKeys")(publicKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSessionKey)) __obj.updateDynamic("returnSessionKey")(returnSessionKey.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    if (toUserIds != null) __obj.updateDynamic("toUserIds")(toUserIds.asInstanceOf[js.Any])
    if (!js.isUndefined(wildcard)) __obj.updateDynamic("wildcard")(wildcard.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptOptionsarmorfalsed]
  }
}

