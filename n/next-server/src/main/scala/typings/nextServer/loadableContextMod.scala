package typings.nextServer

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadableContextMod {
  
  @JSImport("next-server/dist/lib/loadable-context", "LoadableContext")
  @js.native
  val LoadableContext: Context[CaptureFn | Null] = js.native
  
  type CaptureFn = js.Function1[/* moduleName */ String, Unit]
}
