package typings
package olLib.sourceUTFGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UTFGrid
  extends olLib.sourceTileMod.default {
  def forDataAtCoordinateAndResolution(
    coordinate: olLib.coordinateMod.Coordinate,
    resolution: scala.Double,
    callback: js.Function1[/* param0 */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def forDataAtCoordinateAndResolution(
    coordinate: olLib.coordinateMod.Coordinate,
    resolution: scala.Double,
    callback: js.Function1[/* param0 */ js.Any, scala.Unit],
    opt_request: scala.Boolean
  ): scala.Unit = js.native
  def getTemplate(): java.lang.String = js.native
  /* protected */ def handleTileJSONError(): scala.Unit = js.native
  /* protected */ def handleTileJSONResponse(tileJSON: olLib.sourceTileJSONMod.Config): scala.Unit = js.native
}

