package typings.mendixmodelsdk.transportInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.git
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommitToGitTeamServerOptions
  extends ICommitToTeamServerBaseOptions
     with ICommitToTeamServerOptions {
  
  var authorEmail: String = js.native
  
  var authorName: String = js.native
  
  var repositoryType: git = js.native
  
  var targetCommitId: String = js.native
  
  var teamServerGitUrl: String = js.native
}
object ICommitToGitTeamServerOptions {
  
  @scala.inline
  def apply(
    authorEmail: String,
    authorName: String,
    commitMessage: String,
    repositoryType: git,
    targetBranch: String,
    targetCommitId: String,
    teamServerGitUrl: String
  ): ICommitToGitTeamServerOptions = {
    val __obj = js.Dynamic.literal(authorEmail = authorEmail.asInstanceOf[js.Any], authorName = authorName.asInstanceOf[js.Any], commitMessage = commitMessage.asInstanceOf[js.Any], repositoryType = repositoryType.asInstanceOf[js.Any], targetBranch = targetBranch.asInstanceOf[js.Any], targetCommitId = targetCommitId.asInstanceOf[js.Any], teamServerGitUrl = teamServerGitUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommitToGitTeamServerOptions]
  }
  
  @scala.inline
  implicit class ICommitToGitTeamServerOptionsOps[Self <: ICommitToGitTeamServerOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthorEmail(value: String): Self = this.set("authorEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorName(value: String): Self = this.set("authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryType(value: git): Self = this.set("repositoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCommitId(value: String): Self = this.set("targetCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamServerGitUrl(value: String): Self = this.set("teamServerGitUrl", value.asInstanceOf[js.Any])
  }
}
