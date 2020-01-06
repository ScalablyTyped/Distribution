package typings.openssiDashWebsdk.openssiDashWebsdkMod

import typings.openssiDashWebsdk.Anon_Did
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionAgent extends js.Object {
  var name: AgentName
  var pairwise: Anon_Did
  var public: Anon_Did
  var role: String
  var url: AgentURL
}

object ConnectionAgent {
  @scala.inline
  def apply(name: AgentName, pairwise: Anon_Did, public: Anon_Did, role: String, url: AgentURL): ConnectionAgent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairwise = pairwise.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionAgent]
  }
}

