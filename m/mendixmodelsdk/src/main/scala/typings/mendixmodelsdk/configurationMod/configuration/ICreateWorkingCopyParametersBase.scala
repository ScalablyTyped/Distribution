package typings.mendixmodelsdk.configurationMod.configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateWorkingCopyParametersBase extends js.Object {
  var avatarUrl: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether this WC is created for the purpose of collaboration between the Desktop modeler and Webmodeler.
    * By setting this, BiDi won't be available anymore for this project and thus requires a modeler with version 7.23.3 or higher.
    */
  var isCollaboration: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the working copy should be long-lived.
    * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
    *  - this excludes regular SDK users for the moment.
    */
  var longLived: js.UndefOr[Boolean] = js.undefined
  /**
    * Force the working copy state to be marked to contain changes.
    *  - this excludes regular SDK users for the moment.
    */
  var markAsChanged: js.UndefOr[Boolean] = js.undefined
  var name: String
  /**
    * Mendix project id. Needed for deployment and team server commits
    */
  var projectId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the new working copy should be the default working copy associated with the provided projectId.
    * This means that this working copy will be opened in the Web Modeler for the given project.
    * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
    *  - this excludes regular SDK users for the moment.
    */
  var setAsDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * If this WC is created from a TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge.
    */
  var teamServerBaseBranch: js.UndefOr[String] = js.undefined
  /**
    * If this WC is created from a TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge.
    * @type {number}
    */
  var teamServerBaseRevision: js.UndefOr[Double] = js.undefined
}

object ICreateWorkingCopyParametersBase {
  @scala.inline
  def apply(
    name: String,
    avatarUrl: String = null,
    description: String = null,
    isCollaboration: js.UndefOr[Boolean] = js.undefined,
    longLived: js.UndefOr[Boolean] = js.undefined,
    markAsChanged: js.UndefOr[Boolean] = js.undefined,
    projectId: String = null,
    setAsDefault: js.UndefOr[Boolean] = js.undefined,
    teamServerBaseBranch: String = null,
    teamServerBaseRevision: Int | Double = null
  ): ICreateWorkingCopyParametersBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (avatarUrl != null) __obj.updateDynamic("avatarUrl")(avatarUrl.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollaboration)) __obj.updateDynamic("isCollaboration")(isCollaboration.asInstanceOf[js.Any])
    if (!js.isUndefined(longLived)) __obj.updateDynamic("longLived")(longLived.asInstanceOf[js.Any])
    if (!js.isUndefined(markAsChanged)) __obj.updateDynamic("markAsChanged")(markAsChanged.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(setAsDefault)) __obj.updateDynamic("setAsDefault")(setAsDefault.asInstanceOf[js.Any])
    if (teamServerBaseBranch != null) __obj.updateDynamic("teamServerBaseBranch")(teamServerBaseBranch.asInstanceOf[js.Any])
    if (teamServerBaseRevision != null) __obj.updateDynamic("teamServerBaseRevision")(teamServerBaseRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateWorkingCopyParametersBase]
  }
}

