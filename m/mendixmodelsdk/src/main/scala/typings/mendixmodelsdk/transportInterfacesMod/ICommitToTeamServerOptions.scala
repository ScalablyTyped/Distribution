package typings.mendixmodelsdk.transportInterfacesMod

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
    val __obj = js.Dynamic.literal(commitMessage = commitMessage.asInstanceOf[js.Any], targetBranch = targetBranch.asInstanceOf[js.Any], targetRevision = targetRevision.asInstanceOf[js.Any], teamServerPassword = teamServerPassword.asInstanceOf[js.Any], teamServerUsername = teamServerUsername.asInstanceOf[js.Any])
    if (!js.isUndefined(isWebModelerCommit)) __obj.updateDynamic("isWebModelerCommit")(isWebModelerCommit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommitToTeamServerOptions]
  }
}

