package typings.muiDatatables.mod

import typings.muiDatatables.anon.PartialMUIDataTableTextLaBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableJumpToPage extends StObject {
  
  var count: Double
  
  var page: Double
  
  var rowsPerPage: Double
  
  var textLabels: PartialMUIDataTableTextLaBody
}
object MUIDataTableJumpToPage {
  
  inline def apply(count: Double, page: Double, rowsPerPage: Double, textLabels: PartialMUIDataTableTextLaBody): MUIDataTableJumpToPage = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any], textLabels = textLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableJumpToPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTableJumpToPage] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setRowsPerPage(value: Double): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
    
    inline def setTextLabels(value: PartialMUIDataTableTextLaBody): Self = StObject.set(x, "textLabels", value.asInstanceOf[js.Any])
  }
}
