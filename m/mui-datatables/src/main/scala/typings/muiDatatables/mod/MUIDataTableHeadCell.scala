package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableHeadCell extends StObject {
  
  var children: js.UndefOr[js.Any] = js.undefined
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var hint: String
  
  var options: MUIDataTableOptions
  
  var sort: Boolean
  
  var sortOrder: js.UndefOr[MUISortOptions] = js.undefined
  
  def toggleSort(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any
}
object MUIDataTableHeadCell {
  
  inline def apply(hint: String, options: MUIDataTableOptions, sort: Boolean, toggleSort: js.Any => js.Any): MUIDataTableHeadCell = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], toggleSort = js.Any.fromFunction1(toggleSort))
    __obj.asInstanceOf[MUIDataTableHeadCell]
  }
  
  extension [Self <: MUIDataTableHeadCell](x: Self) {
    
    inline def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: MUISortOptions): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setToggleSort(value: js.Any => js.Any): Self = StObject.set(x, "toggleSort", js.Any.fromFunction1(value))
  }
}
