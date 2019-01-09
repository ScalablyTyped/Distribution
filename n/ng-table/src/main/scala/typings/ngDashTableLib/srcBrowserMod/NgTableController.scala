package typings
package ngDashTableLib.srcBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser", "NgTableController")
@js.native
class NgTableController[TParams, TCol /* <: ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef | ngDashTableLib.srcBrowserPublicDashInterfacesMod.IDynamicTableColDef */] protected ()
  extends ngDashTableLib.srcBrowserNgTableControllerMod.NgTableController[TParams, TCol] {
  def this($scope: ngDashTableLib.srcBrowserNgTableControllerMod.ITableScope[TParams], $timeout: angularLib.angularMod.angularNs.ITimeoutService, $parse: angularLib.angularMod.angularNs.IParseService, $compile: angularLib.angularMod.angularNs.ICompileService, $attrs: angularLib.angularMod.angularNs.IAttributes with ngDashTableLib.srcBrowserPublicDashInterfacesMod.ITableInputAttributes, $element: angularLib.angularMod.angularNs.IAugmentedJQuery, $document: angularLib.angularMod.angularNs.IDocumentService, ngTableColumn: ngDashTableLib.srcBrowserNgTableColumnMod.NgTableColumn[TCol], ngTableEventsChannel: ngDashTableLib.srcCoreMod.NgTableEventsChannel) = this()
}

@JSImport("ng-table/src/browser", "NgTableController")
@js.native
object NgTableController extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[java.lang.String] = js.native
}

