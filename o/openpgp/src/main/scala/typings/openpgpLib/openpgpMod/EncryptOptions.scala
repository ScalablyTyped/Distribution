package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptOptions extends js.Object {
  /**
    * (optional) if the return values should be ascii armored or the message/signature objects
    */
  var armor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (optional) which compression algorithm to compress the message with, defaults to what is specified in config
    */
  var compression: js.UndefOr[openpgpLib.openpgpMod.enumsNs.compression] = js.undefined
  /**
    * (optional) override the creation date of the message signature
    */
  var date: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * (optional) if the signature should be detached (if true, signature will be added to returned object)
    */
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
  /**
    * message to be encrypted as created by openpgp.message.fromText or openpgp.message.fromBinary
    */
  var message: openpgpLib.openpgpMod.messageNs.Message
  /**
    * (optional) array of passwords or a single password to encrypt the message
    */
  var passwords: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
  /**
    * (optional) private keys for signing. If omitted message will not be signed
    */
  var privateKeys: js.UndefOr[openpgpLib.openpgpMod.keyNs.Key | js.Array[_]] = js.undefined
  /**
    * (optional) array of keys or single key, used to encrypt the message
    */
  var publicKeys: js.UndefOr[openpgpLib.openpgpMod.keyNs.Key | js.Array[_]] = js.undefined
  /**
    * (optional) if the unencrypted session key should be added to returned object
    */
  var returnSessionKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (optional) session key in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKey: js.UndefOr[openpgpLib.Anon_Algorithm] = js.undefined
  /**
    * (optional) a detached signature to add to the encrypted message
    */
  var signature: js.UndefOr[openpgpLib.openpgpMod.signatureNs.Signature] = js.undefined
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[
    openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false`
  ] = js.undefined
  /**
    * (optional) array of user IDs to encrypt for, one per key in `publicKeys`, e.g. [ { name:'Robert Receiver', email:'robert@openpgp.org' }]
    */
  var toUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
  /**
    * (optional) use a key ID of 0 instead of the public key IDs
    */
  var wildcard: js.UndefOr[scala.Boolean] = js.undefined
}

object EncryptOptions {
  @scala.inline
  def apply(
    message: openpgpLib.openpgpMod.messageNs.Message,
    armor: js.UndefOr[scala.Boolean] = js.undefined,
    compression: openpgpLib.openpgpMod.enumsNs.compression = null,
    date: stdLib.Date = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    fromUserIds: js.Array[UserID] = null,
    passwords: java.lang.String | js.Array[_] = null,
    privateKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[_] = null,
    publicKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[_] = null,
    returnSessionKey: js.UndefOr[scala.Boolean] = js.undefined,
    sessionKey: openpgpLib.Anon_Algorithm = null,
    signature: openpgpLib.openpgpMod.signatureNs.Signature = null,
    streaming: openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false` = null,
    toUserIds: js.Array[UserID] = null,
    wildcard: js.UndefOr[scala.Boolean] = js.undefined
  ): EncryptOptions = {
    val __obj = js.Dynamic.literal(message = message)
    if (!js.isUndefined(armor)) __obj.updateDynamic("armor")(armor)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (date != null) __obj.updateDynamic("date")(date)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (fromUserIds != null) __obj.updateDynamic("fromUserIds")(fromUserIds)
    if (passwords != null) __obj.updateDynamic("passwords")(passwords.asInstanceOf[js.Any])
    if (privateKeys != null) __obj.updateDynamic("privateKeys")(privateKeys.asInstanceOf[js.Any])
    if (publicKeys != null) __obj.updateDynamic("publicKeys")(publicKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSessionKey)) __obj.updateDynamic("returnSessionKey")(returnSessionKey)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    if (toUserIds != null) __obj.updateDynamic("toUserIds")(toUserIds)
    if (!js.isUndefined(wildcard)) __obj.updateDynamic("wildcard")(wildcard)
    __obj.asInstanceOf[EncryptOptions]
  }
}

