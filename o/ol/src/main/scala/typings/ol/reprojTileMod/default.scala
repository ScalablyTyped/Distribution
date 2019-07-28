package typings.ol.reprojTileMod

import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj/Tile", JSImport.Default)
@js.native
class default protected () extends ReprojTile {
  def this(
    sourceProj: typings.ol.projProjectionMod.default,
    sourceTileGrid: typings.ol.tilegridTileGridMod.default,
    targetProj: typings.ol.projProjectionMod.default,
    targetTileGrid: typings.ol.tilegridTileGridMod.default,
    tileCoord: TileCoord,
    wrappedTileCoord: TileCoord,
    pixelRatio: Double,
    gutter: Double,
    getTileFunction: FunctionType
  ) = this()
  def this(
    sourceProj: typings.ol.projProjectionMod.default,
    sourceTileGrid: typings.ol.tilegridTileGridMod.default,
    targetProj: typings.ol.projProjectionMod.default,
    targetTileGrid: typings.ol.tilegridTileGridMod.default,
    tileCoord: TileCoord,
    wrappedTileCoord: TileCoord,
    pixelRatio: Double,
    gutter: Double,
    getTileFunction: FunctionType,
    opt_errorThreshold: Double
  ) = this()
  def this(
    sourceProj: typings.ol.projProjectionMod.default,
    sourceTileGrid: typings.ol.tilegridTileGridMod.default,
    targetProj: typings.ol.projProjectionMod.default,
    targetTileGrid: typings.ol.tilegridTileGridMod.default,
    tileCoord: TileCoord,
    wrappedTileCoord: TileCoord,
    pixelRatio: Double,
    gutter: Double,
    getTileFunction: FunctionType,
    opt_errorThreshold: Double,
    opt_renderEdges: Boolean
  ) = this()
}

