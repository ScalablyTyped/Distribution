package typings.ngDashGrid

import org.scalablytyped.runtime.TopLevel
import typings.ngDashGrid.ngGrid.IColumn
import typings.ngDashGrid.ngGrid.IEventProvider
import typings.ngDashGrid.ngGrid.IEventProviderStatic
import typings.ngDashGrid.ngGrid.IGridInstance
import typings.ngDashGrid.ngGrid.IGridScope
import typings.ngDashGrid.ngGrid.service.IDomUtilityService
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
    $timeout: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ITimeoutService */ js.Any
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

@JSGlobal("ngEventProvider")
@js.native
object ngEventProvider extends TopLevel[IEventProviderStatic]

