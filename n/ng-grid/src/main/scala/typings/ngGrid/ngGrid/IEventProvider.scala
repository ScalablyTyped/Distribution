package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventProvider extends StObject {
  
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
  implicit class IEventProviderMutableBuilder[Self <: IEventProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignEvents(value: () => Unit): Self = StObject.set(x, "assignEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAssignGridEventHandlers(value: () => Unit): Self = StObject.set(x, "assignGridEventHandlers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColToMove(value: IColumn): Self = StObject.set(x, "colToMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOver(value: js.Any => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragStart(value: js.Any => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupToMove(value: js.Any): Self = StObject.set(x, "groupToMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnGroupDrop(value: js.Any => Unit): Self = StObject.set(x, "onGroupDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGroupMouseDown(value: js.Any => Unit): Self = StObject.set(x, "onGroupMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHeaderDrop(value: js.Any => Unit): Self = StObject.set(x, "onHeaderDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHeaderMouseDown(value: js.Any => Unit): Self = StObject.set(x, "onHeaderMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDraggables(value: () => Unit): Self = StObject.set(x, "setDraggables", js.Any.fromFunction0(value))
  }
}
