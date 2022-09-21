package typings.openlayers.mod.source

import typings.openlayers.mod.olx.source.TileJSONOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Layer source for tile data in TileJSON format.
  *
  * @param options TileJSON options.
  * @api stable
  */
@JSImport("openlayers", "source.TileJSON")
@js.native
open class TileJSON protected () extends TileImage {
  /**
    * @classdesc
    * Layer source for tile data in TileJSON format.
    *
    * @param options TileJSON options.
    * @api stable
    */
  def this(options: TileJSONOptions) = this()
  
  /**
    * @return The tilejson object.
    * @api
    */
  def getTileJSON(): TileJSON = js.native
}
