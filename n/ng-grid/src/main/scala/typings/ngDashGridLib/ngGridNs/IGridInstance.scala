package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridInstance extends js.Object {
  @JSName("$canvas")
  var $canvas: angularLib.angularMod.IAugmentedJQuery
  @JSName("$footerPanel")
  var $footerPanel: angularLib.angularMod.IAugmentedJQuery
  @JSName("$groupPanel")
  var $groupPanel: angularLib.angularMod.IAugmentedJQuery
  @JSName("$headerContainer")
  var $headerContainer: angularLib.angularMod.IAugmentedJQuery
  @JSName("$headerScroller")
  var $headerScroller: angularLib.angularMod.IAugmentedJQuery
  @JSName("$headers")
  var $headers: angularLib.angularMod.IAugmentedJQuery
  @JSName("$root")
  var $root: angularLib.angularMod.IAugmentedJQuery
  @JSName("$topPanel")
  var $topPanel: angularLib.angularMod.IAugmentedJQuery
  @JSName("$viewport")
  var $viewport: angularLib.angularMod.IAugmentedJQuery
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
  def getTemplate(key: java.lang.String): angularLib.angularMod.IPromise[_]
  def init(): angularLib.angularMod.IPromise[_]
  def initTemplates(): angularLib.angularMod.IPromise[_]
  def minRowsToRender(): scala.Unit
  def refreshDomSizes(): scala.Unit
  def resizeOnData(col: IColumn): scala.Unit
  def setRenderedRows(newRows: js.Array[IRow]): scala.Unit
  def sortActual(): scala.Unit
  def sortColumnsInit(): scala.Unit
  def sortData(col: IColumn, event: js.Any): scala.Unit
}

object IGridInstance {
  @scala.inline
  def apply(
    $canvas: angularLib.angularMod.IAugmentedJQuery,
    $footerPanel: angularLib.angularMod.IAugmentedJQuery,
    $groupPanel: angularLib.angularMod.IAugmentedJQuery,
    $headerContainer: angularLib.angularMod.IAugmentedJQuery,
    $headerScroller: angularLib.angularMod.IAugmentedJQuery,
    $headers: angularLib.angularMod.IAugmentedJQuery,
    $root: angularLib.angularMod.IAugmentedJQuery,
    $topPanel: angularLib.angularMod.IAugmentedJQuery,
    $viewport: angularLib.angularMod.IAugmentedJQuery,
    buildColumnDefsFromData: () => scala.Unit,
    buildColumns: () => scala.Unit,
    calcMaxCanvasHeight: () => scala.Unit,
    clearSortingData: () => scala.Unit,
    config: IGridOptions,
    configureColumnWidths: () => scala.Unit,
    data: js.Any,
    elementDims: IElementDimension,
    eventProvider: IEventProvider,
    filteredRows: js.Array[IRow],
    fixColumnIndexes: () => scala.Unit,
    fixGroupIndexes: () => scala.Unit,
    footerController: js.Any,
    getTemplate: java.lang.String => angularLib.angularMod.IPromise[_],
    gridId: java.lang.String,
    init: () => angularLib.angularMod.IPromise[_],
    initTemplates: () => angularLib.angularMod.IPromise[_],
    lastSortedColumns: js.Array[IColumn],
    lateBindColumns: scala.Boolean,
    maxCanvasHt: scala.Double,
    minRowsToRender: () => scala.Unit,
    prevScrollIndex: scala.Double,
    prevScrollTop: scala.Double,
    refreshDomSizes: () => scala.Unit,
    resizeOnData: IColumn => scala.Unit,
    rootDim: IDimension,
    rowCache: js.Array[IRow],
    rowFactory: IRowFactory,
    rowMap: js.Array[IRow],
    searchProvider: ISearchProvider,
    setRenderedRows: js.Array[IRow] => scala.Unit,
    sortActual: () => scala.Unit,
    sortColumnsInit: () => scala.Unit,
    sortData: (IColumn, js.Any) => scala.Unit,
    styleProvider: IStyleProvider
  ): IGridInstance = {
    val __obj = js.Dynamic.literal($canvas = $canvas, $footerPanel = $footerPanel, $groupPanel = $groupPanel, $headerContainer = $headerContainer, $headerScroller = $headerScroller, $headers = $headers, $root = $root, $topPanel = $topPanel, $viewport = $viewport, buildColumnDefsFromData = js.Any.fromFunction0(buildColumnDefsFromData), buildColumns = js.Any.fromFunction0(buildColumns), calcMaxCanvasHeight = js.Any.fromFunction0(calcMaxCanvasHeight), clearSortingData = js.Any.fromFunction0(clearSortingData), config = config, configureColumnWidths = js.Any.fromFunction0(configureColumnWidths), data = data, elementDims = elementDims, eventProvider = eventProvider, filteredRows = filteredRows, fixColumnIndexes = js.Any.fromFunction0(fixColumnIndexes), fixGroupIndexes = js.Any.fromFunction0(fixGroupIndexes), footerController = footerController, getTemplate = js.Any.fromFunction1(getTemplate), gridId = gridId, init = js.Any.fromFunction0(init), initTemplates = js.Any.fromFunction0(initTemplates), lastSortedColumns = lastSortedColumns, lateBindColumns = lateBindColumns, maxCanvasHt = maxCanvasHt, minRowsToRender = js.Any.fromFunction0(minRowsToRender), prevScrollIndex = prevScrollIndex, prevScrollTop = prevScrollTop, refreshDomSizes = js.Any.fromFunction0(refreshDomSizes), resizeOnData = js.Any.fromFunction1(resizeOnData), rootDim = rootDim, rowCache = rowCache, rowFactory = rowFactory, rowMap = rowMap, searchProvider = searchProvider, setRenderedRows = js.Any.fromFunction1(setRenderedRows), sortActual = js.Any.fromFunction0(sortActual), sortColumnsInit = js.Any.fromFunction0(sortColumnsInit), sortData = js.Any.fromFunction2(sortData), styleProvider = styleProvider)
  
    __obj.asInstanceOf[IGridInstance]
  }
}

