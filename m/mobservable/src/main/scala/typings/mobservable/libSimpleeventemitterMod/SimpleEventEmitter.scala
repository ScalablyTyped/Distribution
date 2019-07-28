package typings.mobservable.libSimpleeventemitterMod

import typings.mobservable.Fn_Data
import typings.mobservable.libInterfacesMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleEventEmitter extends js.Object {
  var listeners: js.Array[Fn_Data]
  def emit(data: js.Any*): js.Any
  def on(listener: js.Function1[/* repeated */ js.Any, Unit]): Lambda
  def once(listener: js.Function1[/* repeated */ js.Any, Unit]): Lambda
}

object SimpleEventEmitter {
  @scala.inline
  def apply(
    emit: /* repeated */ js.Any => js.Any,
    listeners: js.Array[Fn_Data],
    on: js.Function1[/* repeated */ js.Any, Unit] => Lambda,
    once: js.Function1[/* repeated */ js.Any, Unit] => Lambda
  ): SimpleEventEmitter = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), listeners = listeners, on = js.Any.fromFunction1(on), once = js.Any.fromFunction1(once))
  
    __obj.asInstanceOf[SimpleEventEmitter]
  }
}

