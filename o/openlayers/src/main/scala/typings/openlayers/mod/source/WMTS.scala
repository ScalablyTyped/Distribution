package typings.openlayers.mod.source

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.olx.source.WMTSOptions
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
@JSImport("openlayers", "source.WMTS")
@js.native
class WMTS protected () extends TileImage {
  /**
    * @classdesc
    * Layer source for tile data from WMTS servers.
    *
    * @param options WMTS options.
    * @api stable
    */
  def this(options: WMTSOptions) = this()
  /**
    * Get the dimensions, i.e. those passed to the constructor through the
    * "dimensions" option, and possibly updated using the updateDimensions
    * method.
    * @return Dimensions.
    * @api
    */
  def getDimensions(): GlobalObject = js.native
  /**
    * Return the image format of the WMTS source.
    * @return Format.
    * @api
    */
  def getFormat(): String = js.native
  /**
    * Return the layer of the WMTS source.
    * @return Layer.
    * @api
    */
  def getLayer(): String = js.native
  /**
    * Return the matrix set of the WMTS source.
    * @return MatrixSet.
    * @api
    */
  def getMatrixSet(): String = js.native
  /**
    * Return the request encoding, either "KVP" or "REST".
    * @return Request encoding.
    * @api
    */
  def getRequestEncoding(): WMTSRequestEncoding = js.native
  /**
    * Return the style of the WMTS source.
    * @return Style.
    * @api
    */
  def getStyle(): String = js.native
  /**
    * Return the version of the WMTS source.
    * @return Version.
    * @api
    */
  def getVersion(): String = js.native
  /**
    * Update the dimensions.
    * @param dimensions Dimensions.
    * @api
    */
  def updateDimensions(dimensions: GlobalObject): Unit = js.native
}

/* static members */
@JSImport("openlayers", "source.WMTS")
@js.native
object WMTS extends js.Object {
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
  def optionsFromCapabilities(wmtsCap: GlobalObject, config: GlobalObject): WMTSOptions = js.native
}

