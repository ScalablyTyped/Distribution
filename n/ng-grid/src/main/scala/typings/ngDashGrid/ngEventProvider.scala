package typings.ngDashGrid

import typings.angular.angularMod.ITimeoutService
import typings.ngDashGrid.ngGridNs.IColumn
import typings.ngDashGrid.ngGridNs.IEventProvider
import typings.ngDashGrid.ngGridNs.IGridInstance
import typings.ngDashGrid.ngGridNs.IGridScope
import typings.ngDashGrid.ngGridNs.serviceNs.IDomUtilityService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngEventProvider")
@js.native
class ngEventProvider protected () extends IEventProvider {
  def this(
    grid: IGridInstance,
    $scope: IGridScope,
    domUtilityService: IDomUtilityService,
    $timeout: ITimeoutService
  ) = this()
  /* CompleteClass */
  override var colToMove: IColumn = js.native
  /* CompleteClass */
  override var groupToMove: js.Any = js.native
  /* CompleteClass */
  override def assignEvents(): Unit = js.native
  /* CompleteClass */
  override def assignGridEventHandlers(): Unit = js.native
  /* CompleteClass */
  override def dragOver(event: js.Any): Unit = js.native
  /* CompleteClass */
  override def dragStart(event: js.Any): Unit = js.native
  /* CompleteClass */
  override def onGroupDrop(event: js.Any): Unit = js.native
  /* CompleteClass */
  override def onGroupMouseDown(event: js.Any): Unit = js.native
  /* CompleteClass */
  override def onHeaderDrop(event: js.Any): Unit = js.native
  /* CompleteClass */
  override def onHeaderMouseDown(event: js.Any): Unit = js.native
  /* CompleteClass */
  override def setDraggables(): Unit = js.native
}

