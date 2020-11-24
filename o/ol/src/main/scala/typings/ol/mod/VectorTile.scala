package typings.ol.mod

import typings.ol.olTileMod.LoadFunction
import typings.ol.olTileMod.Options
import typings.ol.olVectorTileMod.default
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol", "VectorTile")
@js.native
class VectorTile protected () extends default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    format: typings.ol.featureMod.default,
    tileLoadFunction: LoadFunction
  ) = this()
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    format: typings.ol.featureMod.default,
    tileLoadFunction: LoadFunction,
    opt_options: Options
  ) = this()
}
