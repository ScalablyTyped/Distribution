package typings.mobxStateTree

import typings.mobxStateTree.actionMod.IMiddlewareEvent
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionContextMod {
  
  @JSImport("mobx-state-tree/dist/core/actionContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRunningActionContext(): js.UndefOr[IActionContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRunningActionContext")().asInstanceOf[js.UndefOr[IActionContext]]
  
  @scala.inline
  def isActionContextChildOf(actionContext: IActionContext, parent: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextChildOf")(actionContext.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isActionContextChildOf(actionContext: IActionContext, parent: IActionContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextChildOf")(actionContext.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isActionContextChildOf(actionContext: IActionContext, parent: IMiddlewareEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextChildOf")(actionContext.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextThisOrChildOf")(actionContext.asInstanceOf[js.Any], parentOrThis.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: IActionContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextThisOrChildOf")(actionContext.asInstanceOf[js.Any], parentOrThis.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: IMiddlewareEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextThisOrChildOf")(actionContext.asInstanceOf[js.Any], parentOrThis.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IActionContext extends StObject {
    
    /** Event arguments in an array (action arguments for actions) */
    val args: js.Array[js.Any]
    
    /** Event context (node where the action was invoked) */
    val context: IAnyStateTreeNode
    
    /** Event unique id */
    val id: Double
    
    /** Event name (action name for actions) */
    val name: String
    
    /** Parent action event object */
    val parentActionEvent: js.UndefOr[IMiddlewareEvent] = js.undefined
    
    /** Event tree (root node of the node where the action was invoked) */
    val tree: IAnyStateTreeNode
  }
  object IActionContext {
    
    @scala.inline
    def apply(
      args: js.Array[js.Any],
      context: IAnyStateTreeNode,
      id: Double,
      name: String,
      tree: IAnyStateTreeNode
    ): IActionContext = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[IActionContext]
    }
    
    @scala.inline
    implicit class IActionContextMutableBuilder[Self <: IActionContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
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
