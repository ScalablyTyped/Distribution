package typings
package pDashSomeLib.pDashSomeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pSomeNs {
  type AggregateError = pDashSomeLib.AggregateError_
  type CancelablePromise[ValueType] = pDashCancelableLib.pDashCancelableMod.namespaced[ValueType]
  type Value[T] = T | js.Thenable[T]
}
