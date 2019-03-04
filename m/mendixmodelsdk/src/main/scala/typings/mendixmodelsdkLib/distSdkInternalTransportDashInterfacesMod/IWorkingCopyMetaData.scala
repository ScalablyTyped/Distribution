package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkingCopyMetaData extends js.Object {
  var avatarUrl: java.lang.String
  var description: java.lang.String
  var metaModelVersion: java.lang.String
  var name: java.lang.String
  var projectId: java.lang.String
  var teamServerBaseBranch: js.UndefOr[java.lang.String] = js.undefined
  var teamServerBaseRevision: js.UndefOr[scala.Double] = js.undefined
}

object IWorkingCopyMetaData {
  @scala.inline
  def apply(
    avatarUrl: java.lang.String,
    description: java.lang.String,
    metaModelVersion: java.lang.String,
    name: java.lang.String,
    projectId: java.lang.String,
    teamServerBaseBranch: java.lang.String = null,
    teamServerBaseRevision: scala.Int | scala.Double = null
  ): IWorkingCopyMetaData = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl, description = description, metaModelVersion = metaModelVersion, name = name, projectId = projectId)
    if (teamServerBaseBranch != null) __obj.updateDynamic("teamServerBaseBranch")(teamServerBaseBranch)
    if (teamServerBaseRevision != null) __obj.updateDynamic("teamServerBaseRevision")(teamServerBaseRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyMetaData]
  }
}

