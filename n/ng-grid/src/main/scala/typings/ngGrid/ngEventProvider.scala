package typings.ngGrid

import org.scalablytyped.runtime.TopLevel
import typings.ngGrid.ngGrid.IColumn
import typings.ngGrid.ngGrid.IEventProvider
import typings.ngGrid.ngGrid.IEventProviderStatic
import typings.ngGrid.ngGrid.IGridInstance
import typings.ngGrid.ngGrid.IGridScope
import typings.ngGrid.ngGrid.service.IDomUtilityService
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

