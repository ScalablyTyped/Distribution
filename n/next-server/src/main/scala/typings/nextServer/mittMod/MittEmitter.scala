package typings.nextServer.mittMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MittEmitter extends js.Object {
  def emit(`type`: String, evts: js.Any*): Unit
  def off(`type`: String, handler: Handler): Unit
  def on(`type`: String, handler: Handler): Unit
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
}

