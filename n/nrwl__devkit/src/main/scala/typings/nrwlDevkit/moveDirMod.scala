package typings.nrwlDevkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveDirMod {
  
  @JSImport("@nrwl/devkit/src/utils/move-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def moveFilesToNewDirectory(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    oldDir: String,
    newDir: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFilesToNewDirectory")(tree.asInstanceOf[js.Any], oldDir.asInstanceOf[js.Any], newDir.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
