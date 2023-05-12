package typings.ol

import typings.ol.layerBaseTileMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerTileMod {
  
  /**
    * @classdesc
    * For layer sources that provide pre-rendered, tiled images in grids that are
    * organized by zoom levels for specific resolutions.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Tile.js").default} TileSourceType
    * @extends BaseTileLayer<TileSourceType, CanvasTileLayerRenderer>
    * @api
    */
  @JSImport("ol/layer/Tile", JSImport.Default)
  @js.native
  /**
    * @param {import("./BaseTile.js").Options<TileSourceType>} [options] Tile layer options.
    */
  open class default[TileSourceType /* <: typings.ol.tileMod.default */] () extends TileLayer[TileSourceType] {
    def this(options: Options[TileSourceType]) = this()
  }
  
  /**
    * @classdesc
    * For layer sources that provide pre-rendered, tiled images in grids that are
    * organized by zoom levels for specific resolutions.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Tile.js").default} TileSourceType
    * @extends BaseTileLayer<TileSourceType, CanvasTileLayerRenderer>
    * @api
    */
  @js.native
  trait TileLayer[TileSourceType /* <: typings.ol.tileMod.default */]
    extends typings.ol.layerBaseTileMod.default[
          TileSourceType, 
          typings.ol.rendererCanvasTileLayerMod.default[TileLayer[typings.ol.tileMod.default] | typings.ol.vectorTileMod.default]
        ]
}
