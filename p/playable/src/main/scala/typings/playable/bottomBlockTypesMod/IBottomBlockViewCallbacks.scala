package typings.playable.bottomBlockTypesMod

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBottomBlockViewCallbacks extends js.Object {
  
  var onBlockMouseMove: EventListenerOrEventListenerObject = js.native
  
  var onBlockMouseOut: EventListenerOrEventListenerObject = js.native
}
object IBottomBlockViewCallbacks {
  
  @scala.inline
  def apply(
    onBlockMouseMove: EventListenerOrEventListenerObject,
    onBlockMouseOut: EventListenerOrEventListenerObject
  ): IBottomBlockViewCallbacks = {
    val __obj = js.Dynamic.literal(onBlockMouseMove = onBlockMouseMove.asInstanceOf[js.Any], onBlockMouseOut = onBlockMouseOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBottomBlockViewCallbacks]
  }
  
  @scala.inline
  implicit class IBottomBlockViewCallbacksOps[Self <: IBottomBlockViewCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnBlockMouseMoveFunction1(value: /* evt */ Event => Unit): Self = this.set("onBlockMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlockMouseMove(value: EventListenerOrEventListenerObject): Self = this.set("onBlockMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlockMouseOutFunction1(value: /* evt */ Event => Unit): Self = this.set("onBlockMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlockMouseOut(value: EventListenerOrEventListenerObject): Self = this.set("onBlockMouseOut", value.asInstanceOf[js.Any])
  }
}
