package typings.ol.imageTileMod

import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Options
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/ImageTile", JSImport.Default)
@js.native
class default protected () extends ImageTile {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction
  ) = this()
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction,
    opt_options: Options
  ) = this()
}

