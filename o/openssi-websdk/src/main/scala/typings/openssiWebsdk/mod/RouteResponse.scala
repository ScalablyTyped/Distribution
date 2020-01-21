package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteResponse extends js.Object {
  var agents: js.Array[AgentResponse]
}

object RouteResponse {
  @scala.inline
  def apply(agents: js.Array[AgentResponse]): RouteResponse = {
    val __obj = js.Dynamic.literal(agents = agents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteResponse]
  }
}

