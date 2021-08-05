package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableTextLabelsSelectedRows extends StObject {
  
  var delete: String
  
  var deleteAria: String
  
  var text: String
}
object MUIDataTableTextLabelsSelectedRows {
  
  inline def apply(delete: String, deleteAria: String, text: String): MUIDataTableTextLabelsSelectedRows = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], deleteAria = deleteAria.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsSelectedRows]
  }
  
  extension [Self <: MUIDataTableTextLabelsSelectedRows](x: Self) {
    
    inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteAria(value: String): Self = StObject.set(x, "deleteAria", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
