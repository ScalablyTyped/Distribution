package typings.mobx

import typings.mobx.Anon_Cancel
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libApiFlowMod {
  type CancellablePromise[T] = js.Promise[T] with Anon_Cancel
  type FlowReturnType[R] = IfAllAreFlowYieldThenVoid[R | FlowYield | js.Any]
  type IfAllAreFlowYieldThenVoid[R] = (Exclude[R, FlowYield]) | Unit
}
