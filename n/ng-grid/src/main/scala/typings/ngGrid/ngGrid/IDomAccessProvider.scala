package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDomAccessProvider extends js.Object {
  
  def changeUserSelect(
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    value: String
  ): Unit = js.native
  
  def focusCellElement($scope: IGridScope, index: Double): Unit = js.native
  
  var grid: IGridInstance = js.native
  
  var previousColumn: IColumn = js.native
  
  def selectionHandlers(
    $scope: IGridScope,
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
  ): Unit = js.native
}
object IDomAccessProvider {
  
  @scala.inline
  def apply(
    changeUserSelect: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, String) => Unit,
    focusCellElement: (IGridScope, Double) => Unit,
    grid: IGridInstance,
    previousColumn: IColumn,
    selectionHandlers: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any) => Unit
  ): IDomAccessProvider = {
    val __obj = js.Dynamic.literal(changeUserSelect = js.Any.fromFunction2(changeUserSelect), focusCellElement = js.Any.fromFunction2(focusCellElement), grid = grid.asInstanceOf[js.Any], previousColumn = previousColumn.asInstanceOf[js.Any], selectionHandlers = js.Any.fromFunction2(selectionHandlers))
    __obj.asInstanceOf[IDomAccessProvider]
  }
  
  @scala.inline
  implicit class IDomAccessProviderOps[Self <: IDomAccessProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangeUserSelect(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, String) => Unit
    ): Self = this.set("changeUserSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusCellElement(value: (IGridScope, Double) => Unit): Self = this.set("focusCellElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGrid(value: IGridInstance): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousColumn(value: IColumn): Self = this.set("previousColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionHandlers(
      value: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any) => Unit
    ): Self = this.set("selectionHandlers", js.Any.fromFunction2(value))
  }
}
