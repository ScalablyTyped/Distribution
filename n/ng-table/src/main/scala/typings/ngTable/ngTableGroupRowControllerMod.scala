package typings.ngTable

import typings.angular.mod.IPromise
import typings.ngTable.groupingFuncMod.IGroupingFunc
import typings.ngTable.ngTableControllerMod.ITableScope
import typings.ngTable.publicInterfacesMod.IColumnDef
import typings.ngTable.resultsMod.DataResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableGroupRowControllerMod {
  
  @JSImport("ng-table/src/browser/ngTableGroupRowController", "NgTableGroupRowController")
  @js.native
  class NgTableGroupRowController[T] protected () extends StObject {
    def this($scope: ITableScope[T] & IScopeExtensions[T]) = this()
    
    @JSName("$scope")
    var $scope: js.Any = js.native
    
    /* private */ def changeSortDirection(): js.Any = js.native
    
    /* private */ def findGroupColumn(groupKey: js.Any): js.Any = js.native
    
    def getGroupTitle(group: IGroupingFunc[js.Any]): String = js.native
    def getGroupTitle(group: IColumnDef): String = js.native
    
    def getGroupables(): js.Array[IGroupingFunc[js.Any] | IColumnDef] = js.native
    
    def getVisibleColumns(): js.Array[IColumnDef] = js.native
    
    def groupBy(group: IGroupingFunc[js.Any]): Unit = js.native
    def groupBy(group: IColumnDef): Unit = js.native
    
    var groupFns: js.Any = js.native
    
    /* private */ def isGroupingFunc(`val`: js.Any): js.Any = js.native
    
    def isSelectedGroup(group: IGroupingFunc[js.Any]): Boolean = js.native
    def isSelectedGroup(group: IColumnDef): Boolean = js.native
    
    /* private */ def setGroup(grouping: js.Any): js.Any = js.native
    
    def toggleDetail(): IPromise[
        js.Array[
          DataResult[
            /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ js.Any
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
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  trait IScopeExtensions[T] extends StObject {
    
    @JSName("$selGroup")
    var $selGroup: IGroupingFunc[js.Any] | String
    
    @JSName("$selGroupTitle")
    var $selGroupTitle: String
  }
  object IScopeExtensions {
    
    @scala.inline
    def apply[T]($selGroup: IGroupingFunc[js.Any] | String, $selGroupTitle: String): IScopeExtensions[T] = {
      val __obj = js.Dynamic.literal($selGroup = $selGroup.asInstanceOf[js.Any], $selGroupTitle = $selGroupTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScopeExtensions[T]]
    }
    
    @scala.inline
    implicit class IScopeExtensionsMutableBuilder[Self <: IScopeExtensions[?], T] (val x: Self & IScopeExtensions[T]) extends AnyVal {
      
      @scala.inline
      def set$selGroup(value: IGroupingFunc[js.Any] | String): Self = StObject.set(x, "$selGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$selGroupTitle(value: String): Self = StObject.set(x, "$selGroupTitle", value.asInstanceOf[js.Any])
    }
  }
}
