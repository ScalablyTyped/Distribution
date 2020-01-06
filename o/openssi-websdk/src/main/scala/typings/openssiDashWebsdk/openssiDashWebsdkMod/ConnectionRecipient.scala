package typings.openssiDashWebsdk.openssiDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionRecipient extends js.Object {
  var name: js.UndefOr[AgentName] = js.undefined
  var url: js.UndefOr[AgentURL] = js.undefined
}

object ConnectionRecipient {
  @scala.inline
  def apply(name: AgentName = null, url: AgentURL = null): ConnectionRecipient = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRecipient]
  }
}

