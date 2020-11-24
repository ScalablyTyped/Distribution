package typings.playable.interactionIndicatorTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInteractionIndicator extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  def hideIcons(): Unit = js.native
  
  def show(): Unit = js.native
  
  def showDecreaseVolume(): Unit = js.native
  
  def showForward(): Unit = js.native
  
  def showIncreaseVolume(): Unit = js.native
  
  def showMute(): Unit = js.native
  
  def showPause(): Unit = js.native
  
  def showPlay(): Unit = js.native
  
  def showRewind(): Unit = js.native
}
object IInteractionIndicator {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    hideIcons: () => Unit,
    show: () => Unit,
    showDecreaseVolume: () => Unit,
    showForward: () => Unit,
    showIncreaseVolume: () => Unit,
    showMute: () => Unit,
    showPause: () => Unit,
    showPlay: () => Unit,
    showRewind: () => Unit
  ): IInteractionIndicator = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), hideIcons = js.Any.fromFunction0(hideIcons), show = js.Any.fromFunction0(show), showDecreaseVolume = js.Any.fromFunction0(showDecreaseVolume), showForward = js.Any.fromFunction0(showForward), showIncreaseVolume = js.Any.fromFunction0(showIncreaseVolume), showMute = js.Any.fromFunction0(showMute), showPause = js.Any.fromFunction0(showPause), showPlay = js.Any.fromFunction0(showPlay), showRewind = js.Any.fromFunction0(showRewind))
    __obj.asInstanceOf[IInteractionIndicator]
  }
  
  @scala.inline
  implicit class IInteractionIndicatorOps[Self <: IInteractionIndicator] (val x: Self) extends AnyVal {
    
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideIcons(value: () => Unit): Self = this.set("hideIcons", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowDecreaseVolume(value: () => Unit): Self = this.set("showDecreaseVolume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowForward(value: () => Unit): Self = this.set("showForward", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowIncreaseVolume(value: () => Unit): Self = this.set("showIncreaseVolume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowMute(value: () => Unit): Self = this.set("showMute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowPause(value: () => Unit): Self = this.set("showPause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowPlay(value: () => Unit): Self = this.set("showPlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowRewind(value: () => Unit): Self = this.set("showRewind", js.Any.fromFunction0(value))
  }
}
