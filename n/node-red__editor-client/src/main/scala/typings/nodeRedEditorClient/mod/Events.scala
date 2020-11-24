package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends js.Object {
  
  def emit(evt: String, args: js.Any*): Unit = js.native
  
  def off(evt: String, func: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  def on(evt: String, func: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}
object Events {
  
  @scala.inline
  def apply(
    emit: (String, /* repeated */ js.Any) => Unit,
    off: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit,
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit
  ): Events = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    
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
    def setEmit(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOff(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
