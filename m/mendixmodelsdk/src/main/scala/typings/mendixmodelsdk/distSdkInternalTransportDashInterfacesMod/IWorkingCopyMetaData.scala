package typings.mendixmodelsdk.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkingCopyMetaData extends js.Object {
  var avatarUrl: String
  var description: String
  var metaModelVersion: String
  var name: String
  var projectId: String
  var teamServerBaseBranch: js.UndefOr[String] = js.undefined
  var teamServerBaseRevision: js.UndefOr[Double] = js.undefined
}

object IWorkingCopyMetaData {
  @scala.inline
  def apply(
    avatarUrl: String,
    description: String,
    metaModelVersion: String,
    name: String,
    projectId: String,
    teamServerBaseBranch: String = null,
    teamServerBaseRevision: Int | Double = null
  ): IWorkingCopyMetaData = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl, description = description, metaModelVersion = metaModelVersion, name = name, projectId = projectId)
    if (teamServerBaseBranch != null) __obj.updateDynamic("teamServerBaseBranch")(teamServerBaseBranch)
    if (teamServerBaseRevision != null) __obj.updateDynamic("teamServerBaseRevision")(teamServerBaseRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyMetaData]
  }
}

