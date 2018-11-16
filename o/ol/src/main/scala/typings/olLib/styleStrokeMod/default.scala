package typings
package olLib.styleStrokeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @classdesc
     * Set stroke style for vector features.
     * Note that the defaults given are the Canvas defaults, which will be used if
     * option is not defined. The `get` functions return whatever was entered in
     * the options; they will not return the default.
     *
     * @param opt_options Options.
     * @api
     */
@JSImport("ol/style/stroke", JSImport.Default)
@js.native
class default ()
  extends openlayersLib.openlayersMod.styleNs.Stroke {
  /**
           * @classdesc
           * Set stroke style for vector features.
           * Note that the defaults given are the Canvas defaults, which will be used if
           * option is not defined. The `get` functions return whatever was entered in
           * the options; they will not return the default.
           *
           * @param opt_options Options.
           * @api
           */
  def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.StrokeOptions) = this()
}

