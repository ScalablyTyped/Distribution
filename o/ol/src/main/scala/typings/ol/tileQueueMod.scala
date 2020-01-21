package typings.ol

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/TileQueue", JSImport.Namespace)
@js.native
object tileQueueMod extends js.Object {
  @js.native
  trait TileQueue
    extends typings.ol.priorityQueueMod.default[js.Any] {
    def getTilesLoading(): Double = js.native
    /* protected */ def handleTileChange(event: typings.ol.eventMod.default): Unit = js.native
    def loadMoreTiles(maxTotalLoading: Double, maxNewLoads: Double): Unit = js.native
  }
  
  @js.native
  class default protected () extends TileQueue {
    def this(tilePriorityFunction: PriorityFunction, tileChangeCallback: js.Function0[_]) = this()
  }
  
  type PriorityFunction = js.Function4[
    /* p0 */ typings.ol.olTileMod.default, 
    /* p1 */ String, 
    /* p2 */ Coordinate, 
    /* p3 */ Double, 
    Double
  ]
}

