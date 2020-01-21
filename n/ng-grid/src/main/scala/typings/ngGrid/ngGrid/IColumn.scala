package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumn extends js.Object {
  var aggLabelFilter: js.Any
  var cellClass: String
  var cellEditableCondition: js.Any
  var cellFilter: js.Any
  var cellTemplate: String
  var colDef: IColumnDef
  var cursor: String
  var displayName: String
  var enableCellEdit: Boolean
  var field: String
  var groupIndex: Double
  var groupable: Boolean
  var headerCellTemplate: String
  var headerClass: String
  var headerRowHeight: Double
  var index: Double
  var isAggCol: Boolean
  var isGroupedBy: Boolean
  var maxWidth: Double
  var minWidth: Double
  var originalIndex: Double
  var pinnable: Boolean
  var pinned: Boolean
  var resizable: Boolean
  var sortDirection: String
  var sortPriority: Double
  var sortable: Boolean
  var sortingAlgorithm: js.Function
  var visible: Boolean
  var width: Double
  def copy(): IColumn
  def gripClick(): js.Any
  def gripOnMouseDown(event: js.Any): js.Any
  def gripOnMouseUp(event: js.Any): Unit
  def groupedByClass(): String
  def noSortVisible(): Boolean
  def onMouseMove(event: js.Any): Unit
  def setVars(fromCol: IColumn): Unit
  def showSortButtonDown(): Boolean
  def showSortButtonUp(): Boolean
  def sort(event: js.Any): Boolean
  def toggleVisible(): Unit
}

object IColumn {
  @scala.inline
  def apply(
    aggLabelFilter: js.Any,
    cellClass: String,
    cellEditableCondition: js.Any,
    cellFilter: js.Any,
    cellTemplate: String,
    colDef: IColumnDef,
    copy: () => IColumn,
    cursor: String,
    displayName: String,
    enableCellEdit: Boolean,
    field: String,
    gripClick: () => js.Any,
    gripOnMouseDown: js.Any => js.Any,
    gripOnMouseUp: js.Any => Unit,
    groupIndex: Double,
    groupable: Boolean,
    groupedByClass: () => String,
    headerCellTemplate: String,
    headerClass: String,
    headerRowHeight: Double,
    index: Double,
    isAggCol: Boolean,
    isGroupedBy: Boolean,
    maxWidth: Double,
    minWidth: Double,
    noSortVisible: () => Boolean,
    onMouseMove: js.Any => Unit,
    originalIndex: Double,
    pinnable: Boolean,
    pinned: Boolean,
    resizable: Boolean,
    setVars: IColumn => Unit,
    showSortButtonDown: () => Boolean,
    showSortButtonUp: () => Boolean,
    sort: js.Any => Boolean,
    sortDirection: String,
    sortPriority: Double,
    sortable: Boolean,
    sortingAlgorithm: js.Function,
    toggleVisible: () => Unit,
    visible: Boolean,
    width: Double
  ): IColumn = {
    val __obj = js.Dynamic.literal(aggLabelFilter = aggLabelFilter.asInstanceOf[js.Any], cellClass = cellClass.asInstanceOf[js.Any], cellEditableCondition = cellEditableCondition.asInstanceOf[js.Any], cellFilter = cellFilter.asInstanceOf[js.Any], cellTemplate = cellTemplate.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), cursor = cursor.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enableCellEdit = enableCellEdit.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], gripClick = js.Any.fromFunction0(gripClick), gripOnMouseDown = js.Any.fromFunction1(gripOnMouseDown), gripOnMouseUp = js.Any.fromFunction1(gripOnMouseUp), groupIndex = groupIndex.asInstanceOf[js.Any], groupable = groupable.asInstanceOf[js.Any], groupedByClass = js.Any.fromFunction0(groupedByClass), headerCellTemplate = headerCellTemplate.asInstanceOf[js.Any], headerClass = headerClass.asInstanceOf[js.Any], headerRowHeight = headerRowHeight.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isAggCol = isAggCol.asInstanceOf[js.Any], isGroupedBy = isGroupedBy.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], noSortVisible = js.Any.fromFunction0(noSortVisible), onMouseMove = js.Any.fromFunction1(onMouseMove), originalIndex = originalIndex.asInstanceOf[js.Any], pinnable = pinnable.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], setVars = js.Any.fromFunction1(setVars), showSortButtonDown = js.Any.fromFunction0(showSortButtonDown), showSortButtonUp = js.Any.fromFunction0(showSortButtonUp), sort = js.Any.fromFunction1(sort), sortDirection = sortDirection.asInstanceOf[js.Any], sortPriority = sortPriority.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], sortingAlgorithm = sortingAlgorithm.asInstanceOf[js.Any], toggleVisible = js.Any.fromFunction0(toggleVisible), visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColumn]
  }
}

