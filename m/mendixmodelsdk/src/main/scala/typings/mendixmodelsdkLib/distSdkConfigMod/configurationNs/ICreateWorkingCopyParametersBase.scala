package typings
package mendixmodelsdkLib.distSdkConfigMod.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateWorkingCopyParametersBase extends js.Object {
  var avatarUrl: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether the working copy should be long-lived.
    * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
    *  - this excludes regular SDK users for the moment.
    */
  var longLived: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Force the working copy state to be marked to contain changes.
    *  - this excludes regular SDK users for the moment.
    */
  var markAsChanged: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  /**
    * Mendix project id. Needed for deployment and team server commits
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether the new working copy should be the default working copy associated with the provided projectId.
    * This means that this working copy will be opened in the Web Modeler for the given project.
    * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
    *  - this excludes regular SDK users for the moment.
    */
  var setAsDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If this WC is created from a TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge.
    */
  var teamServerBaseBranch: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If this WC is created from a TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge.
    * @type {number}
    */
  var teamServerBaseRevision: js.UndefOr[scala.Double] = js.undefined
}

object ICreateWorkingCopyParametersBase {
  @scala.inline
  def apply(
    name: java.lang.String,
    avatarUrl: java.lang.String = null,
    description: java.lang.String = null,
    longLived: js.UndefOr[scala.Boolean] = js.undefined,
    markAsChanged: js.UndefOr[scala.Boolean] = js.undefined,
    projectId: java.lang.String = null,
    setAsDefault: js.UndefOr[scala.Boolean] = js.undefined,
    teamServerBaseBranch: java.lang.String = null,
    teamServerBaseRevision: scala.Int | scala.Double = null
  ): ICreateWorkingCopyParametersBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (avatarUrl != null) __obj.updateDynamic("avatarUrl")(avatarUrl)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(longLived)) __obj.updateDynamic("longLived")(longLived)
    if (!js.isUndefined(markAsChanged)) __obj.updateDynamic("markAsChanged")(markAsChanged)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (!js.isUndefined(setAsDefault)) __obj.updateDynamic("setAsDefault")(setAsDefault)
    if (teamServerBaseBranch != null) __obj.updateDynamic("teamServerBaseBranch")(teamServerBaseBranch)
    if (teamServerBaseRevision != null) __obj.updateDynamic("teamServerBaseRevision")(teamServerBaseRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateWorkingCopyParametersBase]
  }
}

