package typings.playable.loaderTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoader extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  var isDelayedShowScheduled: Boolean = js.native
  
  def show(): Unit = js.native
  
  def stopDelayedShow(): Unit = js.native
}
object ILoader {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    isDelayedShowScheduled: Boolean,
    show: () => Unit,
    stopDelayedShow: () => Unit
  ): ILoader = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isDelayedShowScheduled = isDelayedShowScheduled.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), stopDelayedShow = js.Any.fromFunction0(stopDelayedShow))
    __obj.asInstanceOf[ILoader]
  }
  
  @scala.inline
  implicit class ILoaderOps[Self <: ILoader] (val x: Self) extends AnyVal {
    
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
    def setIsDelayedShowScheduled(value: Boolean): Self = this.set("isDelayedShowScheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopDelayedShow(value: () => Unit): Self = this.set("stopDelayedShow", js.Any.fromFunction0(value))
  }
}
