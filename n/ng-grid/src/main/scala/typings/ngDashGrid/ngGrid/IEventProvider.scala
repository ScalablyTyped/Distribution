package typings.ngDashGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventProvider extends js.Object {
  var colToMove: IColumn
  var groupToMove: js.Any
  def assignEvents(): Unit
  def assignGridEventHandlers(): Unit
  def dragOver(event: js.Any): Unit
  def dragStart(event: js.Any): Unit
  def onGroupDrop(event: js.Any): Unit
  def onGroupMouseDown(event: js.Any): Unit
  def onHeaderDrop(event: js.Any): Unit
  def onHeaderMouseDown(event: js.Any): Unit
  def setDraggables(): Unit
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
    val __obj = js.Dynamic.literal(assignEvents = js.Any.fromFunction0(assignEvents), assignGridEventHandlers = js.Any.fromFunction0(assignGridEventHandlers), colToMove = colToMove, dragOver = js.Any.fromFunction1(dragOver), dragStart = js.Any.fromFunction1(dragStart), groupToMove = groupToMove, onGroupDrop = js.Any.fromFunction1(onGroupDrop), onGroupMouseDown = js.Any.fromFunction1(onGroupMouseDown), onHeaderDrop = js.Any.fromFunction1(onHeaderDrop), onHeaderMouseDown = js.Any.fromFunction1(onHeaderMouseDown), setDraggables = js.Any.fromFunction0(setDraggables))
  
    __obj.asInstanceOf[IEventProvider]
  }
}

