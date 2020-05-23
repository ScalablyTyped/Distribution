package typings.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /**
    * The Microsoft Teams ID for the channel with which the content is associated.
    */
  var channelId: js.UndefOr[String] = js.undefined
  /**
    * The name for the channel with which the content is associated.
    */
  var channelName: js.UndefOr[String] = js.undefined
  /**
    * The developer-defined unique ID for the entity this content points to.
    */
  var entityId: String
  /**
    * The Office 365 group ID for the team with which the content is associated.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var groupId: js.UndefOr[String] = js.undefined
  /**
    * Indication whether the tab is in full-screen mode.
    */
  var isFullScreen: js.UndefOr[Boolean] = js.undefined
  /**
    * The current locale that the user has configured for the app formatted as
    * languageId-countryId (for example, en-us).
    */
  var locale: String
  /**
    * The developer-defined unique ID for the sub-entity this content points to.
    * This field should be used to restore to a specific state within an entity, such as scrolling to or activating a specific piece of content.
    */
  var subEntityId: js.UndefOr[String] = js.undefined
  /**
    * The Microsoft Teams ID for the team with which the content is associated.
    */
  var teamId: js.UndefOr[String] = js.undefined
  /**
    * The name for the team with which the content is associated.
    */
  var teamName: js.UndefOr[String] = js.undefined
  /**
    * The type of the team.
    */
  var teamType: js.UndefOr[TeamType] = js.undefined
  /**
    * The current UI theme.
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * The Azure AD tenant ID of the current user.
    * Because a malicious party can host malicious content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var tid: js.UndefOr[String] = js.undefined
  /**
    * The UPN of the current user.
    * Because a malicious party can host malicious content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var upn: js.UndefOr[String] = js.undefined
}

object Context {
  @scala.inline
  def apply(
    entityId: String,
    locale: String,
    channelId: String = null,
    channelName: String = null,
    groupId: String = null,
    isFullScreen: js.UndefOr[Boolean] = js.undefined,
    subEntityId: String = null,
    teamId: String = null,
    teamName: String = null,
    teamType: TeamType = null,
    theme: String = null,
    tid: String = null,
    upn: String = null
  ): Context = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (!js.isUndefined(isFullScreen)) __obj.updateDynamic("isFullScreen")(isFullScreen.get.asInstanceOf[js.Any])
    if (subEntityId != null) __obj.updateDynamic("subEntityId")(subEntityId.asInstanceOf[js.Any])
    if (teamId != null) __obj.updateDynamic("teamId")(teamId.asInstanceOf[js.Any])
    if (teamName != null) __obj.updateDynamic("teamName")(teamName.asInstanceOf[js.Any])
    if (teamType != null) __obj.updateDynamic("teamType")(teamType.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tid != null) __obj.updateDynamic("tid")(tid.asInstanceOf[js.Any])
    if (upn != null) __obj.updateDynamic("upn")(upn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

