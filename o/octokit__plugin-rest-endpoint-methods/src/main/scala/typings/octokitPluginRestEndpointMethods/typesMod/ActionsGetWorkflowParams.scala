package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetWorkflowParams extends js.Object {
  var owner: String
  var repo: String
  var workflow_id: Double
}

object ActionsGetWorkflowParams {
  @scala.inline
  def apply(owner: String, repo: String, workflow_id: Double): ActionsGetWorkflowParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsGetWorkflowParams]
  }
}

