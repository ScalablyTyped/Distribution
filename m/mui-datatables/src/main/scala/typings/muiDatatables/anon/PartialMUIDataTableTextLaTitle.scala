package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsViewColumns> */
@js.native
trait PartialMUIDataTableTextLaTitle extends StObject {
  
  var title: js.UndefOr[String] = js.native
  
  var titleAria: js.UndefOr[String] = js.native
}
object PartialMUIDataTableTextLaTitle {
  
  @scala.inline
  def apply(): PartialMUIDataTableTextLaTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaTitle]
  }
  
  @scala.inline
  implicit class PartialMUIDataTableTextLaTitleMutableBuilder[Self <: PartialMUIDataTableTextLaTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAria(value: String): Self = StObject.set(x, "titleAria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAriaUndefined: Self = StObject.set(x, "titleAria", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
