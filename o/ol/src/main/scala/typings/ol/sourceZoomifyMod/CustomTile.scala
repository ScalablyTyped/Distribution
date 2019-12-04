package typings.ol.sourceZoomifyMod

import typings.ol.tileMod.LoadFunction
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/Zoomify", "CustomTile")
@js.native
class CustomTile protected ()
  extends typings.ol.imageTileMod.default {
  def this(
    tileGrid: typings.ol.tilegridTileGridMod.default,
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction
  ) = this()
  def this(
    tileGrid: typings.ol.tilegridTileGridMod.default,
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction,
    opt_options: typings.ol.tileMod.Options
  ) = this()
}

