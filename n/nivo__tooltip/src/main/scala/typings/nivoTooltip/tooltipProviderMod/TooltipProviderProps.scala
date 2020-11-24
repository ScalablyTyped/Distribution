package typings.nivoTooltip.tooltipProviderMod

import typings.react.mod.MutableRefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipProviderProps extends js.Object {
  
  var container: MutableRefObject[HTMLDivElement] = js.native
}
object TooltipProviderProps {
  
  @scala.inline
  def apply(container: MutableRefObject[HTMLDivElement]): TooltipProviderProps = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProviderProps]
  }
  
  @scala.inline
  implicit class TooltipProviderPropsOps[Self <: TooltipProviderProps] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: MutableRefObject[HTMLDivElement]): Self = this.set("container", value.asInstanceOf[js.Any])
  }
}
