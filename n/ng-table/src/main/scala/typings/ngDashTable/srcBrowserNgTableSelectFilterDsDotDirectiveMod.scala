package typings.ngDashTable

import typings.angular.JQLite
import typings.angular.angularMod.IAttributes
import typings.angular.angularMod.IController
import typings.angular.angularMod.IDirective
import typings.angular.angularMod.IParseService
import typings.angular.angularMod.IQService
import typings.angular.angularMod.IScope
import typings.ngDashTable.srcBrowserNgTableSelectFilterDsDotDirectiveMod.IInputAttributes
import typings.ngDashTable.srcBrowserNgTableSelectFilterDsDotDirectiveMod.IScopeExtensions
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IColumnDef
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.ISelectOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableSelectFilterDs.directive", JSImport.Namespace)
@js.native
object srcBrowserNgTableSelectFilterDsDotDirectiveMod extends js.Object {
  @js.native
  trait IInputAttributes extends IAttributes {
    var ngTableSelectFilterDs: String = js.native
  }
  
  @js.native
  trait IScopeExtensions extends js.Object {
    @JSName("$selectData")
    var $selectData: js.Array[ISelectOption] = js.native
  }
  
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
  
  /**
    * Takes the array returned by $column.filterData and makes it available as `$selectData` on the `$scope`.
    *
    * The resulting `$selectData` array will contain an extra item that is suitable to represent the user
    * "deselecting" an item from a `<select>` tag
    *
    * This directive is is focused on providing a datasource to an `ngOptions` directive
    */
  def ngTableSelectFilterDs(): IDirective[IScope, JQLite, IAttributes, IController] = js.native
  /* static members */
  @js.native
  object NgTableSelectFilterDsController extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
}

