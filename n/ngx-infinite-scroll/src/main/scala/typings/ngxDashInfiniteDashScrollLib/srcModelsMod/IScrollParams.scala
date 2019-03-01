package typings
package ngxDashInfiniteDashScrollLib.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollParams extends js.Object {
  var fire: scala.Boolean
  var scrollDown: scala.Boolean
  var stats: IPositionStats
}

object IScrollParams {
  @scala.inline
  def apply(fire: scala.Boolean, scrollDown: scala.Boolean, stats: IPositionStats): IScrollParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fire")(fire)
    __obj.updateDynamic("scrollDown")(scrollDown)
    __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[IScrollParams]
  }
}

