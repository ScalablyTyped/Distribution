package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateResponseMilestoneCreator extends js.Object {
  var avatar_url: java.lang.String
  var events_url: java.lang.String
  var followers_url: java.lang.String
  var following_url: java.lang.String
  var gists_url: java.lang.String
  var gravatar_id: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var login: java.lang.String
  var node_id: java.lang.String
  var organizations_url: java.lang.String
  var received_events_url: java.lang.String
  var repos_url: java.lang.String
  var site_admin: scala.Boolean
  var starred_url: java.lang.String
  var subscriptions_url: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object IssuesCreateResponseMilestoneCreator {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    events_url: java.lang.String,
    followers_url: java.lang.String,
    following_url: java.lang.String,
    gists_url: java.lang.String,
    gravatar_id: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    login: java.lang.String,
    node_id: java.lang.String,
    organizations_url: java.lang.String,
    received_events_url: java.lang.String,
    repos_url: java.lang.String,
    site_admin: scala.Boolean,
    starred_url: java.lang.String,
    subscriptions_url: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): IssuesCreateResponseMilestoneCreator = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, events_url = events_url, followers_url = followers_url, following_url = following_url, gists_url = gists_url, gravatar_id = gravatar_id, html_url = html_url, id = id, login = login, node_id = node_id, organizations_url = organizations_url, received_events_url = received_events_url, repos_url = repos_url, site_admin = site_admin, starred_url = starred_url, subscriptions_url = subscriptions_url, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IssuesCreateResponseMilestoneCreator]
  }
}

