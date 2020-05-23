package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsDeleteSelfHostedRunnerFromRepoEndpoint extends js.Object {
  var owner: String
  var repo: String
  var runner_id: Double
}

object ActionsDeleteSelfHostedRunnerFromRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, runner_id: Double): ActionsDeleteSelfHostedRunnerFromRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteSelfHostedRunnerFromRepoEndpoint]
  }
}

