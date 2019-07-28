package typings.ngDashGrid

import typings.angular.angularMod.ITemplateCacheService
import typings.ngDashGrid.ngGridNs.IColumn
import typings.ngDashGrid.ngGridNs.IColumnDef
import typings.ngDashGrid.ngGridNs.IGridInstance
import typings.ngDashGrid.ngGridNs.IGridOptions
import typings.ngDashGrid.ngGridNs.IGridScope
import typings.ngDashGrid.ngGridNs.serviceNs.IDomUtilityService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngColumn")
@js.native
class ngColumn protected () extends IColumn {
  def this(
    config: IGridOptions,
    $scope: IGridScope,
    grid: IGridInstance,
    domUtilityService: IDomUtilityService,
    $templateCache: ITemplateCacheService,
    $utils: js.Any
  ) = this()
  /* CompleteClass */
  override var aggLabelFilter: js.Any = js.native
  /* CompleteClass */
  override var cellClass: String = js.native
  /* CompleteClass */
  override var cellEditableCondition: js.Any = js.native
  /* CompleteClass */
  override var cellFilter: js.Any = js.native
  /* CompleteClass */
  override var cellTemplate: String = js.native
  /* CompleteClass */
  override var colDef: IColumnDef = js.native
  /* CompleteClass */
  override var cursor: String = js.native
  /* CompleteClass */
  override var displayName: String = js.native
  /* CompleteClass */
  override var enableCellEdit: Boolean = js.native
  /* CompleteClass */
  override var field: String = js.native
  /* CompleteClass */
  override var groupIndex: Double = js.native
  /* CompleteClass */
  override var groupable: Boolean = js.native
  /* CompleteClass */
  override var headerCellTemplate: String = js.native
  /* CompleteClass */
  override var headerClass: String = js.native
  /* CompleteClass */
  override var headerRowHeight: Double = js.native
  /* CompleteClass */
  override var index: Double = js.native
  /* CompleteClass */
  override var isAggCol: Boolean = js.native
  /* CompleteClass */
  override var isGroupedBy: Boolean = js.native
  /* CompleteClass */
  override var maxWidth: Double = js.native
  /* CompleteClass */
  override var minWidth: Double = js.native
  /* CompleteClass */
  override var originalIndex: Double = js.native
  /* CompleteClass */
  override var pinnable: Boolean = js.native
  /* CompleteClass */
  override var pinned: Boolean = js.native
  /* CompleteClass */
  override var resizable: Boolean = js.native
  /* CompleteClass */
  override var sortDirection: String = js.native
  /* CompleteClass */
  override var sortPriority: Double = js.native
  /* CompleteClass */
  override var sortable: Boolean = js.native
  /* CompleteClass */
  override var sortingAlgorithm: js.Function = js.native
  /* CompleteClass */
  override var visible: Boolean = js.native
  /* CompleteClass */
  override var width: Double = js.native
  /* CompleteClass */
  override def copy(): IColumn = js.native
  /* CompleteClass */
  override def gripClick(): js.Any = js.native
  /* CompleteClass */
  override def gripOnMouseDown(event: js.Any): js.Any = js.native
  /* CompleteClass */
  override def gripOnMouseUp(event: js.Any): Unit = js.native
  /* CompleteClass */
  override def groupedByClass(): String = js.native
  /* CompleteClass */
  override def noSortVisible(): Boolean = js.native
  /* CompleteClass */
  override def onMouseMove(event: js.Any): Unit = js.native
  /* CompleteClass */
  override def setVars(fromCol: IColumn): Unit = js.native
  /* CompleteClass */
  override def showSortButtonDown(): Boolean = js.native
  /* CompleteClass */
  override def showSortButtonUp(): Boolean = js.native
  /* CompleteClass */
  override def sort(event: js.Any): Boolean = js.native
  /* CompleteClass */
  override def toggleVisible(): Unit = js.native
}

