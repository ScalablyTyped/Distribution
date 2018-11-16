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

