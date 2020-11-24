package typings.ol.wmtsMod

import typings.ol.olTileMod.UrlFunction
import typings.ol.wmtsrequestencodingMod.WMTSRequestEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMTS
  extends typings.ol.tileImageMod.default {
  
  def createFromWMTSTemplate(template: String): UrlFunction = js.native
  
  /**
    * Get the dimensions, i.e. those passed to the constructor through the
    * "dimensions" option, and possibly updated using the updateDimensions
    * method.
    */
  def getDimensions(): js.Any = js.native
  
  /**
    * Return the image format of the WMTS source.
    */
  def getFormat(): String = js.native
  
  /**
    * Return the layer of the WMTS source.
    */
  def getLayer(): String = js.native
  
  /**
    * Return the matrix set of the WMTS source.
    */
  def getMatrixSet(): String = js.native
  
  /**
    * Return the request encoding, either "KVP" or "REST".
    */
  def getRequestEncoding(): WMTSRequestEncoding = js.native
  
  /**
    * Return the style of the WMTS source.
    */
  def getStyle(): String = js.native
  
  /**
    * Return the version of the WMTS source.
    */
  def getVersion(): String = js.native
  
  /**
    * Update the dimensions.
    */
  def updateDimensions(dimensions: js.Any): Unit = js.native
}
