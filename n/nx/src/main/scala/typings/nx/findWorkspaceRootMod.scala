package typings.nx

import typings.nx.nxStrings.angular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findWorkspaceRootMod {
  
  @JSImport("nx/src/utils/find-workspace-root", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findWorkspaceRoot(dir: String): WorkspaceTypeAndRoot | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findWorkspaceRoot")(dir.asInstanceOf[js.Any]).asInstanceOf[WorkspaceTypeAndRoot | Null]
  
  trait WorkspaceTypeAndRoot extends StObject {
    
    var dir: String
    
    var `type`: typings.nx.nxStrings.nx | angular
  }
  object WorkspaceTypeAndRoot {
    
    inline def apply(dir: String, `type`: typings.nx.nxStrings.nx | angular): WorkspaceTypeAndRoot = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceTypeAndRoot]
    }
    
    extension [Self <: WorkspaceTypeAndRoot](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.nx.nxStrings.nx | angular): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
