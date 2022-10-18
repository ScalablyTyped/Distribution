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
import typings.ngTable.srcBrowserNgTableColumnMod.NgTableColumn
import typings.ngTable.srcBrowserNgTableControllerMod.ITableScope
import typings.ngTable.srcBrowserPublicInterfacesMod.IColumnDef
import typings.ngTable.srcBrowserPublicInterfacesMod.IDynamicTableColDef
import typings.ngTable.srcBrowserPublicInterfacesMod.IFilterConfigValues
import typings.ngTable.srcBrowserPublicInterfacesMod.ITableInputAttributes
import typings.ngTable.srcCoreNgTableDefaultsMod.IDefaults
import typings.ngTable.srcCoreNgTableParamsMod.IParamValues
import typings.ngTable.srcCoreNgTableSettingsMod.ISettings
import typings.ngTable.srcCoreNgTableSettingsMod.NgTableSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ng-table", "NgTableController")
  @js.native
  open class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typings.ngTable.srcBrowserMod.NgTableController[TParams, TCol] {
    def this(
      $scope: ITableScope[TParams],
      $timeout: ITimeoutService,
      $parse: IParseService,
      $compile: ICompileService,
      $attrs: IAttributes & ITableInputAttributes,
      $element: IAugmentedJQuery,
      $document: IDocumentService,
      ngTableColumn: NgTableColumn[TCol],
      ngTableEventsChannel: typings.ngTable.srcCoreMod.NgTableEventsChannel
    ) = this()
  }
  /* static members */
  object NgTableController {
    
    @JSImport("ng-table", "NgTableController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table", "NgTableController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table", "NgTableDefaultGetDataProvider")
  @js.native
  open class NgTableDefaultGetDataProvider ()
    extends typings.ngTable.srcCoreMod.NgTableDefaultGetDataProvider
  
  @JSImport("ng-table", "NgTableEventsChannel")
  @js.native
  open class NgTableEventsChannel protected ()
    extends typings.ngTable.srcCoreMod.NgTableEventsChannel {
    def this($rootScope: IRootScopeService) = this()
  }
  /* static members */
  object NgTableEventsChannel {
    
    @JSImport("ng-table", "NgTableEventsChannel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table", "NgTableEventsChannel.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table", "NgTableFilterConfig")
  @js.native
  open class NgTableFilterConfig protected ()
    extends typings.ngTable.srcBrowserMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  /* static members */
  object NgTableFilterConfig {
    
    @JSImport("ng-table", "NgTableFilterConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table", "NgTableFilterConfig.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table", "NgTableFilterConfigProvider")
  @js.native
  open class NgTableFilterConfigProvider protected ()
    extends typings.ngTable.srcBrowserMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  /* static members */
  object NgTableFilterConfigProvider {
    
    @JSImport("ng-table", "NgTableFilterConfigProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table", "NgTableFilterConfigProvider.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table", "NgTableParams")
  @js.native
  open class NgTableParams[T] ()
    extends typings.ngTable.srcCoreMod.NgTableParams[T] {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: Unit, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
  }
  /* static members */
  object NgTableParams {
    
    @JSImport("ng-table", "NgTableParams")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table", "NgTableParams.$log")
    @js.native
    def $log: Any = js.native
    inline def $log_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$log")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table", "NgTableParams.$q")
    @js.native
    def $q: Any = js.native
    inline def $q_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$q")(x.asInstanceOf[js.Any])
    
    inline def init(
      $q: IQService,
      $log: ILogService,
      ngTableDefaults: IDefaults,
      ngTableEventsChannel: typings.ngTable.srcCoreNgTableEventsChannelMod.NgTableEventsChannel,
      ngTableSettings: NgTableSettings
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")($q.asInstanceOf[js.Any], $log.asInstanceOf[js.Any], ngTableDefaults.asInstanceOf[js.Any], ngTableEventsChannel.asInstanceOf[js.Any], ngTableSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("ng-table", "NgTableParams.ngTableDefaults")
    @js.native
    def ngTableDefaults: Any = js.native
    inline def ngTableDefaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableDefaults")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table", "NgTableParams.ngTableEventsChannel")
    @js.native
    def ngTableEventsChannel: Any = js.native
    inline def ngTableEventsChannel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableEventsChannel")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table", "NgTableParams.ngTableSettings")
    @js.native
    def ngTableSettings: Any = js.native
    inline def ngTableSettings_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableSettings")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table", "ngTableBrowserModule")
  @js.native
  val ngTableBrowserModule: IModule = js.native
  
  @JSImport("ng-table", "ngTableCoreModule")
  @js.native
  val ngTableCoreModule: IModule = js.native
  
  @JSImport("ng-table", "ngTableModule")
  @js.native
  val ngTableModule: IModule = js.native
}
