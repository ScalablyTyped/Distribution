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
    val __obj = js.Dynamic.literal(retries = retries, sessionTimeout = sessionTimeout, spinDelay = spinDelay)
  
    __obj.asInstanceOf[Option]
  }
}

