package typings
package pDashEventLib.pDashEventMod.pEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emitter[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */] extends js.Object {
  var addEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var addListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var off: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var on: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var removeEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var removeListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
}

object Emitter {
  @scala.inline
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    addEventListener: AddRemoveListener[EventName, EmittedType] = null,
    addListener: AddRemoveListener[EventName, EmittedType] = null,
    off: AddRemoveListener[EventName, EmittedType] = null,
    on: AddRemoveListener[EventName, EmittedType] = null,
    removeEventListener: AddRemoveListener[EventName, EmittedType] = null,
    removeListener: AddRemoveListener[EventName, EmittedType] = null
  ): Emitter[EventName, EmittedType] = {
    val __obj = js.Dynamic.literal()
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(addEventListener)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (off != null) __obj.updateDynamic("off")(off)
    if (on != null) __obj.updateDynamic("on")(on)
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(removeEventListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    __obj.asInstanceOf[Emitter[EventName, EmittedType]]
  }
}

