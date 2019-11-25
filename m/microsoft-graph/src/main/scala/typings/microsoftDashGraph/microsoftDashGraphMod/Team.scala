package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Team extends Entity {
  // The collection of channels &amp; messages associated with the team.
  var channels: js.UndefOr[js.Array[Channel]] = js.undefined
  // Settings to configure use of Giphy, memes, and stickers in the team.
  var funSettings: js.UndefOr[TeamFunSettings] = js.undefined
  // Settings to configure whether guests can create, update, or delete channels in the team.
  var guestSettings: js.UndefOr[TeamGuestSettings] = js.undefined
  // The apps installed in this team.
  var installedApps: js.UndefOr[js.Array[TeamsAppInstallation]] = js.undefined
  // Whether this team is in read-only mode.
  var isArchived: js.UndefOr[Boolean] = js.undefined
  /**
    * Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the
    * team.
    */
  var memberSettings: js.UndefOr[TeamMemberSettings] = js.undefined
  // Settings to configure messaging and mentions in the team.
  var messagingSettings: js.UndefOr[TeamMessagingSettings] = js.undefined
  var operations: js.UndefOr[js.Array[TeamsAsyncOperation]] = js.undefined
  /**
    * A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a
    * team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not
    * parsed.
    */
  var webUrl: js.UndefOr[String] = js.undefined
}

object Team {
  @scala.inline
  def apply(
    channels: js.Array[Channel] = null,
    funSettings: TeamFunSettings = null,
    guestSettings: TeamGuestSettings = null,
    id: String = null,
    installedApps: js.Array[TeamsAppInstallation] = null,
    isArchived: js.UndefOr[Boolean] = js.undefined,
    memberSettings: TeamMemberSettings = null,
    messagingSettings: TeamMessagingSettings = null,
    operations: js.Array[TeamsAsyncOperation] = null,
    webUrl: String = null
  ): Team = {
    val __obj = js.Dynamic.literal()
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (funSettings != null) __obj.updateDynamic("funSettings")(funSettings.asInstanceOf[js.Any])
    if (guestSettings != null) __obj.updateDynamic("guestSettings")(guestSettings.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (installedApps != null) __obj.updateDynamic("installedApps")(installedApps.asInstanceOf[js.Any])
    if (!js.isUndefined(isArchived)) __obj.updateDynamic("isArchived")(isArchived.asInstanceOf[js.Any])
    if (memberSettings != null) __obj.updateDynamic("memberSettings")(memberSettings.asInstanceOf[js.Any])
    if (messagingSettings != null) __obj.updateDynamic("messagingSettings")(messagingSettings.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Team]
  }
}

