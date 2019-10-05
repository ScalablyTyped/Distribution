package typings.openlayers.openlayersMod.source

import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.GlobalObject
import typings.openlayers.openlayersMod.ImageLoadFunctionType
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.olx.source.ImageWMSOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Source for WMS servers providing single, untiled images.
  *
  * @fires ol.source.ImageEvent
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "source.ImageWMS")
@js.native
/**
  * @classdesc
  * Source for WMS servers providing single, untiled images.
  *
  * @fires ol.source.ImageEvent
  * @param opt_options Options.
  * @api stable
  */
class ImageWMS ()
  extends typings.openlayers.openlayersMod.source.Image {
  def this(opt_options: ImageWMSOptions) = this()
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
    * Return the image load function of the source.
    * @return The image load function.
    * @api
    */
  def getImageLoadFunction(): ImageLoadFunctionType = js.native
  /**
    * Get the user-provided params, i.e. those passed to the constructor through
    * the "params" option, and possibly updated using the updateParams method.
    * @return Params.
    * @api stable
    */
  def getParams(): GlobalObject = js.native
  /**
    * Return the URL used for this WMS source.
    * @return URL.
    * @api stable
    */
  def getUrl(): String = js.native
  /**
    * Set the image load function of the source.
    * @param imageLoadFunction Image load function.
    * @api
    */
  def setImageLoadFunction(imageLoadFunction: ImageLoadFunctionType): Unit = js.native
  /**
    * Set the URL to use for requests.
    * @param url URL.
    * @api stable
    */
  def setUrl(url: String): Unit = js.native
  /**
    * Update the user-provided params.
    * @param params Params.
    * @api stable
    */
  def updateParams(params: GlobalObject): Unit = js.native
}

