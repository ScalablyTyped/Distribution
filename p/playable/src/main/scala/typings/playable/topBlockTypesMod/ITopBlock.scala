package typings.playable.topBlockTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITopBlock extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  def hideContent(): Unit = js.native
  
  def hideLiveIndicator(): Unit = js.native
  
  def hideTitle(): Unit = js.native
  
  var isFocused: Boolean = js.native
  
  def show(): Unit = js.native
  
  def showContent(): Unit = js.native
  
  def showLiveIndicator(): Unit = js.native
  
  def showTitle(): Unit = js.native
}
object ITopBlock {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    hideContent: () => Unit,
    hideLiveIndicator: () => Unit,
    hideTitle: () => Unit,
    isFocused: Boolean,
    show: () => Unit,
    showContent: () => Unit,
    showLiveIndicator: () => Unit,
    showTitle: () => Unit
  ): ITopBlock = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), hideContent = js.Any.fromFunction0(hideContent), hideLiveIndicator = js.Any.fromFunction0(hideLiveIndicator), hideTitle = js.Any.fromFunction0(hideTitle), isFocused = isFocused.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), showContent = js.Any.fromFunction0(showContent), showLiveIndicator = js.Any.fromFunction0(showLiveIndicator), showTitle = js.Any.fromFunction0(showTitle))
    __obj.asInstanceOf[ITopBlock]
  }
  
  @scala.inline
  implicit class ITopBlockOps[Self <: ITopBlock] (val x: Self) extends AnyVal {
    
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
    def setHideContent(value: () => Unit): Self = this.set("hideContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideLiveIndicator(value: () => Unit): Self = this.set("hideLiveIndicator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideTitle(value: () => Unit): Self = this.set("hideTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowContent(value: () => Unit): Self = this.set("showContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowLiveIndicator(value: () => Unit): Self = this.set("showLiveIndicator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowTitle(value: () => Unit): Self = this.set("showTitle", js.Any.fromFunction0(value))
  }
}
