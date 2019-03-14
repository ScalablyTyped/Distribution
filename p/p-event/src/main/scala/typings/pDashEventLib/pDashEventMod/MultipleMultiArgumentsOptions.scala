package typings
package pDashEventLib.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleMultiArgumentsOptions[EmittedType /* <: pDashEventLib.Array[_] */] extends MultipleOptions[EmittedType] {
  @JSName("multiArgs")
  val multiArgs_MultipleMultiArgumentsOptions: pDashEventLib.pDashEventLibNumbers.`true`
}

object MultipleMultiArgumentsOptions {
  @scala.inline
  def apply[EmittedType /* <: pDashEventLib.Array[_] */](
    count: scala.Double,
    multiArgs: pDashEventLib.pDashEventLibNumbers.`true`,
    filter: FilterFunction[EmittedType] = null,
    rejectionEvents: pDashEventLib.Array[java.lang.String | js.Symbol] = null,
    resolveImmediately: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): MultipleMultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(count = count, multiArgs = multiArgs)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents)
    if (!js.isUndefined(resolveImmediately)) __obj.updateDynamic("resolveImmediately")(resolveImmediately)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleMultiArgumentsOptions[EmittedType]]
  }
}

