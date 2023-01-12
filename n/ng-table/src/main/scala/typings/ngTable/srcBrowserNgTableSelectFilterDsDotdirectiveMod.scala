package typings.ngTable

import typings.angular.JQLite
import typings.angular.mod.IAttributes
import typings.angular.mod.IController
import typings.angular.mod.IDirective
import typings.angular.mod.IParseService
import typings.angular.mod.IQService
import typings.angular.mod.IScope
import typings.angular.mod.global.Function
import typings.ngTable.srcBrowserPublicInterfacesMod.IColumnDef
import typings.ngTable.srcBrowserPublicInterfacesMod.ISelectOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserNgTableSelectFilterDsDotdirectiveMod {
  
  @JSImport("ng-table/src/browser/ngTableSelectFilterDs.directive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ng-table/src/browser/ngTableSelectFilterDs.directive", "NgTableSelectFilterDsController")
  @js.native
  open class NgTableSelectFilterDsController protected () extends StObject {
    def this($scope: IScope & IScopeExtensions, $parse: IParseService, $attrs: IInputAttributes, $q: IQService) = this()
    
    /* private */ @JSName("$attrs")
    var $attrs: Any = js.native
    
    @JSName("$column")
    var $column: IColumnDef = js.native
    
    /* private */ @JSName("$q")
    var $q: Any = js.native
    
    /* private */ @JSName("$scope")
    var $scope: Any = js.native
    
    /* private */ def bindDataSource(): Any = js.native
    
    /* private */ def getSelectListData($column: Any): Any = js.native
    
    /* private */ def hasEmptyOption(data: Any): Any = js.native
  }
  /* static members */
  object NgTableSelectFilterDsController {
    
    @JSImport("ng-table/src/browser/ngTableSelectFilterDs.directive", "NgTableSelectFilterDsController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser/ngTableSelectFilterDs.directive", "NgTableSelectFilterDsController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Takes the array returned by $column.filterData and makes it available as `$selectData` on the `$scope`.
    *
    * The resulting `$selectData` array will contain an extra item that is suitable to represent the user
    * "deselecting" an item from a `<select>` tag
    *
    * This directive is is focused on providing a datasource to an `ngOptions` directive
    */
  inline def ngTableSelectFilterDs(): IDirective[IScope, JQLite, IAttributes, IController] = ^.asInstanceOf[js.Dynamic].applyDynamic("ngTableSelectFilterDs")().asInstanceOf[IDirective[IScope, JQLite, IAttributes, IController]]
  
  trait IInputAttributes
    extends StObject
       with IAttributes {
    
    var ngTableSelectFilterDs: String
  }
  object IInputAttributes {
    
    inline def apply(
      $addClass: String => Unit,
      $attr: js.Object,
      $normalize: String => String,
      $observe: (String, js.Function1[/* value */ js.UndefOr[Any], Any]) => Function,
      $removeClass: String => Unit,
      $set: (String, Any) => Unit,
      $updateClass: (String, String) => Unit,
      ngTableSelectFilterDs: String
    ): IInputAttributes = {
      val __obj = js.Dynamic.literal($addClass = js.Any.fromFunction1($addClass), $attr = $attr.asInstanceOf[js.Any], $normalize = js.Any.fromFunction1($normalize), $observe = js.Any.fromFunction2($observe), $removeClass = js.Any.fromFunction1($removeClass), $set = js.Any.fromFunction2($set), $updateClass = js.Any.fromFunction2($updateClass), ngTableSelectFilterDs = ngTableSelectFilterDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInputAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IInputAttributes] (val x: Self) extends AnyVal {
      
      inline def setNgTableSelectFilterDs(value: String): Self = StObject.set(x, "ngTableSelectFilterDs", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScopeExtensions extends StObject {
    
    @JSName("$selectData")
    var $selectData: js.Array[ISelectOption]
  }
  object IScopeExtensions {
    
    inline def apply($selectData: js.Array[ISelectOption]): IScopeExtensions = {
      val __obj = js.Dynamic.literal($selectData = $selectData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScopeExtensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScopeExtensions] (val x: Self) extends AnyVal {
      
      inline def set$selectData(value: js.Array[ISelectOption]): Self = StObject.set(x, "$selectData", value.asInstanceOf[js.Any])
      
      inline def set$selectDataVarargs(value: ISelectOption*): Self = StObject.set(x, "$selectData", js.Array(value*))
    }
  }
}
