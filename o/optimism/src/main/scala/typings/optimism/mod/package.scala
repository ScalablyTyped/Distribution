package typings.optimism

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OptimisticWrapperFunction[TArgs /* <: js.Array[_] */, TResult, TKeyArgs /* <: js.Array[_] */] = (js.Function1[/* args */ TArgs, TResult]) with (typings.optimism.anon.Peek[TKeyArgs, TResult])
  type TCacheKey = js.Any
}
