package typings.playable.titleTypesMod

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITitleViewCallbacks extends js.Object {
  
  var onClick: EventListenerOrEventListenerObject = js.native
}
object ITitleViewCallbacks {
  
  @scala.inline
  def apply(onClick: EventListenerOrEventListenerObject): ITitleViewCallbacks = {
    val __obj = js.Dynamic.literal(onClick = onClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITitleViewCallbacks]
  }
  
  @scala.inline
  implicit class ITitleViewCallbacksOps[Self <: ITitleViewCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnClickFunction1(value: /* evt */ Event => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClick(value: EventListenerOrEventListenerObject): Self = this.set("onClick", value.asInstanceOf[js.Any])
  }
}
