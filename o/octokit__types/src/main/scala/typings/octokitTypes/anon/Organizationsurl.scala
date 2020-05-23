package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organizationsurl extends js.Object {
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

object Organizationsurl {
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
  ): Organizationsurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organizationsurl]
  }
}

