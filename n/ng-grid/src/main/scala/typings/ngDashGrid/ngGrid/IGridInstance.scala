package typings.ngDashGrid.ngGrid

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

