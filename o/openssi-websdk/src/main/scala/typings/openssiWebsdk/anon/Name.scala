package typings.openssiWebsdk.anon

import typings.openssiWebsdk.mod.AgentName
import typings.openssiWebsdk.mod.AgentURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: js.UndefOr[AgentName] = js.undefined
  var url: js.UndefOr[AgentURL] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: AgentName = null, url: AgentURL = null): Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

