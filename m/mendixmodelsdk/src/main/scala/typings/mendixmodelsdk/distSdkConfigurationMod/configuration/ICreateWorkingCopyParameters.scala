package typings.mendixmodelsdk.distSdkConfigurationMod.configuration

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
    teamServerBaseRevision: Int | Double = null
  ): ICreateWorkingCopyParameters = {
    val __obj = js.Dynamic.literal(name = name, template = template)
    if (avatarUrl != null) __obj.updateDynamic("avatarUrl")(avatarUrl)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(isCollaboration)) __obj.updateDynamic("isCollaboration")(isCollaboration)
    if (!js.isUndefined(longLived)) __obj.updateDynamic("longLived")(longLived)
    if (!js.isUndefined(markAsChanged)) __obj.updateDynamic("markAsChanged")(markAsChanged)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (!js.isUndefined(setAsDefault)) __obj.updateDynamic("setAsDefault")(setAsDefault)
    if (teamServerBaseBranch != null) __obj.updateDynamic("teamServerBaseBranch")(teamServerBaseBranch)
    if (teamServerBaseRevision != null) __obj.updateDynamic("teamServerBaseRevision")(teamServerBaseRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateWorkingCopyParameters]
  }
}

