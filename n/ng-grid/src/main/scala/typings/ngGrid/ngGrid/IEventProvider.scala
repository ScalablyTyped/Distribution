package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventProvider extends js.Object {
  
  def assignEvents(): Unit = js.native
  
  def assignGridEventHandlers(): Unit = js.native
  
  var colToMove: IColumn = js.native
  
  def dragOver(event: js.Any): Unit = js.native
  
  def dragStart(event: js.Any): Unit = js.native
  
  var groupToMove: js.Any = js.native
  
  def onGroupDrop(event: js.Any): Unit = js.native
  
  def onGroupMouseDown(event: js.Any): Unit = js.native
  
  def onHeaderDrop(event: js.Any): Unit = js.native
  
  def onHeaderMouseDown(event: js.Any): Unit = js.native
  
  def setDraggables(): Unit = js.native
}
object IEventProvider {
  
  @scala.inline
  def apply(
    assignEvents: () => Unit,
    assignGridEventHandlers: () => Unit,
    colToMove: IColumn,
    dragOver: js.Any => Unit,
    dragStart: js.Any => Unit,
    groupToMove: js.Any,
    onGroupDrop: js.Any => Unit,
    onGroupMouseDown: js.Any => Unit,
    onHeaderDrop: js.Any => Unit,
    onHeaderMouseDown: js.Any => Unit,
    setDraggables: () => Unit
  ): IEventProvider = {
    val __obj = js.Dynamic.literal(assignEvents = js.Any.fromFunction0(assignEvents), assignGridEventHandlers = js.Any.fromFunction0(assignGridEventHandlers), colToMove = colToMove.asInstanceOf[js.Any], dragOver = js.Any.fromFunction1(dragOver), dragStart = js.Any.fromFunction1(dragStart), groupToMove = groupToMove.asInstanceOf[js.Any], onGroupDrop = js.Any.fromFunction1(onGroupDrop), onGroupMouseDown = js.Any.fromFunction1(onGroupMouseDown), onHeaderDrop = js.Any.fromFunction1(onHeaderDrop), onHeaderMouseDown = js.Any.fromFunction1(onHeaderMouseDown), setDraggables = js.Any.fromFunction0(setDraggables))
    __obj.asInstanceOf[IEventProvider]
  }
  
  @scala.inline
  implicit class IEventProviderOps[Self <: IEventProvider] (val x: Self) extends AnyVal {
    
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
    def setAssignEvents(value: () => Unit): Self = this.set("assignEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAssignGridEventHandlers(value: () => Unit): Self = this.set("assignGridEventHandlers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColToMove(value: IColumn): Self = this.set("colToMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOver(value: js.Any => Unit): Self = this.set("dragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragStart(value: js.Any => Unit): Self = this.set("dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupToMove(value: js.Any): Self = this.set("groupToMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnGroupDrop(value: js.Any => Unit): Self = this.set("onGroupDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGroupMouseDown(value: js.Any => Unit): Self = this.set("onGroupMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHeaderDrop(value: js.Any => Unit): Self = this.set("onHeaderDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHeaderMouseDown(value: js.Any => Unit): Self = this.set("onHeaderMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDraggables(value: () => Unit): Self = this.set("setDraggables", js.Any.fromFunction0(value))
  }
}
