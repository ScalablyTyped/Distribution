package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommitToTeamServerBaseOptions extends js.Object {
  
  var commitMessage: String = js.native
  
  var isWebModelerCommit: js.UndefOr[Boolean] = js.native
  
  var targetBranch: String = js.native
}
object ICommitToTeamServerBaseOptions {
  
  @scala.inline
  def apply(commitMessage: String, targetBranch: String): ICommitToTeamServerBaseOptions = {
    val __obj = js.Dynamic.literal(commitMessage = commitMessage.asInstanceOf[js.Any], targetBranch = targetBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommitToTeamServerBaseOptions]
  }
  
  @scala.inline
  implicit class ICommitToTeamServerBaseOptionsOps[Self <: ICommitToTeamServerBaseOptions] (val x: Self) extends AnyVal {
    
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
    def setIsWebModelerCommit(value: Boolean): Self = this.set("isWebModelerCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWebModelerCommit: Self = this.set("isWebModelerCommit", js.undefined)
  }
}
