package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridInstance extends js.Object {
  @JSName("$canvas")
  var $canvas: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  @JSName("$footerPanel")
  var $footerPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  @JSName("$groupPanel")
  var $groupPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  @JSName("$headerContainer")
  var $headerContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  @JSName("$headerScroller")
  var $headerScroller: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  @JSName("$headers")
  var $headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  @JSName("$root")
  var $root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  @JSName("$topPanel")
  var $topPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  @JSName("$viewport")
  var $viewport: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  var config: IGridOptions = js.native
  var data: js.Any = js.native
  var elementDims: IElementDimension = js.native
  var eventProvider: IEventProvider = js.native
  var filteredRows: js.Array[IRow] = js.native
  var footerController: js.Any = js.native
  var gridId: String = js.native
  var lastSortedColumns: js.Array[IColumn] = js.native
  var lateBindColumns: Boolean = js.native
  var maxCanvasHt: Double = js.native
  var prevScrollIndex: Double = js.native
  var prevScrollTop: Double = js.native
  var rootDim: IDimension = js.native
  var rowCache: js.Array[IRow] = js.native
  var rowFactory: IRowFactory = js.native
  var rowMap: js.Array[IRow] = js.native
  var searchProvider: ISearchProvider = js.native
  var styleProvider: IStyleProvider = js.native
  def buildColumnDefsFromData(): Unit = js.native
  def buildColumns(): Unit = js.native
  def calcMaxCanvasHeight(): Unit = js.native
  def clearSortingData(): Unit = js.native
  def configureColumnWidths(): Unit = js.native
  def fixColumnIndexes(): Unit = js.native
  def fixGroupIndexes(): Unit = js.native
  def getTemplate(key: String): js.Any = js.native
  def init(): js.Any = js.native
  def initTemplates(): js.Any = js.native
  def minRowsToRender(): Unit = js.native
  def refreshDomSizes(): Unit = js.native
  def resizeOnData(col: IColumn): Unit = js.native
  def setRenderedRows(newRows: js.Array[IRow]): Unit = js.native
  def sortActual(): Unit = js.native
  def sortColumnsInit(): Unit = js.native
  def sortData(col: IColumn, event: js.Any): Unit = js.native
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
  @scala.inline
  implicit class IGridInstanceOps[Self <: IGridInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$canvas(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = this.set("$canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def set$footerPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = this.set("$footerPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def set$groupPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = this.set("$groupPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def set$headerContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = this.set("$headerContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def set$headerScroller(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = this.set("$headerScroller", value.asInstanceOf[js.Any])
    @scala.inline
    def set$headers(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = this.set("$headers", value.asInstanceOf[js.Any])
    @scala.inline
    def set$root(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = this.set("$root", value.asInstanceOf[js.Any])
    @scala.inline
    def set$topPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = this.set("$topPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def set$viewport(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = this.set("$viewport", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildColumnDefsFromData(value: () => Unit): Self = this.set("buildColumnDefsFromData", js.Any.fromFunction0(value))
    @scala.inline
    def setBuildColumns(value: () => Unit): Self = this.set("buildColumns", js.Any.fromFunction0(value))
    @scala.inline
    def setCalcMaxCanvasHeight(value: () => Unit): Self = this.set("calcMaxCanvasHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setClearSortingData(value: () => Unit): Self = this.set("clearSortingData", js.Any.fromFunction0(value))
    @scala.inline
    def setConfig(value: IGridOptions): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigureColumnWidths(value: () => Unit): Self = this.set("configureColumnWidths", js.Any.fromFunction0(value))
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementDims(value: IElementDimension): Self = this.set("elementDims", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventProvider(value: IEventProvider): Self = this.set("eventProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilteredRowsVarargs(value: IRow*): Self = this.set("filteredRows", js.Array(value :_*))
    @scala.inline
    def setFilteredRows(value: js.Array[IRow]): Self = this.set("filteredRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixColumnIndexes(value: () => Unit): Self = this.set("fixColumnIndexes", js.Any.fromFunction0(value))
    @scala.inline
    def setFixGroupIndexes(value: () => Unit): Self = this.set("fixGroupIndexes", js.Any.fromFunction0(value))
    @scala.inline
    def setFooterController(value: js.Any): Self = this.set("footerController", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTemplate(value: String => js.Any): Self = this.set("getTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def setGridId(value: String): Self = this.set("gridId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: () => js.Any): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setInitTemplates(value: () => js.Any): Self = this.set("initTemplates", js.Any.fromFunction0(value))
    @scala.inline
    def setLastSortedColumnsVarargs(value: IColumn*): Self = this.set("lastSortedColumns", js.Array(value :_*))
    @scala.inline
    def setLastSortedColumns(value: js.Array[IColumn]): Self = this.set("lastSortedColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setLateBindColumns(value: Boolean): Self = this.set("lateBindColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxCanvasHt(value: Double): Self = this.set("maxCanvasHt", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinRowsToRender(value: () => Unit): Self = this.set("minRowsToRender", js.Any.fromFunction0(value))
    @scala.inline
    def setPrevScrollIndex(value: Double): Self = this.set("prevScrollIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevScrollTop(value: Double): Self = this.set("prevScrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshDomSizes(value: () => Unit): Self = this.set("refreshDomSizes", js.Any.fromFunction0(value))
    @scala.inline
    def setResizeOnData(value: IColumn => Unit): Self = this.set("resizeOnData", js.Any.fromFunction1(value))
    @scala.inline
    def setRootDim(value: IDimension): Self = this.set("rootDim", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowCacheVarargs(value: IRow*): Self = this.set("rowCache", js.Array(value :_*))
    @scala.inline
    def setRowCache(value: js.Array[IRow]): Self = this.set("rowCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowFactory(value: IRowFactory): Self = this.set("rowFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowMapVarargs(value: IRow*): Self = this.set("rowMap", js.Array(value :_*))
    @scala.inline
    def setRowMap(value: js.Array[IRow]): Self = this.set("rowMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchProvider(value: ISearchProvider): Self = this.set("searchProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetRenderedRows(value: js.Array[IRow] => Unit): Self = this.set("setRenderedRows", js.Any.fromFunction1(value))
    @scala.inline
    def setSortActual(value: () => Unit): Self = this.set("sortActual", js.Any.fromFunction0(value))
    @scala.inline
    def setSortColumnsInit(value: () => Unit): Self = this.set("sortColumnsInit", js.Any.fromFunction0(value))
    @scala.inline
    def setSortData(value: (IColumn, js.Any) => Unit): Self = this.set("sortData", js.Any.fromFunction2(value))
    @scala.inline
    def setStyleProvider(value: IStyleProvider): Self = this.set("styleProvider", value.asInstanceOf[js.Any])
  }
  
}

