package typings.ngDashTable.ngDashTableMod

import typings.angular.angularMod.IAttributes
import typings.angular.angularMod.IAugmentedJQuery
import typings.angular.angularMod.ICompileService
import typings.angular.angularMod.IDocumentService
import typings.angular.angularMod.IParseService
import typings.angular.angularMod.ITimeoutService
import typings.ngDashTable.srcBrowserNgTableColumnMod.NgTableColumn
import typings.ngDashTable.srcBrowserNgTableControllerMod.ITableScope
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IColumnDef
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IDynamicTableColDef
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.ITableInputAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table", "NgTableController")
@js.native
class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
  extends typings.ngDashTable.srcBrowserMod.NgTableController[TParams, TCol] {
  def this(
    $scope: ITableScope[TParams],
    $timeout: ITimeoutService,
    $parse: IParseService,
    $compile: ICompileService,
    $attrs: IAttributes with ITableInputAttributes,
    $element: IAugmentedJQuery,
    $document: IDocumentService,
    ngTableColumn: NgTableColumn[TCol],
    ngTableEventsChannel: typings.ngDashTable.srcCoreMod.NgTableEventsChannel
  ) = this()
}

/* static members */
@JSImport("ng-table", "NgTableController")
@js.native
object NgTableController extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[String] = js.native
}

