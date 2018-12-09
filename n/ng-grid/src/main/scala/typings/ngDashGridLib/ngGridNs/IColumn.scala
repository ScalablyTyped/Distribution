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

