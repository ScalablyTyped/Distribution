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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/browser", JSImport.Namespace)
@js.native
object browserMod extends js.Object {
  
  val ngTableBrowserModule: IModule = js.native
  
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typings.ngTable.ngTableControllerMod.NgTableController[TParams, TCol] {
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
  /* static members */
  @js.native
  object NgTableController extends js.Object {
    
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  @js.native
  class NgTableFilterConfig protected ()
    extends typings.ngTable.ngTableFilterConfigMod.NgTableFilterConfig {
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
    extends typings.ngTable.ngTableFilterConfigMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  /* static members */
  @js.native
  object NgTableFilterConfigProvider extends js.Object {
    
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
}
