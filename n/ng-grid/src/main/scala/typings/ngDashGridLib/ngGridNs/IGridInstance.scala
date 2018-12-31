package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridInstance extends js.Object {
  @JSName("$canvas")
  var $canvas: angularLib.angularMod.angularNs.IAugmentedJQuery
  @JSName("$footerPanel")
  var $footerPanel: angularLib.angularMod.angularNs.IAugmentedJQuery
  @JSName("$groupPanel")
  var $groupPanel: angularLib.angularMod.angularNs.IAugmentedJQuery
  @JSName("$headerContainer")
  var $headerContainer: angularLib.angularMod.angularNs.IAugmentedJQuery
  @JSName("$headerScroller")
  var $headerScroller: angularLib.angularMod.angularNs.IAugmentedJQuery
  @JSName("$headers")
  var $headers: angularLib.angularMod.angularNs.IAugmentedJQuery
  @JSName("$root")
  var $root: angularLib.angularMod.angularNs.IAugmentedJQuery
  @JSName("$topPanel")
  var $topPanel: angularLib.angularMod.angularNs.IAugmentedJQuery
  @JSName("$viewport")
  var $viewport: angularLib.angularMod.angularNs.IAugmentedJQuery
  var config: IGridOptions
  var data: js.Any
  var elementDims: IElementDimension
  var eventProvider: IEventProvider
  var filteredRows: js.Array[IRow]
  var footerController: js.Any
  var gridId: java.lang.String
  var lastSortedColumns: js.Array[IColumn]
  var lateBindColumns: scala.Boolean
  var maxCanvasHt: scala.Double
  var prevScrollIndex: scala.Double
  var prevScrollTop: scala.Double
  var rootDim: IDimension
  var rowCache: js.Array[IRow]
  var rowFactory: IRowFactory
  var rowMap: js.Array[IRow]
  var searchProvider: ISearchProvider
  var styleProvider: IStyleProvider
  def buildColumnDefsFromData(): scala.Unit
  def buildColumns(): scala.Unit
  def calcMaxCanvasHeight(): scala.Unit
  def clearSortingData(): scala.Unit
  def configureColumnWidths(): scala.Unit
  def fixColumnIndexes(): scala.Unit
  def fixGroupIndexes(): scala.Unit
  def getTemplate(key: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def init(): angularLib.angularMod.angularNs.IPromise[_]
  def initTemplates(): angularLib.angularMod.angularNs.IPromise[_]
  def minRowsToRender(): scala.Unit
  def refreshDomSizes(): scala.Unit
  def resizeOnData(col: IColumn): scala.Unit
  def setRenderedRows(newRows: js.Array[IRow]): scala.Unit
  def sortActual(): scala.Unit
  def sortColumnsInit(): scala.Unit
  def sortData(col: IColumn, event: js.Any): scala.Unit
}

