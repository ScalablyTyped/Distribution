package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableResize extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.native
  
  var options: js.UndefOr[MUIDataTableOptions] = js.native
  
  var rowSelected: js.UndefOr[Boolean] = js.native
  
  var setResizeable: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var updateDividers: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
}
object MUIDataTableResize {
  
  @scala.inline
  def apply(): MUIDataTableResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableResize]
  }
  
  @scala.inline
  implicit class MUIDataTableResizeMutableBuilder[Self <: MUIDataTableResize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setRowSelected(value: Boolean): Self = StObject.set(x, "rowSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSelectedUndefined: Self = StObject.set(x, "rowSelected", js.undefined)
    
    @scala.inline
    def setSetResizeable(value: /* args */ js.Any => _): Self = StObject.set(x, "setResizeable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetResizeableUndefined: Self = StObject.set(x, "setResizeable", js.undefined)
    
    @scala.inline
    def setUpdateDividers(value: /* args */ js.Any => _): Self = StObject.set(x, "updateDividers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateDividersUndefined: Self = StObject.set(x, "updateDividers", js.undefined)
  }
}
