package typings.openlayers.mod.source

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.ImageLoadFunctionType
import typings.openlayers.mod.olx.source.ImageArcGISRestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Source for data from ArcGIS Rest services providing single, untiled images.
  * Useful when underlying map service has labels.
  *
  * If underlying map service is not using labels,
  * take advantage of ol image caching and use
  * {@link ol.source.TileArcGISRest} data source.
  *
  * @fires ol.source.ImageEvent
  * @param opt_options Image ArcGIS Rest Options.
  * @api
  */
@JSImport("openlayers", "source.ImageArcGISRest")
@js.native
/**
  * @classdesc
  * Source for data from ArcGIS Rest services providing single, untiled images.
  * Useful when underlying map service has labels.
  *
  * If underlying map service is not using labels,
  * take advantage of ol image caching and use
  * {@link ol.source.TileArcGISRest} data source.
  *
  * @fires ol.source.ImageEvent
  * @param opt_options Image ArcGIS Rest Options.
  * @api
  */
class ImageArcGISRest () extends Image {
  def this(opt_options: ImageArcGISRestOptions) = this()
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
    * Return the URL used for this ArcGIS source.
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

