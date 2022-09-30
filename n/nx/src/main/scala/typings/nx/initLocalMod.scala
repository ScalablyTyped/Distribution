package typings.nx

import typings.nx.findWorkspaceRootMod.WorkspaceTypeAndRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initLocalMod {
  
  @JSImport("nx/bin/init-local", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initLocal(workspace: WorkspaceTypeAndRoot): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initLocal")(workspace.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
