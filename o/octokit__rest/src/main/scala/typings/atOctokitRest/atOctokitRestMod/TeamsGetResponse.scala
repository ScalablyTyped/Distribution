package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetResponse extends js.Object {
  var created_at: String
  var description: String
  var id: Double
  var members_count: Double
  var members_url: String
  var name: String
  var node_id: String
  var organization: TeamsGetResponseOrganization
  var parent: Null
  var permission: String
  var privacy: String
  var repos_count: Double
  var repositories_url: String
  var slug: String
  var updated_at: String
  var url: String
}

object TeamsGetResponse {
  @scala.inline
  def apply(
    created_at: String,
    description: String,
    id: Double,
    members_count: Double,
    members_url: String,
    name: String,
    node_id: String,
    organization: TeamsGetResponseOrganization,
    parent: Null,
    permission: String,
    privacy: String,
    repos_count: Double,
    repositories_url: String,
    slug: String,
    updated_at: String,
    url: String
  ): TeamsGetResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, description = description, id = id, members_count = members_count, members_url = members_url, name = name, node_id = node_id, organization = organization, parent = parent, permission = permission, privacy = privacy, repos_count = repos_count, repositories_url = repositories_url, slug = slug, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[TeamsGetResponse]
  }
}

