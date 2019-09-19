package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListPullRequestsAssociatedWithCommitResponseItemRequestedTeamsItem extends js.Object {
  var description: String
  var html_url: String
  var id: Double
  var members_url: String
  var name: String
  var node_id: String
  var parent: Null
  var permission: String
  var privacy: String
  var repositories_url: String
  var slug: String
  var url: String
}

object ReposListPullRequestsAssociatedWithCommitResponseItemRequestedTeamsItem {
  @scala.inline
  def apply(
    description: String,
    html_url: String,
    id: Double,
    members_url: String,
    name: String,
    node_id: String,
    parent: Null,
    permission: String,
    privacy: String,
    repositories_url: String,
    slug: String,
    url: String
  ): ReposListPullRequestsAssociatedWithCommitResponseItemRequestedTeamsItem = {
    val __obj = js.Dynamic.literal(description = description, html_url = html_url, id = id, members_url = members_url, name = name, node_id = node_id, parent = parent, permission = permission, privacy = privacy, repositories_url = repositories_url, slug = slug, url = url)
  
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitResponseItemRequestedTeamsItem]
  }
}

