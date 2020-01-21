package typings.memcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandData extends js.Object {
  var cas: js.UndefOr[String] = js.undefined
  var command: String
  var execution: Double
  var key: js.UndefOr[String] = js.undefined
  var lifetime: js.UndefOr[Double] = js.undefined
  var redundancyEnabled: js.UndefOr[Boolean] = js.undefined
  var start: Double
  var `type`: String
  var validate: js.Array[js.Tuple2[String, js.Function1[/* repeated */ _, _]]]
  var value: js.UndefOr[js.Any] = js.undefined
  def callback(args: js.Any*): js.Any
}

object CommandData {
  @scala.inline
  def apply(
    callback: /* repeated */ js.Any => js.Any,
    command: String,
    execution: Double,
    start: Double,
    `type`: String,
    validate: js.Array[js.Tuple2[String, js.Function1[/* repeated */ _, _]]],
    cas: String = null,
    key: String = null,
    lifetime: Int | Double = null,
    redundancyEnabled: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): CommandData = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), command = command.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cas != null) __obj.updateDynamic("cas")(cas.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lifetime != null) __obj.updateDynamic("lifetime")(lifetime.asInstanceOf[js.Any])
    if (!js.isUndefined(redundancyEnabled)) __obj.updateDynamic("redundancyEnabled")(redundancyEnabled.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandData]
  }
}

