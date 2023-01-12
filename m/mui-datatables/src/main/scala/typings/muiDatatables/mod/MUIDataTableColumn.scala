package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableColumn extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var options: js.UndefOr[MUIDataTableColumnOptions] = js.undefined
}
object MUIDataTableColumn {
  
  inline def apply(name: String): MUIDataTableColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTableColumn] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: MUIDataTableColumnOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
