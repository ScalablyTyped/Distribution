package typings
package pDashEventLib.pDashEventMod.pEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorMultiArgsOptions[T] extends IteratorOptions[T] {
  @JSName("multiArgs")
  var multiArgs_IteratorMultiArgsOptions: pDashEventLib.pDashEventLibNumbers.`true`
}

object IteratorMultiArgsOptions {
  @scala.inline
  def apply[T](
    multiArgs: pDashEventLib.pDashEventLibNumbers.`true`,
    filter: FilterFn[T] = null,
    limit: scala.Int | scala.Double = null,
    rejectionEvents: js.Array[java.lang.String | js.Symbol] = null,
    resolutionEvents: js.Array[java.lang.String | js.Symbol] = null,
    timeout: scala.Int | scala.Double = null
  ): IteratorMultiArgsOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("multiArgs")(multiArgs)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents)
    if (resolutionEvents != null) __obj.updateDynamic("resolutionEvents")(resolutionEvents)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorMultiArgsOptions[T]]
  }
}

