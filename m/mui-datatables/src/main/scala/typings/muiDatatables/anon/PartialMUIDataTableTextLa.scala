package typings.muiDatatables.anon

import typings.muiDatatables.mod.MUIDataTableColumn
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsBody> */
trait PartialMUIDataTableTextLa extends StObject {
  
  var columnHeaderTooltip: js.UndefOr[js.Function1[/* column */ MUIDataTableColumn, String]] = js.undefined
  
  var noMatch: js.UndefOr[String | ReactNode] = js.undefined
  
  var toolTip: js.UndefOr[String] = js.undefined
}
object PartialMUIDataTableTextLa {
  
  inline def apply(): PartialMUIDataTableTextLa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMUIDataTableTextLa] (val x: Self) extends AnyVal {
    
    inline def setColumnHeaderTooltip(value: /* column */ MUIDataTableColumn => String): Self = StObject.set(x, "columnHeaderTooltip", js.Any.fromFunction1(value))
    
    inline def setColumnHeaderTooltipUndefined: Self = StObject.set(x, "columnHeaderTooltip", js.undefined)
    
    inline def setNoMatch(value: String | ReactNode): Self = StObject.set(x, "noMatch", value.asInstanceOf[js.Any])
    
    inline def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
    
    inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
  }
}
