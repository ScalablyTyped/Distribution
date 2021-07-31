package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableBodyRow extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
  
  var options: MUIDataTableOptions
  
  var rowSelected: js.UndefOr[Boolean] = js.undefined
}
object MUIDataTableBodyRow {
  
  @scala.inline
  def apply(options: MUIDataTableOptions): MUIDataTableBodyRow = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableBodyRow]
  }
  
  @scala.inline
  implicit class MUIDataTableBodyRowMutableBuilder[Self <: MUIDataTableBodyRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSelected(value: Boolean): Self = StObject.set(x, "rowSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSelectedUndefined: Self = StObject.set(x, "rowSelected", js.undefined)
  }
}
