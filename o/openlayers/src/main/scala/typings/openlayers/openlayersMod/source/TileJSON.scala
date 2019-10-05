package typings.openlayers.openlayersMod.source

import typings.openlayers.openlayersMod.olx.source.TileJSONOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Layer source for tile data in TileJSON format.
  *
  * @param options TileJSON options.
  * @api stable
  */
@JSImport("openlayers", "source.TileJSON")
@js.native
class TileJSON protected () extends TileImage {
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

