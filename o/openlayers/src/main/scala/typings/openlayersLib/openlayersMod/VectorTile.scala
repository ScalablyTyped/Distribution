package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "VectorTile")
@js.native
class VectorTile protected () extends Tile {
  /**
    * @param tileCoord Tile coordinate.
    * @param state State.
    * @param src Data source url.
    * @param format Feature format.
    * @param tileLoadFunction Tile load function.
    */
  def this(tileCoord: TileCoord, state: openlayersLib.openlayersMod.TileNs.State, src: java.lang.String, format: openlayersLib.openlayersMod.formatNs.Feature, tileLoadFunction: TileLoadFunctionType) = this()
  /**
    * Get the feature format assigned for reading this tile's features.
    * @return Feature format.
    * @api
    */
  def getFormat(): openlayersLib.openlayersMod.formatNs.Feature = js.native
  /**
    * @param features Features.
    * @api
    */
  def setFeatures(features: js.Array[Feature]): scala.Unit = js.native
  /**
    * Set the feature loader for reading this tile's features.
    * @param loader Feature loader.
    * @api
    */
  def setLoader(loader: FeatureLoader): scala.Unit = js.native
  /**
    * Set the projection of the features that were added with {@link #setFeatures}.
    * @param projection Feature projection.
    * @api
    */
  def setProjection(projection: openlayersLib.openlayersMod.projNs.Projection): scala.Unit = js.native
}

