package typings.ol.olMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.UrlFunction
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.ol.vectorImageTileMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "VectorImageTile")
@js.native
class VectorImageTile protected () extends default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    sourceRevision: Double,
    format: typings.ol.formatFeatureMod.default,
    tileLoadFunction: LoadFunction,
    urlTileCoord: TileCoord,
    tileUrlFunction: UrlFunction,
    sourceTileGrid: typings.ol.tilegridTileGridMod.default,
    tileGrid: typings.ol.tilegridTileGridMod.default,
    sourceTiles: StringDictionary[typings.ol.vectorTileMod.default],
    pixelRatio: Double,
    projection: typings.ol.projProjectionMod.default,
    tileClass: typings.ol.vectorTileMod.default,
    handleTileChange: js.ThisFunction1[
        /* this */ typings.ol.sourceVectorTileMod.default, 
        /* p0 */ typings.ol.eventsEventMod.default, 
        Unit
      ],
    zoom: Double
  ) = this()
}

