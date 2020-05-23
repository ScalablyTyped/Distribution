package typings.nextgenEvents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Async extends js.Object {
  var async: js.Any
  var context: js.UndefOr[String] = js.undefined
  var eventObject: js.Any
  var fn: js.Any
  var id: js.UndefOr[js.Any] = js.undefined
  var nice: js.UndefOr[Double] = js.undefined
  var once: js.Any
}

object Async {
  @scala.inline
  def apply(
    async: js.Any,
    eventObject: js.Any,
    fn: js.Any,
    once: js.Any,
    context: String = null,
    id: js.Any = null,
    nice: js.UndefOr[Double] = js.undefined
  ): Async = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(nice)) __obj.updateDynamic("nice")(nice.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
}

