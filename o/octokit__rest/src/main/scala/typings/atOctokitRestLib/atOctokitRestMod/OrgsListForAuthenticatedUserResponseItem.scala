package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListForAuthenticatedUserResponseItem extends js.Object {
  var avatar_url: java.lang.String
  var description: java.lang.String
  var events_url: java.lang.String
  var hooks_url: java.lang.String
  var id: scala.Double
  var issues_url: java.lang.String
  var login: java.lang.String
  var members_url: java.lang.String
  var node_id: java.lang.String
  var public_members_url: java.lang.String
  var repos_url: java.lang.String
  var url: java.lang.String
}

object OrgsListForAuthenticatedUserResponseItem {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    description: java.lang.String,
    events_url: java.lang.String,
    hooks_url: java.lang.String,
    id: scala.Double,
    issues_url: java.lang.String,
    login: java.lang.String,
    members_url: java.lang.String,
    node_id: java.lang.String,
    public_members_url: java.lang.String,
    repos_url: java.lang.String,
    url: java.lang.String
  ): OrgsListForAuthenticatedUserResponseItem = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, description = description, events_url = events_url, hooks_url = hooks_url, id = id, issues_url = issues_url, login = login, members_url = members_url, node_id = node_id, public_members_url = public_members_url, repos_url = repos_url, url = url)
  
    __obj.asInstanceOf[OrgsListForAuthenticatedUserResponseItem]
  }
}

