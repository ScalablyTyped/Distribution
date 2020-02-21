package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListJobsForWorkflowRunResponseJobsItem extends js.Object {
  var check_run_url: String
  var completed_at: String
  var conclusion: String
  var head_sha: String
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var run_id: Double
  var run_url: String
  var started_at: String
  var status: String
  var steps: js.Array[ActionsListJobsForWorkflowRunResponseJobsItemStepsItem]
  var url: String
}

object ActionsListJobsForWorkflowRunResponseJobsItem {
  @scala.inline
  def apply(
    check_run_url: String,
    completed_at: String,
    conclusion: String,
    head_sha: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    run_id: Double,
    run_url: String,
    started_at: String,
    status: String,
    steps: js.Array[ActionsListJobsForWorkflowRunResponseJobsItemStepsItem],
    url: String
  ): ActionsListJobsForWorkflowRunResponseJobsItem = {
    val __obj = js.Dynamic.literal(check_run_url = check_run_url.asInstanceOf[js.Any], completed_at = completed_at.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any], run_url = run_url.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListJobsForWorkflowRunResponseJobsItem]
  }
}

