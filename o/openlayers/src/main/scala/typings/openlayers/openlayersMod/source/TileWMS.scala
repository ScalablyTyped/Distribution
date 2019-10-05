package typings.openlayers.openlayersMod.source

import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.GlobalObject
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.olx.source.TileWMSOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Layer source for tile data from WMS servers.
  *
  * @param opt_options Tile WMS options.
  * @api stable
  */
@JSImport("openlayers", "source.TileWMS")
@js.native
/**
  * @classdesc
  * Layer source for tile data from WMS servers.
  *
  * @param opt_options Tile WMS options.
  * @api stable
  */
class TileWMS () extends TileImage {
  def this(opt_options: TileWMSOptions) = this()
  /**
    * Return the GetFeatureInfo URL for the passed coordinate, resolution, and
    * projection. Return `undefined` if the GetFeatureInfo URL cannot be
    * constructed.
    * @param coordinate Coordinate.
    * @param resolution Resolution.
    * @param projection Projection.
    * @param params GetFeatureInfo params. `INFO_FORMAT` at least should
    *     be provided. If `QUERY_LAYERS` is not provided then the layers specified
    *     in the `LAYERS` parameter will be used. `VERSION` should not be
    *     specified here.
    * @return GetFeatureInfo URL.
    * @api stable
    */
  def getGetFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: GlobalObject): String = js.native
  /**
    * Get the user-provided params, i.e. those passed to the constructor through
    * the "params" option, and possibly updated using the updateParams method.
    * @return Params.
    * @api stable
    */
  def getParams(): GlobalObject = js.native
  /**
    * Update the user-provided params.
    * @param params Params.
    * @api stable
    */
  def updateParams(params: GlobalObject): Unit = js.native
}

