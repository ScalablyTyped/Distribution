package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsFilter> */
trait PartialMUIDataTableTextLaAll extends StObject {
  
  var all: js.UndefOr[String] = js.undefined
  
  var reset: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PartialMUIDataTableTextLaAll {
  
  inline def apply(): PartialMUIDataTableTextLaAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaAll]
  }
  
  extension [Self <: PartialMUIDataTableTextLaAll](x: Self) {
    
    inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
