package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsDownloadJobLogsForWorkflowRunEndpoint extends js.Object {
  var job_id: Double
  var owner: String
  var repo: String
}

object ActionsDownloadJobLogsForWorkflowRunEndpoint {
  @scala.inline
  def apply(job_id: Double, owner: String, repo: String): ActionsDownloadJobLogsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDownloadJobLogsForWorkflowRunEndpoint]
  }
}

