package typings.ol.mod

import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.ol.vectorRenderTileMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol", "VectorRenderTile")
@js.native
class VectorRenderTile protected () extends default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    urlTileCoord: TileCoord,
    getSourceTiles: js.Function1[
        /* p0 */ typings.ol.vectorRenderTileMod.VectorRenderTile, 
        js.Array[typings.ol.olVectorTileMod.default]
      ]
  ) = this()
}
