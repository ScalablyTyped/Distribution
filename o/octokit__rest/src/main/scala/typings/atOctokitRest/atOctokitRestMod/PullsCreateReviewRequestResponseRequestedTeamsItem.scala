package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewRequestResponseRequestedTeamsItem extends js.Object {
  var description: String
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

object PullsCreateReviewRequestResponseRequestedTeamsItem {
  @scala.inline
  def apply(
    description: String,
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
  ): PullsCreateReviewRequestResponseRequestedTeamsItem = {
    val __obj = js.Dynamic.literal(description = description, id = id, members_url = members_url, name = name, node_id = node_id, parent = parent, permission = permission, privacy = privacy, repositories_url = repositories_url, slug = slug, url = url)
  
    __obj.asInstanceOf[PullsCreateReviewRequestResponseRequestedTeamsItem]
  }
}

