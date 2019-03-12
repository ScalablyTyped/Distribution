package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventProvider extends js.Object {
  var colToMove: IColumn
  var groupToMove: js.Any
  def assignEvents(): scala.Unit
  def assignGridEventHandlers(): scala.Unit
  def dragOver(event: js.Any): scala.Unit
  def dragStart(event: js.Any): scala.Unit
  def onGroupDrop(event: js.Any): scala.Unit
  def onGroupMouseDown(event: js.Any): scala.Unit
  def onHeaderDrop(event: js.Any): scala.Unit
  def onHeaderMouseDown(event: js.Any): scala.Unit
  def setDraggables(): scala.Unit
}

object IEventProvider {
  @scala.inline
  def apply(
    assignEvents: () => scala.Unit,
    assignGridEventHandlers: () => scala.Unit,
    colToMove: IColumn,
    dragOver: js.Any => scala.Unit,
    dragStart: js.Any => scala.Unit,
    groupToMove: js.Any,
    onGroupDrop: js.Any => scala.Unit,
    onGroupMouseDown: js.Any => scala.Unit,
    onHeaderDrop: js.Any => scala.Unit,
    onHeaderMouseDown: js.Any => scala.Unit,
    setDraggables: () => scala.Unit
  ): IEventProvider = {
    val __obj = js.Dynamic.literal(assignEvents = js.Any.fromFunction0(assignEvents), assignGridEventHandlers = js.Any.fromFunction0(assignGridEventHandlers), colToMove = colToMove, dragOver = js.Any.fromFunction1(dragOver), dragStart = js.Any.fromFunction1(dragStart), groupToMove = groupToMove, onGroupDrop = js.Any.fromFunction1(onGroupDrop), onGroupMouseDown = js.Any.fromFunction1(onGroupMouseDown), onHeaderDrop = js.Any.fromFunction1(onHeaderDrop), onHeaderMouseDown = js.Any.fromFunction1(onHeaderMouseDown), setDraggables = js.Any.fromFunction0(setDraggables))
  
    __obj.asInstanceOf[IEventProvider]
  }
}

