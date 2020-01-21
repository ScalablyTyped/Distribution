package typings.openlayers.mod.format

import typings.openlayers.mod.GlobalObject
import typings.std.Document_
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Format for reading WMTS capabilities data.
  *
  * @api
  */
@JSImport("openlayers", "format.WMTSCapabilities")
@js.native
/**
  * @classdesc
  * Format for reading WMTS capabilities data.
  *
  * @api
  */
class WMTSCapabilities () extends XML {
  def read(source: String): GlobalObject = js.native
  /**
    * Read a WMTS capabilities document.
    *
    * @param source The XML source.
    * @return An object representing the WMTS capabilities.
    * @api
    */
  def read(source: Document_): GlobalObject = js.native
  def read(source: Node): GlobalObject = js.native
}

