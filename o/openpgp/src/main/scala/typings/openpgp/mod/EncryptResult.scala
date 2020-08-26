package typings.openpgp.mod

import typings.openpgp.anon.AeadAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptResult extends js.Object {
  var sessionKey: AeadAlgorithm = js.native
}

object EncryptResult {
  @scala.inline
  def apply(sessionKey: AeadAlgorithm): EncryptResult = {
    val __obj = js.Dynamic.literal(sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResult]
  }
  @scala.inline
  implicit class EncryptResultOps[Self <: EncryptResult] (val x: Self) extends AnyVal {
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
    def setSessionKey(value: AeadAlgorithm): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
  }
  
}

