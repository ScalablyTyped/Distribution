package typings.ol.olMod

import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Options
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.ol.vectorTileMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "VectorTile")
@js.native
class VectorTile protected () extends default {
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

