package typings.ngTable

import typings.angular.mod.IAttributes
import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.ICompileService
import typings.angular.mod.IDocumentService
import typings.angular.mod.IModule
import typings.angular.mod.IParseService
import typings.angular.mod.ITimeoutService
import typings.angular.mod.auto.IInjectorService
import typings.ngTable.coreMod.NgTableEventsChannel
import typings.ngTable.ngTableColumnMod.NgTableColumn
import typings.ngTable.ngTableControllerMod.ITableScope
import typings.ngTable.publicInterfacesMod.IColumnDef
import typings.ngTable.publicInterfacesMod.IDynamicTableColDef
import typings.ngTable.publicInterfacesMod.IFilterConfigValues
import typings.ngTable.publicInterfacesMod.ITableInputAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("ng-table/src/browser", "NgTableController")
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typings.ngTable.ngTableControllerMod.NgTableController[TParams, TCol] {
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
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser", "NgTableFilterConfig")
  @js.native
  class NgTableFilterConfig protected ()
    extends typings.ngTable.ngTableFilterConfigMod.NgTableFilterConfig {
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
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser", "NgTableFilterConfigProvider")
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends typings.ngTable.ngTableFilterConfigMod.NgTableFilterConfigProvider {
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
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser", "ngTableBrowserModule")
  @js.native
  val ngTableBrowserModule: IModule = js.native
}
