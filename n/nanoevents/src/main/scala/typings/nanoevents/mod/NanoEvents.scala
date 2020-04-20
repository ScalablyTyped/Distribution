package typings.nanoevents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NanoEvents[T /* <: js.Object */] extends js.Object {
  def emit[U /* <: /* keyof T */ String */](
    name: U,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any
  ): Unit
  def on[U /* <: /* keyof T */ String */](
    name: U,
    callBack: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ /* arg */ js.Any, 
      _
    ]
  ): js.Function0[Unit]
}

object NanoEvents {
  @scala.inline
  def apply[T /* <: js.Object */](
    emit: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any) => Unit,
    on: (js.Any, js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ /* arg */ js.Any, 
      _
    ]) => js.Function0[Unit]
  ): NanoEvents[T] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[NanoEvents[T]]
  }
}

