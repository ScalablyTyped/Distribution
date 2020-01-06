package typings.openssiDashWebsdk.openssiDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestRecipient extends js.Object {
  var did: js.UndefOr[DID] = js.undefined
  var name: js.UndefOr[AgentName] = js.undefined
}

object RequestRecipient {
  @scala.inline
  def apply(did: DID = null, name: AgentName = null): RequestRecipient = {
    val __obj = js.Dynamic.literal()
    if (did != null) __obj.updateDynamic("did")(did.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestRecipient]
  }
}

