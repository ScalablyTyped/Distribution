package typings.nrwlDevkit

import typings.nrwlDevkit.anon.AppsDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getWorkspaceLayoutMod {
  
  @JSImport("@nrwl/devkit/src/utils/get-workspace-layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWorkspaceLayout(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any
  ): AppsDir = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspaceLayout")(tree.asInstanceOf[js.Any]).asInstanceOf[AppsDir]
}
