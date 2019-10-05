package typings.openlayers.openlayersMod.source

import typings.openlayers.openlayersMod.olx.source.ImageCanvasOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Base class for image sources where a canvas element is the image.
  *
  * @param options Constructor options.
  * @api
  */
@JSImport("openlayers", "source.ImageCanvas")
@js.native
class ImageCanvas protected ()
  extends typings.openlayers.openlayersMod.source.Image {
  /**
    * @classdesc
    * Base class for image sources where a canvas element is the image.
    *
    * @param options Constructor options.
    * @api
    */
  def this(options: ImageCanvasOptions) = this()
}

