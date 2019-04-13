package typings
package ngDashTableLib.ngDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table", "NgTableController")
@js.native
class NgTableController[TParams, TCol /* <: ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef | ngDashTableLib.srcBrowserPublicDashInterfacesMod.IDynamicTableColDef */] protected ()
  extends ngDashTableLib.srcBrowserMod.NgTableController[TParams, TCol] {
  def this($scope: ngDashTableLib.srcBrowserNgTableControllerMod.ITableScope[TParams], $timeout: angularLib.angularMod.ITimeoutService, $parse: angularLib.angularMod.IParseService, $compile: angularLib.angularMod.ICompileService, $attrs: angularLib.angularMod.IAttributes with ngDashTableLib.srcBrowserPublicDashInterfacesMod.ITableInputAttributes, $element: angularLib.angularMod.IAugmentedJQuery, $document: angularLib.angularMod.IDocumentService, ngTableColumn: ngDashTableLib.srcBrowserNgTableColumnMod.NgTableColumn[TCol], ngTableEventsChannel: ngDashTableLib.srcCoreMod.NgTableEventsChannel) = this()
}

/* static members */
@JSImport("ng-table", "NgTableController")
@js.native
object NgTableController extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[java.lang.String] = js.native
}

