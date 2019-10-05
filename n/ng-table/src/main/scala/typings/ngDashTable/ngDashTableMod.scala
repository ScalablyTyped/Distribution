package typings.ngDashTable

import typings.angular.angularMod.IAttributes
import typings.angular.angularMod.IAugmentedJQuery
import typings.angular.angularMod.ICompileService
import typings.angular.angularMod.IDocumentService
import typings.angular.angularMod.ILogService
import typings.angular.angularMod.IModule
import typings.angular.angularMod.IParseService
import typings.angular.angularMod.IQService
import typings.angular.angularMod.IRootScopeService
import typings.angular.angularMod.ITimeoutService
import typings.angular.angularMod.auto.IInjectorService
import typings.ngDashTable.srcBrowserNgTableColumnMod.NgTableColumn
import typings.ngDashTable.srcBrowserNgTableControllerMod.ITableScope
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IColumnDef
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IDynamicTableColDef
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IFilterConfigValues
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.ITableInputAttributes
import typings.ngDashTable.srcCoreNgTableDefaultsMod.IDefaults
import typings.ngDashTable.srcCoreNgTableParamsMod.IParamValues
import typings.ngDashTable.srcCoreNgTableSettingsMod.ISettings
import typings.ngDashTable.srcCoreNgTableSettingsMod.NgTableSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table", JSImport.Namespace)
@js.native
object ngDashTableMod extends js.Object {
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
  
  @js.native
  class NgTableDefaultGetDataProvider ()
    extends typings.ngDashTable.srcCoreMod.NgTableDefaultGetDataProvider
  
  @js.native
  class NgTableEventsChannel protected ()
    extends typings.ngDashTable.srcCoreMod.NgTableEventsChannel {
    def this($rootScope: IRootScopeService) = this()
  }
  
  @js.native
  class NgTableFilterConfig protected ()
    extends typings.ngDashTable.srcBrowserMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends typings.ngDashTable.srcBrowserMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  
  @js.native
  class NgTableParams[T] ()
    extends typings.ngDashTable.srcCoreMod.NgTableParams[T] {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
  }
  
  val ngTableBrowserModule: IModule = js.native
  val ngTableCoreModule: IModule = js.native
  val ngTableModule: IModule = js.native
  /* static members */
  @js.native
  object NgTableController extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableEventsChannel extends js.Object {
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
  
  /* static members */
  @js.native
  object NgTableParams extends js.Object {
    @JSName("$log")
    var $log: js.Any = js.native
    @JSName("$q")
    var $q: js.Any = js.native
    var ngTableDefaults: js.Any = js.native
    var ngTableEventsChannel: js.Any = js.native
    var ngTableSettings: js.Any = js.native
    def init(
      $q: IQService,
      $log: ILogService,
      ngTableDefaults: IDefaults,
      ngTableEventsChannel: typings.ngDashTable.srcCoreNgTableEventsChannelMod.NgTableEventsChannel,
      ngTableSettings: NgTableSettings
    ): Unit = js.native
  }
  
}

