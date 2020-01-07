package typings.ol.sourceUTFGridMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/UTFGrid", "CustomTile")
@js.native
class CustomTile protected ()
  extends typings.ol.tileMod.default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    extent: Extent,
    preemptive: Boolean,
    jsonp: Boolean
  ) = this()
  def forDataAtCoordinate(coordinate: Coordinate, callback: js.Function1[/* p0 */ js.Any, Unit]): Unit = js.native
  def forDataAtCoordinate(coordinate: Coordinate, callback: js.Function1[/* p0 */ js.Any, Unit], opt_request: Boolean): Unit = js.native
  def getData(coordinate: Coordinate): js.Any = js.native
  def getImage(): HTMLImageElement = js.native
}

