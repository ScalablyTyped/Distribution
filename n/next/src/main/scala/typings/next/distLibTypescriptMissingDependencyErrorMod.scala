package typings.next

import typings.next.distLibHasNecessaryDependenciesMod.MissingDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTypescriptMissingDependencyErrorMod {
  
  @JSImport("next/dist/lib/typescript/missingDependencyError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def missingDepsError(dir: String, missingPackages: js.Array[MissingDependency]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("missingDepsError")(dir.asInstanceOf[js.Any], missingPackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
