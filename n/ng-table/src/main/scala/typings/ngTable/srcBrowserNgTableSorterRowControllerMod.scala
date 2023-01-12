package typings.ngTable

import typings.angular.mod.IAngularEvent
import typings.angular.mod.IScope
import typings.ngTable.srcBrowserNgTableControllerMod.ITableScope
import typings.ngTable.srcBrowserPublicInterfacesMod.IColumnDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserNgTableSorterRowControllerMod {
  
  @JSImport("ng-table/src/browser/ngTableSorterRowController", "NgTableSorterRowController")
  @js.native
  open class NgTableSorterRowController[T] protected () extends StObject {
    def this($scope: ITableScope[T]) = this()
    
    /* private */ @JSName("$scope")
    var $scope: Any = js.native
    
    def sortBy($column: IColumnDef, event: IAugmentedMouseEvent): Unit = js.native
  }
  /* static members */
  object NgTableSorterRowController {
    
    @JSImport("ng-table/src/browser/ngTableSorterRowController", "NgTableSorterRowController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser/ngTableSorterRowController", "NgTableSorterRowController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  trait IAugmentedMouseEvent
    extends StObject
       with IAngularEvent {
    
    var ctrlKey: Boolean
    
    var metaKey: Boolean
  }
  object IAugmentedMouseEvent {
    
    inline def apply(
      ctrlKey: Boolean,
      currentScope: IScope,
      defaultPrevented: Boolean,
      metaKey: Boolean,
      name: String,
      preventDefault: () => Unit,
      targetScope: IScope
    ): IAugmentedMouseEvent = {
      val __obj = js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any], currentScope = currentScope.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), targetScope = targetScope.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAugmentedMouseEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAugmentedMouseEvent] (val x: Self) extends AnyVal {
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    }
  }
}
