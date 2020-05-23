package typings.pAny

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AggregateError = typings.pSome.mod.AggregateError
  type CancelablePromise[ValueType] = typings.pCancelable.mod.^[ValueType]
  type Value[ValueType] = ValueType | js.Thenable[ValueType]
}
