package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.mapMod.FrameState
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCanvasTileLayerMod {
  
  /**
    * @classdesc
    * Canvas renderer for tile layers.
    * @api
    * @template {import("../../layer/Tile.js").default<import("../../source/Tile.js").default>|import("../../layer/VectorTile.js").default} [LayerType=import("../../layer/Tile.js").default<import("../../source/Tile.js").default>|import("../../layer/VectorTile.js").default]
    * @extends {CanvasLayerRenderer<LayerType>}
    */
  @JSImport("ol/renderer/canvas/TileLayer", JSImport.Default)
  @js.native
  open class default[LayerType /* <: typings.ol.tileMod.default | typings.ol.vectorTileMod.default */] protected () extends CanvasTileLayerRenderer[LayerType] {
    /**
      * @param {LayerType} tileLayer Tile layer.
      */
    def this(tileLayer: LayerType) = this()
  }
  
  /**
    * @classdesc
    * Canvas renderer for tile layers.
    * @api
    * @template {import("../../layer/Tile.js").default<import("../../source/Tile.js").default>|import("../../layer/VectorTile.js").default} [LayerType=import("../../layer/Tile.js").default<import("../../source/Tile.js").default>|import("../../layer/VectorTile.js").default]
    * @extends {CanvasLayerRenderer<LayerType>}
    */
  @js.native
  trait CanvasTileLayerRenderer[LayerType /* <: typings.ol.tileMod.default | typings.ol.vectorTileMod.default */]
    extends typings.ol.rendererCanvasLayerMod.default[LayerType] {
    
    /**
      * @param {import("../../ImageTile.js").default} tile Tile.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @param {number} x Left of the tile.
      * @param {number} y Top of the tile.
      * @param {number} w Width of the tile.
      * @param {number} h Height of the tile.
      * @param {number} gutter Tile gutter.
      * @param {boolean} transition Apply an alpha transition.
      */
    def drawTileImage(
      tile: typings.ol.imageTileMod.default,
      frameState: FrameState,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      gutter: Double,
      transition: Boolean
    ): Unit = js.native
    
    /**
      * Rendered extent has changed since the previous `renderFrame()` call
      * @type {boolean}
      */
    var extentChanged: Boolean = js.native
    
    /**
      * @return {HTMLCanvasElement} Image
      */
    def getImage(): HTMLCanvasElement = js.native
    
    /**
      * @param {number} z Tile coordinate z.
      * @param {number} x Tile coordinate x.
      * @param {number} y Tile coordinate y.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @return {!import("../../Tile.js").default} Tile.
      */
    def getTile(z: Double, x: Double, y: Double, frameState: FrameState): typings.ol.tileMod.default = js.native
    
    /**
      * Get the image from a tile.
      * @param {import("../../ImageTile.js").default} tile Tile.
      * @return {HTMLCanvasElement|HTMLImageElement|HTMLVideoElement} Image.
      * @protected
      */
    /* protected */ def getTileImage(tile: typings.ol.imageTileMod.default): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    /**
      * @protected
      * @param {import("../../Tile.js").default} tile Tile.
      * @return {boolean} Tile is drawable.
      */
    /* protected */ def isDrawableTile(tile: typings.ol.tileMod.default): Boolean = js.native
    
    /**
      * Manage tile pyramid.
      * This function performs a number of functions related to the tiles at the
      * current zoom and lower zoom levels:
      * - registers idle tiles in frameState.wantedTiles so that they are not
      *   discarded by the tile queue
      * - enqueues missing tiles
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @param {import("../../source/Tile.js").default} tileSource Tile source.
      * @param {import("../../tilegrid/TileGrid.js").default} tileGrid Tile grid.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../../proj/Projection.js").default} projection Projection.
      * @param {import("../../extent.js").Extent} extent Extent.
      * @param {number} currentZ Current Z.
      * @param {number} preload Load low resolution tiles up to `preload` levels.
      * @param {function(import("../../Tile.js").default):void} [tileCallback] Tile callback.
      * @protected
      */
    /* protected */ def manageTilePyramid(
      frameState: FrameState,
      tileSource: typings.ol.tileMod.default,
      tileGrid: typings.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double
    ): Unit = js.native
    /* protected */ def manageTilePyramid(
      frameState: FrameState,
      tileSource: typings.ol.tileMod.default,
      tileGrid: typings.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double,
      tileCallback: js.Function1[/* arg0 */ typings.ol.tileMod.default, Unit]
    ): Unit = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var newTiles_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../../extent.js").Extent}
      */
    /* private */ var renderedExtent_ : Any = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var renderedPixelRatio: Double = js.native
    
    /**
      * @protected
      * @type {import("../../proj/Projection.js").default}
      */
    /* protected */ var renderedProjection: typings.ol.projProjectionMod.default = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var renderedRevision: Double = js.native
    
    /**
      * @protected
      * @type {!Array<import("../../Tile.js").default>}
      */
    /* protected */ var renderedTiles: js.Array[typings.ol.tileMod.default] = js.native
    
    /**
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @param {import("../../source/Tile.js").default} tileSource Tile source.
      * @protected
      */
    /* protected */ def scheduleExpireCache(frameState: FrameState, tileSource: typings.ol.tileMod.default): Unit = js.native
    
    /**
      * @protected
      * @type {import("../../extent.js").Extent}
      */
    /* protected */ var tmpExtent: Extent = js.native
    
    /**
      * @private
      * @type {import("../../TileRange.js").default}
      */
    /* private */ var tmpTileRange_ : Any = js.native
    
    /**
      * @param {!Object<string, !Object<string, boolean>>} usedTiles Used tiles.
      * @param {import("../../source/Tile.js").default} tileSource Tile source.
      * @param {import('../../Tile.js').default} tile Tile.
      * @protected
      */
    /* protected */ def updateUsedTiles(
      usedTiles: StringDictionary[StringDictionary[Boolean]],
      tileSource: typings.ol.tileMod.default,
      tile: typings.ol.tileMod.default
    ): Unit = js.native
  }
}
