package typings
package pDashPipeLib.pDashPipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-pipe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // Fallbacks if more than 9 functions are passed as input (not type-safe).
  def default(functions: (js.Function1[/* repeated */ js.Any, _ | js.Thenable[_]])*): pDashPipeLib.pDashPipeMod.Pipeline[js.Array[_], _] = js.native
  /**
    * Returns an async `function` which accepts the same parameters as the first `function` of `input`.
    * When the returned `function` is executed the `input` is sequentially iterated until one of the
    * inputs throws or the last input is fulfilled.
    *
    * @param input - Iterated over sequentially when returned `function` is called.
    */
  def default[T /* <: js.Array[_] */, R](f1: js.Function1[/* args */ T, R | js.Thenable[R]]): pDashPipeLib.pDashPipeMod.Pipeline[T, R] = js.native
  def default[T /* <: js.Array[_] */, R1, R](
    f1: js.Function1[/* args */ T, R1 | js.Thenable[R1]],
    f2: pDashPipeLib.pDashPipeMod.UnaryFunction[R1, R]
  ): pDashPipeLib.pDashPipeMod.Pipeline[T, R] = js.native
  def default[T /* <: js.Array[_] */, R1, R2, R](
    f1: js.Function1[/* args */ T, R1 | js.Thenable[R1]],
    f2: pDashPipeLib.pDashPipeMod.UnaryFunction[R1, R2],
    f3: pDashPipeLib.pDashPipeMod.UnaryFunction[R2, R]
  ): pDashPipeLib.pDashPipeMod.Pipeline[T, R] = js.native
  def default[T /* <: js.Array[_] */, R1, R2, R3, R](
    f1: js.Function1[/* args */ T, R1 | js.Thenable[R1]],
    f2: pDashPipeLib.pDashPipeMod.UnaryFunction[R1, R2],
    f3: pDashPipeLib.pDashPipeMod.UnaryFunction[R2, R3],
    f4: pDashPipeLib.pDashPipeMod.UnaryFunction[R3, R]
  ): pDashPipeLib.pDashPipeMod.Pipeline[T, R] = js.native
  def default[T /* <: js.Array[_] */, R1, R2, R3, R4, R](
    f1: js.Function1[/* args */ T, R1 | js.Thenable[R1]],
    f2: pDashPipeLib.pDashPipeMod.UnaryFunction[R1, R2],
    f3: pDashPipeLib.pDashPipeMod.UnaryFunction[R2, R3],
    f4: pDashPipeLib.pDashPipeMod.UnaryFunction[R3, R4],
    f5: pDashPipeLib.pDashPipeMod.UnaryFunction[R4, R]
  ): pDashPipeLib.pDashPipeMod.Pipeline[T, R] = js.native
  def default[T /* <: js.Array[_] */, R1, R2, R3, R4, R5, R](
    f1: js.Function1[/* args */ T, R1 | js.Thenable[R1]],
    f2: pDashPipeLib.pDashPipeMod.UnaryFunction[R1, R2],
    f3: pDashPipeLib.pDashPipeMod.UnaryFunction[R2, R3],
    f4: pDashPipeLib.pDashPipeMod.UnaryFunction[R3, R4],
    f5: pDashPipeLib.pDashPipeMod.UnaryFunction[R4, R5],
    f6: pDashPipeLib.pDashPipeMod.UnaryFunction[R5, R]
  ): pDashPipeLib.pDashPipeMod.Pipeline[T, R] = js.native
  def default[T /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6, R](
    f1: js.Function1[/* args */ T, R1 | js.Thenable[R1]],
    f2: pDashPipeLib.pDashPipeMod.UnaryFunction[R1, R2],
    f3: pDashPipeLib.pDashPipeMod.UnaryFunction[R2, R3],
    f4: pDashPipeLib.pDashPipeMod.UnaryFunction[R3, R4],
    f5: pDashPipeLib.pDashPipeMod.UnaryFunction[R4, R5],
    f6: pDashPipeLib.pDashPipeMod.UnaryFunction[R5, R6],
    f7: pDashPipeLib.pDashPipeMod.UnaryFunction[R6, R]
  ): pDashPipeLib.pDashPipeMod.Pipeline[T, R] = js.native
  def default[T /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6, R7, R](
    f1: js.Function1[/* args */ T, R1 | js.Thenable[R1]],
    f2: pDashPipeLib.pDashPipeMod.UnaryFunction[R1, R2],
    f3: pDashPipeLib.pDashPipeMod.UnaryFunction[R2, R3],
    f4: pDashPipeLib.pDashPipeMod.UnaryFunction[R3, R4],
    f5: pDashPipeLib.pDashPipeMod.UnaryFunction[R4, R5],
    f6: pDashPipeLib.pDashPipeMod.UnaryFunction[R5, R6],
    f7: pDashPipeLib.pDashPipeMod.UnaryFunction[R6, R7],
    f8: pDashPipeLib.pDashPipeMod.UnaryFunction[R7, R]
  ): pDashPipeLib.pDashPipeMod.Pipeline[T, R] = js.native
  def default[T /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6, R7, R8, R](
    f1: js.Function1[/* args */ T, R1 | js.Thenable[R1]],
    f2: pDashPipeLib.pDashPipeMod.UnaryFunction[R1, R2],
    f3: pDashPipeLib.pDashPipeMod.UnaryFunction[R2, R3],
    f4: pDashPipeLib.pDashPipeMod.UnaryFunction[R3, R4],
    f5: pDashPipeLib.pDashPipeMod.UnaryFunction[R4, R5],
    f6: pDashPipeLib.pDashPipeMod.UnaryFunction[R5, R6],
    f7: pDashPipeLib.pDashPipeMod.UnaryFunction[R6, R7],
    f8: pDashPipeLib.pDashPipeMod.UnaryFunction[R7, R8],
    f9: pDashPipeLib.pDashPipeMod.UnaryFunction[R8, R]
  ): pDashPipeLib.pDashPipeMod.Pipeline[T, R] = js.native
}

