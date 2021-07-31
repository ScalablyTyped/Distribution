package typings.ngTable

import typings.angular.JQLite
import typings.angular.mod.IAttributes
import typings.angular.mod.IController
import typings.angular.mod.IDirective
import typings.angular.mod.IParseService
import typings.angular.mod.IQService
import typings.angular.mod.IScope
import typings.angular.mod.global.Function
import typings.ngTable.publicInterfacesMod.IColumnDef
import typings.ngTable.publicInterfacesMod.ISelectOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableSelectFilterDsDirectiveMod {
  
  @JSImport("ng-table/src/browser/ngTableSelectFilterDs.directive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ng-table/src/browser/ngTableSelectFilterDs.directive", "NgTableSelectFilterDsController")
  @js.native
  class NgTableSelectFilterDsController protected () extends StObject {
    def this($scope: IScope & IScopeExtensions, $parse: IParseService, $attrs: IInputAttributes, $q: IQService) = this()
    
    @JSName("$attrs")
    var $attrs: js.Any = js.native
    
    @JSName("$column")
    var $column: IColumnDef = js.native
    
    @JSName("$q")
    var $q: js.Any = js.native
    
    @JSName("$scope")
    var $scope: js.Any = js.native
    
    /* private */ def bindDataSource(): js.Any = js.native
    
    /* private */ def getSelectListData($column: js.Any): js.Any = js.native
    
    /* private */ def hasEmptyOption(data: js.Any): js.Any = js.native
  }
  /* static members */
  object NgTableSelectFilterDsController {
    
    @JSImport("ng-table/src/browser/ngTableSelectFilterDs.directive", "NgTableSelectFilterDsController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser/ngTableSelectFilterDs.directive", "NgTableSelectFilterDsController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Takes the array returned by $column.filterData and makes it available as `$selectData` on the `$scope`.
    *
    * The resulting `$selectData` array will contain an extra item that is suitable to represent the user
    * "deselecting" an item from a `<select>` tag
    *
    * This directive is is focused on providing a datasource to an `ngOptions` directive
    */
  @scala.inline
  def ngTableSelectFilterDs(): IDirective[IScope, JQLite, IAttributes, IController] = ^.asInstanceOf[js.Dynamic].applyDynamic("ngTableSelectFilterDs")().asInstanceOf[IDirective[IScope, JQLite, IAttributes, IController]]
  
  trait IInputAttributes
    extends StObject
       with IAttributes {
    
    var ngTableSelectFilterDs: String
  }
  object IInputAttributes {
    
    @scala.inline
    def apply(
      $addClass: String => Unit,
      $attr: js.Object,
      $normalize: String => String,
      $observe: (String, js.Function1[/* value */ js.UndefOr[js.Any], js.Any]) => Function,
      $removeClass: String => Unit,
      $set: (String, js.Any) => Unit,
      $updateClass: (String, String) => Unit,
      ngTableSelectFilterDs: String
    ): IInputAttributes = {
      val __obj = js.Dynamic.literal($addClass = js.Any.fromFunction1($addClass), $attr = $attr.asInstanceOf[js.Any], $normalize = js.Any.fromFunction1($normalize), $observe = js.Any.fromFunction2($observe), $removeClass = js.Any.fromFunction1($removeClass), $set = js.Any.fromFunction2($set), $updateClass = js.Any.fromFunction2($updateClass), ngTableSelectFilterDs = ngTableSelectFilterDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInputAttributes]
    }
    
    @scala.inline
    implicit class IInputAttributesMutableBuilder[Self <: IInputAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNgTableSelectFilterDs(value: String): Self = StObject.set(x, "ngTableSelectFilterDs", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScopeExtensions extends StObject {
    
    @JSName("$selectData")
    var $selectData: js.Array[ISelectOption]
  }
  object IScopeExtensions {
    
    @scala.inline
    def apply($selectData: js.Array[ISelectOption]): IScopeExtensions = {
      val __obj = js.Dynamic.literal($selectData = $selectData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScopeExtensions]
    }
    
    @scala.inline
    implicit class IScopeExtensionsMutableBuilder[Self <: IScopeExtensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$selectData(value: js.Array[ISelectOption]): Self = StObject.set(x, "$selectData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$selectDataVarargs(value: ISelectOption*): Self = StObject.set(x, "$selectData", js.Array(value :_*))
    }
  }
}
