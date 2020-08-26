package typings.nodePushnotifications.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clientid extends js.Object {
  var client_id: js.UndefOr[String] = js.native
  var client_secret: js.UndefOr[String] = js.native
}

object Clientid {
  @scala.inline
  def apply(): Clientid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clientid]
  }
  @scala.inline
  implicit class ClientidOps[Self <: Clientid] (val x: Self) extends AnyVal {
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_secret: Self = this.set("client_secret", js.undefined)
  }
  
}

