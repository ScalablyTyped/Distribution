package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUsersResponseItemsItem extends js.Object {
  var avatar_url: String
  var followers_url: String
  var gravatar_id: String
  var html_url: String
  var id: Double
  var login: String
  var node_id: String
  var organizations_url: String
  var received_events_url: String
  var repos_url: String
  var score: Double
  var subscriptions_url: String
  var `type`: String
  var url: String
}

object SearchUsersResponseItemsItem {
  @scala.inline
  def apply(
    avatar_url: String,
    followers_url: String,
    gravatar_id: String,
    html_url: String,
    id: Double,
    login: String,
    node_id: String,
    organizations_url: String,
    received_events_url: String,
    repos_url: String,
    score: Double,
    subscriptions_url: String,
    `type`: String,
    url: String
  ): SearchUsersResponseItemsItem = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, followers_url = followers_url, gravatar_id = gravatar_id, html_url = html_url, id = id, login = login, node_id = node_id, organizations_url = organizations_url, received_events_url = received_events_url, repos_url = repos_url, score = score, subscriptions_url = subscriptions_url, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SearchUsersResponseItemsItem]
  }
}

