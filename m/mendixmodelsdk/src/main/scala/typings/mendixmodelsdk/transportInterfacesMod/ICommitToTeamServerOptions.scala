package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommitToTeamServerOptions extends js.Object {
  var commitMessage: String = js.native
  var isWebModelerCommit: js.UndefOr[Boolean] = js.native
  var targetBranch: String = js.native
  var targetRevision: Double = js.native
  var teamServerPassword: String = js.native
  var teamServerUsername: String = js.native
}

object ICommitToTeamServerOptions {
  @scala.inline
  def apply(
    commitMessage: String,
    targetBranch: String,
    targetRevision: Double,
    teamServerPassword: String,
    teamServerUsername: String
  ): ICommitToTeamServerOptions = {
    val __obj = js.Dynamic.literal(commitMessage = commitMessage.asInstanceOf[js.Any], targetBranch = targetBranch.asInstanceOf[js.Any], targetRevision = targetRevision.asInstanceOf[js.Any], teamServerPassword = teamServerPassword.asInstanceOf[js.Any], teamServerUsername = teamServerUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommitToTeamServerOptions]
  }
  @scala.inline
  implicit class ICommitToTeamServerOptionsOps[Self <: ICommitToTeamServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommitMessage(value: String): Self = this.set("commitMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetBranch(value: String): Self = this.set("targetBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetRevision(value: Double): Self = this.set("targetRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamServerPassword(value: String): Self = this.set("teamServerPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamServerUsername(value: String): Self = this.set("teamServerUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWebModelerCommit(value: Boolean): Self = this.set("isWebModelerCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWebModelerCommit: Self = this.set("isWebModelerCommit", js.undefined)
  }
  
}

