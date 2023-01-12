package typings.muiDatatables.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableTextLabelsBody extends StObject {
  
  def columnHeaderTooltip(column: MUIDataTableColumn): String
  
  var noMatch: String | ReactNode
  
  var toolTip: String
}
object MUIDataTableTextLabelsBody {
  
  inline def apply(columnHeaderTooltip: MUIDataTableColumn => String, toolTip: String): MUIDataTableTextLabelsBody = {
    val __obj = js.Dynamic.literal(columnHeaderTooltip = js.Any.fromFunction1(columnHeaderTooltip), toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTableTextLabelsBody] (val x: Self) extends AnyVal {
    
    inline def setColumnHeaderTooltip(value: MUIDataTableColumn => String): Self = StObject.set(x, "columnHeaderTooltip", js.Any.fromFunction1(value))
    
    inline def setNoMatch(value: String | ReactNode): Self = StObject.set(x, "noMatch", value.asInstanceOf[js.Any])
    
    inline def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
    
    inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
  }
}
