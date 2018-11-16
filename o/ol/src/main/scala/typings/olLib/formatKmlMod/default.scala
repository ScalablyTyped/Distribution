package typings
package olLib.formatKmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @classdesc
     * Feature format for reading and writing data in the KML format.
     *
     * Note that the KML format uses the URL() constructor. Older browsers such as IE
     * which do not support this will need a URL polyfill to be loaded before use.
     *
     * @param opt_options Options.
     * @api stable
     */
@JSImport("ol/format/kml", JSImport.Default)
@js.native
class default ()
  extends openlayersLib.openlayersMod.formatNs.KML {
  /**
           * @classdesc
           * Feature format for reading and writing data in the KML format.
           *
           * Note that the KML format uses the URL() constructor. Older browsers such as IE
           * which do not support this will need a URL polyfill to be loaded before use.
           *
           * @param opt_options Options.
           * @api stable
           */
  def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.KMLOptions) = this()
}

