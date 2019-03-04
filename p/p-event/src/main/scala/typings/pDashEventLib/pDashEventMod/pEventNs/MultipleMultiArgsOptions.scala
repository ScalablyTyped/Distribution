package typings
package pDashEventLib.pDashEventMod.pEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleMultiArgsOptions[T] extends MultipleOptions[T] {
  @JSName("multiArgs")
  var multiArgs_MultipleMultiArgsOptions: pDashEventLib.pDashEventLibNumbers.`true`
}

object MultipleMultiArgsOptions {
  @scala.inline
  def apply[T](
    count: scala.Double,
    multiArgs: pDashEventLib.pDashEventLibNumbers.`true`,
    filter: FilterFn[T] = null,
    rejectionEvents: js.Array[java.lang.String | js.Symbol] = null,
    resolveImmediately: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): MultipleMultiArgsOptions[T] = {
    val __obj = js.Dynamic.literal(count = count, multiArgs = multiArgs)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents)
    if (!js.isUndefined(resolveImmediately)) __obj.updateDynamic("resolveImmediately")(resolveImmediately)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleMultiArgsOptions[T]]
  }
}

