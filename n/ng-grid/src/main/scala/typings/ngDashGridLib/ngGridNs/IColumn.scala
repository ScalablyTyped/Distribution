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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggLabelFilter")(aggLabelFilter)
    __obj.updateDynamic("cellClass")(cellClass)
    __obj.updateDynamic("cellEditableCondition")(cellEditableCondition)
    __obj.updateDynamic("cellFilter")(cellFilter)
    __obj.updateDynamic("cellTemplate")(cellTemplate)
    __obj.updateDynamic("colDef")(colDef)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("cursor")(cursor)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("enableCellEdit")(enableCellEdit)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("gripClick")(gripClick)
    __obj.updateDynamic("gripOnMouseDown")(gripOnMouseDown)
    __obj.updateDynamic("gripOnMouseUp")(gripOnMouseUp)
    __obj.updateDynamic("groupIndex")(groupIndex)
    __obj.updateDynamic("groupable")(groupable)
    __obj.updateDynamic("groupedByClass")(groupedByClass)
    __obj.updateDynamic("headerCellTemplate")(headerCellTemplate)
    __obj.updateDynamic("headerClass")(headerClass)
    __obj.updateDynamic("headerRowHeight")(headerRowHeight)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("isAggCol")(isAggCol)
    __obj.updateDynamic("isGroupedBy")(isGroupedBy)
    __obj.updateDynamic("maxWidth")(maxWidth)
    __obj.updateDynamic("minWidth")(minWidth)
    __obj.updateDynamic("noSortVisible")(noSortVisible)
    __obj.updateDynamic("onMouseMove")(onMouseMove)
    __obj.updateDynamic("originalIndex")(originalIndex)
    __obj.updateDynamic("pinnable")(pinnable)
    __obj.updateDynamic("pinned")(pinned)
    __obj.updateDynamic("resizable")(resizable)
    __obj.updateDynamic("setVars")(setVars)
    __obj.updateDynamic("showSortButtonDown")(showSortButtonDown)
    __obj.updateDynamic("showSortButtonUp")(showSortButtonUp)
    __obj.updateDynamic("sort")(sort)
    __obj.updateDynamic("sortDirection")(sortDirection)
    __obj.updateDynamic("sortPriority")(sortPriority)
    __obj.updateDynamic("sortable")(sortable)
    __obj.updateDynamic("sortingAlgorithm")(sortingAlgorithm)
    __obj.updateDynamic("toggleVisible")(toggleVisible)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IColumn]
  }
}

