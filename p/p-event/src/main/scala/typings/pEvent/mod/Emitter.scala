package typings.pEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emitter[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */] extends js.Object {
  var addEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var addListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var off: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var on: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var removeEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var removeListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
}

object Emitter {
  @scala.inline
  def apply[EventName, EmittedType](
    addEventListener: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit = null,
    addListener: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit = null,
    off: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit = null,
    on: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit = null,
    removeEventListener: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit = null,
    removeListener: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit = null
  ): Emitter[EventName, EmittedType] = {
    val __obj = js.Dynamic.literal()
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(js.Any.fromFunction2(addEventListener))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction2(addListener))
    if (off != null) __obj.updateDynamic("off")(js.Any.fromFunction2(off))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction2(on))
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2(removeEventListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[Emitter[EventName, EmittedType]]
  }
}

