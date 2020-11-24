package typings.officeUiFabricReact.detailsColumnTypesMod

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetailsColumnRenderTooltipProps extends ITooltipHostProps {
  
  /**
    * Information about the column for which the tooltip is being rendered.
    * Use this to format status information about the column, such as its filter or sort state.
    */
  var column: js.UndefOr[IColumn] = js.native
}
object IDetailsColumnRenderTooltipProps {
  
  @scala.inline
  def apply(): IDetailsColumnRenderTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsColumnRenderTooltipProps]
  }
  
  @scala.inline
  implicit class IDetailsColumnRenderTooltipPropsOps[Self <: IDetailsColumnRenderTooltipProps] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: IColumn): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
  }
}
