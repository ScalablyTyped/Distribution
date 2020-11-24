package typings.playable.debugPanelTypesMod

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDebugPanelViewCallbacks extends js.Object {
  
  var onCloseButtonClick: EventListenerOrEventListenerObject = js.native
}
object IDebugPanelViewCallbacks {
  
  @scala.inline
  def apply(onCloseButtonClick: EventListenerOrEventListenerObject): IDebugPanelViewCallbacks = {
    val __obj = js.Dynamic.literal(onCloseButtonClick = onCloseButtonClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugPanelViewCallbacks]
  }
  
  @scala.inline
  implicit class IDebugPanelViewCallbacksOps[Self <: IDebugPanelViewCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnCloseButtonClickFunction1(value: /* evt */ Event => Unit): Self = this.set("onCloseButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseButtonClick(value: EventListenerOrEventListenerObject): Self = this.set("onCloseButtonClick", value.asInstanceOf[js.Any])
  }
}
