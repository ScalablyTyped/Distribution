package typings
package olLib.tileQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileQueue
  extends olLib.structsPriorityQueueMod.default[js.Any] {
  def getTilesLoading(): scala.Double = js.native
  /* protected */ def handleTileChange(event: olLib.eventsEventMod.default): scala.Unit = js.native
  def loadMoreTiles(maxTotalLoading: scala.Double, maxNewLoads: scala.Double): scala.Unit = js.native
}

