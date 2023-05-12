package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.featureloaderMod.FeatureLoader
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Options
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorTileMod {
  
  @JSImport("ol/VectorTile", JSImport.Default)
  @js.native
  open class default protected () extends VectorTile {
    /**
      * @param {import("./tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("./TileState.js").default} state State.
      * @param {string} src Data source url.
      * @param {import("./format/Feature.js").default} format Feature format.
      * @param {import("./Tile.js").LoadFunction} tileLoadFunction Tile load function.
      * @param {import("./Tile.js").Options} [options] Tile options.
      */
    def this(
      tileCoord: TileCoord,
      state: Any,
      src: String,
      format: typings.ol.renderFeatureMod.default,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: Any,
      src: String,
      format: typings.ol.renderFeatureMod.default,
      tileLoadFunction: LoadFunction,
      options: Options
    ) = this()
  }
  
  @js.native
  trait VectorTile
    extends typings.ol.tileMod.default {
    
    /**
      * Extent of this tile; set by the source.
      * @type {import("./extent.js").Extent}
      */
    var extent: Extent = js.native
    
    /**
      * @private
      * @type {Array<import("./Feature.js").default>}
      */
    /* private */ var features_ : Any = js.native
    
    /**
      * @private
      * @type {import("./format/Feature.js").default}
      */
    /* private */ var format_ : Any = js.native
    
    /**
      * Get the features for this tile. Geometries will be in the view projection.
      * @return {Array<import("./Feature.js").FeatureLike>} Features.
      * @api
      */
    def getFeatures(): js.Array[FeatureLike] = js.native
    
    /**
      * Get the feature format assigned for reading this tile's features.
      * @return {import("./format/Feature.js").default} Feature format.
      * @api
      */
    def getFormat(): typings.ol.renderFeatureMod.default = js.native
    
    /**
      * @private
      * @type {import("./featureloader.js").FeatureLoader}
      */
    /* private */ var loader_ : Any = js.native
    
    /**
      * Handler for tile load errors.
      */
    def onError(): Unit = js.native
    
    /**
      * Handler for successful tile load.
      * @param {Array<import("./Feature.js").default>} features The loaded features.
      * @param {import("./proj/Projection.js").default} dataProjection Data projection.
      */
    def onLoad(
      features: js.Array[typings.ol.renderFeatureMod.default],
      dataProjection: typings.ol.projProjectionMod.default
    ): Unit = js.native
    
    /**
      * Feature projection of this tile; set by the source.
      * @type {import("./proj/Projection.js").default}
      */
    var projection: typings.ol.projProjectionMod.default = js.native
    
    /**
      * Resolution of this tile; set by the source.
      * @type {number}
      */
    var resolution: Double = js.native
    
    /**
      * Function for use in an {@link module:ol/source/VectorTile~VectorTile}'s `tileLoadFunction`.
      * Sets the features for the tile.
      * @param {Array<import("./Feature.js").default>} features Features.
      * @api
      */
    def setFeatures(features: js.Array[typings.ol.renderFeatureMod.default]): Unit = js.native
    
    /**
      * Set the feature loader for reading this tile's features.
      * @param {import("./featureloader.js").FeatureLoader} loader Feature loader.
      * @api
      */
    def setLoader(loader: FeatureLoader): Unit = js.native
    
    /**
      * @private
      * @type {import("./Tile.js").LoadFunction}
      */
    /* private */ var tileLoadFunction_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var url_ : Any = js.native
  }
}
