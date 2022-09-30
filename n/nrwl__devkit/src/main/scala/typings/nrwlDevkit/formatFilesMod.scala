package typings.nrwlDevkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilesMod {
  
  @JSImport("@nrwl/devkit/src/generators/format-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatFiles(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatFiles")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
