package typings.ngTable

import typings.angular.mod.IAngularEvent
import typings.angular.mod.IScope
import typings.ngTable.ngTableControllerMod.ITableScope
import typings.ngTable.publicInterfacesMod.IColumnDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableSorterRowControllerMod {
  
  @JSImport("ng-table/src/browser/ngTableSorterRowController", "NgTableSorterRowController")
  @js.native
  class NgTableSorterRowController[T] protected () extends StObject {
    def this($scope: ITableScope[T]) = this()
    
    @JSName("$scope")
    var $scope: js.Any = js.native
    
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
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IAugmentedMouseEvent extends IAngularEvent {
    
    var ctrlKey: Boolean = js.native
    
    var metaKey: Boolean = js.native
  }
  object IAugmentedMouseEvent {
    
    @scala.inline
    def apply(
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
    implicit class IAugmentedMouseEventMutableBuilder[Self <: IAugmentedMouseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    }
  }
}
