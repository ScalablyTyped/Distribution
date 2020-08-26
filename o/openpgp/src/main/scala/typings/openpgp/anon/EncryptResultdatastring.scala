package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  data :string} */
@js.native
trait EncryptResultdatastring extends js.Object {
  var data: String = js.native
  var sessionKey: AeadAlgorithm = js.native
}

object EncryptResultdatastring {
  @scala.inline
  def apply(data: String, sessionKey: AeadAlgorithm): EncryptResultdatastring = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultdatastring]
  }
  @scala.inline
  implicit class EncryptResultdatastringOps[Self <: EncryptResultdatastring] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionKey(value: AeadAlgorithm): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
  }
  
}

