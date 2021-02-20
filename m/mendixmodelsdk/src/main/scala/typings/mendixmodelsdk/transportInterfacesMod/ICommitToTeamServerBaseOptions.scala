package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommitToTeamServerBaseOptions extends StObject {
  
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
  implicit class ICommitToTeamServerBaseOptionsMutableBuilder[Self <: ICommitToTeamServerBaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitMessage(value: String): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWebModelerCommit(value: Boolean): Self = StObject.set(x, "isWebModelerCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWebModelerCommitUndefined: Self = StObject.set(x, "isWebModelerCommit", js.undefined)
    
    @scala.inline
    def setTargetBranch(value: String): Self = StObject.set(x, "targetBranch", value.asInstanceOf[js.Any])
  }
}
