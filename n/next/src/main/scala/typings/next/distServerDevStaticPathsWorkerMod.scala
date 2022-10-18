package typings.next

import typings.next.anon.EncodedPathsFallback
import typings.next.anon.HttpAgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerDevStaticPathsWorkerMod {
  
  @JSImport("next/dist/server/dev/static-paths-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadStaticPaths(
    hasDistDirPathnameServerlessConfigHttpAgentOptionsLocalesDefaultLocaleIsAppPathOriginalAppPath: HttpAgentOptions
  ): js.Promise[EncodedPathsFallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadStaticPaths")(hasDistDirPathnameServerlessConfigHttpAgentOptionsLocalesDefaultLocaleIsAppPathOriginalAppPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EncodedPathsFallback]]
  
  type RuntimeConfig = Any
}
