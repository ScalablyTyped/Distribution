package typings.nextgenDashEvents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: js.Any
  var context: js.UndefOr[String] = js.undefined
  var eventObject: js.Any
  var fn: js.Any
  var id: js.UndefOr[js.Any] = js.undefined
  var nice: js.UndefOr[Double] = js.undefined
  var once: js.Any
}

object Anon_Async {
  @scala.inline
  def apply(
    async: js.Any,
    eventObject: js.Any,
    fn: js.Any,
    once: js.Any,
    context: String = null,
    id: js.Any = null,
    nice: Int | Double = null
  ): Anon_Async = {
    val __obj = js.Dynamic.literal(async = async, eventObject = eventObject, fn = fn, once = once)
    if (context != null) __obj.updateDynamic("context")(context)
    if (id != null) __obj.updateDynamic("id")(id)
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Async]
  }
}

