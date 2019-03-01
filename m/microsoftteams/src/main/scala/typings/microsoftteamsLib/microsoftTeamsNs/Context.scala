package typings
package microsoftteamsLib.microsoftTeamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /**
    * The Microsoft Teams ID for the channel with which the content is associated.
    */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name for the channel with which the content is associated.
    */
  var channelName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The developer-defined unique ID for the entity this content points to.
    */
  var entityId: java.lang.String
  /**
    * The Office 365 group ID for the team with which the content is associated.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indication whether the tab is in full-screen mode.
    */
  var isFullScreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The current locale that the user has configured for the app formatted as
    * languageId-countryId (for example, en-us).
    */
  var locale: java.lang.String
  /**
    * The developer-defined unique ID for the sub-entity this content points to.
    * This field should be used to restore to a specific state within an entity, such as scrolling to or activating a specific piece of content.
    */
  var subEntityId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Microsoft Teams ID for the team with which the content is associated.
    */
  var teamId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name for the team with which the content is associated.
    */
  var teamName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the team.
    */
  var teamType: js.UndefOr[TeamType] = js.undefined
  /**
    * The current UI theme.
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Azure AD tenant ID of the current user.
    * Because a malicious party can host malicious content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var tid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The UPN of the current user.
    * Because a malicious party can host malicious content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var upn: js.UndefOr[java.lang.String] = js.undefined
}

object Context {
  @scala.inline
  def apply(
    entityId: java.lang.String,
    locale: java.lang.String,
    channelId: java.lang.String = null,
    channelName: java.lang.String = null,
    groupId: java.lang.String = null,
    isFullScreen: js.UndefOr[scala.Boolean] = js.undefined,
    subEntityId: java.lang.String = null,
    teamId: java.lang.String = null,
    teamName: java.lang.String = null,
    teamType: TeamType = null,
    theme: java.lang.String = null,
    tid: java.lang.String = null,
    upn: java.lang.String = null
  ): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entityId")(entityId)
    __obj.updateDynamic("locale")(locale)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (channelName != null) __obj.updateDynamic("channelName")(channelName)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (!js.isUndefined(isFullScreen)) __obj.updateDynamic("isFullScreen")(isFullScreen)
    if (subEntityId != null) __obj.updateDynamic("subEntityId")(subEntityId)
    if (teamId != null) __obj.updateDynamic("teamId")(teamId)
    if (teamName != null) __obj.updateDynamic("teamName")(teamName)
    if (teamType != null) __obj.updateDynamic("teamType")(teamType)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tid != null) __obj.updateDynamic("tid")(tid)
    if (upn != null) __obj.updateDynamic("upn")(upn)
    __obj.asInstanceOf[Context]
  }
}

