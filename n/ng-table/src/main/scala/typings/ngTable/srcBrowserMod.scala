package typings.ngTable

import typings.angular.mod.IAttributes
import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.ICompileService
import typings.angular.mod.IDocumentService
import typings.angular.mod.IModule
import typings.angular.mod.IParseService
import typings.angular.mod.ITimeoutService
import typings.angular.mod.auto.IInjectorService
import typings.ngTable.srcBrowserNgTableColumnMod.NgTableColumn
import typings.ngTable.srcBrowserNgTableControllerMod.ITableScope
import typings.ngTable.srcBrowserPublicInterfacesMod.IColumnDef
import typings.ngTable.srcBrowserPublicInterfacesMod.IDynamicTableColDef
import typings.ngTable.srcBrowserPublicInterfacesMod.IFilterConfigValues
import typings.ngTable.srcBrowserPublicInterfacesMod.ITableInputAttributes
import typings.ngTable.srcCoreMod.NgTableEventsChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserMod {
  
  @JSImport("ng-table/src/browser", "NgTableController")
  @js.native
  open class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typings.ngTable.srcBrowserNgTableControllerMod.NgTableController[TParams, TCol] {
    def this(
      $scope: ITableScope[TParams],
      $timeout: ITimeoutService,
      $parse: IParseService,
      $compile: ICompileService,
      $attrs: IAttributes & ITableInputAttributes,
      $element: IAugmentedJQuery,
      $document: IDocumentService,
      ngTableColumn: NgTableColumn[TCol],
      ngTableEventsChannel: NgTableEventsChannel
    ) = this()
  }
  /* static members */
  object NgTableController {
    
    @JSImport("ng-table/src/browser", "NgTableController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser", "NgTableController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser", "NgTableFilterConfig")
  @js.native
  open class NgTableFilterConfig protected ()
    extends typings.ngTable.srcBrowserNgTableFilterConfigMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  /* static members */
  object NgTableFilterConfig {
    
    @JSImport("ng-table/src/browser", "NgTableFilterConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser", "NgTableFilterConfig.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser", "NgTableFilterConfigProvider")
  @js.native
  open class NgTableFilterConfigProvider protected ()
    extends typings.ngTable.srcBrowserNgTableFilterConfigMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  /* static members */
  object NgTableFilterConfigProvider {
    
    @JSImport("ng-table/src/browser", "NgTableFilterConfigProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser", "NgTableFilterConfigProvider.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser", "ngTableBrowserModule")
  @js.native
  val ngTableBrowserModule: IModule = js.native
}
