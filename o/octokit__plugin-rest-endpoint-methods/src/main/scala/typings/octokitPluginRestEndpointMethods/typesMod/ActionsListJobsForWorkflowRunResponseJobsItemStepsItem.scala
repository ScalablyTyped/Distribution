package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListJobsForWorkflowRunResponseJobsItemStepsItem extends js.Object {
  var completed_at: String
  var conclusion: String
  var name: String
  var number: Double
  var started_at: String
  var status: String
}

object ActionsListJobsForWorkflowRunResponseJobsItemStepsItem {
  @scala.inline
  def apply(
    completed_at: String,
    conclusion: String,
    name: String,
    number: Double,
    started_at: String,
    status: String
  ): ActionsListJobsForWorkflowRunResponseJobsItemStepsItem = {
    val __obj = js.Dynamic.literal(completed_at = completed_at.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListJobsForWorkflowRunResponseJobsItemStepsItem]
  }
}

