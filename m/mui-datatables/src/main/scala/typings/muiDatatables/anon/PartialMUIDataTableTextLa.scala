package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsViewColumns> */
trait PartialMUIDataTableTextLa extends StObject {
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleAria: js.UndefOr[String] = js.undefined
}
object PartialMUIDataTableTextLa {
  
  inline def apply(): PartialMUIDataTableTextLa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLa]
  }
  
  extension [Self <: PartialMUIDataTableTextLa](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleAria(value: String): Self = StObject.set(x, "titleAria", value.asInstanceOf[js.Any])
    
    inline def setTitleAriaUndefined: Self = StObject.set(x, "titleAria", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
