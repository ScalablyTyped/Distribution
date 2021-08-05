package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommitToTeamServerBaseOptions extends StObject {
  
  var commitMessage: String
  
  var isWebModelerCommit: js.UndefOr[Boolean] = js.undefined
  
  var targetBranch: String
}
object ICommitToTeamServerBaseOptions {
  
  inline def apply(commitMessage: String, targetBranch: String): ICommitToTeamServerBaseOptions = {
    val __obj = js.Dynamic.literal(commitMessage = commitMessage.asInstanceOf[js.Any], targetBranch = targetBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommitToTeamServerBaseOptions]
  }
  
  extension [Self <: ICommitToTeamServerBaseOptions](x: Self) {
    
    inline def setCommitMessage(value: String): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
    
    inline def setIsWebModelerCommit(value: Boolean): Self = StObject.set(x, "isWebModelerCommit", value.asInstanceOf[js.Any])
    
    inline def setIsWebModelerCommitUndefined: Self = StObject.set(x, "isWebModelerCommit", js.undefined)
    
    inline def setTargetBranch(value: String): Self = StObject.set(x, "targetBranch", value.asInstanceOf[js.Any])
  }
}
