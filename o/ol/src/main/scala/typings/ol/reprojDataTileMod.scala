package typings.ol

import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reprojDataTileMod {
  
  /**
    * @typedef {function(number, number, number, number) : import("../DataTile.js").default} TileGetter
    */
  /**
    * @typedef {Object} Options
    * @property {import("../proj/Projection.js").default} sourceProj Source projection.
    * @property {import("../tilegrid/TileGrid.js").default} sourceTileGrid Source tile grid.
    * @property {import("../proj/Projection.js").default} targetProj Target projection.
    * @property {import("../tilegrid/TileGrid.js").default} targetTileGrid Target tile grid.
    * @property {import("../tilecoord.js").TileCoord} tileCoord Coordinate of the tile.
    * @property {import("../tilecoord.js").TileCoord} [wrappedTileCoord] Coordinate of the tile wrapped in X.
    * @property {number} pixelRatio Pixel ratio.
    * @property {number} gutter Gutter of the source tiles.
    * @property {TileGetter} getTileFunction Function returning source tiles (z, x, y, pixelRatio).
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    * @property {number} [errorThreshold] Acceptable reprojection error (in px).
    * @property {number} [transition=250] A duration for tile opacity
    * transitions in milliseconds. A duration of 0 disables the opacity transition.
    */
  /**
    * @classdesc
    * Class encapsulating single reprojected data tile.
    * See {@link module:ol/source/DataTile~DataTileSource}.
    *
    */
  @JSImport("ol/reproj/DataTile", JSImport.Default)
  @js.native
  open class default protected () extends ReprojDataTile {
    /**
      * @param {Options} options Tile options.
      */
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Acceptable reprojection error (in px).
      */
    var errorThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Function returning source tiles (z, x, y, pixelRatio).
      */
    def getTileFunction(arg0: Double, arg1: Double, arg2: Double, arg3: Double): typings.ol.sourceDataTileMod.default
    /**
      * Function returning source tiles (z, x, y, pixelRatio).
      */
    @JSName("getTileFunction")
    var getTileFunction_Original: TileGetter
    
    /**
      * Gutter of the source tiles.
      */
    var gutter: Double
    
    /**
      * Use interpolated values when resampling.  By default,
      * the nearest neighbor is used when resampling.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pixel ratio.
      */
    var pixelRatio: Double
    
    /**
      * Source projection.
      */
    var sourceProj: typings.ol.projProjectionMod.default
    
    /**
      * Source tile grid.
      */
    var sourceTileGrid: typings.ol.tilegridTileGridMod.default
    
    /**
      * Target projection.
      */
    var targetProj: typings.ol.projProjectionMod.default
    
    /**
      * Target tile grid.
      */
    var targetTileGrid: typings.ol.tilegridTileGridMod.default
    
    /**
      * Coordinate of the tile.
      */
    var tileCoord: TileCoord
    
    /**
      * A duration for tile opacity
      * transitions in milliseconds. A duration of 0 disables the opacity transition.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * Coordinate of the tile wrapped in X.
      */
    var wrappedTileCoord: js.UndefOr[TileCoord] = js.undefined
  }
  object Options {
    
    inline def apply(
      getTileFunction: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double, /* arg3 */ Double) => typings.ol.sourceDataTileMod.default,
      gutter: Double,
      pixelRatio: Double,
      sourceProj: typings.ol.projProjectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetTileGrid: typings.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord
    ): Options = {
      val __obj = js.Dynamic.literal(getTileFunction = js.Any.fromFunction4(getTileFunction), gutter = gutter.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], sourceProj = sourceProj.asInstanceOf[js.Any], sourceTileGrid = sourceTileGrid.asInstanceOf[js.Any], targetProj = targetProj.asInstanceOf[js.Any], targetTileGrid = targetTileGrid.asInstanceOf[js.Any], tileCoord = tileCoord.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setErrorThreshold(value: Double): Self = StObject.set(x, "errorThreshold", value.asInstanceOf[js.Any])
      
      inline def setErrorThresholdUndefined: Self = StObject.set(x, "errorThreshold", js.undefined)
      
      inline def setGetTileFunction(
        value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double, /* arg3 */ Double) => typings.ol.sourceDataTileMod.default
      ): Self = StObject.set(x, "getTileFunction", js.Any.fromFunction4(value))
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setSourceProj(value: typings.ol.projProjectionMod.default): Self = StObject.set(x, "sourceProj", value.asInstanceOf[js.Any])
      
      inline def setSourceTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "sourceTileGrid", value.asInstanceOf[js.Any])
      
      inline def setTargetProj(value: typings.ol.projProjectionMod.default): Self = StObject.set(x, "targetProj", value.asInstanceOf[js.Any])
      
      inline def setTargetTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "targetTileGrid", value.asInstanceOf[js.Any])
      
      inline def setTileCoord(value: TileCoord): Self = StObject.set(x, "tileCoord", value.asInstanceOf[js.Any])
      
      inline def setTileCoordVarargs(value: Double*): Self = StObject.set(x, "tileCoord", js.Array(value*))
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setWrappedTileCoord(value: TileCoord): Self = StObject.set(x, "wrappedTileCoord", value.asInstanceOf[js.Any])
      
      inline def setWrappedTileCoordUndefined: Self = StObject.set(x, "wrappedTileCoord", js.undefined)
      
      inline def setWrappedTileCoordVarargs(value: Double*): Self = StObject.set(x, "wrappedTileCoord", js.Array(value*))
    }
  }
  
  /**
    * @typedef {function(number, number, number, number) : import("../DataTile.js").default} TileGetter
    */
  /**
    * @typedef {Object} Options
    * @property {import("../proj/Projection.js").default} sourceProj Source projection.
    * @property {import("../tilegrid/TileGrid.js").default} sourceTileGrid Source tile grid.
    * @property {import("../proj/Projection.js").default} targetProj Target projection.
    * @property {import("../tilegrid/TileGrid.js").default} targetTileGrid Target tile grid.
    * @property {import("../tilecoord.js").TileCoord} tileCoord Coordinate of the tile.
    * @property {import("../tilecoord.js").TileCoord} [wrappedTileCoord] Coordinate of the tile wrapped in X.
    * @property {number} pixelRatio Pixel ratio.
    * @property {number} gutter Gutter of the source tiles.
    * @property {TileGetter} getTileFunction Function returning source tiles (z, x, y, pixelRatio).
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    * @property {number} [errorThreshold] Acceptable reprojection error (in px).
    * @property {number} [transition=250] A duration for tile opacity
    * transitions in milliseconds. A duration of 0 disables the opacity transition.
    */
  /**
    * @classdesc
    * Class encapsulating single reprojected data tile.
    * See {@link module:ol/source/DataTile~DataTileSource}.
    *
    */
  @js.native
  trait ReprojDataTile
    extends typings.ol.dataTileMod.default {
    
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
      * @type {import("../DataTile.js").Data}
      * @private
      */
    /* private */ var reprojData_ : Any = js.native
    
    /**
      * @type {Error}
      * @private
      */
    /* private */ var reprojError_ : Any = js.native
    
    /**
      * @type {import('../size.js').Size}
      * @private
      */
    /* private */ var reprojSize_ : Any = js.native
    
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
      * @type {!Array<DataTile>}
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
  
  type TileGetter = js.Function4[
    /* arg0 */ Double, 
    /* arg1 */ Double, 
    /* arg2 */ Double, 
    /* arg3 */ Double, 
    typings.ol.sourceDataTileMod.default
  ]
}
