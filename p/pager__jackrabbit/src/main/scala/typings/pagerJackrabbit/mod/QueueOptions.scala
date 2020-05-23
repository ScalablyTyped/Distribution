package typings.pagerJackrabbit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amqplib.amqplib.Options.AssertQueue & {  name ? :string,   key ? :string,   keys ? :std.ReadonlyArray<string>,   prefetch ? :number} */
trait QueueOptions extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.undefined
  var autoDelete: js.UndefOr[Boolean] = js.undefined
  var deadLetterExchange: js.UndefOr[String] = js.undefined
  var deadLetterRoutingKey: js.UndefOr[String] = js.undefined
  var durable: js.UndefOr[Boolean] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var maxPriority: js.UndefOr[Double] = js.undefined
  var messageTtl: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prefetch: js.UndefOr[Double] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(
    arguments: js.Any = null,
    autoDelete: js.UndefOr[Boolean] = js.undefined,
    deadLetterExchange: String = null,
    deadLetterRoutingKey: String = null,
    durable: js.UndefOr[Boolean] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    expires: js.UndefOr[Double] = js.undefined,
    key: String = null,
    keys: js.Array[String] = null,
    maxLength: js.UndefOr[Double] = js.undefined,
    maxPriority: js.UndefOr[Double] = js.undefined,
    messageTtl: js.UndefOr[Double] = js.undefined,
    name: String = null,
    prefetch: js.UndefOr[Double] = js.undefined
  ): QueueOptions = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete.get.asInstanceOf[js.Any])
    if (deadLetterExchange != null) __obj.updateDynamic("deadLetterExchange")(deadLetterExchange.asInstanceOf[js.Any])
    if (deadLetterRoutingKey != null) __obj.updateDynamic("deadLetterRoutingKey")(deadLetterRoutingKey.asInstanceOf[js.Any])
    if (!js.isUndefined(durable)) __obj.updateDynamic("durable")(durable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPriority)) __obj.updateDynamic("maxPriority")(maxPriority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageTtl)) __obj.updateDynamic("messageTtl")(messageTtl.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(prefetch)) __obj.updateDynamic("prefetch")(prefetch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueOptions]
  }
}

