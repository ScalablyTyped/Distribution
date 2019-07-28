package typings.pDashEvent.pDashEventMod

import typings.pDashEvent.pDashEventNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleMultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends MultipleOptions[EmittedType] {
  @JSName("multiArgs")
  val multiArgs_MultipleMultiArgumentsOptions: `true`
}

object MultipleMultiArgumentsOptions {
  @scala.inline
  def apply[EmittedType /* <: js.Array[_] */](
    count: Double,
    multiArgs: `true`,
    filter: FilterFunction[EmittedType] = null,
    rejectionEvents: js.Array[String | js.Symbol] = null,
    resolveImmediately: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): MultipleMultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(count = count, multiArgs = multiArgs)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents)
    if (!js.isUndefined(resolveImmediately)) __obj.updateDynamic("resolveImmediately")(resolveImmediately)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleMultiArgumentsOptions[EmittedType]]
  }
}

