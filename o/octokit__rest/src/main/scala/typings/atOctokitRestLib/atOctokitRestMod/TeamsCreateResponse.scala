package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateResponse extends js.Object {
  var created_at: java.lang.String
  var description: java.lang.String
  var id: scala.Double
  var members_count: scala.Double
  var members_url: java.lang.String
  var name: java.lang.String
  var node_id: java.lang.String
  var organization: TeamsCreateResponseOrganization
  var parent: scala.Null
  var permission: java.lang.String
  var privacy: java.lang.String
  var repos_count: scala.Double
  var repositories_url: java.lang.String
  var slug: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object TeamsCreateResponse {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    description: java.lang.String,
    id: scala.Double,
    members_count: scala.Double,
    members_url: java.lang.String,
    name: java.lang.String,
    node_id: java.lang.String,
    organization: TeamsCreateResponseOrganization,
    parent: scala.Null,
    permission: java.lang.String,
    privacy: java.lang.String,
    repos_count: scala.Double,
    repositories_url: java.lang.String,
    slug: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): TeamsCreateResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, description = description, id = id, members_count = members_count, members_url = members_url, name = name, node_id = node_id, organization = organization, parent = parent, permission = permission, privacy = privacy, repos_count = repos_count, repositories_url = repositories_url, slug = slug, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[TeamsCreateResponse]
  }
}

