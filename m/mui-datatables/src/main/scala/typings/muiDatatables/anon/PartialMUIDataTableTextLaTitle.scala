package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsViewColumns> */
trait PartialMUIDataTableTextLaTitle extends StObject {
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleAria: js.UndefOr[String] = js.undefined
}
object PartialMUIDataTableTextLaTitle {
  
  inline def apply(): PartialMUIDataTableTextLaTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMUIDataTableTextLaTitle] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleAria(value: String): Self = StObject.set(x, "titleAria", value.asInstanceOf[js.Any])
    
    inline def setTitleAriaUndefined: Self = StObject.set(x, "titleAria", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
