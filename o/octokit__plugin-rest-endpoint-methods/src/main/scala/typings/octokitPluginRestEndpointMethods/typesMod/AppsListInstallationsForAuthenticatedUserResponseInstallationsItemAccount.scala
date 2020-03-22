package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (followers_url != null) __obj.updateDynamic("followers_url")(followers_url.asInstanceOf[js.Any])
    if (following_url != null) __obj.updateDynamic("following_url")(following_url.asInstanceOf[js.Any])
    if (gists_url != null) __obj.updateDynamic("gists_url")(gists_url.asInstanceOf[js.Any])
    if (gravatar_id != null) __obj.updateDynamic("gravatar_id")(gravatar_id.asInstanceOf[js.Any])
    if (hooks_url != null) __obj.updateDynamic("hooks_url")(hooks_url.asInstanceOf[js.Any])
    if (html_url != null) __obj.updateDynamic("html_url")(html_url.asInstanceOf[js.Any])
    if (issues_url != null) __obj.updateDynamic("issues_url")(issues_url.asInstanceOf[js.Any])
    if (members_url != null) __obj.updateDynamic("members_url")(members_url.asInstanceOf[js.Any])
    if (organizations_url != null) __obj.updateDynamic("organizations_url")(organizations_url.asInstanceOf[js.Any])
    if (public_members_url != null) __obj.updateDynamic("public_members_url")(public_members_url.asInstanceOf[js.Any])
    if (received_events_url != null) __obj.updateDynamic("received_events_url")(received_events_url.asInstanceOf[js.Any])
    if (!js.isUndefined(site_admin)) __obj.updateDynamic("site_admin")(site_admin.asInstanceOf[js.Any])
    if (starred_url != null) __obj.updateDynamic("starred_url")(starred_url.asInstanceOf[js.Any])
    if (subscriptions_url != null) __obj.updateDynamic("subscriptions_url")(subscriptions_url.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount]
  }
}

