package typings
package pDashPipeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashPipeMod {
  type Pipeline[T /* <: js.Array[_] */, R] = js.Function1[/* args */ T, js.Promise[R]]
  type UnaryFunction[T, R] = js.Function1[/* value */ T, R | js.Thenable[R]]
}
