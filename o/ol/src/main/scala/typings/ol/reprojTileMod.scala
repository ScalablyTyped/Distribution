package typings.ol

import typings.ol.tilecoordMod.TileCoord
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj/Tile", JSImport.Namespace)
@js.native
object reprojTileMod extends js.Object {
  @js.native
  trait ReprojTile
    extends typings.ol.olTileMod.default {
    def getImage(): HTMLCanvasElement = js.native
  }
  
  @js.native
  class default protected () extends ReprojTile {
    def this(
      sourceProj: typings.ol.projectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projectionMod.default,
      targetTileGrid: typings.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType
    ) = this()
    def this(
      sourceProj: typings.ol.projectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projectionMod.default,
      targetTileGrid: typings.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: Double
    ) = this()
    def this(
      sourceProj: typings.ol.projectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projectionMod.default,
      targetTileGrid: typings.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: js.UndefOr[scala.Nothing],
      opt_renderEdges: Boolean
    ) = this()
    def this(
      sourceProj: typings.ol.projectionMod.default,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      targetProj: typings.ol.projectionMod.default,
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
  
  type FunctionType = js.Function4[
    /* p0 */ Double, 
    /* p1 */ Double, 
    /* p2 */ Double, 
    /* p3 */ Double, 
    typings.ol.olTileMod.default
  ]
}

