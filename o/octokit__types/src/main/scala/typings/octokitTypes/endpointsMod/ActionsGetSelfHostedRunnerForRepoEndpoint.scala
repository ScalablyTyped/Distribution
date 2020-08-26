package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsGetSelfHostedRunnerForRepoEndpoint extends js.Object {
  var owner: String = js.native
  var repo: String = js.native
  var runner_id: Double = js.native
}

object ActionsGetSelfHostedRunnerForRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, runner_id: Double): ActionsGetSelfHostedRunnerForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetSelfHostedRunnerForRepoEndpoint]
  }
  @scala.inline
  implicit class ActionsGetSelfHostedRunnerForRepoEndpointOps[Self <: ActionsGetSelfHostedRunnerForRepoEndpoint] (val x: Self) extends AnyVal {
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunner_id(value: Double): Self = this.set("runner_id", value.asInstanceOf[js.Any])
  }
  
}

