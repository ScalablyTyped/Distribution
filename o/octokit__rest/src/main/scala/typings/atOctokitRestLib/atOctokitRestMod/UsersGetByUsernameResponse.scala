package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetByUsernameResponse extends js.Object {
  var avatar_url: java.lang.String
  var bio: java.lang.String
  var blog: java.lang.String
  var company: java.lang.String
  var created_at: java.lang.String
  var email: java.lang.String
  var events_url: java.lang.String
  var followers: scala.Double
  var followers_url: java.lang.String
  var following: scala.Double
  var following_url: java.lang.String
  var gists_url: java.lang.String
  var gravatar_id: java.lang.String
  var hireable: scala.Boolean
  var html_url: java.lang.String
  var id: scala.Double
  var location: java.lang.String
  var login: java.lang.String
  var name: java.lang.String
  var node_id: java.lang.String
  var organizations_url: java.lang.String
  var public_gists: scala.Double
  var public_repos: scala.Double
  var received_events_url: java.lang.String
  var repos_url: java.lang.String
  var site_admin: scala.Boolean
  var starred_url: java.lang.String
  var subscriptions_url: java.lang.String
  var `type`: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object UsersGetByUsernameResponse {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    bio: java.lang.String,
    blog: java.lang.String,
    company: java.lang.String,
    created_at: java.lang.String,
    email: java.lang.String,
    events_url: java.lang.String,
    followers: scala.Double,
    followers_url: java.lang.String,
    following: scala.Double,
    following_url: java.lang.String,
    gists_url: java.lang.String,
    gravatar_id: java.lang.String,
    hireable: scala.Boolean,
    html_url: java.lang.String,
    id: scala.Double,
    location: java.lang.String,
    login: java.lang.String,
    name: java.lang.String,
    node_id: java.lang.String,
    organizations_url: java.lang.String,
    public_gists: scala.Double,
    public_repos: scala.Double,
    received_events_url: java.lang.String,
    repos_url: java.lang.String,
    site_admin: scala.Boolean,
    starred_url: java.lang.String,
    subscriptions_url: java.lang.String,
    `type`: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): UsersGetByUsernameResponse = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, bio = bio, blog = blog, company = company, created_at = created_at, email = email, events_url = events_url, followers = followers, followers_url = followers_url, following = following, following_url = following_url, gists_url = gists_url, gravatar_id = gravatar_id, hireable = hireable, html_url = html_url, id = id, location = location, login = login, name = name, node_id = node_id, organizations_url = organizations_url, public_gists = public_gists, public_repos = public_repos, received_events_url = received_events_url, repos_url = repos_url, site_admin = site_admin, starred_url = starred_url, subscriptions_url = subscriptions_url, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UsersGetByUsernameResponse]
  }
}

