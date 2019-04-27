package typings
package mendixmodelsdkLib.distSdkConfigMod.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateWorkingCopyParameters extends ICreateWorkingCopyParametersBase {
  /**
    * Path to the (template) MPK file.
    */
  var template: java.lang.String
}

object ICreateWorkingCopyParameters {
  @scala.inline
  def apply(
    name: java.lang.String,
    template: java.lang.String,
    avatarUrl: java.lang.String = null,
    description: java.lang.String = null,
    isCollaboration: js.UndefOr[scala.Boolean] = js.undefined,
    longLived: js.UndefOr[scala.Boolean] = js.undefined,
    markAsChanged: js.UndefOr[scala.Boolean] = js.undefined,
    projectId: java.lang.String = null,
    setAsDefault: js.UndefOr[scala.Boolean] = js.undefined,
    teamServerBaseBranch: java.lang.String = null,
    teamServerBaseRevision: scala.Int | scala.Double = null
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

