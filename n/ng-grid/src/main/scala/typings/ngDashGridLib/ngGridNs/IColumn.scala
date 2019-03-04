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
  var sortingAlgorithm: angularLib.angularMod.Global.Function
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
    copy: js.Function0[IColumn],
    cursor: java.lang.String,
    displayName: java.lang.String,
    enableCellEdit: scala.Boolean,
    field: java.lang.String,
    gripClick: js.Function0[js.Any],
    gripOnMouseDown: js.Function1[js.Any, js.Any],
    gripOnMouseUp: js.Function1[js.Any, scala.Unit],
    groupIndex: scala.Double,
    groupable: scala.Boolean,
    groupedByClass: js.Function0[java.lang.String],
    headerCellTemplate: java.lang.String,
    headerClass: java.lang.String,
    headerRowHeight: scala.Double,
    index: scala.Double,
    isAggCol: scala.Boolean,
    isGroupedBy: scala.Boolean,
    maxWidth: scala.Double,
    minWidth: scala.Double,
    noSortVisible: js.Function0[scala.Boolean],
    onMouseMove: js.Function1[js.Any, scala.Unit],
    originalIndex: scala.Double,
    pinnable: scala.Boolean,
    pinned: scala.Boolean,
    resizable: scala.Boolean,
    setVars: js.Function1[IColumn, scala.Unit],
    showSortButtonDown: js.Function0[scala.Boolean],
    showSortButtonUp: js.Function0[scala.Boolean],
    sort: js.Function1[js.Any, scala.Boolean],
    sortDirection: java.lang.String,
    sortPriority: scala.Double,
    sortable: scala.Boolean,
    sortingAlgorithm: angularLib.angularMod.Global.Function,
    toggleVisible: js.Function0[scala.Unit],
    visible: scala.Boolean,
    width: scala.Double
  ): IColumn = {
    val __obj = js.Dynamic.literal(aggLabelFilter = aggLabelFilter, cellClass = cellClass, cellEditableCondition = cellEditableCondition, cellFilter = cellFilter, cellTemplate = cellTemplate, colDef = colDef, copy = copy, cursor = cursor, displayName = displayName, enableCellEdit = enableCellEdit, field = field, gripClick = gripClick, gripOnMouseDown = gripOnMouseDown, gripOnMouseUp = gripOnMouseUp, groupIndex = groupIndex, groupable = groupable, groupedByClass = groupedByClass, headerCellTemplate = headerCellTemplate, headerClass = headerClass, headerRowHeight = headerRowHeight, index = index, isAggCol = isAggCol, isGroupedBy = isGroupedBy, maxWidth = maxWidth, minWidth = minWidth, noSortVisible = noSortVisible, onMouseMove = onMouseMove, originalIndex = originalIndex, pinnable = pinnable, pinned = pinned, resizable = resizable, setVars = setVars, showSortButtonDown = showSortButtonDown, showSortButtonUp = showSortButtonUp, sort = sort, sortDirection = sortDirection, sortPriority = sortPriority, sortable = sortable, sortingAlgorithm = sortingAlgorithm, toggleVisible = toggleVisible, visible = visible, width = width)
  
    __obj.asInstanceOf[IColumn]
  }
}

