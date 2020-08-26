package typings.nodeJose.mod.JWE

import typings.node.Buffer
import typings.nodeJose.mod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecryptResult extends js.Object {
  var header: js.Object = js.native
  /**
    * Key used to decrypt
    */
  var key: Key = js.native
  /**
    * Buffer of the decrypted content
    */
  var payload: Buffer = js.native
  /**
    * the decrypted content (alternate)
    */
  var plaintext: Buffer = js.native
  /**
    * an array of the member names from the "protected" member
    */
  var `protected`: js.Array[String] = js.native
}

object DecryptResult {
  @scala.inline
  def apply(header: js.Object, key: Key, payload: Buffer, plaintext: Buffer, `protected`: js.Array[String]): DecryptResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResult]
  }
  @scala.inline
  implicit class DecryptResultOps[Self <: DecryptResult] (val x: Self) extends AnyVal {
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
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: Buffer): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaintext(value: Buffer): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtectedVarargs(value: String*): Self = this.set("protected", js.Array(value :_*))
    @scala.inline
    def setProtected(value: js.Array[String]): Self = this.set("protected", value.asInstanceOf[js.Any])
  }
  
}

