package typings.muiDatatables.anon

import typings.muiDatatables.mod.MUIDataTableColumn
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsBody> */
@js.native
trait PartialMUIDataTableTextLa extends StObject {
  
  var columnHeaderTooltip: js.UndefOr[js.Function1[/* column */ MUIDataTableColumn, String]] = js.native
  
  var noMatch: js.UndefOr[String | ReactNode] = js.native
  
  var toolTip: js.UndefOr[String] = js.native
}
object PartialMUIDataTableTextLa {
  
  @scala.inline
  def apply(): PartialMUIDataTableTextLa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLa]
  }
  
  @scala.inline
  implicit class PartialMUIDataTableTextLaMutableBuilder[Self <: PartialMUIDataTableTextLa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnHeaderTooltip(value: /* column */ MUIDataTableColumn => String): Self = StObject.set(x, "columnHeaderTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnHeaderTooltipUndefined: Self = StObject.set(x, "columnHeaderTooltip", js.undefined)
    
    @scala.inline
    def setNoMatch(value: String | ReactNode): Self = StObject.set(x, "noMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
    
    @scala.inline
    def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
  }
}
