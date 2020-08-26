package typings.openpgp.mod

import typings.openpgp.mod.cleartext.CleartextMessage
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

@js.native
trait VerifyOptions extends js.Object {
  /**
    * (optional) use the given date for verification instead of the current time
    */
  var date: js.UndefOr[Date] = js.native
  /**
    * (cleartext) message object with signatures
    */
  var message: CleartextMessage | Message = js.native
  /**
    * array of publicKeys or single key, to verify signatures
    */
  var publicKeys: Key | js.Array[_] = js.native
  /**
    * (optional) detached signature for verification
    */
  var signature: js.UndefOr[Signature] = js.native
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.native
}

object VerifyOptions {
  @scala.inline
  def apply(message: CleartextMessage | Message, publicKeys: Key | js.Array[_]): VerifyOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], publicKeys = publicKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions]
  }
  @scala.inline
  implicit class VerifyOptionsOps[Self <: VerifyOptions] (val x: Self) extends AnyVal {
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
    def setMessage(value: CleartextMessage | Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKeysVarargs(value: js.Any*): Self = this.set("publicKeys", js.Array(value :_*))
    @scala.inline
    def setPublicKeys(value: Key | js.Array[_]): Self = this.set("publicKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setSignature(value: Signature): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    @scala.inline
    def setStreaming(value: web | node | `false`): Self = this.set("streaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreaming: Self = this.set("streaming", js.undefined)
  }
  
}

