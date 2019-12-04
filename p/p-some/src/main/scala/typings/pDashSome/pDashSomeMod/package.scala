package typings.pDashSome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashSomeMod {
  import org.scalablytyped.runtime.Instantiable1
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type AggregateError = AggregateError_
  type AggregateErrorConstructor = Instantiable1[
    /* errors */ js.Array[Error | StringDictionary[js.Any] | String], 
    typings.aggregateDashError.aggregateDashErrorMod.^
  ]
  type AggregateError_ = typings.aggregateDashError.aggregateDashErrorMod.^
  type CancelablePromise[ValueType] = typings.pDashCancelable.pDashCancelableMod.^[ValueType]
  type Value[T] = T | js.Thenable[T]
}
