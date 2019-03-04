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

object IGridInstance {
  @scala.inline
  def apply(
    $canvas: angularLib.angularMod.angularNs.IAugmentedJQuery,
    $footerPanel: angularLib.angularMod.angularNs.IAugmentedJQuery,
    $groupPanel: angularLib.angularMod.angularNs.IAugmentedJQuery,
    $headerContainer: angularLib.angularMod.angularNs.IAugmentedJQuery,
    $headerScroller: angularLib.angularMod.angularNs.IAugmentedJQuery,
    $headers: angularLib.angularMod.angularNs.IAugmentedJQuery,
    $root: angularLib.angularMod.angularNs.IAugmentedJQuery,
    $topPanel: angularLib.angularMod.angularNs.IAugmentedJQuery,
    $viewport: angularLib.angularMod.angularNs.IAugmentedJQuery,
    buildColumnDefsFromData: js.Function0[scala.Unit],
    buildColumns: js.Function0[scala.Unit],
    calcMaxCanvasHeight: js.Function0[scala.Unit],
    clearSortingData: js.Function0[scala.Unit],
    config: IGridOptions,
    configureColumnWidths: js.Function0[scala.Unit],
    data: js.Any,
    elementDims: IElementDimension,
    eventProvider: IEventProvider,
    filteredRows: js.Array[IRow],
    fixColumnIndexes: js.Function0[scala.Unit],
    fixGroupIndexes: js.Function0[scala.Unit],
    footerController: js.Any,
    getTemplate: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[_]],
    gridId: java.lang.String,
    init: js.Function0[angularLib.angularMod.angularNs.IPromise[_]],
    initTemplates: js.Function0[angularLib.angularMod.angularNs.IPromise[_]],
    lastSortedColumns: js.Array[IColumn],
    lateBindColumns: scala.Boolean,
    maxCanvasHt: scala.Double,
    minRowsToRender: js.Function0[scala.Unit],
    prevScrollIndex: scala.Double,
    prevScrollTop: scala.Double,
    refreshDomSizes: js.Function0[scala.Unit],
    resizeOnData: js.Function1[IColumn, scala.Unit],
    rootDim: IDimension,
    rowCache: js.Array[IRow],
    rowFactory: IRowFactory,
    rowMap: js.Array[IRow],
    searchProvider: ISearchProvider,
    setRenderedRows: js.Function1[js.Array[IRow], scala.Unit],
    sortActual: js.Function0[scala.Unit],
    sortColumnsInit: js.Function0[scala.Unit],
    sortData: js.Function2[IColumn, js.Any, scala.Unit],
    styleProvider: IStyleProvider
  ): IGridInstance = {
    val __obj = js.Dynamic.literal($canvas = $canvas, $footerPanel = $footerPanel, $groupPanel = $groupPanel, $headerContainer = $headerContainer, $headerScroller = $headerScroller, $headers = $headers, $root = $root, $topPanel = $topPanel, $viewport = $viewport, buildColumnDefsFromData = buildColumnDefsFromData, buildColumns = buildColumns, calcMaxCanvasHeight = calcMaxCanvasHeight, clearSortingData = clearSortingData, config = config, configureColumnWidths = configureColumnWidths, data = data, elementDims = elementDims, eventProvider = eventProvider, filteredRows = filteredRows, fixColumnIndexes = fixColumnIndexes, fixGroupIndexes = fixGroupIndexes, footerController = footerController, getTemplate = getTemplate, gridId = gridId, init = init, initTemplates = initTemplates, lastSortedColumns = lastSortedColumns, lateBindColumns = lateBindColumns, maxCanvasHt = maxCanvasHt, minRowsToRender = minRowsToRender, prevScrollIndex = prevScrollIndex, prevScrollTop = prevScrollTop, refreshDomSizes = refreshDomSizes, resizeOnData = resizeOnData, rootDim = rootDim, rowCache = rowCache, rowFactory = rowFactory, rowMap = rowMap, searchProvider = searchProvider, setRenderedRows = setRenderedRows, sortActual = sortActual, sortColumnsInit = sortColumnsInit, sortData = sortData, styleProvider = styleProvider)
  
    __obj.asInstanceOf[IGridInstance]
  }
}

