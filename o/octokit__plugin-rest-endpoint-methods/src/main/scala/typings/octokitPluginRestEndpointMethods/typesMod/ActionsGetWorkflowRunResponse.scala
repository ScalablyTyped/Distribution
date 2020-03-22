package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetWorkflowRunResponse extends js.Object {
  var artifacts_url: String
  var cancel_url: String
  var check_suite_url: String
  var conclusion: Null
  var created_at: String
  var event: String
  var head_branch: String
  var head_commit: ActionsGetWorkflowRunResponseHeadCommit
  var head_repository: ActionsGetWorkflowRunResponseHeadRepository
  var head_sha: String
  var html_url: String
  var id: Double
  var jobs_url: String
  var logs_url: String
  var node_id: String
  var pull_requests: js.Array[_]
  var repository: ActionsGetWorkflowRunResponseRepository
  var rerun_url: String
  var run_number: Double
  var status: String
  var updated_at: String
  var url: String
  var workflow_url: String
}

object ActionsGetWorkflowRunResponse {
  @scala.inline
  def apply(
    artifacts_url: String,
    cancel_url: String,
    check_suite_url: String,
    conclusion: Null,
    created_at: String,
    event: String,
    head_branch: String,
    head_commit: ActionsGetWorkflowRunResponseHeadCommit,
    head_repository: ActionsGetWorkflowRunResponseHeadRepository,
    head_sha: String,
    html_url: String,
    id: Double,
    jobs_url: String,
    logs_url: String,
    node_id: String,
    pull_requests: js.Array[_],
    repository: ActionsGetWorkflowRunResponseRepository,
    rerun_url: String,
    run_number: Double,
    status: String,
    updated_at: String,
    url: String,
    workflow_url: String
  ): ActionsGetWorkflowRunResponse = {
    val __obj = js.Dynamic.literal(artifacts_url = artifacts_url.asInstanceOf[js.Any], cancel_url = cancel_url.asInstanceOf[js.Any], check_suite_url = check_suite_url.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], head_branch = head_branch.asInstanceOf[js.Any], head_commit = head_commit.asInstanceOf[js.Any], head_repository = head_repository.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobs_url = jobs_url.asInstanceOf[js.Any], logs_url = logs_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], rerun_url = rerun_url.asInstanceOf[js.Any], run_number = run_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_url = workflow_url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsGetWorkflowRunResponse]
  }
}

