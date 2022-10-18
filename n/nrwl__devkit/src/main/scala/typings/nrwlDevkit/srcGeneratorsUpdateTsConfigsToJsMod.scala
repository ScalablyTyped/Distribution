package typings.nrwlDevkit

import typings.nrwlDevkit.anon.ProjectRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeneratorsUpdateTsConfigsToJsMod {
  
  @JSImport("@nrwl/devkit/src/generators/update-ts-configs-to-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateTsConfigsToJs(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    options: ProjectRoot
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTsConfigsToJs")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
