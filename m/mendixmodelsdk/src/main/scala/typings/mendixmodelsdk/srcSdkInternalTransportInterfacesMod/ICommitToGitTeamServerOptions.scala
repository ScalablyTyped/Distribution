package typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod

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
  
  inline def apply(
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
  
  extension [Self <: ICommitToGitTeamServerOptions](x: Self) {
    
    inline def setAuthorEmail(value: String): Self = StObject.set(x, "authorEmail", value.asInstanceOf[js.Any])
    
    inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryType(value: git): Self = StObject.set(x, "repositoryType", value.asInstanceOf[js.Any])
    
    inline def setTargetCommitId(value: String): Self = StObject.set(x, "targetCommitId", value.asInstanceOf[js.Any])
    
    inline def setTeamServerGitUrl(value: String): Self = StObject.set(x, "teamServerGitUrl", value.asInstanceOf[js.Any])
  }
}
