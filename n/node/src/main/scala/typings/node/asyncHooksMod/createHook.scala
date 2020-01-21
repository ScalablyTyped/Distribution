package typings.node.asyncHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async_hooks", "createHook")
@js.native
object createHook extends js.Object {
  /**
    * Registers functions to be called for different lifetime events of each async operation.
    * @param options the callbacks to register
    * @return an AsyncHooks instance used for disabling and enabling hooks
    */
  def apply(options: HookCallbacks): AsyncHook = js.native
}

