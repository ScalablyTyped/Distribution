package typings
package pDashSettleLib.pDashSettleMod.pSettleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SettledResult[T] extends js.Object {
  var isFulfilled: scala.Boolean
  var isRejected: scala.Boolean
  /** If the promise was rejected, the reason */
  var reason: js.UndefOr[js.Any] = js.undefined
  /** If the promise was fulfilled, the resolved value */
  var value: js.UndefOr[T] = js.undefined
}

