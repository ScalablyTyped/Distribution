package typings.ol.mod

import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.ol.vectorRenderTileMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "VectorRenderTile")
@js.native
class VectorRenderTile protected () extends default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    urlTileCoord: TileCoord,
    sourceTileGrid: typings.ol.tilegridTileGridMod.default,
    getSourceTiles: js.Function1[
        /* p0 */ typings.ol.vectorRenderTileMod.VectorRenderTile, 
        js.Array[typings.ol.olVectorTileMod.default]
      ],
    removeSourceTiles: js.Function1[/* p0 */ typings.ol.vectorRenderTileMod.VectorRenderTile, Unit]
  ) = this()
}

