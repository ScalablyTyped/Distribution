package typings.popupWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupWindow extends js.Object {
  
  /**
    * Accepts a callback - the callback is called when the window is closed.
    */
  def blocked(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow = js.native
  
  /**
    * Close the browser window.
    */
  def close(): PopupWindow = js.native
  
  /**
    * Accepts a callback - the callback is called when the window is blocked from opening.
    */
  def closed(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow = js.native
  
  val name: String = js.native
  
  /**
    * Open a new browser window.
    */
  def open(): PopupWindow = js.native
  
  /**
    * Accepts a callback - the callback is called when the window is opened.
    */
  def opened(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow = js.native
  
  val url: String = js.native
}
object PopupWindow {
  
  @scala.inline
  def apply(
    blocked: js.Function1[PopupWindow, Unit] => PopupWindow,
    close: () => PopupWindow,
    closed: js.Function1[PopupWindow, Unit] => PopupWindow,
    name: String,
    open: () => PopupWindow,
    opened: js.Function1[PopupWindow, Unit] => PopupWindow,
    url: String
  ): PopupWindow = {
    val __obj = js.Dynamic.literal(blocked = js.Any.fromFunction1(blocked), close = js.Any.fromFunction0(close), closed = js.Any.fromFunction1(closed), name = name.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), opened = js.Any.fromFunction1(opened), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindow]
  }
  
  @scala.inline
  implicit class PopupWindowOps[Self <: PopupWindow] (val x: Self) extends AnyVal {
    
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
    def setBlocked(value: js.Function1[PopupWindow, Unit] => PopupWindow): Self = this.set("blocked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClose(value: () => PopupWindow): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosed(value: js.Function1[PopupWindow, Unit] => PopupWindow): Self = this.set("closed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => PopupWindow): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpened(value: js.Function1[PopupWindow, Unit] => PopupWindow): Self = this.set("opened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
