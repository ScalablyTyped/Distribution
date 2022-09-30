package typings.nrwlDevkit

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateFilesMod {
  
  @JSImport("@nrwl/devkit/src/generators/generate-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateFiles(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    srcFolder: String,
    target: String,
    substitutions: StringDictionary[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFiles")(tree.asInstanceOf[js.Any], srcFolder.asInstanceOf[js.Any], target.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
