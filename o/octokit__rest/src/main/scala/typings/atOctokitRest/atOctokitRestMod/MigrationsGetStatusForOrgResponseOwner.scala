package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetStatusForOrgResponseOwner extends js.Object {
  var avatar_url: String
  var description: String
  var events_url: String
  var hooks_url: String
  var id: Double
  var issues_url: String
  var login: String
  var members_url: String
  var node_id: String
  var public_members_url: String
  var repos_url: String
  var url: String
}

object MigrationsGetStatusForOrgResponseOwner {
  @scala.inline
  def apply(
    avatar_url: String,
    description: String,
    events_url: String,
    hooks_url: String,
    id: Double,
    issues_url: String,
    login: String,
    members_url: String,
    node_id: String,
    public_members_url: String,
    repos_url: String,
    url: String
  ): MigrationsGetStatusForOrgResponseOwner = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsGetStatusForOrgResponseOwner]
  }
}

