package typings
package ngDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngEventProvider")
@js.native
class ngEventProvider protected ()
  extends ngDashGridLib.ngGridNs.IEventProvider {
  def this(grid: ngDashGridLib.ngGridNs.IGridInstance, $scope: ngDashGridLib.ngGridNs.IGridScope, domUtilityService: ngDashGridLib.ngGridNs.serviceNs.IDomUtilityService, $timeout: angularLib.angularMod.ITimeoutService) = this()
  /* CompleteClass */
  override var colToMove: ngDashGridLib.ngGridNs.IColumn = js.native
  /* CompleteClass */
  override var groupToMove: js.Any = js.native
  /* CompleteClass */
  override def assignEvents(): scala.Unit = js.native
  /* CompleteClass */
  override def assignGridEventHandlers(): scala.Unit = js.native
  /* CompleteClass */
  override def dragOver(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def dragStart(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def onGroupDrop(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def onGroupMouseDown(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def onHeaderDrop(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def onHeaderMouseDown(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def setDraggables(): scala.Unit = js.native
}

