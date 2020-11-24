package typings.ngTable

import typings.angular.mod.IAttributes
import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.ICompileService
import typings.angular.mod.IDocumentService
import typings.angular.mod.ILogService
import typings.angular.mod.IModule
import typings.angular.mod.IParseService
import typings.angular.mod.IQService
import typings.angular.mod.IRootScopeService
import typings.angular.mod.ITimeoutService
import typings.angular.mod.auto.IInjectorService
import typings.ngTable.ngTableColumnMod.NgTableColumn
import typings.ngTable.ngTableControllerMod.ITableScope
import typings.ngTable.ngTableDefaultsMod.IDefaults
import typings.ngTable.ngTableParamsMod.IParamValues
import typings.ngTable.ngTableSettingsMod.ISettings
import typings.ngTable.ngTableSettingsMod.NgTableSettings
import typings.ngTable.publicInterfacesMod.IColumnDef
import typings.ngTable.publicInterfacesMod.IDynamicTableColDef
import typings.ngTable.publicInterfacesMod.IFilterConfigValues
import typings.ngTable.publicInterfacesMod.ITableInputAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ngTableBrowserModule: IModule = js.native
  
  val ngTableCoreModule: IModule = js.native
  
  val ngTableModule: IModule = js.native
  
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typings.ngTable.browserMod.NgTableController[TParams, TCol] {
    def this(
      $scope: ITableScope[TParams],
      $timeout: ITimeoutService,
      $parse: IParseService,
      $compile: ICompileService,
      $attrs: IAttributes with ITableInputAttributes,
      $element: IAugmentedJQuery,
      $document: IDocumentService,
      ngTableColumn: NgTableColumn[TCol],
      ngTableEventsChannel: typings.ngTable.coreMod.NgTableEventsChannel
    ) = this()
  }
  /* static members */
  @js.native
  object NgTableController extends js.Object {
    
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  @js.native
  class NgTableDefaultGetDataProvider ()
    extends typings.ngTable.coreMod.NgTableDefaultGetDataProvider
  
  @js.native
  class NgTableEventsChannel protected ()
    extends typings.ngTable.coreMod.NgTableEventsChannel {
    def this($rootScope: IRootScopeService) = this()
  }
  /* static members */
  @js.native
  object NgTableEventsChannel extends js.Object {
    
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  @js.native
  class NgTableFilterConfig protected ()
    extends typings.ngTable.browserMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  /* static members */
  @js.native
  object NgTableFilterConfig extends js.Object {
    
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends typings.ngTable.browserMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  /* static members */
  @js.native
  object NgTableFilterConfigProvider extends js.Object {
    
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  @js.native
  class NgTableParams[T] ()
    extends typings.ngTable.coreMod.NgTableParams[T] {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: js.UndefOr[scala.Nothing], baseSettings: ISettings[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
  }
  /* static members */
  @js.native
  object NgTableParams extends js.Object {
    
    @JSName("$log")
    var $log: js.Any = js.native
    
    @JSName("$q")
    var $q: js.Any = js.native
    
    def init(
      $q: IQService,
      $log: ILogService,
      ngTableDefaults: IDefaults,
      ngTableEventsChannel: typings.ngTable.ngTableEventsChannelMod.NgTableEventsChannel,
      ngTableSettings: NgTableSettings
    ): Unit = js.native
    
    var ngTableDefaults: js.Any = js.native
    
    var ngTableEventsChannel: js.Any = js.native
    
    var ngTableSettings: js.Any = js.native
  }
}
