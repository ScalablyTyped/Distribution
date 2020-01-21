package typings.ol.mod

import typings.ol.olTileMod.Options
import typings.ol.olTileMod.default
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "Tile")
@js.native
abstract class Tile protected () extends default {
  def this(tileCoord: TileCoord, state: TileState) = this()
  def this(tileCoord: TileCoord, state: TileState, opt_options: Options) = this()
}

