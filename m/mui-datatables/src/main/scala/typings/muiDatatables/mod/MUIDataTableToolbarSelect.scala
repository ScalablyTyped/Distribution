package typings.muiDatatables.mod

import typings.muiDatatables.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableToolbarSelect extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.native
  
  var displayData: js.UndefOr[DisplayData] = js.native
  
  var onRowsDelete: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var options: MUIDataTableOptions = js.native
  
  var rowSelected: js.UndefOr[Boolean] = js.native
  
  var selectRowUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
}
object MUIDataTableToolbarSelect {
  
  @scala.inline
  def apply(options: MUIDataTableOptions): MUIDataTableToolbarSelect = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableToolbarSelect]
  }
  
  @scala.inline
  implicit class MUIDataTableToolbarSelectMutableBuilder[Self <: MUIDataTableToolbarSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setDisplayData(value: DisplayData): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDataUndefined: Self = StObject.set(x, "displayData", js.undefined)
    
    @scala.inline
    def setDisplayDataVarargs(value: Data*): Self = StObject.set(x, "displayData", js.Array(value :_*))
    
    @scala.inline
    def setOnRowsDelete(value: /* args */ js.Any => _): Self = StObject.set(x, "onRowsDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowsDeleteUndefined: Self = StObject.set(x, "onRowsDelete", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSelected(value: Boolean): Self = StObject.set(x, "rowSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSelectedUndefined: Self = StObject.set(x, "rowSelected", js.undefined)
    
    @scala.inline
    def setSelectRowUpdate(value: /* args */ js.Any => _): Self = StObject.set(x, "selectRowUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectRowUpdateUndefined: Self = StObject.set(x, "selectRowUpdate", js.undefined)
  }
}
