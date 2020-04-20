package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridInstance extends js.Object {
  @JSName("$canvas")
  var $canvas: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
  @JSName("$footerPanel")
  var $footerPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
  @JSName("$groupPanel")
  var $groupPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
  @JSName("$headerContainer")
  var $headerContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
  @JSName("$headerScroller")
  var $headerScroller: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
  @JSName("$headers")
  var $headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
  @JSName("$root")
  var $root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
  @JSName("$topPanel")
  var $topPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
  @JSName("$viewport")
  var $viewport: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
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
  def getTemplate(key: String): js.Any
  def init(): js.Any
  def initTemplates(): js.Any
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
    $canvas: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $footerPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $groupPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $headerContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $headerScroller: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $topPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $viewport: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
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
    getTemplate: String => js.Any,
    gridId: String,
    init: () => js.Any,
    initTemplates: () => js.Any,
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
    val __obj = js.Dynamic.literal($canvas = $canvas.asInstanceOf[js.Any], $footerPanel = $footerPanel.asInstanceOf[js.Any], $groupPanel = $groupPanel.asInstanceOf[js.Any], $headerContainer = $headerContainer.asInstanceOf[js.Any], $headerScroller = $headerScroller.asInstanceOf[js.Any], $headers = $headers.asInstanceOf[js.Any], $root = $root.asInstanceOf[js.Any], $topPanel = $topPanel.asInstanceOf[js.Any], $viewport = $viewport.asInstanceOf[js.Any], buildColumnDefsFromData = js.Any.fromFunction0(buildColumnDefsFromData), buildColumns = js.Any.fromFunction0(buildColumns), calcMaxCanvasHeight = js.Any.fromFunction0(calcMaxCanvasHeight), clearSortingData = js.Any.fromFunction0(clearSortingData), config = config.asInstanceOf[js.Any], configureColumnWidths = js.Any.fromFunction0(configureColumnWidths), data = data.asInstanceOf[js.Any], elementDims = elementDims.asInstanceOf[js.Any], eventProvider = eventProvider.asInstanceOf[js.Any], filteredRows = filteredRows.asInstanceOf[js.Any], fixColumnIndexes = js.Any.fromFunction0(fixColumnIndexes), fixGroupIndexes = js.Any.fromFunction0(fixGroupIndexes), footerController = footerController.asInstanceOf[js.Any], getTemplate = js.Any.fromFunction1(getTemplate), gridId = gridId.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initTemplates = js.Any.fromFunction0(initTemplates), lastSortedColumns = lastSortedColumns.asInstanceOf[js.Any], lateBindColumns = lateBindColumns.asInstanceOf[js.Any], maxCanvasHt = maxCanvasHt.asInstanceOf[js.Any], minRowsToRender = js.Any.fromFunction0(minRowsToRender), prevScrollIndex = prevScrollIndex.asInstanceOf[js.Any], prevScrollTop = prevScrollTop.asInstanceOf[js.Any], refreshDomSizes = js.Any.fromFunction0(refreshDomSizes), resizeOnData = js.Any.fromFunction1(resizeOnData), rootDim = rootDim.asInstanceOf[js.Any], rowCache = rowCache.asInstanceOf[js.Any], rowFactory = rowFactory.asInstanceOf[js.Any], rowMap = rowMap.asInstanceOf[js.Any], searchProvider = searchProvider.asInstanceOf[js.Any], setRenderedRows = js.Any.fromFunction1(setRenderedRows), sortActual = js.Any.fromFunction0(sortActual), sortColumnsInit = js.Any.fromFunction0(sortColumnsInit), sortData = js.Any.fromFunction2(sortData), styleProvider = styleProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridInstance]
  }
}

