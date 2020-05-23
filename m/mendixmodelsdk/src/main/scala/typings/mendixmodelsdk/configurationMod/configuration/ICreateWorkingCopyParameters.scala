package typings.mendixmodelsdk.configurationMod.configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateWorkingCopyParameters extends ICreateWorkingCopyParametersBase {
  /**
    * Path to the (template) MPK file.
    */
  var template: String
}

object ICreateWorkingCopyParameters {
  @scala.inline
  def apply(
    name: String,
    template: String,
    avatarUrl: String = null,
    description: String = null,
    isCollaboration: js.UndefOr[Boolean] = js.undefined,
    longLived: js.UndefOr[Boolean] = js.undefined,
    markAsChanged: js.UndefOr[Boolean] = js.undefined,
    projectId: String = null,
    setAsDefault: js.UndefOr[Boolean] = js.undefined,
    teamServerBaseBranch: String = null,
    teamServerBaseRevision: js.UndefOr[Double] = js.undefined
  ): ICreateWorkingCopyParameters = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (avatarUrl != null) __obj.updateDynamic("avatarUrl")(avatarUrl.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollaboration)) __obj.updateDynamic("isCollaboration")(isCollaboration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longLived)) __obj.updateDynamic("longLived")(longLived.get.asInstanceOf[js.Any])
    if (!js.isUndefined(markAsChanged)) __obj.updateDynamic("markAsChanged")(markAsChanged.get.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(setAsDefault)) __obj.updateDynamic("setAsDefault")(setAsDefault.get.asInstanceOf[js.Any])
    if (teamServerBaseBranch != null) __obj.updateDynamic("teamServerBaseBranch")(teamServerBaseBranch.asInstanceOf[js.Any])
    if (!js.isUndefined(teamServerBaseRevision)) __obj.updateDynamic("teamServerBaseRevision")(teamServerBaseRevision.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateWorkingCopyParameters]
  }
}

