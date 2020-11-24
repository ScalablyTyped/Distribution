package typings.notifyjs.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notify extends js.Object {
  
  /**
    * Close the notification.
    */
  def close(): Unit = js.native
  
  /**
    * Remove all event listener.
    */
  def destroy(): Unit = js.native
  
  def handleEvent(e: Event): Unit = js.native
  
  def onClickNotification(): Unit = js.native
  
  def onCloseNotification(): Unit = js.native
  
  def onErrorNotification(): Unit = js.native
  
  def onShowNotification(e: Event): Unit = js.native
  
  /**
    * Show the notification.
    */
  def show(): Unit = js.native
}
object Notify {
  
  @scala.inline
  def apply(
    close: () => Unit,
    destroy: () => Unit,
    handleEvent: Event => Unit,
    onClickNotification: () => Unit,
    onCloseNotification: () => Unit,
    onErrorNotification: () => Unit,
    onShowNotification: Event => Unit,
    show: () => Unit
  ): Notify = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), handleEvent = js.Any.fromFunction1(handleEvent), onClickNotification = js.Any.fromFunction0(onClickNotification), onCloseNotification = js.Any.fromFunction0(onCloseNotification), onErrorNotification = js.Any.fromFunction0(onErrorNotification), onShowNotification = js.Any.fromFunction1(onShowNotification), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Notify]
  }
  
  @scala.inline
  implicit class NotifyOps[Self <: Notify] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleEvent(value: Event => Unit): Self = this.set("handleEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickNotification(value: () => Unit): Self = this.set("onClickNotification", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseNotification(value: () => Unit): Self = this.set("onCloseNotification", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnErrorNotification(value: () => Unit): Self = this.set("onErrorNotification", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowNotification(value: Event => Unit): Self = this.set("onShowNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
}
