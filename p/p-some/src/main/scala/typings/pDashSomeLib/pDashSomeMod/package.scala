package typings
package pDashSomeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashSomeMod {
  type CancelablePromise[ValueType] = pDashCancelableLib.pDashCancelableMod.namespaced[ValueType]
  type Value[T] = T | js.Thenable[T]
}
