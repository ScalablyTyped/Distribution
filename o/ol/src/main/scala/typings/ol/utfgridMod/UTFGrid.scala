package typings.ol.utfgridMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.tileJSONMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UTFGrid
  extends typings.ol.sourceTileMod.default {
  def forDataAtCoordinateAndResolution(coordinate: Coordinate, resolution: Double, callback: js.Function1[/* p0 */ js.Any, Unit]): Unit = js.native
  def forDataAtCoordinateAndResolution(
    coordinate: Coordinate,
    resolution: Double,
    callback: js.Function1[/* p0 */ js.Any, Unit],
    opt_request: Boolean
  ): Unit = js.native
  def getTemplate(): String = js.native
  /* protected */ def handleTileJSONError(): Unit = js.native
  /* protected */ def handleTileJSONResponse(tileJSON: Config): Unit = js.native
}

