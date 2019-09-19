package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetAuthenticatedResponse extends js.Object {
  var avatar_url: String
  var bio: String
  var blog: String
  var collaborators: js.UndefOr[Double] = js.undefined
  var company: String
  var created_at: String
  var disk_usage: js.UndefOr[Double] = js.undefined
  var email: String
  var events_url: String
  var followers: Double
  var followers_url: String
  var following: Double
  var following_url: String
  var gists_url: String
  var gravatar_id: String
  var hireable: Boolean
  var html_url: String
  var id: Double
  var location: String
  var login: String
  var name: String
  var node_id: String
  var organizations_url: String
  var owned_private_repos: js.UndefOr[Double] = js.undefined
  var plan: js.UndefOr[UsersGetAuthenticatedResponsePlan] = js.undefined
  var private_gists: js.UndefOr[Double] = js.undefined
  var public_gists: Double
  var public_repos: Double
  var received_events_url: String
  var repos_url: String
  var site_admin: Boolean
  var starred_url: String
  var subscriptions_url: String
  var total_private_repos: js.UndefOr[Double] = js.undefined
  var two_factor_authentication: js.UndefOr[Boolean] = js.undefined
  var `type`: String
  var updated_at: String
  var url: String
}

object UsersGetAuthenticatedResponse {
  @scala.inline
  def apply(
    avatar_url: String,
    bio: String,
    blog: String,
    company: String,
    created_at: String,
    email: String,
    events_url: String,
    followers: Double,
    followers_url: String,
    following: Double,
    following_url: String,
    gists_url: String,
    gravatar_id: String,
    hireable: Boolean,
    html_url: String,
    id: Double,
    location: String,
    login: String,
    name: String,
    node_id: String,
    organizations_url: String,
    public_gists: Double,
    public_repos: Double,
    received_events_url: String,
    repos_url: String,
    site_admin: Boolean,
    starred_url: String,
    subscriptions_url: String,
    `type`: String,
    updated_at: String,
    url: String,
    collaborators: Int | Double = null,
    disk_usage: Int | Double = null,
    owned_private_repos: Int | Double = null,
    plan: UsersGetAuthenticatedResponsePlan = null,
    private_gists: Int | Double = null,
    total_private_repos: Int | Double = null,
    two_factor_authentication: js.UndefOr[Boolean] = js.undefined
  ): UsersGetAuthenticatedResponse = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, bio = bio, blog = blog, company = company, created_at = created_at, email = email, events_url = events_url, followers = followers, followers_url = followers_url, following = following, following_url = following_url, gists_url = gists_url, gravatar_id = gravatar_id, hireable = hireable, html_url = html_url, id = id, location = location, login = login, name = name, node_id = node_id, organizations_url = organizations_url, public_gists = public_gists, public_repos = public_repos, received_events_url = received_events_url, repos_url = repos_url, site_admin = site_admin, starred_url = starred_url, subscriptions_url = subscriptions_url, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`)
    if (collaborators != null) __obj.updateDynamic("collaborators")(collaborators.asInstanceOf[js.Any])
    if (disk_usage != null) __obj.updateDynamic("disk_usage")(disk_usage.asInstanceOf[js.Any])
    if (owned_private_repos != null) __obj.updateDynamic("owned_private_repos")(owned_private_repos.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (private_gists != null) __obj.updateDynamic("private_gists")(private_gists.asInstanceOf[js.Any])
    if (total_private_repos != null) __obj.updateDynamic("total_private_repos")(total_private_repos.asInstanceOf[js.Any])
    if (!js.isUndefined(two_factor_authentication)) __obj.updateDynamic("two_factor_authentication")(two_factor_authentication)
    __obj.asInstanceOf[UsersGetAuthenticatedResponse]
  }
}

