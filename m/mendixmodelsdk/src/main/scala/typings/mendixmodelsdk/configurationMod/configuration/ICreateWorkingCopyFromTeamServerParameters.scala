package typings.mendixmodelsdk.configurationMod.configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateWorkingCopyFromTeamServerParameters extends ICreateWorkingCopyParametersBase {
  @JSName("projectId")
  var projectId_ICreateWorkingCopyFromTeamServerParameters: String
  @JSName("teamServerBaseBranch")
  var teamServerBaseBranch_ICreateWorkingCopyFromTeamServerParameters: String
  var teamServerGitUrl: js.UndefOr[String] = js.undefined
}

object ICreateWorkingCopyFromTeamServerParameters {
  @scala.inline
  def apply(
    name: String,
    projectId: String,
    teamServerBaseBranch: String,
    avatarUrl: String = null,
    description: String = null,
    isCollaboration: js.UndefOr[Boolean] = js.undefined,
    longLived: js.UndefOr[Boolean] = js.undefined,
    markAsChanged: js.UndefOr[Boolean] = js.undefined,
    setAsDefault: js.UndefOr[Boolean] = js.undefined,
    teamServerBaseCommitHash: String = null,
    teamServerBaseRevision: js.UndefOr[Double] = js.undefined,
    teamServerGitUrl: String = null
  ): ICreateWorkingCopyFromTeamServerParameters = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], teamServerBaseBranch = teamServerBaseBranch.asInstanceOf[js.Any])
    if (avatarUrl != null) __obj.updateDynamic("avatarUrl")(avatarUrl.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollaboration)) __obj.updateDynamic("isCollaboration")(isCollaboration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longLived)) __obj.updateDynamic("longLived")(longLived.get.asInstanceOf[js.Any])
    if (!js.isUndefined(markAsChanged)) __obj.updateDynamic("markAsChanged")(markAsChanged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setAsDefault)) __obj.updateDynamic("setAsDefault")(setAsDefault.get.asInstanceOf[js.Any])
    if (teamServerBaseCommitHash != null) __obj.updateDynamic("teamServerBaseCommitHash")(teamServerBaseCommitHash.asInstanceOf[js.Any])
    if (!js.isUndefined(teamServerBaseRevision)) __obj.updateDynamic("teamServerBaseRevision")(teamServerBaseRevision.get.asInstanceOf[js.Any])
    if (teamServerGitUrl != null) __obj.updateDynamic("teamServerGitUrl")(teamServerGitUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateWorkingCopyFromTeamServerParameters]
  }
}

