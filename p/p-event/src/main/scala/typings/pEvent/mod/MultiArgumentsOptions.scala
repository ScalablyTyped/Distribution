package typings.pEvent.mod

import typings.pEvent.pEventBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends Options[EmittedType] {
  @JSName("multiArgs")
  val multiArgs_MultiArgumentsOptions: `true`
}

object MultiArgumentsOptions {
  @scala.inline
  def apply[/* <: js.Array[_] */ EmittedType](
    multiArgs: `true`,
    filter: EmittedType => Boolean = null,
    rejectionEvents: js.Array[String | js.Symbol] = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): MultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(multiArgs = multiArgs.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiArgumentsOptions[EmittedType]]
  }
}

