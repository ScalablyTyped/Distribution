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

