package typings
package pDashAnyLib.pDashAnyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pAnyNs {
  type AggregateError = pDashSomeLib.pDashSomeMod.pSomeNs.AggregateError
  type CancelablePromise[ValueType] = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PCancelable<ValueType> */ js.Any
  type Options[ValueType] = typeDashFestLib.typeDashFestMod.Omit[
    pDashSomeLib.pDashSomeMod.pSomeNs.Options[ValueType], 
    pDashAnyLib.pDashAnyLibStrings.count
  ]
  type Value[ValueType] = ValueType | js.Thenable[ValueType]
}
