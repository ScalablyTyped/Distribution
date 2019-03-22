package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptOptions extends js.Object {
  /**
    * (optional) use the given date for verification instead of the current time
    */
  var date: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * (optional) whether to return data as a string(Stream) or Uint8Array(Stream). If 'utf8' (the default), also normalize newlines.
    */
  var format: js.UndefOr[openpgpLib.openpgpLibStrings.utf8 | openpgpLib.openpgpLibStrings.binary] = js.undefined
  /**
    * the message object with the encrypted data
    */
  var message: openpgpLib.openpgpMod.messageNs.Message
  /**
    * (optional) passwords to decrypt the message
    */
  var passwords: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * (optional) private keys with decrypted secret key data or session key
    */
  var privateKeys: js.UndefOr[openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key]] = js.undefined
  /**
    * (optional) array of public keys or single key, to verify signatures
    */
  var publicKeys: js.UndefOr[openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key]] = js.undefined
  /**
    * (optional) session keys in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKeys: js.UndefOr[openpgpLib.Anon_Algorithm | js.Array[openpgpLib.Anon_Algorithm]] = js.undefined
  /**
    * (optional) detached signature for verification
    */
  var signature: js.UndefOr[openpgpLib.openpgpMod.signatureNs.Signature] = js.undefined
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[
    openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false`
  ] = js.undefined
}

object DecryptOptions {
  @scala.inline
  def apply(
    message: openpgpLib.openpgpMod.messageNs.Message,
    date: stdLib.Date = null,
    format: openpgpLib.openpgpLibStrings.utf8 | openpgpLib.openpgpLibStrings.binary = null,
    passwords: java.lang.String | js.Array[java.lang.String] = null,
    privateKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key] = null,
    publicKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key] = null,
    sessionKeys: openpgpLib.Anon_Algorithm | js.Array[openpgpLib.Anon_Algorithm] = null,
    signature: openpgpLib.openpgpMod.signatureNs.Signature = null,
    streaming: openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false` = null
  ): DecryptOptions = {
    val __obj = js.Dynamic.literal(message = message)
    if (date != null) __obj.updateDynamic("date")(date)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (passwords != null) __obj.updateDynamic("passwords")(passwords.asInstanceOf[js.Any])
    if (privateKeys != null) __obj.updateDynamic("privateKeys")(privateKeys.asInstanceOf[js.Any])
    if (publicKeys != null) __obj.updateDynamic("publicKeys")(publicKeys.asInstanceOf[js.Any])
    if (sessionKeys != null) __obj.updateDynamic("sessionKeys")(sessionKeys.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptOptions]
  }
}

