package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassportData extends js.Object {
  var credentials: EncryptedCredentials = js.native
  var data: js.Array[EncryptedPassportElement] = js.native
}

object PassportData {
  @scala.inline
  def apply(credentials: EncryptedCredentials, data: js.Array[EncryptedPassportElement]): PassportData = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassportData]
  }
  @scala.inline
  implicit class PassportDataOps[Self <: PassportData] (val x: Self) extends AnyVal {
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
    def setCredentials(value: EncryptedCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: EncryptedPassportElement*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[EncryptedPassportElement]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

