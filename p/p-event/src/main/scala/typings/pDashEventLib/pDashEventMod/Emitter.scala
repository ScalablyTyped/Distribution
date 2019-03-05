package typings
package pDashEventLib.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emitter[EmittedType, EmittedTypeRest] extends js.Object {
  var addEventListener: js.UndefOr[AddRemoveListener[EmittedType, EmittedTypeRest]] = js.undefined
  var addListener: js.UndefOr[AddRemoveListener[EmittedType, EmittedTypeRest]] = js.undefined
  var off: js.UndefOr[AddRemoveListener[EmittedType, EmittedTypeRest]] = js.undefined
  var on: js.UndefOr[AddRemoveListener[EmittedType, EmittedTypeRest]] = js.undefined
  var removeEventListener: js.UndefOr[AddRemoveListener[EmittedType, EmittedTypeRest]] = js.undefined
  var removeListener: js.UndefOr[AddRemoveListener[EmittedType, EmittedTypeRest]] = js.undefined
}

object Emitter {
  @scala.inline
  def apply[EmittedType, EmittedTypeRest](
    addEventListener: AddRemoveListener[EmittedType, EmittedTypeRest] = null,
    addListener: AddRemoveListener[EmittedType, EmittedTypeRest] = null,
    off: AddRemoveListener[EmittedType, EmittedTypeRest] = null,
    on: AddRemoveListener[EmittedType, EmittedTypeRest] = null,
    removeEventListener: AddRemoveListener[EmittedType, EmittedTypeRest] = null,
    removeListener: AddRemoveListener[EmittedType, EmittedTypeRest] = null
  ): Emitter[EmittedType, EmittedTypeRest] = {
    val __obj = js.Dynamic.literal()
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(addEventListener)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (off != null) __obj.updateDynamic("off")(off)
    if (on != null) __obj.updateDynamic("on")(on)
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(removeEventListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    __obj.asInstanceOf[Emitter[EmittedType, EmittedTypeRest]]
  }
}

