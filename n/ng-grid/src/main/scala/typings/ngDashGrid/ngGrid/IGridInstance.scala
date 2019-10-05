package typings.ngDashGrid.ngGrid

import typings.angular.angularMod.IAugmentedJQuery
import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridInstance extends js.Object {
  @JSName("$canvas")
  var $canvas: IAugmentedJQuery
  @JSName("$footerPanel")
  var $footerPanel: IAugmentedJQuery
  @JSName("$groupPanel")
  var $groupPanel: IAugmentedJQuery
  @JSName("$headerContainer")
  var $headerContainer: IAugmentedJQuery
  @JSName("$headerScroller")
  var $headerScroller: IAugmentedJQuery
  @JSName("$headers")
  var $headers: IAugmentedJQuery
  @JSName("$root")
  var $root: IAugmentedJQuery
  @JSName("$topPanel")
  var $topPanel: IAugmentedJQuery
  @JSName("$viewport")
  var $viewport: IAugmentedJQuery
  var config: IGridOptions
  var data: js.Any
  var elementDims: IElementDimension
  var eventProvider: IEventProvider
  var filteredRows: js.Array[IRow]
  var footerController: js.Any
  var gridId: String
  var lastSortedColumns: js.Array[IColumn]
  var lateBindColumns: Boolean
  var maxCanvasHt: Double
  var prevScrollIndex: Double
  var prevScrollTop: Double
  var rootDim: IDimension
  var rowCache: js.Array[IRow]
  var rowFactory: IRowFactory
  var rowMap: js.Array[IRow]
  var searchProvider: ISearchProvider
  var styleProvider: IStyleProvider
  def buildColumnDefsFromData(): Unit
  def buildColumns(): Unit
  def calcMaxCanvasHeight(): Unit
  def clearSortingData(): Unit
  def configureColumnWidths(): Unit
  def fixColumnIndexes(): Unit
  def fixGroupIndexes(): Unit
  def getTemplate(key: String): IPromise[_]
  def init(): IPromise[_]
  def initTemplates(): IPromise[_]
  def minRowsToRender(): Unit
  def refreshDomSizes(): Unit
  def resizeOnData(col: IColumn): Unit
  def setRenderedRows(newRows: js.Array[IRow]): Unit
  def sortActual(): Unit
  def sortColumnsInit(): Unit
  def sortData(col: IColumn, event: js.Any): Unit
}

object IGridInstance {
  @scala.inline
  def apply(
    $canvas: IAugmentedJQuery,
    $footerPanel: IAugmentedJQuery,
    $groupPanel: IAugmentedJQuery,
    $headerContainer: IAugmentedJQuery,
    $headerScroller: IAugmentedJQuery,
    $headers: IAugmentedJQuery,
    $root: IAugmentedJQuery,
    $topPanel: IAugmentedJQuery,
    $viewport: IAugmentedJQuery,
    buildColumnDefsFromData: () => Unit,
    buildColumns: () => Unit,
    calcMaxCanvasHeight: () => Unit,
    clearSortingData: () => Unit,
    config: IGridOptions,
    configureColumnWidths: () => Unit,
    data: js.Any,
    elementDims: IElementDimension,
    eventProvider: IEventProvider,
    filteredRows: js.Array[IRow],
    fixColumnIndexes: () => Unit,
    fixGroupIndexes: () => Unit,
    footerController: js.Any,
    getTemplate: String => IPromise[_],
    gridId: String,
    init: () => IPromise[_],
    initTemplates: () => IPromise[_],
    lastSortedColumns: js.Array[IColumn],
    lateBindColumns: Boolean,
    maxCanvasHt: Double,
    minRowsToRender: () => Unit,
    prevScrollIndex: Double,
    prevScrollTop: Double,
    refreshDomSizes: () => Unit,
    resizeOnData: IColumn => Unit,
    rootDim: IDimension,
    rowCache: js.Array[IRow],
    rowFactory: IRowFactory,
    rowMap: js.Array[IRow],
    searchProvider: ISearchProvider,
    setRenderedRows: js.Array[IRow] => Unit,
    sortActual: () => Unit,
    sortColumnsInit: () => Unit,
    sortData: (IColumn, js.Any) => Unit,
    styleProvider: IStyleProvider
  ): IGridInstance = {
    val __obj = js.Dynamic.literal($canvas = $canvas, $footerPanel = $footerPanel, $groupPanel = $groupPanel, $headerContainer = $headerContainer, $headerScroller = $headerScroller, $headers = $headers, $root = $root, $topPanel = $topPanel, $viewport = $viewport, buildColumnDefsFromData = js.Any.fromFunction0(buildColumnDefsFromData), buildColumns = js.Any.fromFunction0(buildColumns), calcMaxCanvasHeight = js.Any.fromFunction0(calcMaxCanvasHeight), clearSortingData = js.Any.fromFunction0(clearSortingData), config = config, configureColumnWidths = js.Any.fromFunction0(configureColumnWidths), data = data, elementDims = elementDims, eventProvider = eventProvider, filteredRows = filteredRows, fixColumnIndexes = js.Any.fromFunction0(fixColumnIndexes), fixGroupIndexes = js.Any.fromFunction0(fixGroupIndexes), footerController = footerController, getTemplate = js.Any.fromFunction1(getTemplate), gridId = gridId, init = js.Any.fromFunction0(init), initTemplates = js.Any.fromFunction0(initTemplates), lastSortedColumns = lastSortedColumns, lateBindColumns = lateBindColumns, maxCanvasHt = maxCanvasHt, minRowsToRender = js.Any.fromFunction0(minRowsToRender), prevScrollIndex = prevScrollIndex, prevScrollTop = prevScrollTop, refreshDomSizes = js.Any.fromFunction0(refreshDomSizes), resizeOnData = js.Any.fromFunction1(resizeOnData), rootDim = rootDim, rowCache = rowCache, rowFactory = rowFactory, rowMap = rowMap, searchProvider = searchProvider, setRenderedRows = js.Any.fromFunction1(setRenderedRows), sortActual = js.Any.fromFunction0(sortActual), sortColumnsInit = js.Any.fromFunction0(sortColumnsInit), sortData = js.Any.fromFunction2(sortData), styleProvider = styleProvider)
  
    __obj.asInstanceOf[IGridInstance]
  }
}

