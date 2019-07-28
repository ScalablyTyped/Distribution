package typings.ol.vectorTileMod

import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Options
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/VectorTile", JSImport.Default)
@js.native
class default protected () extends VectorTile {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    format: typings.ol.formatFeatureMod.default,
    tileLoadFunction: LoadFunction
  ) = this()
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    format: typings.ol.formatFeatureMod.default,
    tileLoadFunction: LoadFunction,
    opt_options: Options
  ) = this()
}

