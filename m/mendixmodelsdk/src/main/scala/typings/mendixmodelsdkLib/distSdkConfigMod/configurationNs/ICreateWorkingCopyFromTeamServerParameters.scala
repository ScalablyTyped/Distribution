package typings
package mendixmodelsdkLib.distSdkConfigMod.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateWorkingCopyFromTeamServerParameters extends ICreateWorkingCopyParametersBase {
  @JSName("projectId")
  var projectId_ICreateWorkingCopyFromTeamServerParameters: java.lang.String
  @JSName("teamServerBaseBranch")
  var teamServerBaseBranch_ICreateWorkingCopyFromTeamServerParameters: java.lang.String
  @JSName("teamServerBaseRevision")
  var teamServerBaseRevision_ICreateWorkingCopyFromTeamServerParameters: scala.Double
}

object ICreateWorkingCopyFromTeamServerParameters {
  @scala.inline
  def apply(
    name: java.lang.String,
    projectId: java.lang.String,
    teamServerBaseBranch: java.lang.String,
    teamServerBaseRevision: scala.Double,
    avatarUrl: java.lang.String = null,
    description: java.lang.String = null,
    isCollaboration: js.UndefOr[scala.Boolean] = js.undefined,
    longLived: js.UndefOr[scala.Boolean] = js.undefined,
    markAsChanged: js.UndefOr[scala.Boolean] = js.undefined,
    setAsDefault: js.UndefOr[scala.Boolean] = js.undefined
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

