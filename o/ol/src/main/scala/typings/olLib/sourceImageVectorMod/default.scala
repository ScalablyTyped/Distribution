package typings
package olLib.sourceImageVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * An image source whose images are canvas elements into which vector features
  * read from a vector source (`ol.source.Vector`) are drawn. An
  * `ol.source.ImageVector` object is to be used as the `source` of an image
  * layer (`ol.layer.Image`). Image layers are rotated, scaled, and translated,
  * as opposed to being re-rendered, during animations and interactions. So, like
  * any other image layer, an image layer configured with an
  * `ol.source.ImageVector` will exhibit this behaviour. This is in contrast to a
  * vector layer, where vector features are re-drawn during animations and
  * interactions.
  *
  * @param options Options.
  * @api
  */
@JSImport("ol/source/ImageVector", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.sourceNs.ImageVector {
  /**
    * @classdesc
    * An image source whose images are canvas elements into which vector features
    * read from a vector source (`ol.source.Vector`) are drawn. An
    * `ol.source.ImageVector` object is to be used as the `source` of an image
    * layer (`ol.layer.Image`). Image layers are rotated, scaled, and translated,
    * as opposed to being re-rendered, during animations and interactions. So, like
    * any other image layer, an image layer configured with an
    * `ol.source.ImageVector` will exhibit this behaviour. This is in contrast to a
    * vector layer, where vector features are re-drawn during animations and
    * interactions.
    *
    * @param options Options.
    * @api
    */
  def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.ImageVectorOptions) = this()
}

