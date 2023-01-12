package typings.mobxStateTree

import typings.mobxStateTree.distCoreActionMod.IMiddlewareEvent
import typings.mobxStateTree.distCoreNodeNodeUtilsMod.IAnyStateTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreActionContextMod {
  
  @JSImport("mobx-state-tree/dist/core/actionContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRunningActionContext(): js.UndefOr[IActionContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRunningActionContext")().asInstanceOf[js.UndefOr[IActionContext]]
  
  inline def isActionContextChildOf(actionContext: IActionContext, parent: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextChildOf")(actionContext.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isActionContextChildOf(actionContext: IActionContext, parent: IActionContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextChildOf")(actionContext.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isActionContextChildOf(actionContext: IActionContext, parent: IMiddlewareEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextChildOf")(actionContext.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextThisOrChildOf")(actionContext.asInstanceOf[js.Any], parentOrThis.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: IActionContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextThisOrChildOf")(actionContext.asInstanceOf[js.Any], parentOrThis.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: IMiddlewareEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextThisOrChildOf")(actionContext.asInstanceOf[js.Any], parentOrThis.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IActionContext extends StObject {
    
    /** Event arguments in an array (action arguments for actions) */
    val args: js.Array[Any]
    
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
    
    inline def apply(args: js.Array[Any], context: IAnyStateTreeNode, id: Double, name: String, tree: IAnyStateTreeNode): IActionContext = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[IActionContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IActionContext] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setContext(value: IAnyStateTreeNode): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParentActionEvent(value: IMiddlewareEvent): Self = StObject.set(x, "parentActionEvent", value.asInstanceOf[js.Any])
      
      inline def setParentActionEventUndefined: Self = StObject.set(x, "parentActionEvent", js.undefined)
      
      inline def setTree(value: IAnyStateTreeNode): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    }
  }
}
