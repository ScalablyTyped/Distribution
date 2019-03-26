package typings
package pDashEventLib.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorMultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends IteratorOptions[EmittedType] {
  @JSName("multiArgs")
  var multiArgs_IteratorMultiArgumentsOptions: pDashEventLib.pDashEventLibNumbers.`true`
}

object IteratorMultiArgumentsOptions {
  @scala.inline
  def apply[EmittedType /* <: js.Array[_] */](
    multiArgs: pDashEventLib.pDashEventLibNumbers.`true`,
    filter: FilterFunction[EmittedType] = null,
    limit: scala.Int | scala.Double = null,
    rejectionEvents: js.Array[java.lang.String | js.Symbol] = null,
    resolutionEvents: js.Array[java.lang.String | js.Symbol] = null,
    timeout: scala.Int | scala.Double = null
  ): IteratorMultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(multiArgs = multiArgs)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents)
    if (resolutionEvents != null) __obj.updateDynamic("resolutionEvents")(resolutionEvents)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorMultiArgumentsOptions[EmittedType]]
  }
}

