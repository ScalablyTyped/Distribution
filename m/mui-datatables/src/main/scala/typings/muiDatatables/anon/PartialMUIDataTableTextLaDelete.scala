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
  
  @scala.inline
  def apply(): PartialMUIDataTableTextLaDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaDelete]
  }
  
  @scala.inline
  implicit class PartialMUIDataTableTextLaDeleteMutableBuilder[Self <: PartialMUIDataTableTextLaDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAria(value: String): Self = StObject.set(x, "deleteAria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAriaUndefined: Self = StObject.set(x, "deleteAria", js.undefined)
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
