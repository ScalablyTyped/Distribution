package typings
package olLib.sourceUTFGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/UTFGrid", "CustomTile")
@js.native
class CustomTile protected ()
  extends olLib.tileMod.default {
  def this(tileCoord: olLib.tilecoordMod.TileCoord, state: olLib.tileStateMod.TileState, src: java.lang.String, extent: olLib.extentMod.Extent, preemptive: scala.Boolean, jsonp: scala.Boolean) = this()
  def forDataAtCoordinate[T](
    coordinate: olLib.coordinateMod.Coordinate,
    callback: js.ThisFunction1[/* this */ T, /* param1 */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def forDataAtCoordinate[T](
    coordinate: olLib.coordinateMod.Coordinate,
    callback: js.ThisFunction1[/* this */ T, /* param1 */ js.Any, scala.Unit],
    opt_this: T
  ): scala.Unit = js.native
  def forDataAtCoordinate[T](
    coordinate: olLib.coordinateMod.Coordinate,
    callback: js.ThisFunction1[/* this */ T, /* param1 */ js.Any, scala.Unit],
    opt_this: T,
    opt_request: scala.Boolean
  ): scala.Unit = js.native
  def getData(coordinate: olLib.coordinateMod.Coordinate): js.Any = js.native
  def getImage(): stdLib.HTMLImageElement = js.native
}

