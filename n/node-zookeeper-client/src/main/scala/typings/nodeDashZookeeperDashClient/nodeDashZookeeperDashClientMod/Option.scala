package typings.nodeDashZookeeperDashClient.nodeDashZookeeperDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var retries: Double
  var sessionTimeout: Double
  var spinDelay: Double
}

object Option {
  @scala.inline
  def apply(retries: Double, sessionTimeout: Double, spinDelay: Double): Option = {
    val __obj = js.Dynamic.literal(retries = retries.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], spinDelay = spinDelay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Option]
  }
}

