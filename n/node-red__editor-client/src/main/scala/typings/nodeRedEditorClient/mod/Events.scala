package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  def emit(evt: String, args: js.Any*): Unit
  
  def off(evt: String, func: js.Function1[/* repeated */ js.Any, Unit]): Unit
  
  def on(evt: String, func: js.Function1[/* repeated */ js.Any, Unit]): Unit
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
  implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmit(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOff(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
