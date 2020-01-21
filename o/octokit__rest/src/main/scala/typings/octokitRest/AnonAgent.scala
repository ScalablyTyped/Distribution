package typings.octokitRest

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAgent extends js.Object {
  var agent: js.UndefOr[Agent] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonAgent {
  @scala.inline
  def apply(agent: Agent = null, timeout: Int | Double = null): AnonAgent = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAgent]
  }
}

