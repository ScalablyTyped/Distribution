package typings.mendixmodelsdk.distSdkInternalTransportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommitToTeamServerOptions extends js.Object {
  var commitMessage: String
  var isWebModelerCommit: js.UndefOr[Boolean] = js.undefined
  var targetBranch: String
  var targetRevision: Double
  var teamServerPassword: String
  var teamServerUsername: String
}

object ICommitToTeamServerOptions {
  @scala.inline
  def apply(
    commitMessage: String,
    targetBranch: String,
    targetRevision: Double,
    teamServerPassword: String,
    teamServerUsername: String,
    isWebModelerCommit: js.UndefOr[Boolean] = js.undefined
  ): ICommitToTeamServerOptions = {
    val __obj = js.Dynamic.literal(commitMessage = commitMessage, targetBranch = targetBranch, targetRevision = targetRevision, teamServerPassword = teamServerPassword, teamServerUsername = teamServerUsername)
    if (!js.isUndefined(isWebModelerCommit)) __obj.updateDynamic("isWebModelerCommit")(isWebModelerCommit)
    __obj.asInstanceOf[ICommitToTeamServerOptions]
  }
}

