package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListChildResponseItemParent extends js.Object {
  var description: String
  var html_url: String
  var id: Double
  var members_url: String
  var name: String
  var node_id: String
  var permission: String
  var privacy: String
  var repositories_url: String
  var slug: String
  var url: String
}

object TeamsListChildResponseItemParent {
  @scala.inline
  def apply(
    description: String,
    html_url: String,
    id: Double,
    members_url: String,
    name: String,
    node_id: String,
    permission: String,
    privacy: String,
    repositories_url: String,
    slug: String,
    url: String
  ): TeamsListChildResponseItemParent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsListChildResponseItemParent]
  }
}

