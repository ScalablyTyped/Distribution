package typings
package memcachedLib.memcachedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandData extends js.Object {
  var cas: js.UndefOr[java.lang.String] = js.undefined
  var command: java.lang.String
  var execution: scala.Double
  var key: js.UndefOr[java.lang.String] = js.undefined
  var lifetime: js.UndefOr[scala.Double] = js.undefined
  var redundancyEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var start: scala.Double
  var `type`: java.lang.String
  var validate: js.Array[js.Tuple2[java.lang.String, js.Function1[/* repeated */ _, _]]]
  var value: js.UndefOr[js.Any] = js.undefined
  def callback(args: js.Any*): js.Any
}

object CommandData {
  @scala.inline
  def apply(
    callback: /* repeated */ js.Any => js.Any,
    command: java.lang.String,
    execution: scala.Double,
    start: scala.Double,
    `type`: java.lang.String,
    validate: js.Array[js.Tuple2[java.lang.String, js.Function1[/* repeated */ _, _]]],
    cas: java.lang.String = null,
    key: java.lang.String = null,
    lifetime: scala.Int | scala.Double = null,
    redundancyEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    value: js.Any = null
  ): CommandData = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), command = command, execution = execution, start = start, validate = validate)
    __obj.updateDynamic("type")(`type`)
    if (cas != null) __obj.updateDynamic("cas")(cas)
    if (key != null) __obj.updateDynamic("key")(key)
    if (lifetime != null) __obj.updateDynamic("lifetime")(lifetime.asInstanceOf[js.Any])
    if (!js.isUndefined(redundancyEnabled)) __obj.updateDynamic("redundancyEnabled")(redundancyEnabled)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CommandData]
  }
}

