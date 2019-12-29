package typings.nextDashServer

import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/lib/loadable-context", JSImport.Namespace)
@js.native
object distLibLoadableDashContextMod extends js.Object {
  val LoadableContext: Context[CaptureFn | Null] = js.native
  type CaptureFn = js.Function1[/* moduleName */ String, Unit]
}

