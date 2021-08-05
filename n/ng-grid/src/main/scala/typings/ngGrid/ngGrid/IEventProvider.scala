package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventProvider extends StObject {
  
  def assignEvents(): Unit
  
  def assignGridEventHandlers(): Unit
  
  var colToMove: IColumn
  
  def dragOver(event: js.Any): Unit
  
  def dragStart(event: js.Any): Unit
  
  var groupToMove: js.Any
  
  def onGroupDrop(event: js.Any): Unit
  
  def onGroupMouseDown(event: js.Any): Unit
  
  def onHeaderDrop(event: js.Any): Unit
  
  def onHeaderMouseDown(event: js.Any): Unit
  
  def setDraggables(): Unit
}
object IEventProvider {
  
  inline def apply(
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
  
  extension [Self <: IEventProvider](x: Self) {
    
    inline def setAssignEvents(value: () => Unit): Self = StObject.set(x, "assignEvents", js.Any.fromFunction0(value))
    
    inline def setAssignGridEventHandlers(value: () => Unit): Self = StObject.set(x, "assignGridEventHandlers", js.Any.fromFunction0(value))
    
    inline def setColToMove(value: IColumn): Self = StObject.set(x, "colToMove", value.asInstanceOf[js.Any])
    
    inline def setDragOver(value: js.Any => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction1(value))
    
    inline def setDragStart(value: js.Any => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
    
    inline def setGroupToMove(value: js.Any): Self = StObject.set(x, "groupToMove", value.asInstanceOf[js.Any])
    
    inline def setOnGroupDrop(value: js.Any => Unit): Self = StObject.set(x, "onGroupDrop", js.Any.fromFunction1(value))
    
    inline def setOnGroupMouseDown(value: js.Any => Unit): Self = StObject.set(x, "onGroupMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnHeaderDrop(value: js.Any => Unit): Self = StObject.set(x, "onHeaderDrop", js.Any.fromFunction1(value))
    
    inline def setOnHeaderMouseDown(value: js.Any => Unit): Self = StObject.set(x, "onHeaderMouseDown", js.Any.fromFunction1(value))
    
    inline def setSetDraggables(value: () => Unit): Self = StObject.set(x, "setDraggables", js.Any.fromFunction0(value))
  }
}
