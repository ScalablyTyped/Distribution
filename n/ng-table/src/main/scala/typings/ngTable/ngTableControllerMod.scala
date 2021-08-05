package typings.ngTable

import typings.angular.mod.IAttributes
import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.ICompileService
import typings.angular.mod.IDocumentService
import typings.angular.mod.IParseService
import typings.angular.mod.IRootScopeService
import typings.angular.mod.ITimeoutService
import typings.ngTable.anon.Columns
import typings.ngTable.anon.Disabled
import typings.ngTable.anon.Header
import typings.ngTable.anon.Show
import typings.ngTable.coreMod.NgTableEventsChannel
import typings.ngTable.coreMod.NgTableParams
import typings.ngTable.ngTableColumnMod.NgTableColumn
import typings.ngTable.pagingMod.IPageButton
import typings.ngTable.publicInterfacesMod.IColumnDef
import typings.ngTable.publicInterfacesMod.IDynamicTableColDef
import typings.ngTable.publicInterfacesMod.ITableInputAttributes
import typings.ngTable.resultsMod.DataResults
import typings.ngTable.resultsMod.GroupedDataResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableControllerMod {
  
  @JSImport("ng-table/src/browser/ngTableController", "NgTableController")
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected () extends StObject {
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
    
    /* private */ @JSName("$attrs")
    var $attrs: js.Any = js.native
    
    /* private */ @JSName("$compile")
    var $compile: js.Any = js.native
    
    /* private */ @JSName("$document")
    var $document: js.Any = js.native
    
    /* private */ @JSName("$element")
    var $element: js.Any = js.native
    
    /* private */ @JSName("$parse")
    var $parse: js.Any = js.native
    
    /* private */ @JSName("$scope")
    var $scope: js.Any = js.native
    
    def buildColumns(columns: js.Array[TCol]): js.Array[IColumnDef] = js.native
    
    def compileDirectiveTemplates(): Unit = js.native
    
    /* private */ var delayFilter: js.Any = js.native
    
    /* private */ def getVisibleColumns(): js.Any = js.native
    
    /* private */ val hasVisibleFilterColumn: js.Any = js.native
    
    def loadFilterData($columns: js.Array[IColumnDef]): Unit = js.native
    
    /* private */ var ngTableColumn: js.Any = js.native
    
    /* private */ var ngTableEventsChannel: js.Any = js.native
    
    /* private */ def onDataReloadStatusChange(newStatus: js.Any): js.Any = js.native
    
    def parseNgTableDynamicExpr(attr: String): Columns = js.native
    
    def setupBindingsToInternalScope(tableParamsExpr: String): Unit = js.native
    
    /* private */ def setupFilterRowBindingsToInternalScope(): js.Any = js.native
    
    /* private */ def setupGroupRowBindingsToInternalScope(): js.Any = js.native
    
    /* private */ def some[T](array: js.Any, predicate: js.Any): js.Any = js.native
    
    /* private */ def subscribeToTableEvents(): js.Any = js.native
  }
  /* static members */
  object NgTableController {
    
    @JSImport("ng-table/src/browser/ngTableController", "NgTableController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser/ngTableController", "NgTableController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITableScope[T]
    extends StObject
       with IRootScopeService {
    
    @JSName("$columns")
    var $columns: js.Array[IColumnDef] = js.native
    
    @JSName("$data")
    var $data: js.UndefOr[DataResults[T]] = js.native
    
    @JSName("$filterRow")
    var $filterRow: Disabled = js.native
    
    @JSName("$groupRow")
    var $groupRow: Show = js.native
    
    @JSName("$groups")
    var $groups: js.UndefOr[GroupedDataResults[T]] = js.native
    
    @JSName("$loading")
    var $loading: Boolean = js.native
    
    var pages: js.Array[IPageButton] = js.native
    
    var params: NgTableParams[T] = js.native
    
    var show_filter: Boolean = js.native
    
    var templates: Header = js.native
  }
}
