package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptedCredentials extends js.Object {
  var data: String = js.native
  var hash: String = js.native
  var secret: String = js.native
}

object EncryptedCredentials {
  @scala.inline
  def apply(data: String, hash: String, secret: String): EncryptedCredentials = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedCredentials]
  }
  @scala.inline
  implicit class EncryptedCredentialsOps[Self <: EncryptedCredentials] (val x: Self) extends AnyVal {
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
  }
  
}

