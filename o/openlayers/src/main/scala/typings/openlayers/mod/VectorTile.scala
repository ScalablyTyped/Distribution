package typings.openlayers.mod

import typings.openlayers.mod.Tile.State
import typings.openlayers.mod.proj.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "VectorTile")
@js.native
open class VectorTile protected () extends Tile {
  /**
    * @param tileCoord Tile coordinate.
    * @param state State.
    * @param src Data source url.
    * @param format Feature format.
    * @param tileLoadFunction Tile load function.
    */
  def this(
    tileCoord: TileCoord,
    state: State,
    src: String,
    format: typings.openlayers.mod.format.Feature,
    tileLoadFunction: TileLoadFunctionType
  ) = this()
  
  /**
    * Get the feature format assigned for reading this tile's features.
    * @return Feature format.
    * @api
    */
  def getFormat(): typings.openlayers.mod.format.Feature = js.native
  
  /**
    * @param features Features.
    * @api
    */
  def setFeatures(features: js.Array[Feature]): Unit = js.native
  
  /**
    * Set the feature loader for reading this tile's features.
    * @param loader Feature loader.
    * @api
    */
  def setLoader(loader: FeatureLoader_): Unit = js.native
  
  /**
    * Set the projection of the features that were added with {@link #setFeatures}.
    * @param projection Feature projection.
    * @api
    */
  def setProjection(projection: Projection): Unit = js.native
}
