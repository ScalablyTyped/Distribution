package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListRepoWorkflowsResponseWorkflowsItem extends js.Object {
  var badge_url: String
  var created_at: String
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var path: String
  var state: String
  var updated_at: String
  var url: String
}

object ActionsListRepoWorkflowsResponseWorkflowsItem {
  @scala.inline
  def apply(
    badge_url: String,
    created_at: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    path: String,
    state: String,
    updated_at: String,
    url: String
  ): ActionsListRepoWorkflowsResponseWorkflowsItem = {
    val __obj = js.Dynamic.literal(badge_url = badge_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListRepoWorkflowsResponseWorkflowsItem]
  }
}

