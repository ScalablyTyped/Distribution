package typings.pSome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AggregateError = typings.pSome.mod.AggregateError_
  type AggregateErrorConstructor = org.scalablytyped.runtime.Instantiable1[
    /* errors */ js.Array[
      typings.std.Error | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String
    ], 
    typings.aggregateError.mod.^
  ]
  type AggregateError_ = typings.std.AggregateError
  type CancelablePromise[ValueType] = typings.pCancelable.mod.^[ValueType]
  type FilterError = typings.std.Error
  type Value[T] = T | js.Thenable[T]
}
