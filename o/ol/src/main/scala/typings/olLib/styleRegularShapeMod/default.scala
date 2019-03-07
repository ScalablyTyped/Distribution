package typings
package olLib.styleRegularShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Set regular shape style for vector features. The resulting shape will be
  * a regular polygon when `radius` is provided, or a star when `radius1` and
  * `radius2` are provided.
  *
  * @param options Options.
  * @api
  */
@JSImport("ol/style/RegularShape", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.styleNs.RegularShape {
  /**
    * @classdesc
    * Set regular shape style for vector features. The resulting shape will be
    * a regular polygon when `radius` is provided, or a star when `radius1` and
    * `radius2` are provided.
    *
    * @param options Options.
    * @api
    */
  def this(options: openlayersLib.openlayersMod.olxNs.styleNs.RegularShapeOptions) = this()
}

