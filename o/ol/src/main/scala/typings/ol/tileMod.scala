package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileMod {
  
  /**
    * A function that takes an {@link module:ol/Tile~Tile} for the tile and a
    * `{string}` for the url as arguments. The default is
    * ```js
    * source.setTileLoadFunction(function(tile, src) {
    *   tile.getImage().src = src;
    * });
    * ```
    * For more fine grained control, the load function can use fetch or XMLHttpRequest and involve
    * error handling:
    *
    * ```js
    * import TileState from 'ol/TileState.js';
    *
    * source.setTileLoadFunction(function(tile, src) {
    *   const xhr = new XMLHttpRequest();
    *   xhr.responseType = 'blob';
    *   xhr.addEventListener('loadend', function (evt) {
    *     const data = this.response;
    *     if (data !== undefined) {
    *       tile.getImage().src = URL.createObjectURL(data);
    *     } else {
    *       tile.setState(TileState.ERROR);
    *     }
    *   });
    *   xhr.addEventListener('error', function () {
    *     tile.setState(TileState.ERROR);
    *   });
    *   xhr.open('GET', src);
    *   xhr.send();
    * });
    * ```
    *
    * @typedef {function(Tile, string): void} LoadFunction
    * @api
    */
  /**
    * {@link module:ol/source/Tile~TileSource} sources use a function of this type to get
    * the url that provides a tile for a given tile coordinate.
    *
    * This function takes an {@link module:ol/tilecoord~TileCoord} for the tile
    * coordinate, a `{number}` representing the pixel ratio and a
    * {@link module:ol/proj/Projection~Projection} for the projection  as arguments
    * and returns a `{string}` representing the tile URL, or undefined if no tile
    * should be requested for the passed tile coordinate.
    *
    * @typedef {function(import("./tilecoord.js").TileCoord, number,
    *           import("./proj/Projection.js").default): (string|undefined)} UrlFunction
    * @api
    */
  /**
    * @typedef {Object} Options
    * @property {number} [transition=250] A duration for tile opacity
    * transitions in milliseconds. A duration of 0 disables the opacity transition.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    * @api
    */
  /**
    * @classdesc
    * Base class for tiles.
    *
    * @abstract
    */
  @JSImport("ol/Tile", JSImport.Default)
  @js.native
  open class default protected () extends Tile {
    /**
      * @param {import("./tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("./TileState.js").default} state State.
      * @param {Options} [options] Tile options.
      */
    def this(tileCoord: TileCoord, state: Any) = this()
    def this(tileCoord: TileCoord, state: Any, options: Options) = this()
  }
  
  type LoadFunction = js.Function2[/* arg0 */ Tile, /* arg1 */ String, Unit]
  
  trait Options extends StObject {
    
    /**
      * Use interpolated values when resampling.  By default,
      * the nearest neighbor is used when resampling.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A duration for tile opacity
      * transitions in milliseconds. A duration of 0 disables the opacity transition.
      */
    var transition: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  /**
    * A function that takes an {@link module:ol/Tile~Tile} for the tile and a
    * `{string}` for the url as arguments. The default is
    * ```js
    * source.setTileLoadFunction(function(tile, src) {
    *   tile.getImage().src = src;
    * });
    * ```
    * For more fine grained control, the load function can use fetch or XMLHttpRequest and involve
    * error handling:
    *
    * ```js
    * import TileState from 'ol/TileState.js';
    *
    * source.setTileLoadFunction(function(tile, src) {
    *   const xhr = new XMLHttpRequest();
    *   xhr.responseType = 'blob';
    *   xhr.addEventListener('loadend', function (evt) {
    *     const data = this.response;
    *     if (data !== undefined) {
    *       tile.getImage().src = URL.createObjectURL(data);
    *     } else {
    *       tile.setState(TileState.ERROR);
    *     }
    *   });
    *   xhr.addEventListener('error', function () {
    *     tile.setState(TileState.ERROR);
    *   });
    *   xhr.open('GET', src);
    *   xhr.send();
    * });
    * ```
    *
    * @typedef {function(Tile, string): void} LoadFunction
    * @api
    */
  /**
    * {@link module:ol/source/Tile~TileSource} sources use a function of this type to get
    * the url that provides a tile for a given tile coordinate.
    *
    * This function takes an {@link module:ol/tilecoord~TileCoord} for the tile
    * coordinate, a `{number}` representing the pixel ratio and a
    * {@link module:ol/proj/Projection~Projection} for the projection  as arguments
    * and returns a `{string}` representing the tile URL, or undefined if no tile
    * should be requested for the passed tile coordinate.
    *
    * @typedef {function(import("./tilecoord.js").TileCoord, number,
    *           import("./proj/Projection.js").default): (string|undefined)} UrlFunction
    * @api
    */
  /**
    * @typedef {Object} Options
    * @property {number} [transition=250] A duration for tile opacity
    * transitions in milliseconds. A duration of 0 disables the opacity transition.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    * @api
    */
  /**
    * @classdesc
    * Base class for tiles.
    *
    * @abstract
    */
  @js.native
  trait Tile
    extends typings.ol.eventsTargetMod.default {
    
    /**
      * @protected
      */
    /* protected */ def changed(): Unit = js.native
    
    /**
      * Mark a transition as complete.
      * @param {string} id An id for the renderer.
      */
    def endTransition(id: String): Unit = js.native
    
    /**
      * Get the alpha value for rendering.
      * @param {string} id An id for the renderer.
      * @param {number} time The render frame time.
      * @return {number} A number between 0 and 1.
      */
    def getAlpha(id: String, time: Double): Double = js.native
    
    /**
      * Get the interim tile most suitable for rendering using the chain of interim
      * tiles. This corresponds to the  most recent tile that has been loaded, if no
      * such tile exists, the original tile is returned.
      * @return {!Tile} Best tile for rendering.
      */
    def getInterimTile(): Tile = js.native
    
    /**
      * @return {string} Key.
      */
    def getKey(): String = js.native
    
    /**
      * @return {import("./TileState.js").default} State.
      */
    def getState(): Any = js.native
    
    /**
      * Get the tile coordinate for this tile.
      * @return {import("./tilecoord.js").TileCoord} The tile coordinate.
      * @api
      */
    def getTileCoord(): TileCoord = js.native
    
    /**
      * Determine if a tile is in an alpha transition.  A tile is considered in
      * transition if tile.getAlpha() has not yet been called or has been called
      * and returned 1.
      * @param {string} id An id for the renderer.
      * @return {boolean} The tile is in transition.
      */
    def inTransition(id: String): Boolean = js.native
    
    /**
      * An "interim" tile for this tile. The interim tile may be used while this
      * one is loading, for "smooth" transitions when changing params/dimensions
      * on the source.
      * @type {Tile}
      */
    var interimTile: Tile = js.native
    
    /**
      * @type {boolean}
      */
    var interpolate: Boolean = js.native
    
    /**
      * A key assigned to the tile. This is used by the tile source to determine
      * if this tile can effectively be used, or if a new tile should be created
      * and this one be used as an interim tile for this new tile.
      * @type {string}
      */
    var key: String = js.native
    
    /**
      * Load the image or retry if loading previously failed.
      * Loading is taken care of by the tile queue, and calling this method is
      * only needed for preloading or for reloading in case of an error.
      * @abstract
      * @api
      */
    def load(): Unit = js.native
    
    /**
      * Goes through the chain of interim tiles and discards sections of the chain
      * that are no longer relevant.
      */
    def refreshInterimChain(): Unit = js.native
    
    /**
      * Called by the tile cache when the tile is removed from the cache due to expiry
      */
    def release(): Unit = js.native
    
    /**
      * Sets the state of this tile. If you write your own {@link module:ol/Tile~LoadFunction tileLoadFunction} ,
      * it is important to set the state correctly to {@link module:ol/TileState~ERROR}
      * when the tile cannot be loaded. Otherwise the tile cannot be removed from
      * the tile queue and will block other requests.
      * @param {import("./TileState.js").default} state State.
      * @api
      */
    def setState(state: Any): Unit = js.native
    
    /**
      * @protected
      * @type {import("./TileState.js").default}
      */
    /* protected */ var state: Any = js.native
    
    /**
      * @type {import("./tilecoord.js").TileCoord}
      */
    var tileCoord: TileCoord = js.native
    
    /**
      * Lookup of start times for rendering transitions.  If the start time is
      * equal to -1, the transition is complete.
      * @type {Object<string, number>}
      */
    var transitionStarts_ : StringDictionary[Double] = js.native
    
    /**
      * The duration for the opacity transition.
      * @type {number}
      */
    var transition_ : Double = js.native
  }
  
  type UrlFunction = js.Function3[
    /* arg0 */ TileCoord, 
    /* arg1 */ Double, 
    /* arg2 */ typings.ol.projProjectionMod.default, 
    js.UndefOr[String]
  ]
}
