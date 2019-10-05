package typings.pDashEvent.pDashEventMod

import typings.pDashEvent.pDashEventNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorMultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends IteratorOptions[EmittedType] {
  @JSName("multiArgs")
  var multiArgs_IteratorMultiArgumentsOptions: `true`
}

object IteratorMultiArgumentsOptions {
  @scala.inline
  def apply[EmittedType /* <: js.Array[_] */](
    multiArgs: `true`,
    filter: EmittedType => Boolean = null,
    limit: Int | Double = null,
    rejectionEvents: js.Array[String | js.Symbol] = null,
    resolutionEvents: js.Array[String | js.Symbol] = null,
    timeout: Int | Double = null
  ): IteratorMultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(multiArgs = multiArgs)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents)
    if (resolutionEvents != null) __obj.updateDynamic("resolutionEvents")(resolutionEvents)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorMultiArgumentsOptions[EmittedType]]
  }
}

