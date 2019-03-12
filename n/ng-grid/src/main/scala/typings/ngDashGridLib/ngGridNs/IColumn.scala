package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumn extends js.Object {
  var aggLabelFilter: js.Any
  var cellClass: java.lang.String
  var cellEditableCondition: js.Any
  var cellFilter: js.Any
  var cellTemplate: java.lang.String
  var colDef: IColumnDef
  var cursor: java.lang.String
  var displayName: java.lang.String
  var enableCellEdit: scala.Boolean
  var field: java.lang.String
  var groupIndex: scala.Double
  var groupable: scala.Boolean
  var headerCellTemplate: java.lang.String
  var headerClass: java.lang.String
  var headerRowHeight: scala.Double
  var index: scala.Double
  var isAggCol: scala.Boolean
  var isGroupedBy: scala.Boolean
  var maxWidth: scala.Double
  var minWidth: scala.Double
  var originalIndex: scala.Double
  var pinnable: scala.Boolean
  var pinned: scala.Boolean
  var resizable: scala.Boolean
  var sortDirection: java.lang.String
  var sortPriority: scala.Double
  var sortable: scala.Boolean
  var sortingAlgorithm: js.Function
  var visible: scala.Boolean
  var width: scala.Double
  def copy(): IColumn
  def gripClick(): js.Any
  def gripOnMouseDown(event: js.Any): js.Any
  def gripOnMouseUp(event: js.Any): scala.Unit
  def groupedByClass(): java.lang.String
  def noSortVisible(): scala.Boolean
  def onMouseMove(event: js.Any): scala.Unit
  def setVars(fromCol: IColumn): scala.Unit
  def showSortButtonDown(): scala.Boolean
  def showSortButtonUp(): scala.Boolean
  def sort(event: js.Any): scala.Boolean
  def toggleVisible(): scala.Unit
}

object IColumn {
  @scala.inline
  def apply(
    aggLabelFilter: js.Any,
    cellClass: java.lang.String,
    cellEditableCondition: js.Any,
    cellFilter: js.Any,
    cellTemplate: java.lang.String,
    colDef: IColumnDef,
    copy: () => IColumn,
    cursor: java.lang.String,
    displayName: java.lang.String,
    enableCellEdit: scala.Boolean,
    field: java.lang.String,
    gripClick: () => js.Any,
    gripOnMouseDown: js.Any => js.Any,
    gripOnMouseUp: js.Any => scala.Unit,
    groupIndex: scala.Double,
    groupable: scala.Boolean,
    groupedByClass: () => java.lang.String,
    headerCellTemplate: java.lang.String,
    headerClass: java.lang.String,
    headerRowHeight: scala.Double,
    index: scala.Double,
    isAggCol: scala.Boolean,
    isGroupedBy: scala.Boolean,
    maxWidth: scala.Double,
    minWidth: scala.Double,
    noSortVisible: () => scala.Boolean,
    onMouseMove: js.Any => scala.Unit,
    originalIndex: scala.Double,
    pinnable: scala.Boolean,
    pinned: scala.Boolean,
    resizable: scala.Boolean,
    setVars: IColumn => scala.Unit,
    showSortButtonDown: () => scala.Boolean,
    showSortButtonUp: () => scala.Boolean,
    sort: js.Any => scala.Boolean,
    sortDirection: java.lang.String,
    sortPriority: scala.Double,
    sortable: scala.Boolean,
    sortingAlgorithm: js.Function,
    toggleVisible: () => scala.Unit,
    visible: scala.Boolean,
    width: scala.Double
  ): IColumn = {
    val __obj = js.Dynamic.literal(aggLabelFilter = aggLabelFilter, cellClass = cellClass, cellEditableCondition = cellEditableCondition, cellFilter = cellFilter, cellTemplate = cellTemplate, colDef = colDef, copy = js.Any.fromFunction0(copy), cursor = cursor, displayName = displayName, enableCellEdit = enableCellEdit, field = field, gripClick = js.Any.fromFunction0(gripClick), gripOnMouseDown = js.Any.fromFunction1(gripOnMouseDown), gripOnMouseUp = js.Any.fromFunction1(gripOnMouseUp), groupIndex = groupIndex, groupable = groupable, groupedByClass = js.Any.fromFunction0(groupedByClass), headerCellTemplate = headerCellTemplate, headerClass = headerClass, headerRowHeight = headerRowHeight, index = index, isAggCol = isAggCol, isGroupedBy = isGroupedBy, maxWidth = maxWidth, minWidth = minWidth, noSortVisible = js.Any.fromFunction0(noSortVisible), onMouseMove = js.Any.fromFunction1(onMouseMove), originalIndex = originalIndex, pinnable = pinnable, pinned = pinned, resizable = resizable, setVars = js.Any.fromFunction1(setVars), showSortButtonDown = js.Any.fromFunction0(showSortButtonDown), showSortButtonUp = js.Any.fromFunction0(showSortButtonUp), sort = js.Any.fromFunction1(sort), sortDirection = sortDirection, sortPriority = sortPriority, sortable = sortable, sortingAlgorithm = sortingAlgorithm, toggleVisible = js.Any.fromFunction0(toggleVisible), visible = visible, width = width)
  
    __obj.asInstanceOf[IColumn]
  }
}

