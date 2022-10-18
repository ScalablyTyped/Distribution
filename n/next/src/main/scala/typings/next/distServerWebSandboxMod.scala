package typings.next

import typings.next.anon.EdgeFunctionEntry
import typings.next.distServerWebSandboxSandboxMod.RunnerFn
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSandboxMod {
  
  @JSImport("next/dist/server/web/sandbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/server/web/sandbox", "ErrorSource")
  @js.native
  val ErrorSource: js.Symbol = js.native
  
  inline def clearModuleContext(path: String, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearModuleContext")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def clearModuleContext(path: String, content: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearModuleContext")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getRuntimeContext(params: EdgeFunctionEntry): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeRuntime<any> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeContext")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeRuntime<any> */ Any
  ]]
  
  @JSImport("next/dist/server/web/sandbox", "run")
  @js.native
  val run: RunnerFn = js.native
}
