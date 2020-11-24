package typings.nextServer

import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-server/dist/lib/loadable-context", JSImport.Namespace)
@js.native
object loadableContextMod extends js.Object {
  
  val LoadableContext: Context[CaptureFn | Null] = js.native
  
  type CaptureFn = js.Function1[/* moduleName */ String, Unit]
}
