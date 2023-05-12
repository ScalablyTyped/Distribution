package typings.ol

import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.projMod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTileDebugMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Optional projection.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Set to `1` when debugging `VectorTile` sources with a default configuration.
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    * @property {string} [template='z:{z} x:{x} y:{y}'] Template for labeling the tiles.
    * Should include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
    */
  /**
    * @classdesc
    * A pseudo tile source, which does not fetch tiles from a server, but renders
    * a grid outline for the tile grid/projection along with the coordinates for
    * each tile. See examples/canvas-tiles for an example.
    * @api
    */
  @JSImport("ol/source/TileDebug", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Debug tile options.
    */
  open class default ()
    extends typings.ol.sourceXyzMod.default {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Optional projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Template for labeling the tiles.
      * Should include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
      */
    var template: js.UndefOr[String] = js.undefined
    
    /**
      * Tile grid.
      */
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.undefined
    
    /**
      * Whether to wrap the world horizontally.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `1` when debugging `VectorTile` sources with a default configuration.
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
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      inline def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      inline def setZDirection(value: Double | NearestDirectionFunction): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionFunction3(value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double) => Double): Self = StObject.set(x, "zDirection", js.Any.fromFunction3(value))
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Optional projection.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Set to `1` when debugging `VectorTile` sources with a default configuration.
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    * @property {string} [template='z:{z} x:{x} y:{y}'] Template for labeling the tiles.
    * Should include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
    */
  /**
    * @classdesc
    * A pseudo tile source, which does not fetch tiles from a server, but renders
    * a grid outline for the tile grid/projection along with the coordinates for
    * each tile. See examples/canvas-tiles for an example.
    * @api
    */
  type TileDebug = typings.ol.sourceXyzMod.default
}
