package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildAnalysisParseModuleMod {
  
  @JSImport("next/dist/build/analysis/parse-module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseModule(_underscore: String, content: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseModule")(_underscore.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
