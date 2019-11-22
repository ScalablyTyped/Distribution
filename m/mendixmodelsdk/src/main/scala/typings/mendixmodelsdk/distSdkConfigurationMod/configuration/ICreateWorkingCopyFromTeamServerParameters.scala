package typings.mendixmodelsdk.distSdkConfigurationMod.configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateWorkingCopyFromTeamServerParameters extends ICreateWorkingCopyParametersBase {
  @JSName("projectId")
  var projectId_ICreateWorkingCopyFromTeamServerParameters: String
  @JSName("teamServerBaseBranch")
  var teamServerBaseBranch_ICreateWorkingCopyFromTeamServerParameters: String
  @JSName("teamServerBaseRevision")
  var teamServerBaseRevision_ICreateWorkingCopyFromTeamServerParameters: Double
}

object ICreateWorkingCopyFromTeamServerParameters {
  @scala.inline
  def apply(
    name: String,
    projectId: String,
    teamServerBaseBranch: String,
    teamServerBaseRevision: Double,
    avatarUrl: String = null,
    description: String = null,
    isCollaboration: js.UndefOr[Boolean] = js.undefined,
    longLived: js.UndefOr[Boolean] = js.undefined,
    markAsChanged: js.UndefOr[Boolean] = js.undefined,
    setAsDefault: js.UndefOr[Boolean] = js.undefined
  ): ICreateWorkingCopyFromTeamServerParameters = {
    val __obj = js.Dynamic.literal(name = name, projectId = projectId, teamServerBaseBranch = teamServerBaseBranch, teamServerBaseRevision = teamServerBaseRevision)
    if (avatarUrl != null) __obj.updateDynamic("avatarUrl")(avatarUrl)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(isCollaboration)) __obj.updateDynamic("isCollaboration")(isCollaboration)
    if (!js.isUndefined(longLived)) __obj.updateDynamic("longLived")(longLived)
    if (!js.isUndefined(markAsChanged)) __obj.updateDynamic("markAsChanged")(markAsChanged)
    if (!js.isUndefined(setAsDefault)) __obj.updateDynamic("setAsDefault")(setAsDefault)
    __obj.asInstanceOf[ICreateWorkingCopyFromTeamServerParameters]
  }
}

