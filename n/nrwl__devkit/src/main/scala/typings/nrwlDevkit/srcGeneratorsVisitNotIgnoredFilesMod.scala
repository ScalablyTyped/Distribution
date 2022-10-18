package typings.nrwlDevkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeneratorsVisitNotIgnoredFilesMod {
  
  @JSImport("@nrwl/devkit/src/generators/visit-not-ignored-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def visitNotIgnoredFiles(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    dirPath: String,
    visitor: js.Function1[/* path */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNotIgnoredFiles")(tree.asInstanceOf[js.Any], dirPath.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
