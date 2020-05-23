package typings.microsoftteams.microsoftTeams

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
    val __obj = js.Dynamic.literal(tabName = tabName.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (!js.isUndefined(channelIsFavorite)) __obj.updateDynamic("channelIsFavorite")(channelIsFavorite.get.asInstanceOf[js.Any])
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (internalTabInstanceId != null) __obj.updateDynamic("internalTabInstanceId")(internalTabInstanceId.asInstanceOf[js.Any])
    if (lastViewUnixEpochTime != null) __obj.updateDynamic("lastViewUnixEpochTime")(lastViewUnixEpochTime.asInstanceOf[js.Any])
    if (teamId != null) __obj.updateDynamic("teamId")(teamId.asInstanceOf[js.Any])
    if (!js.isUndefined(teamIsFavorite)) __obj.updateDynamic("teamIsFavorite")(teamIsFavorite.get.asInstanceOf[js.Any])
    if (teamName != null) __obj.updateDynamic("teamName")(teamName.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabInstance]
  }
}

