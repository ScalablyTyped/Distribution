package typings.playable.mainUiBlockTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMainUIBlockViewElements extends js.Object {
  
  var bottomBlock: HTMLElement = js.native
  
  var tooltipContainer: HTMLElement = js.native
  
  var topBlock: HTMLElement = js.native
}
object IMainUIBlockViewElements {
  
  @scala.inline
  def apply(bottomBlock: HTMLElement, tooltipContainer: HTMLElement, topBlock: HTMLElement): IMainUIBlockViewElements = {
    val __obj = js.Dynamic.literal(bottomBlock = bottomBlock.asInstanceOf[js.Any], tooltipContainer = tooltipContainer.asInstanceOf[js.Any], topBlock = topBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMainUIBlockViewElements]
  }
  
  @scala.inline
  implicit class IMainUIBlockViewElementsOps[Self <: IMainUIBlockViewElements] (val x: Self) extends AnyVal {
    
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
    def setBottomBlock(value: HTMLElement): Self = this.set("bottomBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipContainer(value: HTMLElement): Self = this.set("tooltipContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBlock(value: HTMLElement): Self = this.set("topBlock", value.asInstanceOf[js.Any])
  }
}
