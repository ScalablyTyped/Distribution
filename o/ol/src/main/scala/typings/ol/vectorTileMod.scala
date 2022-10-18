package typings.ol

import typings.ol.featureMod.FeatureLike
import typings.ol.featureloaderMod.FeatureLoader
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Options
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorTileMod {
  
  @JSImport("ol/VectorTile", JSImport.Default)
  @js.native
  open class default protected () extends VectorTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typings.ol.formatFeatureMod.default,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typings.ol.formatFeatureMod.default,
      tileLoadFunction: LoadFunction,
      opt_options: Options
    ) = this()
  }
  
  @js.native
  trait VectorTile
    extends typings.ol.tileMod.default {
    
    /**
      * Get the features for this tile. Geometries will be in the view projection.
      */
    def getFeatures(): js.Array[FeatureLike] = js.native
    
    /**
      * Get the feature format assigned for reading this tile's features.
      */
    def getFormat(): typings.ol.formatFeatureMod.default = js.native
    
    /**
      * Handler for tile load errors.
      */
    def onError(): Unit = js.native
    
    /**
      * Handler for successful tile load.
      */
    def onLoad(
      features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]],
      dataProjection: typings.ol.projProjectionMod.default
    ): Unit = js.native
    
    /**
      * Function for use in an {@link module:ol/source/VectorTile~VectorTile}'s tileLoadFunction.
      * Sets the features for the tile.
      */
    def setFeatures(features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]): Unit = js.native
    
    /**
      * Set the feature loader for reading this tile's features.
      */
    def setLoader(loader: FeatureLoader): Unit = js.native
  }
}
