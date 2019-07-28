package typings.ol.tileQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileQueue
  extends typings.ol.structsPriorityQueueMod.default[js.Any] {
  def getTilesLoading(): Double = js.native
  /* protected */ def handleTileChange(event: typings.ol.eventsEventMod.default): Unit = js.native
  def loadMoreTiles(maxTotalLoading: Double, maxNewLoads: Double): Unit = js.native
}

