package typings.muiDatatables.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableTextLabelsBody extends js.Object {
  
  def columnHeaderTooltip(column: MUIDataTableColumn): String = js.native
  
  var noMatch: String | ReactNode = js.native
  
  var toolTip: String = js.native
}
object MUIDataTableTextLabelsBody {
  
  @scala.inline
  def apply(columnHeaderTooltip: MUIDataTableColumn => String, toolTip: String): MUIDataTableTextLabelsBody = {
    val __obj = js.Dynamic.literal(columnHeaderTooltip = js.Any.fromFunction1(columnHeaderTooltip), toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsBody]
  }
  
  @scala.inline
  implicit class MUIDataTableTextLabelsBodyOps[Self <: MUIDataTableTextLabelsBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnHeaderTooltip(value: MUIDataTableColumn => String): Self = this.set("columnHeaderTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToolTip(value: String): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoMatch(value: String | ReactNode): Self = this.set("noMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoMatch: Self = this.set("noMatch", js.undefined)
  }
}
