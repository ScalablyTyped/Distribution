package typings.openlayers.mod.source

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.olx.source.TileUTFGridOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Layer source for UTFGrid interaction data loaded from TileJSON format.
  *
  * @param options Source options.
  * @api
  */
@JSImport("openlayers", "source.TileUTFGrid")
@js.native
class TileUTFGrid protected () extends Tile {
  /**
    * @classdesc
    * Layer source for UTFGrid interaction data loaded from TileJSON format.
    *
    * @param options Source options.
    * @api
    */
  def this(options: TileUTFGridOptions) = this()
  /**
    * Calls the callback (synchronously by default) with the available data
    * for given coordinate and resolution (or `null` if not yet loaded or
    * in case of an error).
    * @param coordinate Coordinate.
    * @param resolution Resolution.
    * @param callback Callback.
    * @param opt_this The object to use as `this` in the callback.
    * @param opt_request If `true` the callback is always async.
    *                               The tile data is requested if not yet loaded.
    * @template T
    * @api
    */
  def forDataAtCoordinateAndResolution(coordinate: Coordinate_, resolution: Double, callback: js.Function1[/* d */ js.Any, _]): Unit = js.native
  def forDataAtCoordinateAndResolution(
    coordinate: Coordinate_,
    resolution: Double,
    callback: js.Function1[/* d */ js.Any, _],
    opt_this: js.Any
  ): Unit = js.native
  def forDataAtCoordinateAndResolution(
    coordinate: Coordinate_,
    resolution: Double,
    callback: js.Function1[/* d */ js.Any, _],
    opt_this: js.Any,
    opt_request: Boolean
  ): Unit = js.native
  /**
    * Return the template from TileJSON.
    * @return The template from TileJSON.
    * @api
    */
  def getTemplate(): String = js.native
}

