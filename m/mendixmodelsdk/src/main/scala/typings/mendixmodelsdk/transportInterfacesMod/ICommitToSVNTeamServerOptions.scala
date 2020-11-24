package typings.mendixmodelsdk.transportInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.svn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommitToSVNTeamServerOptions
  extends ICommitToTeamServerBaseOptions
     with ICommitToTeamServerOptions {
  
  var repositoryType: js.UndefOr[svn] = js.native
  
  var targetRevision: Double = js.native
  
  var teamServerPassword: String = js.native
  
  var teamServerUsername: String = js.native
}
object ICommitToSVNTeamServerOptions {
  
  @scala.inline
  def apply(
    commitMessage: String,
    targetBranch: String,
    targetRevision: Double,
    teamServerPassword: String,
    teamServerUsername: String
  ): ICommitToSVNTeamServerOptions = {
    val __obj = js.Dynamic.literal(commitMessage = commitMessage.asInstanceOf[js.Any], targetBranch = targetBranch.asInstanceOf[js.Any], targetRevision = targetRevision.asInstanceOf[js.Any], teamServerPassword = teamServerPassword.asInstanceOf[js.Any], teamServerUsername = teamServerUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommitToSVNTeamServerOptions]
  }
  
  @scala.inline
  implicit class ICommitToSVNTeamServerOptionsOps[Self <: ICommitToSVNTeamServerOptions] (val x: Self) extends AnyVal {
    
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
    def setTargetRevision(value: Double): Self = this.set("targetRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamServerPassword(value: String): Self = this.set("teamServerPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamServerUsername(value: String): Self = this.set("teamServerUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryType(value: svn): Self = this.set("repositoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryType: Self = this.set("repositoryType", js.undefined)
  }
}
