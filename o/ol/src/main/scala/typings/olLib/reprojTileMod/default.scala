package typings
package olLib.reprojTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj/Tile", JSImport.Default)
@js.native
class default protected () extends ReprojTile {
  def this(sourceProj: olLib.projProjectionMod.default, sourceTileGrid: olLib.tilegridTileGridMod.default, targetProj: olLib.projProjectionMod.default, targetTileGrid: olLib.tilegridTileGridMod.default, tileCoord: olLib.tilecoordMod.TileCoord, wrappedTileCoord: olLib.tilecoordMod.TileCoord, pixelRatio: scala.Double, gutter: scala.Double, getTileFunction: FunctionType) = this()
  def this(sourceProj: olLib.projProjectionMod.default, sourceTileGrid: olLib.tilegridTileGridMod.default, targetProj: olLib.projProjectionMod.default, targetTileGrid: olLib.tilegridTileGridMod.default, tileCoord: olLib.tilecoordMod.TileCoord, wrappedTileCoord: olLib.tilecoordMod.TileCoord, pixelRatio: scala.Double, gutter: scala.Double, getTileFunction: FunctionType, opt_errorThreshold: scala.Double) = this()
  def this(sourceProj: olLib.projProjectionMod.default, sourceTileGrid: olLib.tilegridTileGridMod.default, targetProj: olLib.projProjectionMod.default, targetTileGrid: olLib.tilegridTileGridMod.default, tileCoord: olLib.tilecoordMod.TileCoord, wrappedTileCoord: olLib.tilecoordMod.TileCoord, pixelRatio: scala.Double, gutter: scala.Double, getTileFunction: FunctionType, opt_errorThreshold: scala.Double, opt_renderEdges: scala.Boolean) = this()
}

