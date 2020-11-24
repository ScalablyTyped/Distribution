package typings.playable.overlayTypesMod

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverlayViewCallbacks extends js.Object {
  
  var onPlayClick: EventListenerOrEventListenerObject = js.native
}
object IOverlayViewCallbacks {
  
  @scala.inline
  def apply(onPlayClick: EventListenerOrEventListenerObject): IOverlayViewCallbacks = {
    val __obj = js.Dynamic.literal(onPlayClick = onPlayClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverlayViewCallbacks]
  }
  
  @scala.inline
  implicit class IOverlayViewCallbacksOps[Self <: IOverlayViewCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnPlayClickFunction1(value: /* evt */ Event => Unit): Self = this.set("onPlayClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayClick(value: EventListenerOrEventListenerObject): Self = this.set("onPlayClick", value.asInstanceOf[js.Any])
  }
}
