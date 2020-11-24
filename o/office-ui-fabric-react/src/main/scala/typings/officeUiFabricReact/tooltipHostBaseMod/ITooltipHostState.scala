package typings.officeUiFabricReact.tooltipHostBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipHostState extends js.Object {
  
  var isAriaPlaceholderRendered: Boolean = js.native
  
  var isTooltipVisible: Boolean = js.native
}
object ITooltipHostState {
  
  @scala.inline
  def apply(isAriaPlaceholderRendered: Boolean, isTooltipVisible: Boolean): ITooltipHostState = {
    val __obj = js.Dynamic.literal(isAriaPlaceholderRendered = isAriaPlaceholderRendered.asInstanceOf[js.Any], isTooltipVisible = isTooltipVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipHostState]
  }
  
  @scala.inline
  implicit class ITooltipHostStateOps[Self <: ITooltipHostState] (val x: Self) extends AnyVal {
    
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
    def setIsAriaPlaceholderRendered(value: Boolean): Self = this.set("isAriaPlaceholderRendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTooltipVisible(value: Boolean): Self = this.set("isTooltipVisible", value.asInstanceOf[js.Any])
  }
}
