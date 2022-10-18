package typings.ol

import typings.ol.tilecoordMod.TileCoord
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reprojTileMod {
  
  @JSImport("ol/reproj/Tile", JSImport.Default)
  @js.native
  open class default protected () extends ReprojTile {
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
      opt_errorThreshold: Unit,
      opt_renderEdges: Boolean
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
      opt_renderEdges: Boolean,
      opt_contextOptions: Any
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
      opt_renderEdges: Unit,
      opt_contextOptions: Any
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
      opt_errorThreshold: Unit,
      opt_renderEdges: Boolean,
      opt_contextOptions: Any
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
      opt_errorThreshold: Unit,
      opt_renderEdges: Unit,
      opt_contextOptions: Any
    ) = this()
  }
  
  type FunctionType = js.Function4[
    /* p0 */ Double, 
    /* p1 */ Double, 
    /* p2 */ Double, 
    /* p3 */ Double, 
    typings.ol.tileMod.default
  ]
  
  @js.native
  trait ReprojTile
    extends typings.ol.tileMod.default {
    
    /**
      * Get the HTML Canvas element for this tile.
      */
    def getImage(): HTMLCanvasElement = js.native
  }
}
