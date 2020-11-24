package typings.ol.utfgridMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/UTFGrid", "CustomTile")
@js.native
class CustomTile protected ()
  extends typings.ol.olTileMod.default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    extent: Extent,
    preemptive: Boolean,
    jsonp: Boolean
  ) = this()
  
  /**
    * Calls the callback (synchronously by default) with the available data
    * for given coordinate (or null if not yet loaded).
    */
  def forDataAtCoordinate(coordinate: Coordinate, callback: js.Function1[/* p0 */ js.Any, Unit]): Unit = js.native
  def forDataAtCoordinate(coordinate: Coordinate, callback: js.Function1[/* p0 */ js.Any, Unit], opt_request: Boolean): Unit = js.native
  
  /**
    * Synchronously returns data at given coordinate (if available).
    */
  def getData(coordinate: Coordinate): js.Any = js.native
  
  /**
    * Get the image element for this tile.
    */
  def getImage(): HTMLImageElement = js.native
}
