package typings.optimism

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type OptimisticWrapperFunction[TArgs /* <: js.Array[_] */, TResult, TKeyArgs /* <: js.Array[_] */] = (js.Function1[/* args */ TArgs, TResult]) with (typings.optimism.anon.Forget[TKeyArgs, TResult])
  
  type TCacheKey = js.Any
}
