package typings.mobservable.simpleeventemitterMod

import typings.mobservable.interfacesMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleEventEmitter extends js.Object {
  
  def emit(data: js.Any*): js.Any = js.native
  
  var listeners: js.Array[js.Function1[/* repeated */ _, Unit]] = js.native
  
  def on(listener: js.Function1[/* repeated */ js.Any, Unit]): Lambda = js.native
  
  def once(listener: js.Function1[/* repeated */ js.Any, Unit]): Lambda = js.native
}
object SimpleEventEmitter {
  
  @scala.inline
  def apply(
    emit: /* repeated */ js.Any => js.Any,
    listeners: js.Array[js.Function1[/* repeated */ _, Unit]],
    on: js.Function1[/* repeated */ js.Any, Unit] => Lambda,
    once: js.Function1[/* repeated */ js.Any, Unit] => Lambda
  ): SimpleEventEmitter = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), listeners = listeners.asInstanceOf[js.Any], on = js.Any.fromFunction1(on), once = js.Any.fromFunction1(once))
    __obj.asInstanceOf[SimpleEventEmitter]
  }
  
  @scala.inline
  implicit class SimpleEventEmitterOps[Self <: SimpleEventEmitter] (val x: Self) extends AnyVal {
    
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
    def setEmit(value: /* repeated */ js.Any => js.Any): Self = this.set("emit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListenersVarargs(value: (js.Function1[js.Any, Unit])*): Self = this.set("listeners", js.Array(value :_*))
    
    @scala.inline
    def setListeners(value: js.Array[js.Function1[/* repeated */ _, Unit]]): Self = this.set("listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: js.Function1[/* repeated */ js.Any, Unit] => Lambda): Self = this.set("on", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnce(value: js.Function1[/* repeated */ js.Any, Unit] => Lambda): Self = this.set("once", js.Any.fromFunction1(value))
  }
}
