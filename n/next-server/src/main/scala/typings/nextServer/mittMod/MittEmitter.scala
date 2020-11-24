package typings.nextServer.mittMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MittEmitter extends js.Object {
  
  def emit(`type`: String, evts: js.Any*): Unit = js.native
  
  def off(`type`: String, handler: Handler): Unit = js.native
  
  def on(`type`: String, handler: Handler): Unit = js.native
}
object MittEmitter {
  
  @scala.inline
  def apply(
    emit: (String, /* repeated */ js.Any) => Unit,
    off: (String, Handler) => Unit,
    on: (String, Handler) => Unit
  ): MittEmitter = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[MittEmitter]
  }
  
  @scala.inline
  implicit class MittEmitterOps[Self <: MittEmitter] (val x: Self) extends AnyVal {
    
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
    def setOff(value: (String, Handler) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, Handler) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
