package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.sourceTileJSONMod.Config
import typings.ol.tilecoordMod.TileCoord
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceUtfgridMod {
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [preemptive=true]
    * If `true` the UTFGrid source loads the tiles based on their "visibility".
    * This improves the speed of response, but increases traffic.
    * Note that if set to `false` (lazy loading), you need to pass `true` as
    * `request` to the `forDataAtCoordinateAndResolution` method otherwise no
    * data will ever be loaded.
    * @property {boolean} [jsonp=false] Use JSONP with callback to load the TileJSON.
    * Useful when the server does not support CORS..
    * @property {import("./TileJSON.js").Config} [tileJSON] TileJSON configuration for this source.
    * If not provided, `url` must be configured.
    * @property {string} [url] TileJSON endpoint that provides the configuration for this source.
    * Request will be made through JSONP. If not provided, `tileJSON` must be configured.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for UTFGrid interaction data loaded from TileJSON format.
    * @api
    */
  @JSImport("ol/source/UTFGrid", JSImport.Default)
  @js.native
  open class default protected () extends UTFGrid {
    /**
      * @param {Options} options Source options.
      */
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source/UTFGrid", "CustomTile")
  @js.native
  open class CustomTile protected ()
    extends typings.ol.tileMod.default {
    /**
      * @param {import("../tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("../TileState.js").default} state State.
      * @param {string} src Image source URI.
      * @param {import("../extent.js").Extent} extent Extent of the tile.
      * @param {boolean} preemptive Load the tile when visible (before it's needed).
      * @param {boolean} jsonp Load the tile as a script.
      */
    def this(tileCoord: TileCoord, state: Any, src: String, extent: Extent, preemptive: Boolean, jsonp: Boolean) = this()
    
    /**
      * @private
      * @type {Object<string, Object>|undefined}
      */
    /* private */ var data_ : Any = js.native
    
    /**
      * @private
      * @type {import("../extent.js").Extent}
      */
    /* private */ var extent_ : Any = js.native
    
    /**
      * Calls the callback (synchronously by default) with the available data
      * for given coordinate (or `null` if not yet loaded).
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @param {function(*): void} callback Callback.
      * @param {boolean} [request] If `true` the callback is always async.
      *                               The tile data is requested if not yet loaded.
      */
    def forDataAtCoordinate(coordinate: Coordinate, callback: js.Function1[/* arg0 */ Any, Unit]): Unit = js.native
    def forDataAtCoordinate(coordinate: Coordinate, callback: js.Function1[/* arg0 */ Any, Unit], request: Boolean): Unit = js.native
    
    /**
      * Synchronously returns data at given coordinate (if available).
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @return {*} The data.
      */
    def getData(coordinate: Coordinate): Any = js.native
    
    /**
      * Get the image element for this tile.
      * @return {HTMLImageElement} Image.
      */
    def getImage(): HTMLImageElement = js.native
    
    /**
      * @private
      * @type {Array<string>}
      */
    /* private */ var grid_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleError_ : Any = js.native
    
    /**
      * @param {!UTFGridJSON} json UTFGrid data.
      * @private
      */
    /* private */ var handleLoad_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var jsonp_ : Any = js.native
    
    /**
      * @private
      * @type {Array<string>}
      */
    /* private */ var keys_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var loadInternal_ : Any = js.native
    
    /**
      * @private
      * @param {Event} event The error event.
      */
    /* private */ var onXHRError_ : Any = js.native
    
    /**
      * @private
      * @param {Event} event The load event.
      */
    /* private */ var onXHRLoad_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var preemptive_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var src_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Use JSONP with callback to load the TileJSON.
      * Useful when the server does not support CORS..
      */
    var jsonp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` the UTFGrid source loads the tiles based on their "visibility".
      * This improves the speed of response, but increases traffic.
      * Note that if set to `false` (lazy loading), you need to pass `true` as
      * `request` to the `forDataAtCoordinateAndResolution` method otherwise no
      * data will ever be loaded.
      */
    var preemptive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * TileJSON configuration for this source.
      * If not provided, `url` must be configured.
      */
    var tileJSON: js.UndefOr[Config] = js.undefined
    
    /**
      * TileJSON endpoint that provides the configuration for this source.
      * Request will be made through JSONP. If not provided, `tileJSON` must be configured.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * Choose whether to use tiles with a higher or lower zoom level when between integer
      * zoom levels. See {@link module :ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
      */
    var zDirection: js.UndefOr[Double | NearestDirectionFunction] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
      
      inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
      
      inline def setPreemptive(value: Boolean): Self = StObject.set(x, "preemptive", value.asInstanceOf[js.Any])
      
      inline def setPreemptiveUndefined: Self = StObject.set(x, "preemptive", js.undefined)
      
      inline def setTileJSON(value: Config): Self = StObject.set(x, "tileJSON", value.asInstanceOf[js.Any])
      
      inline def setTileJSONUndefined: Self = StObject.set(x, "tileJSON", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setZDirection(value: Double | NearestDirectionFunction): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionFunction3(value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double) => Double): Self = StObject.set(x, "zDirection", js.Any.fromFunction3(value))
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [preemptive=true]
    * If `true` the UTFGrid source loads the tiles based on their "visibility".
    * This improves the speed of response, but increases traffic.
    * Note that if set to `false` (lazy loading), you need to pass `true` as
    * `request` to the `forDataAtCoordinateAndResolution` method otherwise no
    * data will ever be loaded.
    * @property {boolean} [jsonp=false] Use JSONP with callback to load the TileJSON.
    * Useful when the server does not support CORS..
    * @property {import("./TileJSON.js").Config} [tileJSON] TileJSON configuration for this source.
    * If not provided, `url` must be configured.
    * @property {string} [url] TileJSON endpoint that provides the configuration for this source.
    * Request will be made through JSONP. If not provided, `tileJSON` must be configured.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for UTFGrid interaction data loaded from TileJSON format.
    * @api
    */
  @js.native
  trait UTFGrid
    extends typings.ol.sourceTileMod.default {
    
    /**
      * Calls the callback (synchronously by default) with the available data
      * for given coordinate and resolution (or `null` if not yet loaded or
      * in case of an error).
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @param {number} resolution Resolution.
      * @param {function(*): void} callback Callback.
      * @param {boolean} [request] If `true` the callback is always async.
      *                               The tile data is requested if not yet loaded.
      * @api
      */
    def forDataAtCoordinateAndResolution(coordinate: Coordinate, resolution: Double, callback: js.Function1[/* arg0 */ Any, Unit]): Unit = js.native
    def forDataAtCoordinateAndResolution(
      coordinate: Coordinate,
      resolution: Double,
      callback: js.Function1[/* arg0 */ Any, Unit],
      request: Boolean
    ): Unit = js.native
    
    /**
      * Return the template from TileJSON.
      * @return {string|undefined} The template from TileJSON.
      * @api
      */
    def getTemplate(): js.UndefOr[String] = js.native
    
    /**
      * @protected
      */
    /* protected */ def handleTileJSONError(): Unit = js.native
    
    /**
      * TODO: very similar to ol/source/TileJSON#handleTileJSONResponse
      * @protected
      * @param {import("./TileJSON.js").Config} tileJSON Tile JSON.
      */
    /* protected */ def handleTileJSONResponse(tileJSON: Config): Unit = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var jsonp_ : Any = js.native
    
    /**
      * @private
      * @param {Event} event The error event.
      */
    /* private */ var onXHRError_ : Any = js.native
    
    /**
      * @private
      * @param {Event} event The load event.
      */
    /* private */ var onXHRLoad_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var preemptive_ : Any = js.native
    
    /**
      * @private
      * @type {string|undefined}
      */
    /* private */ var template_ : Any = js.native
    
    /**
      * @private
      * @type {!import("../Tile.js").UrlFunction}
      */
    /* private */ var tileUrlFunction_ : Any = js.native
    
    /**
      * Marks a tile coord as being used, without triggering a load.
      * @param {number} z Tile coordinate z.
      * @param {number} x Tile coordinate x.
      * @param {number} y Tile coordinate y.
      */
    def useTile(z: Double, x: Double, y: Double): Unit = js.native
  }
  
  trait UTFGridJSON extends StObject {
    
    /**
      * Optional data.
      */
    var data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * The grid.
      */
    var grid: js.Array[String]
    
    /**
      * The keys.
      */
    var keys: js.Array[String]
  }
  object UTFGridJSON {
    
    inline def apply(grid: js.Array[String], keys: js.Array[String]): UTFGridJSON = {
      val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[UTFGridJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UTFGridJSON] (val x: Self) extends AnyVal {
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGrid(value: js.Array[String]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridVarargs(value: String*): Self = StObject.set(x, "grid", js.Array(value*))
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    }
  }
}
