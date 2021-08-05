package typings.mobxStateTree

import typings.mobxStateTree.actionMod.IMiddlewareEvent
import typings.mobxStateTree.actionMod.IMiddlewareHandler
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createActionTrackingMiddleware2Mod {
  
  @JSImport("mobx-state-tree/dist/middlewares/createActionTrackingMiddleware2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createActionTrackingMiddleware2[TEnv](middlewareHooks: IActionTrackingMiddleware2Hooks[TEnv]): IMiddlewareHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createActionTrackingMiddleware2")(middlewareHooks.asInstanceOf[js.Any]).asInstanceOf[IMiddlewareHandler]
  
  /* Inlined parent std.Readonly<mobx-state-tree.mobx-state-tree/dist/internal.IActionContext> */
  trait IActionTrackingMiddleware2Call[TEnv] extends StObject {
    
    val args: js.Array[js.Any]
    
    val context: IAnyStateTreeNode
    
    var env: js.UndefOr[TEnv] = js.undefined
    
    val id: Double
    
    val name: String
    
    val parentActionEvent: js.UndefOr[IMiddlewareEvent] = js.undefined
    
    val parentCall: js.UndefOr[IActionTrackingMiddleware2Call[TEnv]] = js.undefined
    
    val tree: IAnyStateTreeNode
  }
  object IActionTrackingMiddleware2Call {
    
    inline def apply[TEnv](
      args: js.Array[js.Any],
      context: IAnyStateTreeNode,
      id: Double,
      name: String,
      tree: IAnyStateTreeNode
    ): IActionTrackingMiddleware2Call[TEnv] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[IActionTrackingMiddleware2Call[TEnv]]
    }
    
    extension [Self <: IActionTrackingMiddleware2Call[?], TEnv](x: Self & IActionTrackingMiddleware2Call[TEnv]) {
      
      inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setContext(value: IAnyStateTreeNode): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: TEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParentActionEvent(value: IMiddlewareEvent): Self = StObject.set(x, "parentActionEvent", value.asInstanceOf[js.Any])
      
      inline def setParentActionEventUndefined: Self = StObject.set(x, "parentActionEvent", js.undefined)
      
      inline def setParentCall(value: IActionTrackingMiddleware2Call[TEnv]): Self = StObject.set(x, "parentCall", value.asInstanceOf[js.Any])
      
      inline def setParentCallUndefined: Self = StObject.set(x, "parentCall", js.undefined)
      
      inline def setTree(value: IAnyStateTreeNode): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IActionTrackingMiddleware2Hooks[TEnv] extends StObject {
    
    var filter: js.UndefOr[js.Function1[/* call */ IActionTrackingMiddleware2Call[TEnv], Boolean]] = js.native
    
    def onFinish(call: IActionTrackingMiddleware2Call[TEnv]): Unit = js.native
    def onFinish(call: IActionTrackingMiddleware2Call[TEnv], error: js.Any): Unit = js.native
    
    def onStart(call: IActionTrackingMiddleware2Call[TEnv]): Unit = js.native
  }
}
