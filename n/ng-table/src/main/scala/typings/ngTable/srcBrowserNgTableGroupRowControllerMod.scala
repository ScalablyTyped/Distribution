package typings.ngTable

import typings.angular.mod.IPromise
import typings.ngTable.srcBrowserNgTableControllerMod.ITableScope
import typings.ngTable.srcBrowserPublicInterfacesMod.IColumnDef
import typings.ngTable.srcCoreDataResultsMod.DataResult
import typings.ngTable.srcCoreGroupingGroupingFuncMod.IGroupingFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserNgTableGroupRowControllerMod {
  
  @JSImport("ng-table/src/browser/ngTableGroupRowController", "NgTableGroupRowController")
  @js.native
  open class NgTableGroupRowController[T] protected () extends StObject {
    def this($scope: ITableScope[T] & IScopeExtensions[T]) = this()
    
    /* private */ @JSName("$scope")
    var $scope: Any = js.native
    
    /* private */ def changeSortDirection(): Any = js.native
    
    /* private */ def findGroupColumn(groupKey: Any): Any = js.native
    
    def getGroupTitle(group: IColumnDef): String = js.native
    def getGroupTitle(group: IGroupingFunc[Any]): String = js.native
    
    def getGroupables(): js.Array[IGroupingFunc[Any] | IColumnDef] = js.native
    
    def getVisibleColumns(): js.Array[IColumnDef] = js.native
    
    def groupBy(group: IColumnDef): Unit = js.native
    def groupBy(group: IGroupingFunc[Any]): Unit = js.native
    
    /* private */ var groupFns: Any = js.native
    
    /* private */ def isGroupingFunc(`val`: Any): Any = js.native
    
    def isSelectedGroup(group: IColumnDef): Boolean = js.native
    def isSelectedGroup(group: IGroupingFunc[Any]): Boolean = js.native
    
    /* private */ def setGroup(grouping: Any): Any = js.native
    
    def toggleDetail(): IPromise[
        js.Array[
          DataResult[
            /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
          ]
        ]
      ] = js.native
  }
  /* static members */
  object NgTableGroupRowController {
    
    @JSImport("ng-table/src/browser/ngTableGroupRowController", "NgTableGroupRowController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser/ngTableGroupRowController", "NgTableGroupRowController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  trait IScopeExtensions[T] extends StObject {
    
    @JSName("$selGroup")
    var $selGroup: IGroupingFunc[Any] | String
    
    @JSName("$selGroupTitle")
    var $selGroupTitle: String
  }
  object IScopeExtensions {
    
    inline def apply[T]($selGroup: IGroupingFunc[Any] | String, $selGroupTitle: String): IScopeExtensions[T] = {
      val __obj = js.Dynamic.literal($selGroup = $selGroup.asInstanceOf[js.Any], $selGroupTitle = $selGroupTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScopeExtensions[T]]
    }
    
    extension [Self <: IScopeExtensions[?], T](x: Self & IScopeExtensions[T]) {
      
      inline def set$selGroup(value: IGroupingFunc[Any] | String): Self = StObject.set(x, "$selGroup", value.asInstanceOf[js.Any])
      
      inline def set$selGroupTitle(value: String): Self = StObject.set(x, "$selGroupTitle", value.asInstanceOf[js.Any])
    }
  }
}
