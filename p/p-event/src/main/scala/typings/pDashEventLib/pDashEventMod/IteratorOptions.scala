package typings
package pDashEventLib.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorOptions[EmittedType /* <: pDashEventLib.Array[_] */] extends Options[EmittedType] {
  /**
  	 * Maximum number of events for the iterator before it ends. When the limit is reached, the iterator will be marked as `done`. This option is useful to paginate events, for example, fetching 10 events per page.
  	 *
  	 * @default Infinity
  	 */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Events that will end the iterator.
  	 *
  	 * @default []
  	 */
  var resolutionEvents: js.UndefOr[pDashEventLib.Array[java.lang.String | js.Symbol]] = js.undefined
}

object IteratorOptions {
  @scala.inline
  def apply[EmittedType /* <: pDashEventLib.Array[_] */](
    filter: FilterFunction[EmittedType] = null,
    limit: scala.Int | scala.Double = null,
    multiArgs: js.UndefOr[scala.Boolean] = js.undefined,
    rejectionEvents: pDashEventLib.Array[java.lang.String | js.Symbol] = null,
    resolutionEvents: pDashEventLib.Array[java.lang.String | js.Symbol] = null,
    timeout: scala.Int | scala.Double = null
  ): IteratorOptions[EmittedType] = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs)
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents)
    if (resolutionEvents != null) __obj.updateDynamic("resolutionEvents")(resolutionEvents)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorOptions[EmittedType]]
  }
}

