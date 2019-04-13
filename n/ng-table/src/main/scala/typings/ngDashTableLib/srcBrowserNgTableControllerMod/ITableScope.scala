package typings
package ngDashTableLib.srcBrowserNgTableControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableScope[T]
  extends angularLib.angularMod.IRootScopeService {
  @JSName("$columns")
  var $columns: js.Array[ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef] = js.native
  @JSName("$data")
  var $data: js.UndefOr[ngDashTableLib.srcCoreDataResultsMod.DataResults[T]] = js.native
  @JSName("$filterRow")
  var $filterRow: ngDashTableLib.Anon_Disabled = js.native
  @JSName("$groupRow")
  var $groupRow: ngDashTableLib.Anon_Show = js.native
  @JSName("$groups")
  var $groups: js.UndefOr[ngDashTableLib.srcCoreDataResultsMod.GroupedDataResults[T]] = js.native
  @JSName("$loading")
  var $loading: scala.Boolean = js.native
  var pages: js.Array[ngDashTableLib.srcCorePagingMod.IPageButton] = js.native
  var params: ngDashTableLib.srcCoreMod.NgTableParams[T] = js.native
  var show_filter: scala.Boolean = js.native
  var templates: ngDashTableLib.Anon_Header = js.native
}

