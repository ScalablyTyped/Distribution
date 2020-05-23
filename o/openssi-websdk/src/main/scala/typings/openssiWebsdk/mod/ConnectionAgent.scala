package typings.openssiWebsdk.mod

import typings.openssiWebsdk.anon.Did
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionAgent extends js.Object {
  var name: AgentName
  var pairwise: Did
  var public: Did
  var role: String
  var url: AgentURL
}

object ConnectionAgent {
  @scala.inline
  def apply(name: AgentName, pairwise: Did, public: Did, role: String, url: AgentURL): ConnectionAgent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairwise = pairwise.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAgent]
  }
}

