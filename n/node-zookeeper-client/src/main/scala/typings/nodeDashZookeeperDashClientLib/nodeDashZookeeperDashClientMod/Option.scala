package typings
package nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var retries: scala.Double
  var sessionTimeout: scala.Double
  var spinDelay: scala.Double
}

object Option {
  @scala.inline
  def apply(retries: scala.Double, sessionTimeout: scala.Double, spinDelay: scala.Double): Option = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("retries")(retries)
    __obj.updateDynamic("sessionTimeout")(sessionTimeout)
    __obj.updateDynamic("spinDelay")(spinDelay)
    __obj.asInstanceOf[Option]
  }
}

