package typings.playable.tooltipTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipShowOptions extends js.Object {
  
  var element: js.UndefOr[HTMLElement] = js.native
  
  var position: ITooltipPosition | ITooltipPositionFunction = js.native
  
  var text: js.UndefOr[String] = js.native
}
object ITooltipShowOptions {
  
  @scala.inline
  def apply(position: ITooltipPosition | ITooltipPositionFunction): ITooltipShowOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipShowOptions]
  }
  
  @scala.inline
  implicit class ITooltipShowOptionsOps[Self <: ITooltipShowOptions] (val x: Self) extends AnyVal {
    
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
    def setPositionFunction1(value: /* tooltipContainerElement */ HTMLElement => ITooltipPosition): Self = this.set("position", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPosition(value: ITooltipPosition | ITooltipPositionFunction): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
