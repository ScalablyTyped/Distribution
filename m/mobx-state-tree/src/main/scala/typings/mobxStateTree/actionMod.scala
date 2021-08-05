package typings.mobxStateTree

import typings.mobxStateTree.actionContextMod.IActionContext
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import typings.mobxStateTree.utilsMod.IDisposer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("mobx-state-tree/dist/core/action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMiddleware(target: IAnyStateTreeNode, handler: IMiddlewareHandler): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("addMiddleware")(target.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  inline def addMiddleware(target: IAnyStateTreeNode, handler: IMiddlewareHandler, includeHooks: Boolean): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("addMiddleware")(target.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], includeHooks.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  
  inline def decorate[T /* <: js.Function */](handler: IMiddlewareHandler, fn: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(handler.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def decorate[T /* <: js.Function */](handler: IMiddlewareHandler, fn: T, includeHooks: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(handler.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], includeHooks.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait IMiddlewareEvent
    extends StObject
       with IActionContext {
    
    /** Id of all events, from root until current (excluding current) */
    val allParentIds: js.Array[Double]
    
    /** Parent event object */
    val parentEvent: js.UndefOr[IMiddlewareEvent] = js.undefined
    
    /** Parent event unique id */
    val parentId: Double
    
    /** Root event unique id */
    val rootId: Double
    
    /** Event type */
    val `type`: IMiddlewareEventType
  }
  object IMiddlewareEvent {
    
    inline def apply(
      allParentIds: js.Array[Double],
      args: js.Array[js.Any],
      context: IAnyStateTreeNode,
      id: Double,
      name: String,
      parentId: Double,
      rootId: Double,
      tree: IAnyStateTreeNode,
      `type`: IMiddlewareEventType
    ): IMiddlewareEvent = {
      val __obj = js.Dynamic.literal(allParentIds = allParentIds.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMiddlewareEvent]
    }
    
    extension [Self <: IMiddlewareEvent](x: Self) {
      
      inline def setAllParentIds(value: js.Array[Double]): Self = StObject.set(x, "allParentIds", value.asInstanceOf[js.Any])
      
      inline def setAllParentIdsVarargs(value: Double*): Self = StObject.set(x, "allParentIds", js.Array(value :_*))
      
      inline def setParentEvent(value: IMiddlewareEvent): Self = StObject.set(x, "parentEvent", value.asInstanceOf[js.Any])
      
      inline def setParentEventUndefined: Self = StObject.set(x, "parentEvent", js.undefined)
      
      inline def setParentId(value: Double): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setRootId(value: Double): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
      
      inline def setType(value: IMiddlewareEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobxStateTree.mobxStateTreeStrings.action
    - typings.mobxStateTree.mobxStateTreeStrings.flow_spawn
    - typings.mobxStateTree.mobxStateTreeStrings.flow_resume
    - typings.mobxStateTree.mobxStateTreeStrings.flow_resume_error
    - typings.mobxStateTree.mobxStateTreeStrings.flow_return
    - typings.mobxStateTree.mobxStateTreeStrings.flow_throw
  */
  trait IMiddlewareEventType extends StObject
  object IMiddlewareEventType {
    
    inline def action: typings.mobxStateTree.mobxStateTreeStrings.action = "action".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.action]
    
    inline def flow_resume: typings.mobxStateTree.mobxStateTreeStrings.flow_resume = "flow_resume".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.flow_resume]
    
    inline def flow_resume_error: typings.mobxStateTree.mobxStateTreeStrings.flow_resume_error = "flow_resume_error".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.flow_resume_error]
    
    inline def flow_return: typings.mobxStateTree.mobxStateTreeStrings.flow_return = "flow_return".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.flow_return]
    
    inline def flow_spawn: typings.mobxStateTree.mobxStateTreeStrings.flow_spawn = "flow_spawn".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.flow_spawn]
    
    inline def flow_throw: typings.mobxStateTree.mobxStateTreeStrings.flow_throw = "flow_throw".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.flow_throw]
  }
  
  type IMiddlewareHandler = js.Function3[
    /* actionCall */ IMiddlewareEvent, 
    /* next */ js.Function2[
      /* actionCall */ IMiddlewareEvent, 
      /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, js.Any]], 
      Unit
    ], 
    /* abort */ js.Function1[/* value */ js.Any, Unit], 
    js.Any
  ]
}
