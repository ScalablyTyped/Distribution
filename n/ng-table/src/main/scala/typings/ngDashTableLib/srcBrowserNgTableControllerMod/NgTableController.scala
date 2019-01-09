package typings
package ngDashTableLib.srcBrowserNgTableControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableController", "NgTableController")
@js.native
class NgTableController[TParams, TCol /* <: ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef | ngDashTableLib.srcBrowserPublicDashInterfacesMod.IDynamicTableColDef */] protected () extends js.Object {
  def this($scope: ITableScope[TParams], $timeout: angularLib.angularMod.angularNs.ITimeoutService, $parse: angularLib.angularMod.angularNs.IParseService, $compile: angularLib.angularMod.angularNs.ICompileService, $attrs: angularLib.angularMod.angularNs.IAttributes with ngDashTableLib.srcBrowserPublicDashInterfacesMod.ITableInputAttributes, $element: angularLib.angularMod.angularNs.IAugmentedJQuery, $document: angularLib.angularMod.angularNs.IDocumentService, ngTableColumn: ngDashTableLib.srcBrowserNgTableColumnMod.NgTableColumn[TCol], ngTableEventsChannel: ngDashTableLib.srcCoreMod.NgTableEventsChannel) = this()
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
  def buildColumns(columns: js.Array[TCol]): js.Array[ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef] = js.native
  def compileDirectiveTemplates(): scala.Unit = js.native
  /* private */ def getVisibleColumns(): js.Any = js.native
  def loadFilterData($columns: js.Array[ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef]): scala.Unit = js.native
  /* private */ def onDataReloadStatusChange(newStatus: js.Any): js.Any = js.native
  def parseNgTableDynamicExpr(attr: java.lang.String): ngDashTableLib.Anon_Columns = js.native
  def setupBindingsToInternalScope(tableParamsExpr: java.lang.String): scala.Unit = js.native
  /* private */ def setupFilterRowBindingsToInternalScope(): js.Any = js.native
  /* private */ def setupGroupRowBindingsToInternalScope(): js.Any = js.native
  /* private */ def some[T](array: js.Any, predicate: js.Any): js.Any = js.native
  /* private */ def subscribeToTableEvents(): js.Any = js.native
}

@JSImport("ng-table/src/browser/ngTableController", "NgTableController")
@js.native
object NgTableController extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[java.lang.String] = js.native
}

