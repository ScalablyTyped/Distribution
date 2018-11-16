package typings
package olLib.attributionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/attribution", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.Attribution {
  /**
       * @classdesc
       * An attribution for a layer source.
       *
       * Example:
       *
       *     source: new ol.source.OSM({
       *       attributions: [
       *         new ol.Attribution({
       *           html: 'All maps &copy; ' +
       *               '<a href="http://www.opencyclemap.org/">OpenCycleMap</a>'
       *         }),
       *         ol.source.OSM.ATTRIBUTION
       *       ],
       *     ..
       *
       * @param options Attribution options.
       * @struct
       * @api stable
       */
  def this(options: openlayersLib.openlayersMod.olxNs.AttributionOptions) = this()
}

