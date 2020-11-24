package typings.mobxStateTree.createActionTrackingMiddleware2Mod

import typings.mobxStateTree.actionMod.IMiddlewareEvent
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Readonly<mobx-state-tree.mobx-state-tree/dist/internal.IActionContext> */
@js.native
trait IActionTrackingMiddleware2Call[TEnv] extends js.Object {
  
  val args: js.Array[_] = js.native
  
  val context: IAnyStateTreeNode = js.native
  
  var env: js.UndefOr[TEnv] = js.native
  
  val id: Double = js.native
  
  val name: String = js.native
  
  val parentActionEvent: js.UndefOr[IMiddlewareEvent] = js.native
  
  val parentCall: js.UndefOr[IActionTrackingMiddleware2Call[TEnv]] = js.native
  
  val tree: IAnyStateTreeNode = js.native
}
object IActionTrackingMiddleware2Call {
  
  @scala.inline
  def apply[TEnv](args: js.Array[_], context: IAnyStateTreeNode, id: Double, name: String, tree: IAnyStateTreeNode): IActionTrackingMiddleware2Call[TEnv] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionTrackingMiddleware2Call[TEnv]]
  }
  
  @scala.inline
  implicit class IActionTrackingMiddleware2CallOps[Self <: IActionTrackingMiddleware2Call[_], TEnv] (val x: Self with IActionTrackingMiddleware2Call[TEnv]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: IAnyStateTreeNode): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: IAnyStateTreeNode): Self = this.set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: TEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setParentActionEvent(value: IMiddlewareEvent): Self = this.set("parentActionEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentActionEvent: Self = this.set("parentActionEvent", js.undefined)
    
    @scala.inline
    def setParentCall(value: IActionTrackingMiddleware2Call[TEnv]): Self = this.set("parentCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentCall: Self = this.set("parentCall", js.undefined)
  }
}
