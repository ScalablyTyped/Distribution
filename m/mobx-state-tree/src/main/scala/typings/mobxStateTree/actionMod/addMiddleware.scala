package typings.mobxStateTree.actionMod

import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import typings.mobxStateTree.utilsMod.IDisposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/action", "addMiddleware")
@js.native
object addMiddleware extends js.Object {
  
  def apply(target: IAnyStateTreeNode, handler: IMiddlewareHandler): IDisposer = js.native
  def apply(target: IAnyStateTreeNode, handler: IMiddlewareHandler, includeHooks: Boolean): IDisposer = js.native
}
