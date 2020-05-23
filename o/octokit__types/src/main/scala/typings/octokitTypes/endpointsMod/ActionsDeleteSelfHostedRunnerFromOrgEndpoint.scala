package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsDeleteSelfHostedRunnerFromOrgEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var runner_id: Double
}

object ActionsDeleteSelfHostedRunnerFromOrgEndpoint {
  @scala.inline
  def apply(org_ : String, runner_id: Double): ActionsDeleteSelfHostedRunnerFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(runner_id = runner_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteSelfHostedRunnerFromOrgEndpoint]
  }
}

