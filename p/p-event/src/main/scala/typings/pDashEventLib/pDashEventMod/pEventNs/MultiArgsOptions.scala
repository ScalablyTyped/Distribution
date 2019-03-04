package typings
package pDashEventLib.pDashEventMod.pEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiArgsOptions[T] extends Options[T] {
  @JSName("multiArgs")
  var multiArgs_MultiArgsOptions: pDashEventLib.pDashEventLibNumbers.`true`
}

object MultiArgsOptions {
  @scala.inline
  def apply[T](
    multiArgs: pDashEventLib.pDashEventLibNumbers.`true`,
    filter: FilterFn[T] = null,
    rejectionEvents: js.Array[java.lang.String | js.Symbol] = null,
    timeout: scala.Int | scala.Double = null
  ): MultiArgsOptions[T] = {
    val __obj = js.Dynamic.literal(multiArgs = multiArgs)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiArgsOptions[T]]
  }
}

