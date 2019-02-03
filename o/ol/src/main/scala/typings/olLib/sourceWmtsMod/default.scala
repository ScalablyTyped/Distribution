package typings
package olLib.sourceWmtsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Layer source for tile data from WMTS servers.
  *
  * @param options WMTS options.
  * @api stable
  */
@JSImport("ol/source/wmts", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.sourceNs.WMTS {
  /**
    * @classdesc
    * Layer source for tile data from WMTS servers.
    *
    * @param options WMTS options.
    * @api stable
    */
  def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.WMTSOptions) = this()
}

/* static members */
@JSImport("ol/source/wmts", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Generate source options from a capabilities object.
    * @param wmtsCap An object representing the capabilities document.
    * @param config Configuration properties for the layer.  Defaults for
    *                  the layer will apply if not provided.
    *
    * Required config properties:
    *  - layer - {string} The layer identifier.
    *
    * Optional config properties:
    *  - matrixSet - {string} The matrix set identifier, required if there is
    *       more than one matrix set in the layer capabilities.
    *  - projection - {string} The desired CRS when no matrixSet is specified.
    *       eg: "EPSG:3857". If the desired projection is not available,
    *       an error is thrown.
    *  - requestEncoding - {string} url encoding format for the layer. Default is
    *       the first tile url format found in the GetCapabilities response.
    *  - style - {string} The name of the style
    *  - format - {string} Image format for the layer. Default is the first
    *       format returned in the GetCapabilities response.
    * @return WMTS source options object.
    * @api
    */
  def optionsFromCapabilities(
    wmtsCap: openlayersLib.openlayersMod.GlobalObject,
    config: openlayersLib.openlayersMod.GlobalObject
  ): openlayersLib.openlayersMod.olxNs.sourceNs.WMTSOptions = js.native
}

