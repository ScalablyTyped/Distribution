package typings.openssiDashWebsdk

import typings.openssiDashWebsdk.openssiDashWebsdkMod.AgentName
import typings.openssiDashWebsdk.openssiDashWebsdkMod.AgentURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[AgentName] = js.undefined
  var url: js.UndefOr[AgentURL] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: AgentName = null, url: AgentURL = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

