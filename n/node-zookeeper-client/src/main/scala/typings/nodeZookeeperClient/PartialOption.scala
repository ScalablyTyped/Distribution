package typings.nodeZookeeperClient

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
  def apply(retries: Int | Double = null, sessionTimeout: Int | Double = null, spinDelay: Int | Double = null): PartialOption = {
    val __obj = js.Dynamic.literal()
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (spinDelay != null) __obj.updateDynamic("spinDelay")(spinDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOption]
  }
}

