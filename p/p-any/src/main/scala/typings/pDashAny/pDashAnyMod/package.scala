package typings.pDashAny

import typings.pDashAny.pDashAnyStrings.count
import typings.typeDashFest.typeDashFestMod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashAnyMod {
  type AggregateError = typings.pDashSome.pDashSomeMod.AggregateError
  type CancelablePromise[ValueType] = typings.pDashCancelable.pDashCancelableMod.^[ValueType]
  type Options[ValueType] = Omit[typings.pDashSome.pDashSomeMod.Options[ValueType], count]
  type Value[ValueType] = ValueType | js.Thenable[ValueType]
}
