package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.olxNs.AttributionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "Attribution")
@js.native
class Attribution protected () extends js.Object {
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
  def this(options: AttributionOptions) = this()
  /**
    * Get the attribution markup.
    * @return The attribution HTML.
    * @api stable
    */
  def getHTML(): String = js.native
}

