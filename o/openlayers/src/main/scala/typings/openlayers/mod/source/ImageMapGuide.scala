package typings.openlayers.mod.source

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.ImageLoadFunctionType
import typings.openlayers.mod.olx.source.ImageMapGuideOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Source for images from Mapguide servers
  *
  * @fires ol.source.ImageEvent
  * @param options Options.
  * @api stable
  */
@JSImport("openlayers", "source.ImageMapGuide")
@js.native
class ImageMapGuide protected () extends Image {
  /**
    * @classdesc
    * Source for images from Mapguide servers
    *
    * @fires ol.source.ImageEvent
    * @param options Options.
    * @api stable
    */
  def this(options: ImageMapGuideOptions) = this()
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
    * Set the image load function of the MapGuide source.
    * @param imageLoadFunction Image load function.
    * @api
    */
  def setImageLoadFunction(imageLoadFunction: ImageLoadFunctionType): Unit = js.native
  /**
    * Update the user-provided params.
    * @param params Params.
    * @api stable
    */
  def updateParams(params: GlobalObject): Unit = js.native
}

