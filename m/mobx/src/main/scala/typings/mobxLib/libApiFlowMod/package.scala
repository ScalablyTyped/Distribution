package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libApiFlowMod {
  type CancellablePromise[T] = js.Promise[T] with mobxLib.Anon_Cancel
  type FlowReturnType[R] = IfAllAreFlowYieldThenVoid[R | FlowYield | js.Any]
  type IfAllAreFlowYieldThenVoid[R] = (stdLib.Exclude[R, FlowYield]) | scala.Unit
}
