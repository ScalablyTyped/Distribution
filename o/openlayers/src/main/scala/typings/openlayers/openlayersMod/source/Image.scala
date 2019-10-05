package typings.openlayers.openlayersMod.source

import typings.openlayers.openlayersMod.SourceImageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Base class for sources providing a single image.
  *
  * @param options Single image source options.
  * @api
  */
@JSImport("openlayers", "source.Image")
@js.native
class Image protected () extends Source {
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for sources providing a single image.
    *
    * @param options Single image source options.
    * @api
    */
  def this(options: SourceImageOptions) = this()
}

