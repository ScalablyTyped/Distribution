package typings.openlayers.mod.format

import typings.openlayers.mod.GlobalObject
import typings.std.Document
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Format for reading WMS capabilities data
  *
  * @api
  */
@JSImport("openlayers", "format.WMSCapabilities")
@js.native
/**
  * @classdesc
  * Format for reading WMS capabilities data
  *
  * @api
  */
class WMSCapabilities () extends XML {
  
  def read(source: String): GlobalObject = js.native
  /**
    * Read a WMS capabilities document.
    *
    * @param source The XML source.
    * @return An object representing the WMS capabilities.
    * @api
    */
  def read(source: Document): GlobalObject = js.native
  def read(source: Node): GlobalObject = js.native
}
