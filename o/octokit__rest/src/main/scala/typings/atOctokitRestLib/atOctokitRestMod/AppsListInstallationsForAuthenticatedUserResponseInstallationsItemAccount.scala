package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount extends js.Object {
  var avatar_url: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  var events_url: java.lang.String
  var followers_url: js.UndefOr[java.lang.String] = js.undefined
  var following_url: js.UndefOr[java.lang.String] = js.undefined
  var gists_url: js.UndefOr[java.lang.String] = js.undefined
  var gravatar_id: js.UndefOr[java.lang.String] = js.undefined
  var hooks_url: js.UndefOr[java.lang.String] = js.undefined
  var html_url: js.UndefOr[java.lang.String] = js.undefined
  var id: scala.Double
  var issues_url: js.UndefOr[java.lang.String] = js.undefined
  var login: java.lang.String
  var members_url: js.UndefOr[java.lang.String] = js.undefined
  var node_id: java.lang.String
  var organizations_url: js.UndefOr[java.lang.String] = js.undefined
  var public_members_url: js.UndefOr[java.lang.String] = js.undefined
  var received_events_url: js.UndefOr[java.lang.String] = js.undefined
  var repos_url: java.lang.String
  var site_admin: js.UndefOr[scala.Boolean] = js.undefined
  var starred_url: js.UndefOr[java.lang.String] = js.undefined
  var subscriptions_url: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    events_url: java.lang.String,
    id: scala.Double,
    login: java.lang.String,
    node_id: java.lang.String,
    repos_url: java.lang.String,
    url: java.lang.String,
    description: java.lang.String = null,
    followers_url: java.lang.String = null,
    following_url: java.lang.String = null,
    gists_url: java.lang.String = null,
    gravatar_id: java.lang.String = null,
    hooks_url: java.lang.String = null,
    html_url: java.lang.String = null,
    issues_url: java.lang.String = null,
    members_url: java.lang.String = null,
    organizations_url: java.lang.String = null,
    public_members_url: java.lang.String = null,
    received_events_url: java.lang.String = null,
    site_admin: js.UndefOr[scala.Boolean] = js.undefined,
    starred_url: java.lang.String = null,
    subscriptions_url: java.lang.String = null,
    `type`: java.lang.String = null
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

