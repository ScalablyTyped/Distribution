package typings.node.workerThreadsMod

import typings.node.vmMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("worker_threads", "moveMessagePortToContext")
@js.native
object moveMessagePortToContext extends js.Object {
  
  /**
    * Transfer a `MessagePort` to a different `vm` Context. The original `port`
    * object will be rendered unusable, and the returned `MessagePort` instance will
    * take its place.
    *
    * The returned `MessagePort` will be an object in the target context, and will
    * inherit from its global `Object` class. Objects passed to the
    * `port.onmessage()` listener will also be created in the target context
    * and inherit from its global `Object` class.
    *
    * However, the created `MessagePort` will no longer inherit from
    * `EventEmitter`, and only `port.onmessage()` can be used to receive
    * events using it.
    */
  def apply(port: MessagePort, context: Context): MessagePort = js.native
}
