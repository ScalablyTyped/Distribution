package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsSelectedRows> */
trait PartialMUIDataTableTextLaDelete extends StObject {
  
  var delete: js.UndefOr[String] = js.undefined
  
  var deleteAria: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PartialMUIDataTableTextLaDelete {
  
  inline def apply(): PartialMUIDataTableTextLaDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaDelete]
  }
  
  extension [Self <: PartialMUIDataTableTextLaDelete](x: Self) {
    
    inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteAria(value: String): Self = StObject.set(x, "deleteAria", value.asInstanceOf[js.Any])
    
    inline def setDeleteAriaUndefined: Self = StObject.set(x, "deleteAria", js.undefined)
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
