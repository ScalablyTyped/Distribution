package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.mapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileQueueMod {
  
  @JSImport("ol/TileQueue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {function(import("./Tile.js").default, string, import("./coordinate.js").Coordinate, number): number} PriorityFunction
    */
  @JSImport("ol/TileQueue", JSImport.Default)
  @js.native
  open class default protected () extends TileQueue {
    /**
      * @param {PriorityFunction} tilePriorityFunction Tile priority function.
      * @param {function(): ?} tileChangeCallback Function called on each tile change event.
      */
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
    /* arg0 */ typings.ol.tileMod.default, 
    /* arg1 */ String, 
    /* arg2 */ Coordinate, 
    /* arg3 */ Double, 
    Double
  ]
  
  /**
    * @typedef {function(import("./Tile.js").default, string, import("./coordinate.js").Coordinate, number): number} PriorityFunction
    */
  @js.native
  trait TileQueue
    extends typings.ol.structsPriorityQueueMod.default[Any] {
    
    /** @private */
    /* private */ var boundHandleTileChange_ : Any = js.native
    
    /**
      * @param {Array} element Element.
      * @return {boolean} The element was added to the queue.
      */
    def enqueue(element: js.Array[Any]): Boolean = js.native
    
    /**
      * @return {number} Number of tiles loading.
      */
    def getTilesLoading(): Double = js.native
    
    /**
      * @param {import("./events/Event.js").default} event Event.
      * @protected
      */
    /* protected */ def handleTileChange(event: typings.ol.eventsEventMod.default): Unit = js.native
    
    /**
      * @param {number} maxTotalLoading Maximum number tiles to load simultaneously.
      * @param {number} maxNewLoads Maximum number of new tiles to load.
      */
    def loadMoreTiles(maxTotalLoading: Double, maxNewLoads: Double): Unit = js.native
    
    /**
      * @private
      * @type {function(): ?}
      */
    /* private */ var tileChangeCallback_ : Any = js.native
    
    /**
      * @private
      * @type {!Object<string,boolean>}
      */
    /* private */ var tilesLoadingKeys_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var tilesLoading_ : Any = js.native
  }
}
