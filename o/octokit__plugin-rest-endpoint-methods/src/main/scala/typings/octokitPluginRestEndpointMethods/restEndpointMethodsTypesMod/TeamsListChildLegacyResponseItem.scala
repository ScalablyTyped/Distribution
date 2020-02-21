package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListChildLegacyResponseItem extends js.Object {
  var description: String
  var id: Double
  var members_url: String
  var name: String
  var node_id: String
  var parent: TeamsListChildLegacyResponseItemParent
  var permission: String
  var privacy: String
  var repositories_url: String
  var slug: String
  var url: String
}

object TeamsListChildLegacyResponseItem {
  @scala.inline
  def apply(
    description: String,
    id: Double,
    members_url: String,
    name: String,
    node_id: String,
    parent: TeamsListChildLegacyResponseItemParent,
    permission: String,
    privacy: String,
    repositories_url: String,
    slug: String,
    url: String
  ): TeamsListChildLegacyResponseItem = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsListChildLegacyResponseItem]
  }
}

