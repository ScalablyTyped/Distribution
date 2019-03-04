package typings
package ngxDashInfiniteDashScrollLib.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionStats extends js.Object {
  var height: scala.Double
  var scrolled: scala.Double
  var totalToScroll: scala.Double
}

object IPositionStats {
  @scala.inline
  def apply(height: scala.Double, scrolled: scala.Double, totalToScroll: scala.Double): IPositionStats = {
    val __obj = js.Dynamic.literal(height = height, scrolled = scrolled, totalToScroll = totalToScroll)
  
    __obj.asInstanceOf[IPositionStats]
  }
}

