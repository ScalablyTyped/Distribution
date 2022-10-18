package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileQueueMod {
  
  @JSImport("ol/TileQueue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/TileQueue", JSImport.Default)
  @js.native
  open class default protected () extends TileQueue {
    def this(tilePriorityFunction: PriorityFunction, tileChangeCallback: js.Function0[Any]) = this()
  }
  
  inline def getTilePriority(
    frameState: FrameState,
    tile: typings.ol.tileMod.default,
    tileSourceKey: String,
    tileCenter: Coordinate,
    tileResolution: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTilePriority")(frameState.asInstanceOf[js.Any], tile.asInstanceOf[js.Any], tileSourceKey.asInstanceOf[js.Any], tileCenter.asInstanceOf[js.Any], tileResolution.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type PriorityFunction = js.Function4[
    /* p0 */ typings.ol.tileMod.default, 
    /* p1 */ String, 
    /* p2 */ Coordinate, 
    /* p3 */ Double, 
    Double
  ]
  
  @js.native
  trait TileQueue
    extends typings.ol.structsPriorityQueueMod.default[Any] {
    
    def enqueue(element: js.Array[Any]): Boolean = js.native
    
    def getTilesLoading(): Double = js.native
    
    /* protected */ def handleTileChange(event: typings.ol.eventsEventMod.default): Unit = js.native
    
    def loadMoreTiles(maxTotalLoading: Double, maxNewLoads: Double): Unit = js.native
  }
}
