package typings
package pDashEventLib.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-event", JSImport.Namespace)
@js.native
object pDashEventModMembers extends js.Object {
  def apply[T](emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, T], event: java.lang.String | js.Symbol): stdLib.Promise[T] = js.native
  def apply[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, T],
    event: java.lang.String | js.Symbol,
    filter: pDashEventLib.FilterFn[T]
  ): stdLib.Promise[T] = js.native
  def apply[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, T],
    event: java.lang.String | js.Symbol,
    options: pDashEventLib.pDashEventMod.pEventNs.Options[T]
  ): stdLib.Promise[T] = js.native
  def apply[T, TRest](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, TRest],
    event: java.lang.String | js.Symbol,
    options: MultiArgsOptions[T | TRest]
  ): stdLib.Promise[js.Array[T | TRest]] = js.native
}

