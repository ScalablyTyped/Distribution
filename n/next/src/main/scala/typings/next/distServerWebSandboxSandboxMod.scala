package typings.next

import typings.next.anon.EdgeFunctionEntry
import typings.next.anon.Env
import typings.next.distServerWebTypesMod.FetchEventResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSandboxSandboxMod {
  
  @JSImport("next/dist/server/web/sandbox/sandbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/server/web/sandbox/sandbox", "ErrorSource")
  @js.native
  val ErrorSource: js.Symbol = js.native
  
  inline def getRuntimeContext(params: EdgeFunctionEntry): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeRuntime<any> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeContext")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeRuntime<any> */ Any
  ]]
  
  @JSImport("next/dist/server/web/sandbox/sandbox", "run")
  @js.native
  val run: RunnerFn = js.native
  
  type RunnerFn = js.Function1[/* params */ Env, js.Promise[FetchEventResult]]
}
