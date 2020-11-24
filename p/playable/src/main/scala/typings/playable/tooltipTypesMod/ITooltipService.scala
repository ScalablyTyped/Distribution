package typings.playable.tooltipTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipService extends js.Object {
  
  def createReference(reference: HTMLElement, options: ITooltipReferenceOptions): ITooltipReference = js.native
  
  def destroy(): Unit = js.native
  
  def hide(): Unit = js.native
  
  var isHidden: Boolean = js.native
  
  def setText(text: String): Unit = js.native
  
  def show(options: ITooltipShowOptions): Unit = js.native
  
  var tooltipContainerElement: HTMLElement = js.native
}
object ITooltipService {
  
  @scala.inline
  def apply(
    createReference: (HTMLElement, ITooltipReferenceOptions) => ITooltipReference,
    destroy: () => Unit,
    hide: () => Unit,
    isHidden: Boolean,
    setText: String => Unit,
    show: ITooltipShowOptions => Unit,
    tooltipContainerElement: HTMLElement
  ): ITooltipService = {
    val __obj = js.Dynamic.literal(createReference = js.Any.fromFunction2(createReference), destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setText = js.Any.fromFunction1(setText), show = js.Any.fromFunction1(show), tooltipContainerElement = tooltipContainerElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipService]
  }
  
  @scala.inline
  implicit class ITooltipServiceOps[Self <: ITooltipService] (val x: Self) extends AnyVal {
    
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
    def setCreateReference(value: (HTMLElement, ITooltipReferenceOptions) => ITooltipReference): Self = this.set("createReference", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetText(value: String => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: ITooltipShowOptions => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltipContainerElement(value: HTMLElement): Self = this.set("tooltipContainerElement", value.asInstanceOf[js.Any])
  }
}
