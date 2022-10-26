package typings.next

import typings.next.anon.EnableUndici
import typings.next.anon.EncodedPathsFallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerDevStaticPathsWorkerMod {
  
  @JSImport("next/dist/server/dev/static-paths-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadStaticPaths(param0: EnableUndici): js.Promise[EncodedPathsFallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadStaticPaths")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EncodedPathsFallback]]
  
  type RuntimeConfig = Any
}
