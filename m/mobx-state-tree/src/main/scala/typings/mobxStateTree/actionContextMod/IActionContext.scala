package typings.mobxStateTree.actionContextMod

import typings.mobxStateTree.actionMod.IMiddlewareEvent
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionContext extends js.Object {
  
  /** Event arguments in an array (action arguments for actions) */
  val args: js.Array[_] = js.native
  
  /** Event context (node where the action was invoked) */
  val context: IAnyStateTreeNode = js.native
  
  /** Event unique id */
  val id: Double = js.native
  
  /** Event name (action name for actions) */
  val name: String = js.native
  
  /** Parent action event object */
  val parentActionEvent: js.UndefOr[IMiddlewareEvent] = js.native
  
  /** Event tree (root node of the node where the action was invoked) */
  val tree: IAnyStateTreeNode = js.native
}
object IActionContext {
  
  @scala.inline
  def apply(args: js.Array[_], context: IAnyStateTreeNode, id: Double, name: String, tree: IAnyStateTreeNode): IActionContext = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionContext]
  }
  
  @scala.inline
  implicit class IActionContextOps[Self <: IActionContext] (val x: Self) extends AnyVal {
    
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
    def setParentActionEvent(value: IMiddlewareEvent): Self = this.set("parentActionEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentActionEvent: Self = this.set("parentActionEvent", js.undefined)
  }
}
