package typings.playable.tooltipContainerMod

import org.scalablytyped.runtime.StringDictionary
import typings.playable.tooltipTypesMod.ITooltipPosition
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipContainer extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def getTooltipPositionStyles(position: ITooltipPosition): StringDictionary[String | Double] = js.native
}
object ITooltipContainer {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    getElement: () => HTMLElement,
    getTooltipPositionStyles: ITooltipPosition => StringDictionary[String | Double]
  ): ITooltipContainer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), getTooltipPositionStyles = js.Any.fromFunction1(getTooltipPositionStyles))
    __obj.asInstanceOf[ITooltipContainer]
  }
  
  @scala.inline
  implicit class ITooltipContainerOps[Self <: ITooltipContainer] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElement(value: () => HTMLElement): Self = this.set("getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTooltipPositionStyles(value: ITooltipPosition => StringDictionary[String | Double]): Self = this.set("getTooltipPositionStyles", js.Any.fromFunction1(value))
  }
}
