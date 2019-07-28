package typings.microsoftteams.microsoftTeamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabInstance extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var channelIsFavorite: js.UndefOr[Boolean] = js.undefined
  var channelName: js.UndefOr[String] = js.undefined
  var entityId: js.UndefOr[String] = js.undefined
  var groupId: js.UndefOr[String] = js.undefined
  var internalTabInstanceId: js.UndefOr[String] = js.undefined
  var lastViewUnixEpochTime: js.UndefOr[String] = js.undefined
  var tabName: String
  var teamId: js.UndefOr[String] = js.undefined
  var teamIsFavorite: js.UndefOr[Boolean] = js.undefined
  var teamName: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object TabInstance {
  @scala.inline
  def apply(
    tabName: String,
    channelId: String = null,
    channelIsFavorite: js.UndefOr[Boolean] = js.undefined,
    channelName: String = null,
    entityId: String = null,
    groupId: String = null,
    internalTabInstanceId: String = null,
    lastViewUnixEpochTime: String = null,
    teamId: String = null,
    teamIsFavorite: js.UndefOr[Boolean] = js.undefined,
    teamName: String = null,
    url: String = null,
    websiteUrl: String = null
  ): TabInstance = {
    val __obj = js.Dynamic.literal(tabName = tabName)
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

