package typings.ngDashTable.srcBrowserNgTableSelectFilterDsDotDirectiveMod

import typings.angular.angularMod.IParseService
import typings.angular.angularMod.IQService
import typings.angular.angularMod.IScope
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IColumnDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableSelectFilterDs.directive", "NgTableSelectFilterDsController")
@js.native
class NgTableSelectFilterDsController protected () extends js.Object {
  def this(
    $scope: IScope with IScopeExtensions,
    $parse: IParseService,
    $attrs: IInputAttributes,
    $q: IQService
  ) = this()
  @JSName("$attrs")
  var $attrs: js.Any = js.native
  @JSName("$column")
  var $column: IColumnDef = js.native
  @JSName("$q")
  var $q: js.Any = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  /* private */ def bindDataSource(): js.Any = js.native
  /* private */ def getSelectListData($column: js.Any): js.Any = js.native
  /* private */ def hasEmptyOption(data: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ng-table/src/browser/ngTableSelectFilterDs.directive", "NgTableSelectFilterDsController")
@js.native
object NgTableSelectFilterDsController extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[String] = js.native
}

