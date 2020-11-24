package typings.playable.screenTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScreen extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  def hideCursor(): Unit = js.native
  
  def setVideoViewMode(viewMode: VideoViewMode): Unit = js.native
  
  def show(): Unit = js.native
  
  def showCursor(): Unit = js.native
}
object IScreen {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    hideCursor: () => Unit,
    setVideoViewMode: VideoViewMode => Unit,
    show: () => Unit,
    showCursor: () => Unit
  ): IScreen = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), hideCursor = js.Any.fromFunction0(hideCursor), setVideoViewMode = js.Any.fromFunction1(setVideoViewMode), show = js.Any.fromFunction0(show), showCursor = js.Any.fromFunction0(showCursor))
    __obj.asInstanceOf[IScreen]
  }
  
  @scala.inline
  implicit class IScreenOps[Self <: IScreen] (val x: Self) extends AnyVal {
    
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
    def setHideCursor(value: () => Unit): Self = this.set("hideCursor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetVideoViewMode(value: VideoViewMode => Unit): Self = this.set("setVideoViewMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowCursor(value: () => Unit): Self = this.set("showCursor", js.Any.fromFunction0(value))
  }
}
