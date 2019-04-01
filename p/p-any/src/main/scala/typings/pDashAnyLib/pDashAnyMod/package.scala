package typings
package pDashAnyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashAnyMod {
  type CancelablePromise[ValueType] = pDashCancelableLib.pDashCancelableMod.namespaced[ValueType]
  type Options[ValueType] = typeDashFestLib.typeDashFestMod.Omit[pDashSomeLib.pDashSomeMod.Options[ValueType], pDashAnyLib.pDashAnyLibStrings.count]
  type Value[ValueType] = ValueType | js.Thenable[ValueType]
}
