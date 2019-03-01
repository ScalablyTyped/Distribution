package typings
package microsoftteamsLib.microsoftTeamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabInstance extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var channelIsFavorite: js.UndefOr[scala.Boolean] = js.undefined
  var channelName: js.UndefOr[java.lang.String] = js.undefined
  var entityId: js.UndefOr[java.lang.String] = js.undefined
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  var internalTabInstanceId: js.UndefOr[java.lang.String] = js.undefined
  var lastViewUnixEpochTime: js.UndefOr[java.lang.String] = js.undefined
  var tabName: java.lang.String
  var teamId: js.UndefOr[java.lang.String] = js.undefined
  var teamIsFavorite: js.UndefOr[scala.Boolean] = js.undefined
  var teamName: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object TabInstance {
  @scala.inline
  def apply(
    tabName: java.lang.String,
    channelId: java.lang.String = null,
    channelIsFavorite: js.UndefOr[scala.Boolean] = js.undefined,
    channelName: java.lang.String = null,
    entityId: java.lang.String = null,
    groupId: java.lang.String = null,
    internalTabInstanceId: java.lang.String = null,
    lastViewUnixEpochTime: java.lang.String = null,
    teamId: java.lang.String = null,
    teamIsFavorite: js.UndefOr[scala.Boolean] = js.undefined,
    teamName: java.lang.String = null,
    url: java.lang.String = null,
    websiteUrl: java.lang.String = null
  ): TabInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tabName")(tabName)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (!js.isUndefined(channelIsFavorite)) __obj.updateDynamic("channelIsFavorite")(channelIsFavorite)
    if (channelName != null) __obj.updateDynamic("channelName")(channelName)
    if (entityId != null) __obj.updateDynamic("entityId")(entityId)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (internalTabInstanceId != null) __obj.updateDynamic("internalTabInstanceId")(internalTabInstanceId)
    if (lastViewUnixEpochTime != null) __obj.updateDynamic("lastViewUnixEpochTime")(lastViewUnixEpochTime)
    if (teamId != null) __obj.updateDynamic("teamId")(teamId)
    if (!js.isUndefined(teamIsFavorite)) __obj.updateDynamic("teamIsFavorite")(teamIsFavorite)
    if (teamName != null) __obj.updateDynamic("teamName")(teamName)
    if (url != null) __obj.updateDynamic("url")(url)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[TabInstance]
  }
}

