package typings.mobxStateTree

import typings.mobxStateTree.actionMod.IMiddlewareEvent
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionContextMod {
  
  @JSImport("mobx-state-tree/dist/core/actionContext", "getRunningActionContext")
  @js.native
  def getRunningActionContext(): js.UndefOr[IActionContext] = js.native
  
  @JSImport("mobx-state-tree/dist/core/actionContext", "isActionContextChildOf")
  @js.native
  def isActionContextChildOf(actionContext: IActionContext, parent: Double): Boolean = js.native
  @JSImport("mobx-state-tree/dist/core/actionContext", "isActionContextChildOf")
  @js.native
  def isActionContextChildOf(actionContext: IActionContext, parent: IActionContext): Boolean = js.native
  @JSImport("mobx-state-tree/dist/core/actionContext", "isActionContextChildOf")
  @js.native
  def isActionContextChildOf(actionContext: IActionContext, parent: IMiddlewareEvent): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/core/actionContext", "isActionContextThisOrChildOf")
  @js.native
  def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: Double): Boolean = js.native
  @JSImport("mobx-state-tree/dist/core/actionContext", "isActionContextThisOrChildOf")
  @js.native
  def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: IActionContext): Boolean = js.native
  @JSImport("mobx-state-tree/dist/core/actionContext", "isActionContextThisOrChildOf")
  @js.native
  def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: IMiddlewareEvent): Boolean = js.native
  
  @js.native
  trait IActionContext extends StObject {
    
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
    implicit class IActionContextMutableBuilder[Self <: IActionContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: IAnyStateTreeNode): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentActionEvent(value: IMiddlewareEvent): Self = StObject.set(x, "parentActionEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentActionEventUndefined: Self = StObject.set(x, "parentActionEvent", js.undefined)
      
      @scala.inline
      def setTree(value: IAnyStateTreeNode): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    }
  }
}
