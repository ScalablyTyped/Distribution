package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount extends js.Object {
  var avatar_url: String
  var description: js.UndefOr[String] = js.undefined
  var events_url: String
  var followers_url: js.UndefOr[String] = js.undefined
  var following_url: js.UndefOr[String] = js.undefined
  var gists_url: js.UndefOr[String] = js.undefined
  var gravatar_id: js.UndefOr[String] = js.undefined
  var hooks_url: js.UndefOr[String] = js.undefined
  var html_url: js.UndefOr[String] = js.undefined
  var id: Double
  var issues_url: js.UndefOr[String] = js.undefined
  var login: String
  var members_url: js.UndefOr[String] = js.undefined
  var node_id: String
  var organizations_url: js.UndefOr[String] = js.undefined
  var public_members_url: js.UndefOr[String] = js.undefined
  var received_events_url: js.UndefOr[String] = js.undefined
  var repos_url: String
  var site_admin: js.UndefOr[Boolean] = js.undefined
  var starred_url: js.UndefOr[String] = js.undefined
  var subscriptions_url: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: String
}

object AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount {
  @scala.inline
  def apply(
    avatar_url: String,
    events_url: String,
    id: Double,
    login: String,
    node_id: String,
    repos_url: String,
    url: String,
    description: String = null,
    followers_url: String = null,
    following_url: String = null,
    gists_url: String = null,
    gravatar_id: String = null,
    hooks_url: String = null,
    html_url: String = null,
    issues_url: String = null,
    members_url: String = null,
    organizations_url: String = null,
    public_members_url: String = null,
    received_events_url: String = null,
    site_admin: js.UndefOr[Boolean] = js.undefined,
    starred_url: String = null,
    subscriptions_url: String = null,
    `type`: String = null
  ): AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, events_url = events_url, id = id, login = login, node_id = node_id, repos_url = repos_url, url = url)
    if (description != null) __obj.updateDynamic("description")(description)
    if (followers_url != null) __obj.updateDynamic("followers_url")(followers_url)
    if (following_url != null) __obj.updateDynamic("following_url")(following_url)
    if (gists_url != null) __obj.updateDynamic("gists_url")(gists_url)
    if (gravatar_id != null) __obj.updateDynamic("gravatar_id")(gravatar_id)
    if (hooks_url != null) __obj.updateDynamic("hooks_url")(hooks_url)
    if (html_url != null) __obj.updateDynamic("html_url")(html_url)
    if (issues_url != null) __obj.updateDynamic("issues_url")(issues_url)
    if (members_url != null) __obj.updateDynamic("members_url")(members_url)
    if (organizations_url != null) __obj.updateDynamic("organizations_url")(organizations_url)
    if (public_members_url != null) __obj.updateDynamic("public_members_url")(public_members_url)
    if (received_events_url != null) __obj.updateDynamic("received_events_url")(received_events_url)
    if (!js.isUndefined(site_admin)) __obj.updateDynamic("site_admin")(site_admin)
    if (starred_url != null) __obj.updateDynamic("starred_url")(starred_url)
    if (subscriptions_url != null) __obj.updateDynamic("subscriptions_url")(subscriptions_url)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount]
  }
}

