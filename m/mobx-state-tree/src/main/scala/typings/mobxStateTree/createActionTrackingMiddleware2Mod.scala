package typings.mobxStateTree

import typings.mobxStateTree.actionMod.IMiddlewareEvent
import typings.mobxStateTree.actionMod.IMiddlewareHandler
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createActionTrackingMiddleware2Mod {
  
  @JSImport("mobx-state-tree/dist/middlewares/createActionTrackingMiddleware2", "createActionTrackingMiddleware2")
  @js.native
  def createActionTrackingMiddleware2[TEnv](middlewareHooks: IActionTrackingMiddleware2Hooks[TEnv]): IMiddlewareHandler = js.native
  
  /* Inlined parent std.Readonly<mobx-state-tree.mobx-state-tree/dist/internal.IActionContext> */
  @js.native
  trait IActionTrackingMiddleware2Call[TEnv] extends StObject {
    
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
    implicit class IActionTrackingMiddleware2CallMutableBuilder[Self <: IActionTrackingMiddleware2Call[_], TEnv] (val x: Self with IActionTrackingMiddleware2Call[TEnv]) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: IAnyStateTreeNode): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnv(value: TEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentActionEvent(value: IMiddlewareEvent): Self = StObject.set(x, "parentActionEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentActionEventUndefined: Self = StObject.set(x, "parentActionEvent", js.undefined)
      
      @scala.inline
      def setParentCall(value: IActionTrackingMiddleware2Call[TEnv]): Self = StObject.set(x, "parentCall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentCallUndefined: Self = StObject.set(x, "parentCall", js.undefined)
      
      @scala.inline
      def setTree(value: IAnyStateTreeNode): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
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
