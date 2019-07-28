package typings.ngDashTable.srcBrowserNgTableControllerMod

import typings.angular.angularMod.IRootScopeService
import typings.ngDashTable.Anon_Disabled
import typings.ngDashTable.Anon_Header
import typings.ngDashTable.Anon_Show
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IColumnDef
import typings.ngDashTable.srcCoreDataResultsMod.DataResults
import typings.ngDashTable.srcCoreDataResultsMod.GroupedDataResults
import typings.ngDashTable.srcCoreMod.NgTableParams
import typings.ngDashTable.srcCorePagingMod.IPageButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableScope[T] extends IRootScopeService {
  @JSName("$columns")
  var $columns: js.Array[IColumnDef] = js.native
  @JSName("$data")
  var $data: js.UndefOr[DataResults[T]] = js.native
  @JSName("$filterRow")
  var $filterRow: Anon_Disabled = js.native
  @JSName("$groupRow")
  var $groupRow: Anon_Show = js.native
  @JSName("$groups")
  var $groups: js.UndefOr[GroupedDataResults[T]] = js.native
  @JSName("$loading")
  var $loading: Boolean = js.native
  var pages: js.Array[IPageButton] = js.native
  var params: NgTableParams[T] = js.native
  var show_filter: Boolean = js.native
  var templates: Anon_Header = js.native
}

