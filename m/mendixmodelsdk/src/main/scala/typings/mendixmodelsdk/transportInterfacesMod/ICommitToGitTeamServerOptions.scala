package typings.mendixmodelsdk.transportInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.git
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommitToGitTeamServerOptions
  extends StObject
     with ICommitToTeamServerBaseOptions
     with ICommitToTeamServerOptions {
  
  var authorEmail: String
  
  var authorName: String
  
  var repositoryType: git
  
  var targetCommitId: String
  
  var teamServerGitUrl: String
}
object ICommitToGitTeamServerOptions {
  
  @scala.inline
  def apply(
    authorEmail: String,
    authorName: String,
    commitMessage: String,
    targetBranch: String,
    targetCommitId: String,
    teamServerGitUrl: String
  ): ICommitToGitTeamServerOptions = {
    val __obj = js.Dynamic.literal(authorEmail = authorEmail.asInstanceOf[js.Any], authorName = authorName.asInstanceOf[js.Any], commitMessage = commitMessage.asInstanceOf[js.Any], repositoryType = "git", targetBranch = targetBranch.asInstanceOf[js.Any], targetCommitId = targetCommitId.asInstanceOf[js.Any], teamServerGitUrl = teamServerGitUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommitToGitTeamServerOptions]
  }
  
  @scala.inline
  implicit class ICommitToGitTeamServerOptionsMutableBuilder[Self <: ICommitToGitTeamServerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorEmail(value: String): Self = StObject.set(x, "authorEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryType(value: git): Self = StObject.set(x, "repositoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCommitId(value: String): Self = StObject.set(x, "targetCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamServerGitUrl(value: String): Self = StObject.set(x, "teamServerGitUrl", value.asInstanceOf[js.Any])
  }
}
