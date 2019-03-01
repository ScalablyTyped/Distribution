package typings
package pDashEventLib.pDashEventMod.pEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emitter[T, TRest] extends js.Object {
  var addEventListener: js.UndefOr[pDashEventLib.AddRmListenerFn[T, TRest]] = js.undefined
  var addListener: js.UndefOr[pDashEventLib.AddRmListenerFn[T, TRest]] = js.undefined
  var off: js.UndefOr[pDashEventLib.AddRmListenerFn[T, TRest]] = js.undefined
  var on: js.UndefOr[pDashEventLib.AddRmListenerFn[T, TRest]] = js.undefined
  var removeEventListener: js.UndefOr[pDashEventLib.AddRmListenerFn[T, TRest]] = js.undefined
  var removeListener: js.UndefOr[pDashEventLib.AddRmListenerFn[T, TRest]] = js.undefined
}

object Emitter {
  @scala.inline
  def apply[T, TRest](
    addEventListener: pDashEventLib.AddRmListenerFn[T, TRest] = null,
    addListener: pDashEventLib.AddRmListenerFn[T, TRest] = null,
    off: pDashEventLib.AddRmListenerFn[T, TRest] = null,
    on: pDashEventLib.AddRmListenerFn[T, TRest] = null,
    removeEventListener: pDashEventLib.AddRmListenerFn[T, TRest] = null,
    removeListener: pDashEventLib.AddRmListenerFn[T, TRest] = null
  ): Emitter[T, TRest] = {
    val __obj = js.Dynamic.literal()
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(addEventListener)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (off != null) __obj.updateDynamic("off")(off)
    if (on != null) __obj.updateDynamic("on")(on)
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(removeEventListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    __obj.asInstanceOf[Emitter[T, TRest]]
  }
}

