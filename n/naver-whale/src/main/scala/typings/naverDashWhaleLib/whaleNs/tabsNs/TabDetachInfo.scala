package typings
package naverDashWhaleLib.whaleNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabDetachInfo extends js.Object {
  var oldPosition: scala.Double
  var oldWindowId: scala.Double
}

object TabDetachInfo {
  @scala.inline
  def apply(oldPosition: scala.Double, oldWindowId: scala.Double): TabDetachInfo = {
    val __obj = js.Dynamic.literal(oldPosition = oldPosition, oldWindowId = oldWindowId)
  
    __obj.asInstanceOf[TabDetachInfo]
  }
}

