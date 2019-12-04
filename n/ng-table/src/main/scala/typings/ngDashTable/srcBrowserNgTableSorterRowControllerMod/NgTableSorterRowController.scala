package typings.ngDashTable.srcBrowserNgTableSorterRowControllerMod

import typings.ngDashTable.srcBrowserNgTableControllerMod.ITableScope
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IColumnDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableSorterRowController", "NgTableSorterRowController")
@js.native
class NgTableSorterRowController[T] protected () extends js.Object {
  def this($scope: ITableScope[T]) = this()
  @JSName("$scope")
  var $scope: js.Any = js.native
  def sortBy($column: IColumnDef, event: IAugmentedMouseEvent): Unit = js.native
}

/* static members */
@JSImport("ng-table/src/browser/ngTableSorterRowController", "NgTableSorterRowController")
@js.native
object NgTableSorterRowController extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[String] = js.native
}

