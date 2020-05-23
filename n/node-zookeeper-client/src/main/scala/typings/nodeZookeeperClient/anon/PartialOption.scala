package typings.nodeZookeeperClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<node-zookeeper-client.node-zookeeper-client.Option> */
trait PartialOption extends js.Object {
  var retries: js.UndefOr[Double] = js.undefined
  var sessionTimeout: js.UndefOr[Double] = js.undefined
  var spinDelay: js.UndefOr[Double] = js.undefined
}

object PartialOption {
  @scala.inline
  def apply(
    retries: js.UndefOr[Double] = js.undefined,
    sessionTimeout: js.UndefOr[Double] = js.undefined,
    spinDelay: js.UndefOr[Double] = js.undefined
  ): PartialOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionTimeout)) __obj.updateDynamic("sessionTimeout")(sessionTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spinDelay)) __obj.updateDynamic("spinDelay")(spinDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOption]
  }
}

