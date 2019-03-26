package typings
package pDashEventLib.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emitter[EmittedType /* <: js.Array[_] */] extends js.Object {
  var addEventListener: js.UndefOr[AddRemoveListener[EmittedType]] = js.undefined
  var addListener: js.UndefOr[AddRemoveListener[EmittedType]] = js.undefined
  var off: js.UndefOr[AddRemoveListener[EmittedType]] = js.undefined
  var on: js.UndefOr[AddRemoveListener[EmittedType]] = js.undefined
  var removeEventListener: js.UndefOr[AddRemoveListener[EmittedType]] = js.undefined
  var removeListener: js.UndefOr[AddRemoveListener[EmittedType]] = js.undefined
}

object Emitter {
  @scala.inline
  def apply[EmittedType /* <: js.Array[_] */](
    addEventListener: AddRemoveListener[EmittedType] = null,
    addListener: AddRemoveListener[EmittedType] = null,
    off: AddRemoveListener[EmittedType] = null,
    on: AddRemoveListener[EmittedType] = null,
    removeEventListener: AddRemoveListener[EmittedType] = null,
    removeListener: AddRemoveListener[EmittedType] = null
  ): Emitter[EmittedType] = {
    val __obj = js.Dynamic.literal()
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(addEventListener)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (off != null) __obj.updateDynamic("off")(off)
    if (on != null) __obj.updateDynamic("on")(on)
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(removeEventListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    __obj.asInstanceOf[Emitter[EmittedType]]
  }
}

