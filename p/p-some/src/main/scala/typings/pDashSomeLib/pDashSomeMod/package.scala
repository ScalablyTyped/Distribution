package typings
package pDashSomeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashSomeMod {
  type AggregateError = pDashSomeLib.AggregateError_
  type AggregateErrorConstructor = org.scalablytyped.runtime.Instantiable1[
    /* errors */ js.Array[
      stdLib.Error | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String
    ], 
    aggregateDashErrorLib.aggregateDashErrorMod.^
  ]
  type CancelablePromise[ValueType] = pDashCancelableLib.pDashCancelableMod.^[ValueType]
  type Value[T] = T | js.Thenable[T]
}
