package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestRecipient extends js.Object {
  var did: js.UndefOr[DID] = js.native
  var name: js.UndefOr[AgentName] = js.native
}

object RequestRecipient {
  @scala.inline
  def apply(): RequestRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestRecipient]
  }
  @scala.inline
  implicit class RequestRecipientOps[Self <: RequestRecipient] (val x: Self) extends AnyVal {
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
    def setDid(value: DID): Self = this.set("did", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDid: Self = this.set("did", js.undefined)
    @scala.inline
    def setName(value: AgentName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

