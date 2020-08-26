package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteResponse extends js.Object {
  var agents: js.Array[AgentResponse] = js.native
}

object RouteResponse {
  @scala.inline
  def apply(agents: js.Array[AgentResponse]): RouteResponse = {
    val __obj = js.Dynamic.literal(agents = agents.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteResponse]
  }
  @scala.inline
  implicit class RouteResponseOps[Self <: RouteResponse] (val x: Self) extends AnyVal {
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
    def setAgentsVarargs(value: AgentResponse*): Self = this.set("agents", js.Array(value :_*))
    @scala.inline
    def setAgents(value: js.Array[AgentResponse]): Self = this.set("agents", value.asInstanceOf[js.Any])
  }
  
}

