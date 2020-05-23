package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooksurl extends js.Object {
  var avatar_url: String
  var description: String
  var events_url: String
  var followers_url: String
  var following_url: String
  var gists_url: String
  var gravatar_id: String
  var hooks_url: String
  var html_url: String
  var id: Double
  var issues_url: String
  var login: String
  var members_url: String
  var node_id: String
  var organizations_url: String
  var public_members_url: String
  var received_events_url: String
  var repos_url: String
  var site_admin: Boolean
  var starred_url: String
  var subscriptions_url: String
  var `type`: String
  var url: String
}

object Hooksurl {
  @scala.inline
  def apply(
    avatar_url: String,
    description: String,
    events_url: String,
    followers_url: String,
    following_url: String,
    gists_url: String,
    gravatar_id: String,
    hooks_url: String,
    html_url: String,
    id: Double,
    issues_url: String,
    login: String,
    members_url: String,
    node_id: String,
    organizations_url: String,
    public_members_url: String,
    received_events_url: String,
    repos_url: String,
    site_admin: Boolean,
    starred_url: String,
    subscriptions_url: String,
    `type`: String,
    url: String
  ): Hooksurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hooksurl]
  }
}

