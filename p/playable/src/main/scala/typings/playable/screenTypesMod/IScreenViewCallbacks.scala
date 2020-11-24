package typings.playable.screenTypesMod

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScreenViewCallbacks extends js.Object {
  
  var onWrapperMouseClick: EventListenerOrEventListenerObject = js.native
  
  var onWrapperMouseDblClick: EventListenerOrEventListenerObject = js.native
}
object IScreenViewCallbacks {
  
  @scala.inline
  def apply(
    onWrapperMouseClick: EventListenerOrEventListenerObject,
    onWrapperMouseDblClick: EventListenerOrEventListenerObject
  ): IScreenViewCallbacks = {
    val __obj = js.Dynamic.literal(onWrapperMouseClick = onWrapperMouseClick.asInstanceOf[js.Any], onWrapperMouseDblClick = onWrapperMouseDblClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScreenViewCallbacks]
  }
  
  @scala.inline
  implicit class IScreenViewCallbacksOps[Self <: IScreenViewCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnWrapperMouseClickFunction1(value: /* evt */ Event => Unit): Self = this.set("onWrapperMouseClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWrapperMouseClick(value: EventListenerOrEventListenerObject): Self = this.set("onWrapperMouseClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWrapperMouseDblClickFunction1(value: /* evt */ Event => Unit): Self = this.set("onWrapperMouseDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWrapperMouseDblClick(value: EventListenerOrEventListenerObject): Self = this.set("onWrapperMouseDblClick", value.asInstanceOf[js.Any])
  }
}
