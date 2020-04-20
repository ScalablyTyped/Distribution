package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCombinedStatusForRefResponseStatusesItem extends js.Object {
  var avatar_url: String
  var context: String
  var created_at: String
  var description: String
  var id: Double
  var node_id: String
  var state: String
  var target_url: String
  var updated_at: String
  var url: String
}

object ReposGetCombinedStatusForRefResponseStatusesItem {
  @scala.inline
  def apply(
    avatar_url: String,
    context: String,
    created_at: String,
    description: String,
    id: Double,
    node_id: String,
    state: String,
    target_url: String,
    updated_at: String,
    url: String
  ): ReposGetCombinedStatusForRefResponseStatusesItem = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCombinedStatusForRefResponseStatusesItem]
  }
}

