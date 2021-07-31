package typings.mendixmodelsdk.transportInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.svn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommitToSVNTeamServerOptions
  extends StObject
     with ICommitToTeamServerBaseOptions
     with ICommitToTeamServerOptions {
  
  var repositoryType: js.UndefOr[svn] = js.undefined
  
  var targetRevision: Double
  
  var teamServerPassword: String
  
  var teamServerUsername: String
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
  implicit class ICommitToSVNTeamServerOptionsMutableBuilder[Self <: ICommitToSVNTeamServerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryType(value: svn): Self = StObject.set(x, "repositoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryTypeUndefined: Self = StObject.set(x, "repositoryType", js.undefined)
    
    @scala.inline
    def setTargetRevision(value: Double): Self = StObject.set(x, "targetRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamServerPassword(value: String): Self = StObject.set(x, "teamServerPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamServerUsername(value: String): Self = StObject.set(x, "teamServerUsername", value.asInstanceOf[js.Any])
  }
}
