package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsRemoveSelfHostedRunnerParams extends js.Object {
  var owner: String
  var repo: String
  var runner_id: Double
}

object ActionsRemoveSelfHostedRunnerParams {
  @scala.inline
  def apply(owner: String, repo: String, runner_id: Double): ActionsRemoveSelfHostedRunnerParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsRemoveSelfHostedRunnerParams]
  }
}

