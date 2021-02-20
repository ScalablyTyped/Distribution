package typings.mobxStateTree

import typings.mobxStateTree.actionContextMod.IActionContext
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import typings.mobxStateTree.utilsMod.IDisposer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("mobx-state-tree/dist/core/action", "addMiddleware")
  @js.native
  def addMiddleware(target: IAnyStateTreeNode, handler: IMiddlewareHandler): IDisposer = js.native
  @JSImport("mobx-state-tree/dist/core/action", "addMiddleware")
  @js.native
  def addMiddleware(target: IAnyStateTreeNode, handler: IMiddlewareHandler, includeHooks: Boolean): IDisposer = js.native
  
  @JSImport("mobx-state-tree/dist/core/action", "decorate")
  @js.native
  def decorate[T /* <: js.Function */](handler: IMiddlewareHandler, fn: T): T = js.native
  @JSImport("mobx-state-tree/dist/core/action", "decorate")
  @js.native
  def decorate[T /* <: js.Function */](handler: IMiddlewareHandler, fn: T, includeHooks: Boolean): T = js.native
  
  @js.native
  trait IMiddlewareEvent extends IActionContext {
    
    /** Id of all events, from root until current (excluding current) */
    val allParentIds: js.Array[Double] = js.native
    
    /** Parent event object */
    val parentEvent: js.UndefOr[IMiddlewareEvent] = js.native
    
    /** Parent event unique id */
    val parentId: Double = js.native
    
    /** Root event unique id */
    val rootId: Double = js.native
    
    /** Event type */
    val `type`: IMiddlewareEventType = js.native
  }
  object IMiddlewareEvent {
    
    @scala.inline
    def apply(
      allParentIds: js.Array[Double],
      args: js.Array[_],
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
    
    @scala.inline
    implicit class IMiddlewareEventMutableBuilder[Self <: IMiddlewareEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllParentIds(value: js.Array[Double]): Self = StObject.set(x, "allParentIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllParentIdsVarargs(value: Double*): Self = StObject.set(x, "allParentIds", js.Array(value :_*))
      
      @scala.inline
      def setParentEvent(value: IMiddlewareEvent): Self = StObject.set(x, "parentEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentEventUndefined: Self = StObject.set(x, "parentEvent", js.undefined)
      
      @scala.inline
      def setParentId(value: Double): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootId(value: Double): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: IMiddlewareEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def action: typings.mobxStateTree.mobxStateTreeStrings.action = "action".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.action]
    
    @scala.inline
    def flow_resume: typings.mobxStateTree.mobxStateTreeStrings.flow_resume = "flow_resume".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.flow_resume]
    
    @scala.inline
    def flow_resume_error: typings.mobxStateTree.mobxStateTreeStrings.flow_resume_error = "flow_resume_error".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.flow_resume_error]
    
    @scala.inline
    def flow_return: typings.mobxStateTree.mobxStateTreeStrings.flow_return = "flow_return".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.flow_return]
    
    @scala.inline
    def flow_spawn: typings.mobxStateTree.mobxStateTreeStrings.flow_spawn = "flow_spawn".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.flow_spawn]
    
    @scala.inline
    def flow_throw: typings.mobxStateTree.mobxStateTreeStrings.flow_throw = "flow_throw".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.flow_throw]
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
