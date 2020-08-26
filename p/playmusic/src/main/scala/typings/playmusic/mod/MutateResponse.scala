package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutateResponse extends js.Object {
  var client_id: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var response_code: js.UndefOr[String] = js.native
}

object MutateResponse {
  @scala.inline
  def apply(): MutateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutateResponse]
  }
  @scala.inline
  implicit class MutateResponseOps[Self <: MutateResponse] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setResponse_code(value: String): Self = this.set("response_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse_code: Self = this.set("response_code", js.undefined)
  }
  
}

