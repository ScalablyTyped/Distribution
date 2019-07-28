package typings.ngDashTable.srcBrowserNgTableControllerMod

import typings.angular.angularMod.IAttributes
import typings.angular.angularMod.IAugmentedJQuery
import typings.angular.angularMod.ICompileService
import typings.angular.angularMod.IDocumentService
import typings.angular.angularMod.IParseService
import typings.angular.angularMod.ITimeoutService
import typings.ngDashTable.Anon_Columns
import typings.ngDashTable.srcBrowserNgTableColumnMod.NgTableColumn
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IColumnDef
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IDynamicTableColDef
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.ITableInputAttributes
import typings.ngDashTable.srcCoreMod.NgTableEventsChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableController", "NgTableController")
@js.native
class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected () extends js.Object {
  def this(
    $scope: ITableScope[TParams],
    $timeout: ITimeoutService,
    $parse: IParseService,
    $compile: ICompileService,
    $attrs: IAttributes with ITableInputAttributes,
    $element: IAugmentedJQuery,
    $document: IDocumentService,
    ngTableColumn: NgTableColumn[TCol],
    ngTableEventsChannel: NgTableEventsChannel
  ) = this()
  @JSName("$attrs")
  var $attrs: js.Any = js.native
  @JSName("$compile")
  var $compile: js.Any = js.native
  @JSName("$document")
  var $document: js.Any = js.native
  @JSName("$element")
  var $element: js.Any = js.native
  @JSName("$parse")
  var $parse: js.Any = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  var delayFilter: js.Any = js.native
  val hasVisibleFilterColumn: js.Any = js.native
  var ngTableColumn: js.Any = js.native
  var ngTableEventsChannel: js.Any = js.native
  def buildColumns(columns: js.Array[TCol]): js.Array[IColumnDef] = js.native
  def compileDirectiveTemplates(): Unit = js.native
  /* private */ def getVisibleColumns(): js.Any = js.native
  def loadFilterData($columns: js.Array[IColumnDef]): Unit = js.native
  /* private */ def onDataReloadStatusChange(newStatus: js.Any): js.Any = js.native
  def parseNgTableDynamicExpr(attr: String): Anon_Columns = js.native
  def setupBindingsToInternalScope(tableParamsExpr: String): Unit = js.native
  /* private */ def setupFilterRowBindingsToInternalScope(): js.Any = js.native
  /* private */ def setupGroupRowBindingsToInternalScope(): js.Any = js.native
  /* private */ def some[T](array: js.Any, predicate: js.Any): js.Any = js.native
  /* private */ def subscribeToTableEvents(): js.Any = js.native
}

/* static members */
@JSImport("ng-table/src/browser/ngTableController", "NgTableController")
@js.native
object NgTableController extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[String] = js.native
}

