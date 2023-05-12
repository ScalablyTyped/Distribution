package typings.ol

import typings.ol.tilecoordMod.TileCoord
import typings.ol.webglTileTextureMod.TileType
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reprojTileMod {
  
  /**
    * @typedef {function(number, number, number, number) : (import("../ImageTile.js").default)} FunctionType
    */
  /**
    * @classdesc
    * Class encapsulating single reprojected tile.
    * See {@link module:ol/source/TileImage~TileImage}.
    *
    */
  @JSImport("ol/reproj/Tile", JSImport.Default)
  @js.native
  open class default protected ()
    extends ReprojTile
       with TileType {
    /**
      * @param {import("../proj/Projection.js").default} sourceProj Source projection.
      * @param {import("../tilegrid/TileGrid.js").default} sourceTileGrid Source tile grid.
      * @param {import("../proj/Projection.js").default} targetProj Target projection.
      * @param {import("../tilegrid/TileGrid.js").default} targetTileGrid Target tile grid.
      * @param {import("../tilecoord.js").TileCoord} tileCoord Coordinate of the tile.
      * @param {import("../tilecoord.js").TileCoord} wrappedTileCoord Coordinate of the tile wrapped in X.
      * @param {number} pixelRatio Pixel ratio.
      * @param {number} gutter Gutter of the source tiles.
      * @param {FunctionType} getTileFunction
      *     Function returning source tiles (z, x, y, pixelRatio).
      * @param {number} [errorThreshold] Acceptable reprojection error (in px).
      * @param {boolean} [renderEdges] Render reprojection edges.
      * @param {boolean} [interpolate] Use linear interpolation when resampling.
      */
    def this(
      sourceProj: typings.ol.projProjectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetTileGrid: typings.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType
    ) = this()
    def this(
      sourceProj: typings.ol.projProjectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetTileGrid: typings.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      errorThreshold: Double
    ) = this()
    def this(
      sourceProj: typings.ol.projProjectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetTileGrid: typings.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      errorThreshold: Double,
      renderEdges: Boolean
    ) = this()
    def this(
      sourceProj: typings.ol.projProjectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetTileGrid: typings.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      errorThreshold: Unit,
      renderEdges: Boolean
    ) = this()
    def this(
      sourceProj: typings.ol.projProjectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetTileGrid: typings.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      errorThreshold: Double,
      renderEdges: Boolean,
      interpolate: Boolean
    ) = this()
    def this(
      sourceProj: typings.ol.projProjectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetTileGrid: typings.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      errorThreshold: Double,
      renderEdges: Unit,
      interpolate: Boolean
    ) = this()
    def this(
      sourceProj: typings.ol.projProjectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetTileGrid: typings.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      errorThreshold: Unit,
      renderEdges: Boolean,
      interpolate: Boolean
    ) = this()
    def this(
      sourceProj: typings.ol.projProjectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetTileGrid: typings.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      errorThreshold: Unit,
      renderEdges: Unit,
      interpolate: Boolean
    ) = this()
  }
  
  type FunctionType = js.Function4[
    /* arg0 */ Double, 
    /* arg1 */ Double, 
    /* arg2 */ Double, 
    /* arg3 */ Double, 
    typings.ol.imageTileMod.default
  ]
  
  /**
    * @typedef {function(number, number, number, number) : (import("../ImageTile.js").default)} FunctionType
    */
  /**
    * @classdesc
    * Class encapsulating single reprojected tile.
    * See {@link module:ol/source/TileImage~TileImage}.
    *
    */
  @js.native
  trait ReprojTile
    extends typings.ol.tileMod.default {
    
    /**
      * @private
      * @type {HTMLCanvasElement}
      */
    /* private */ var canvas_ : Any = js.native
    
    /**
      * Get the HTML Canvas element for this tile.
      * @return {HTMLCanvasElement} Canvas.
      */
    def getImage(): HTMLCanvasElement = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var gutter_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var pixelRatio_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var renderEdges_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var reproject_ : Any = js.native
    
    /**
      * @private
      * @type {import("../tilegrid/TileGrid.js").default}
      */
    /* private */ var sourceTileGrid_ : Any = js.native
    
    /**
      * @private
      * @type {!Array<import("../ImageTile.js").default>}
      */
    /* private */ var sourceTiles_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var sourceZ_ : Any = js.native
    
    /**
      * @private
      * @type {?Array<import("../events.js").EventsKey>}
      */
    /* private */ var sourcesListenerKeys_ : Any = js.native
    
    /**
      * @private
      * @type {import("../tilegrid/TileGrid.js").default}
      */
    /* private */ var targetTileGrid_ : Any = js.native
    
    /**
      * @private
      * @type {!import("./Triangulation.js").default}
      */
    /* private */ var triangulation_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var unlistenSources_ : Any = js.native
    
    /**
      * @private
      * @type {import("../tilecoord.js").TileCoord}
      */
    /* private */ var wrappedTileCoord_ : Any = js.native
  }
}
