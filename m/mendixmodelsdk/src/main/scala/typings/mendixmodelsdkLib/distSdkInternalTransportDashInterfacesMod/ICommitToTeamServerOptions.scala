package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommitToTeamServerOptions extends js.Object {
  var commitMessage: java.lang.String
  var isWebModelerCommit: js.UndefOr[scala.Boolean] = js.undefined
  var targetBranch: java.lang.String
  var targetRevision: scala.Double
  var teamServerPassword: java.lang.String
  var teamServerUsername: java.lang.String
}

object ICommitToTeamServerOptions {
  @scala.inline
  def apply(
    commitMessage: java.lang.String,
    targetBranch: java.lang.String,
    targetRevision: scala.Double,
    teamServerPassword: java.lang.String,
    teamServerUsername: java.lang.String,
    isWebModelerCommit: js.UndefOr[scala.Boolean] = js.undefined
  ): ICommitToTeamServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commitMessage")(commitMessage)
    __obj.updateDynamic("targetBranch")(targetBranch)
    __obj.updateDynamic("targetRevision")(targetRevision)
    __obj.updateDynamic("teamServerPassword")(teamServerPassword)
    __obj.updateDynamic("teamServerUsername")(teamServerUsername)
    if (!js.isUndefined(isWebModelerCommit)) __obj.updateDynamic("isWebModelerCommit")(isWebModelerCommit)
    __obj.asInstanceOf[ICommitToTeamServerOptions]
  }
}

