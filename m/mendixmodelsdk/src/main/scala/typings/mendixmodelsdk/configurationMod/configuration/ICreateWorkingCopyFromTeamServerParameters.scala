package typings.mendixmodelsdk.configurationMod.configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICreateWorkingCopyFromTeamServerParameters extends ICreateWorkingCopyParametersBase {
  
  @JSName("projectId")
  var projectId_ICreateWorkingCopyFromTeamServerParameters: String = js.native
  
  @JSName("teamServerBaseBranch")
  var teamServerBaseBranch_ICreateWorkingCopyFromTeamServerParameters: String = js.native
  
  var teamServerGitUrl: js.UndefOr[String] = js.native
}
object ICreateWorkingCopyFromTeamServerParameters {
  
  @scala.inline
  def apply(name: String, projectId: String, teamServerBaseBranch: String): ICreateWorkingCopyFromTeamServerParameters = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], teamServerBaseBranch = teamServerBaseBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateWorkingCopyFromTeamServerParameters]
  }
  
  @scala.inline
  implicit class ICreateWorkingCopyFromTeamServerParametersOps[Self <: ICreateWorkingCopyFromTeamServerParameters] (val x: Self) extends AnyVal {
    
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamServerBaseBranch(value: String): Self = this.set("teamServerBaseBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamServerGitUrl(value: String): Self = this.set("teamServerGitUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamServerGitUrl: Self = this.set("teamServerGitUrl", js.undefined)
  }
}
