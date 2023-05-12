package typings.ol

import typings.std.ArrayLike
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglTileTextureMod {
  
  /**
    * @typedef {import("../DataTile.js").default|ImageTile|ReprojTile} TileType
    */
  /**
    * @typedef {Object} Options
    * @property {TileType} tile The tile.
    * @property {import("../tilegrid/TileGrid.js").default} grid Tile grid.
    * @property {import("../webgl/Helper.js").default} helper WebGL helper.
    * @property {number} [gutter=0] The size in pixels of the gutter around image tiles to ignore.
    */
  @JSImport("ol/webgl/TileTexture", JSImport.Default)
  @js.native
  open class default protected () extends TileTexture {
    /**
      * @param {Options} options The tile texture options.
      */
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Tile grid.
      */
    var grid: typings.ol.tilegridTileGridMod.default
    
    /**
      * The size in pixels of the gutter around image tiles to ignore.
      */
    var gutter: js.UndefOr[Double] = js.undefined
    
    /**
      * WebGL helper.
      */
    var helper: typings.ol.webglHelperMod.default
    
    /**
      * The tile.
      */
    var tile: TileType
  }
  object Options {
    
    inline def apply(
      grid: typings.ol.tilegridTileGridMod.default,
      helper: typings.ol.webglHelperMod.default,
      tile: TileType
    ): Options = {
      val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setHelper(value: typings.ol.webglHelperMod.default): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      inline def setTile(value: TileType): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @typedef {import("../DataTile.js").default|ImageTile|ReprojTile} TileType
    */
  /**
    * @typedef {Object} Options
    * @property {TileType} tile The tile.
    * @property {import("../tilegrid/TileGrid.js").default} grid Tile grid.
    * @property {import("../webgl/Helper.js").default} helper WebGL helper.
    * @property {number} [gutter=0] The size in pixels of the gutter around image tiles to ignore.
    */
  @js.native
  trait TileTexture
    extends typings.ol.eventsTargetMod.default {
    
    /**
      * @type {number}
      */
    var bandCount: Double = js.native
    
    /**
      * @type {WebGLArrayBuffer}
      */
    var coords: typings.ol.webglBufferMod.default = js.native
    
    /**
      * @param {import("../DataTile.js").ArrayLike} data The data.
      * @param {import("../size.js").Size} sourceSize The size.
      * @param {number} renderCol The column index (in rendered tile space).
      * @param {number} renderRow The row index (in rendered tile space).
      * @return {import("../DataTile.js").ArrayLike|null} The data.
      * @private
      */
    /* private */ var getArrayPixelData_ : Any = js.native
    
    /**
      * @param {import("../DataTile.js").ImageLike} image The image.
      * @param {number} renderCol The column index (in rendered tile space).
      * @param {number} renderRow The row index (in rendered tile space).
      * @return {Uint8ClampedArray|null} The data.
      * @private
      */
    /* private */ var getImagePixelData_ : Any = js.native
    
    /**
      * Get data for a pixel.  If the tile is not loaded, null is returned.
      * @param {number} renderCol The column index (in rendered tile space).
      * @param {number} renderRow The row index (in rendered tile space).
      * @return {import("../DataTile.js").ArrayLike|null} The data.
      */
    def getPixelData(renderCol: Double, renderRow: Double): (ArrayLike[
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
      ]) | Null = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var gutter_ : Any = js.native
    
    def handleTileChange_(): Unit = js.native
    
    /**
      * @type {import("../webgl/Helper.js").default}
      * @private
      */
    /* private */ var helper_ : Any = js.native
    
    var loaded: js.UndefOr[Boolean] = js.native
    
    /**
      * @type {import("../size.js").Size}
      * @private
      */
    /* private */ var renderSize_ : Any = js.native
    
    /**
      * @param {TileType} tile Tile.
      */
    def setTile(tile: TileType): Unit = js.native
    
    /**
      * @type {Array<WebGLTexture>}
      */
    var textures: js.Array[WebGLTexture] = js.native
    
    /**
      * @type {TileType}
      */
    var tile: TileType = js.native
    
    def uploadTile_(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.sourceDataTileMod.default
    - typings.ol.imageTileMod.default
    - typings.ol.reprojTileMod.default
  */
  trait TileType extends StObject
}
