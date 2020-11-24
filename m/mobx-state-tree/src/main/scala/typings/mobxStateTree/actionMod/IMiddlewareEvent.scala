package typings.mobxStateTree.actionMod

import typings.mobxStateTree.actionContextMod.IActionContext
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IMiddlewareEventOps[Self <: IMiddlewareEvent] (val x: Self) extends AnyVal {
    
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
    def setAllParentIdsVarargs(value: Double*): Self = this.set("allParentIds", js.Array(value :_*))
    
    @scala.inline
    def setAllParentIds(value: js.Array[Double]): Self = this.set("allParentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: Double): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootId(value: Double): Self = this.set("rootId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IMiddlewareEventType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentEvent(value: IMiddlewareEvent): Self = this.set("parentEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentEvent: Self = this.set("parentEvent", js.undefined)
  }
}
