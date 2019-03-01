package typings
package nextgenDashEventsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: js.Any
  var context: js.UndefOr[java.lang.String] = js.undefined
  var eventObject: js.Any
  var fn: js.Any
  var id: js.UndefOr[js.Any] = js.undefined
  var nice: js.UndefOr[scala.Double] = js.undefined
  var once: js.Any
}

object Anon_Async {
  @scala.inline
  def apply(
    async: js.Any,
    eventObject: js.Any,
    fn: js.Any,
    once: js.Any,
    context: java.lang.String = null,
    id: js.Any = null,
    nice: scala.Int | scala.Double = null
  ): Anon_Async = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("eventObject")(eventObject)
    __obj.updateDynamic("fn")(fn)
    __obj.updateDynamic("once")(once)
    if (context != null) __obj.updateDynamic("context")(context)
    if (id != null) __obj.updateDynamic("id")(id)
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Async]
  }
}

