package typings.ngDashTable

import typings.angular.angularMod.IAttributes
import typings.angular.angularMod.IAugmentedJQuery
import typings.angular.angularMod.ICompileService
import typings.angular.angularMod.IDocumentService
import typings.angular.angularMod.IModule
import typings.angular.angularMod.IParseService
import typings.angular.angularMod.ITimeoutService
import typings.angular.angularMod.auto.IInjectorService
import typings.ngDashTable.srcBrowserNgTableColumnMod.NgTableColumn
import typings.ngDashTable.srcBrowserNgTableControllerMod.ITableScope
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IColumnDef
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IDynamicTableColDef
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IFilterConfigValues
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.ITableInputAttributes
import typings.ngDashTable.srcCoreMod.NgTableEventsChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser", JSImport.Namespace)
@js.native
object srcBrowserMod extends js.Object {
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typings.ngDashTable.srcBrowserNgTableControllerMod.NgTableController[TParams, TCol] {
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
  }
  
  @js.native
  class NgTableFilterConfig protected ()
    extends typings.ngDashTable.srcBrowserNgTableFilterConfigMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends typings.ngDashTable.srcBrowserNgTableFilterConfigMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  
  val ngTableBrowserModule: IModule = js.native
  /* static members */
  @js.native
  object NgTableController extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableFilterConfig extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableFilterConfigProvider extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
}

